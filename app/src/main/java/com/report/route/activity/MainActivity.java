package com.report.route.activity;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;
import android.widget.TextView;

import com.report.route.R;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

/**
 * Created by TechnoA on 21.07.2017.
 */

public class MainActivity extends AppCompatActivity {

    @BindView(R.id.tv_user_email) TextView tvUserEmail;
    @BindView(R.id.tv_err_code) TextView tvErrorCode;
    @BindView(R.id.tv_session_id) TextView tvSessionID;
    @BindView(R.id.btn_logout) Button btnLogout;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);

        Intent intent = getIntent();
        String sessionID = intent.getStringExtra("sessionID");
        Integer errCode = intent.getIntExtra("errCode",0);
        String email = intent.getStringExtra("email");

        tvUserEmail.setText(email);
        tvErrorCode.setText(errCode.toString());
        tvSessionID.setText(sessionID);
    }

    @OnClick(R.id.btn_logout)
    public void onClickLogout(Button button){

        Intent intent = new Intent(this,AuthorizationActivity.class);
        startActivity(intent);

    }
}
