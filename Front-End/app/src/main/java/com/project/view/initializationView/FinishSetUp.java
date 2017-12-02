package com.project.view.initializationView;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.project.controller.initializeController.FinishSetUpController;
import com.project.view.loginView.MainActivity;
import com.project.view.R;

public class FinishSetUp extends AppCompatActivity {

    @Override
    /**
     * Set up the layout for finishing the initialization of the app
     */
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.finished_initialization);
        Button finish = (Button)findViewById(R.id.login);
        finish.setOnClickListener(new FinishSetUpController(this));
    }

}
