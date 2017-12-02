package com.project.view.adminView;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.project.controller.createAccountController.CreateAccountController;
import com.project.view.R;

public class CreateNewAccountAdmin extends AppCompatActivity {

    @Override
    /**
     * Set up the admin view when creating new accounts.
     */
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.create_new_account);
        Button create = (Button)findViewById(R.id.createAccount);
        create.setOnClickListener(new CreateAccountController(this, "Admin"));
    }

}
