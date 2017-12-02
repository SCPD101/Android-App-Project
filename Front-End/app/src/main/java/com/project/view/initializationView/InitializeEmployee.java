package com.project.view.initializationView;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.project.controller.initializeController.CreateAdminController;
import com.project.controller.initializeController.CreateEmployeeController;
import com.project.view.R;

public class InitializeEmployee extends AppCompatActivity {

    @Override
    /**
     * Instant the layout for creating the first employee
     */
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.create_employee);
        Button createEmployee = (Button)findViewById(R.id.createEmployee);
        createEmployee.setOnClickListener(new CreateEmployeeController(this));
    }

}
