package com.project.view.employeeView;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.project.controller.createAccountController.CreateAccountController;
import com.project.view.R;

public class CreateNewAccountEmployee extends AppCompatActivity {

    @Override
    /**
     * Instant the layout for creating the first employee
     */
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.create_new_account);
        Button create = (Button)findViewById(R.id.createAccount);
        create.setOnClickListener(new CreateAccountController(this, "Employee"));
    }

}
