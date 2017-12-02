package com.project.view.initializationView;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.project.controller.initializeController.CreateAdminController;
import com.project.view.R;

public class InitializeAdmin extends AppCompatActivity {

    @Override
    /**
     * Set up the current view when creating the first admin account.
     */
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.create_admin);
        Button createAdmin = (Button)findViewById(R.id.createAdmin);
        createAdmin.setOnClickListener(new CreateAdminController(this));
    }

}
