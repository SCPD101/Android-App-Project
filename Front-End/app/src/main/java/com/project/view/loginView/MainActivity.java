package com.project.view.loginView;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;

import com.project.controller.loginController.LoginSubmitController;
import com.project.view.R;
import com.project.view.initializationView.InitializeAdmin;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button login = (Button)findViewById(R.id.loginSubmit);
        login.setOnClickListener(new LoginSubmitController(this));
    }





}
