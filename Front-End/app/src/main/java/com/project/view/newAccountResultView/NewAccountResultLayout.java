package com.project.view.newAccountResultView;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.project.controller.createAccountController.NewAccountViewController;
import com.project.view.R;

/**
 * Created by Bill Huang on 2017-12-01.
 */

public class NewAccountResultLayout extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.show_new_account);

        //Get the account info from the previous screen
        Intent intent = getIntent();
        String accountType = intent.getStringExtra("accountType");
        String accountAuthorized = intent.getStringExtra("accountAuthorization");

        //Print the new message when the account is created
        TextView success = (TextView)findViewById(R.id.userType);
        success.setText(accountType);

        //Create the new button
        Button okButton = (Button)findViewById(R.id.okButton);
        okButton.setOnClickListener(new NewAccountViewController(this, accountAuthorized));
    }
}
