package com.report.route.activity;

import android.content.Intent;
import android.os.AsyncTask;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.report.route.R;
import com.report.route.data.model.authorization.Authorization;
import com.report.route.data.model.authorization.AuthorizationParameters;
import com.report.route.data.model.authorization.AuthorizationResponse;
import com.report.route.data.remote.registration.ApiFactory;
import com.report.route.data.remote.registration.RegistrationService;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

/**
 * Created by TechnoA on 22.07.2017.
 */

public class AuthorizationActivity extends AppCompatActivity {

    @BindView(R.id.et_user_email) EditText etEmail;
    @BindView(R.id.et_user_password) EditText etPassword;
    @BindView(R.id.btn_submit_authorization) Button btnSubmit;

    private String email;
    private String password;

    private boolean allDataPresents;

    private Integer errCode;
    private Object sessionID;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_authorization);
        ButterKnife.bind(this);
    }

    @OnClick(R.id.btn_submit_authorization)
    public void onClickSubmit(Button button){
        initializeVariable();
        fieldIsEmpty();

        if(allDataPresents){
            authorization();
        }
    }

    private void authorization() {

        RegistrationService registrationService = ApiFactory.getRegistrationService();
        Call<AuthorizationResponse> call = registrationService.authorization(createAuthorizationRequest());
        call.enqueue(new Callback<AuthorizationResponse>() {
            @Override
            public void onResponse(Call<AuthorizationResponse> call, Response<AuthorizationResponse> response) {
                AuthorizationResponse authorizationResponse = response.body();
                errCode = authorizationResponse.getErrCode();
                sessionID = authorizationResponse.getSessionIdOut();
                Log.d("myLog","errCode = " + errCode);
                if(errCode==20021){
                    Toast.makeText(AuthorizationActivity.this, "Please, check your password or email", Toast.LENGTH_SHORT).show();
                    Toast.makeText(AuthorizationActivity.this, authorizationResponse.toString(), Toast.LENGTH_SHORT).show();
                }else if (errCode == 1){
                    Toast.makeText(AuthorizationActivity.this, "Authorization successful", Toast.LENGTH_SHORT).show();
                    new StartMainActivityTask().execute();
                }
            }

            @Override
            public void onFailure(Call<AuthorizationResponse> call, Throwable t) {

            }
        });
    }

    private Authorization createAuthorizationRequest() {
        AuthorizationParameters parameters = new AuthorizationParameters("0.0.0.0",email,password,
                                "OS version","browser version", 22.00f, 22.00f);
        Authorization authorization = new Authorization(parameters);
        return authorization;
    }

    private boolean fieldIsEmpty() {

        allDataPresents = true;

        if(etEmail.equals("")) {
            Toast.makeText(this, "Field Email is empty", Toast.LENGTH_SHORT).show();
            allDataPresents = false;
        }
        else if(etPassword.equals("")){
            Toast.makeText(this, "Field Password is empty", Toast.LENGTH_SHORT).show();
            allDataPresents = false;
        }

        return allDataPresents;

    }

    private void initializeVariable() {
        email = etEmail.getText().toString();
        password = etPassword.getText().toString();
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
            Intent intent = new Intent(AuthorizationActivity.this, MainActivity.class);
            intent.putExtra("errCode", errCode);
            intent.putExtra("email", email);
//            intent.putExtra("sessionID", sessionID);

            startActivity(intent);
            overridePendingTransition(R.anim.open_next,R.anim.close_main);
        }
    }

}
