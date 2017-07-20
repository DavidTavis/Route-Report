package com.report.route.activity;

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

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registration);
        ButterKnife.bind(this);
    }

    @OnClick(R.id.btn_submit)
    public void submitRegistration(Button button){
        RegistrationService registrationService = ApiFactory.getRegistrationService();
        Call<RegistrationResponse> call = registrationService.registration(createTestRegistrationRequest());

        call.enqueue(new Callback<RegistrationResponse>() {
            @Override
            public void onResponse(Call<RegistrationResponse> call, Response<RegistrationResponse> response) {
                if (response.isSuccessful()) {
                    RegistrationResponse registrationResponse = response.body();
                    Toast.makeText(RegistrationActivity.this, registrationResponse.toString(), Toast.LENGTH_LONG).show();
                    Log.d("myLog",registrationResponse.toString());
                } else {
                    Log.d("myLog", "Error");
                }
            }

            @Override
            public void onFailure(Call<RegistrationResponse> call, Throwable t) {

            }
        });
    }


    private Registration createTestRegistrationRequest() {

        String firstName = etFirstName.getText().toString();
        String lastName = etLastName.getText().toString();
        String email = etMail.getText().toString();
        String nickName = etNickName.getText().toString();
        String password = etPassword.getText().toString();

        Parameters parameters = new Parameters("0.0.0.0",firstName,lastName,
                email,"2016-09-23 22:34:00",
                nickName, password,0,"OS","BROWSER",22.00f,22.00f);
//        Parameters parameters = new Parameters("0.0.0.0","Name","Name",
//                "EMAIL@EMAIL_EMAIL.COM","2016-09-23 22:34:00",
//                "NICK", "111111",0,"OS","BROWSER",22.00f,22.00f);

        return new Registration(parameters);

    }

}
