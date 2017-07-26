package com.report.route.activity;

import android.content.Intent;
import android.os.AsyncTask;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.report.route.R;
import com.report.route.data.model.registration.Parameters;
import com.report.route.data.model.registration.Registration;
import com.report.route.data.model.registration.RegistrationResponse;
import com.report.route.data.remote.registration.ApiFactory;
import com.report.route.data.remote.registration.RegistrationService;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class RegistrationActivity extends AppCompatActivity {

    @BindView(R.id.et_email) EditText etMail;
    @BindView(R.id.et_first_name) EditText etFirstName;
    @BindView(R.id.et_last_name) EditText etLastName;
    @BindView(R.id.et_nick_name) EditText etNickName;
    @BindView(R.id.et_password) EditText etPassword;
    @BindView(R.id.btn_submit) Button btnSubmit;

    private String firstName;
    private String lastName;
    private String email;
    private String nickName;
    private String password;

    private boolean allDataPresents;

    private Integer errCode;
    private String sessionID;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registration);
        ButterKnife.bind(this);
    }

    @OnClick(R.id.btn_submit)
    public void onClickSubmit(Button button){

        initializeVariable();
        fieldIsEmpty();

        if(allDataPresents){
            registration();
        }

    }

    private void registration() {

        RegistrationService registrationService = ApiFactory.getRegistrationService();
        Call<RegistrationResponse> call = registrationService.registration(createRegistrationRequest());
        call.enqueue(new Callback<RegistrationResponse>() {

            @Override
            public void onResponse(Call<RegistrationResponse> call, Response<RegistrationResponse> response) {
                if (response.isSuccessful()) {
                    RegistrationResponse registrationResponse = response.body();
                    errCode = registrationResponse.getErrCode();
                    sessionID = registrationResponse.getSessionIdOut();
                    if(errCode == 1){
                        Toast.makeText(RegistrationActivity.this, "Registration successful", Toast.LENGTH_SHORT).show();
                        new StartMainActivityTask().execute();
                    }else if(errCode == 11){
                        Toast.makeText(RegistrationActivity.this, "Current user is already exists", Toast.LENGTH_SHORT).show();
                        new StartMainActivityTask().execute();
                    }
                } else {
                    Log.d("myLog", "Error");
                }
            }

            @Override
            public void onFailure(Call<RegistrationResponse> call, Throwable t) {

            }
        });

    }

    private boolean fieldIsEmpty() {

        allDataPresents = true;

        if(firstName.equals("")) {
            Toast.makeText(this, "Field First name is empty", Toast.LENGTH_SHORT).show();
            allDataPresents = false;
        }
        else if(lastName.equals("")){
            Toast.makeText(this, "Field Last name is empty", Toast.LENGTH_SHORT).show();
            allDataPresents = false;
        }
        else if(email.equals("")) {
            Toast.makeText(this, "Field Email is empty", Toast.LENGTH_SHORT).show();
            allDataPresents = false;
        }
        else if(nickName.equals("")){
            Toast.makeText(this, "Field Nick name is empty", Toast.LENGTH_SHORT).show();
            allDataPresents = false;
        }
        else if(password.equals("")){
            Toast.makeText(this, "Field Password is empty", Toast.LENGTH_SHORT).show();
            allDataPresents = false;
        }

        return allDataPresents;

    }

    private void initializeVariable() {

        firstName = etFirstName.getText().toString();
        lastName = etLastName.getText().toString();
        email = etMail.getText().toString();
        nickName = etNickName.getText().toString();
        password = etPassword.getText().toString();

    }

    private Registration createRegistrationRequest() {

        Parameters parameters = new Parameters("0.0.0.0",firstName,lastName,email,"2016-09-23 22:34:00",
                                                nickName, password,0,"OS","BROWSER",22.00f,22.00f);

        return new Registration(parameters);

    }

    public class StartMainActivityTask extends AsyncTask<Void, Void, Void> {
        @Override
        protected Void doInBackground(Void... voids) {

            try {
                Thread.sleep(2000);
            }catch (InterruptedException ie){
                ie.printStackTrace();
            }

            return null;
        }

        @Override
        protected void onPostExecute(Void aVoid) {
            super.onPostExecute(aVoid);
            Intent intent = new Intent(RegistrationActivity.this, MainActivity.class);
            intent.putExtra("errCode", errCode);
            intent.putExtra("email", email);
            intent.putExtra("sessionID", sessionID);

            startActivity(intent);
            overridePendingTransition(R.anim.open_next,R.anim.close_main);
        }
    }
}
