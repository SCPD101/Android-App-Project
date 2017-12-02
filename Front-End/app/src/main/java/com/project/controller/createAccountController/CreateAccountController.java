package com.project.controller.createAccountController;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioGroup;
import android.widget.Toast;

import com.project.view.R;
import com.project.view.newAccountResultView.NewAccountResultLayout;

/**
 * Created by Bill Huang on 2017-11-29.
 */

public class CreateAccountController implements View.OnClickListener {

    private Context appContext;
    private String accountAuthorization;

    public CreateAccountController(Context context, String accountType) {
        this.appContext = context;
        this.accountAuthorization = accountType;
    }

    @Override
    public void onClick(View view) {
        createAccount(view);
    }

    /**
     * Create the account of the new user.
     * @param view the current view
     */
    private void createAccount(View view) {
        //Get the info of the user
        String name = this.getName();
        String age = this.getAge();
        String address = this.getAddress();
        String password = this.getPassword();
        String confirmedPassword = this.getConfirmedPassword();
        String accountType = this.getAccountType();

        //Check the inputs if its valid
        CharSequence message = "";
        if (name.length() == 0) {
            message = "Please enter your name";
            Toast.makeText(this.appContext, message, Toast.LENGTH_SHORT).show();
        } else if (age.length() == 0) {
            message = "Please enter your age";
            Toast.makeText(this.appContext, message, Toast.LENGTH_SHORT).show();
        } else if (address.length() == 0) {
            message = "Please enter your address";
            Toast.makeText(this.appContext, message, Toast.LENGTH_SHORT).show();
        } else if (password.length() == 0) {
            message = "Please enter your password";
            Toast.makeText(this.appContext, message, Toast.LENGTH_SHORT).show();
        } else if (confirmedPassword.length() == 0) {
            message = "Please confirm your password";
            Toast.makeText(this.appContext, message, Toast.LENGTH_SHORT).show();
        } else if (accountType.length() == 0) {
            message = "Please choose the type of user to create the account";
            Toast.makeText(this.appContext, message, Toast.LENGTH_SHORT).show();
        } else if (!(password.equals(confirmedPassword))) {
            message = "The password you entered does not match your original password";
            Toast.makeText(this.appContext, message, Toast.LENGTH_SHORT).show();
        } else {
            //Send the new info to the new screen
            Intent review = new Intent(this.appContext, NewAccountResultLayout.class);
            review.putExtra("accountType", accountType);
            review.putExtra("accountAuthorization", this.accountAuthorization);
            this.appContext.startActivity(review);

        }

    }


    /**
     * Get the name of the user.
     * @return the name of the user
     */
    private String getName() {
        EditText name = (EditText)((AppCompatActivity)appContext).findViewById(R.id.name);
        return name.getText().toString();
    }

    /**
     * Get the age of the user.
     * @return the age of the user in string
     */
    private String getAge() {
        EditText age = (EditText)((AppCompatActivity)appContext).findViewById(R.id.age);
        return age.getText().toString();
    }

    /**
     * Get the address of the user.
     * @return the address of the user
     */
    private String getAddress() {
        EditText address =
                (EditText)((AppCompatActivity)appContext).findViewById(R.id.address);
        return address.getText().toString();
    }

    /**
     * Get the password of the user.
     * @return the password of the user
     */
    private String getPassword() {
        EditText password =
                (EditText)((AppCompatActivity)appContext).findViewById(R.id.password);
        return password.getText().toString();
    }

    /**
     * Get the confirmed password of the user.
     * @return the confirmed password of the user
     */
    private String getConfirmedPassword() {
        EditText confirmedPassword =
                (EditText)((AppCompatActivity)appContext).findViewById(R.id.confirmPassword);
        return confirmedPassword.getText().toString();
    }

    /**
     * Get the account type of the user.
     * @return the account type of the user
     */
    private String getAccountType() {
        String accountType = "";
        RadioGroup user = (RadioGroup)((AppCompatActivity)appContext).findViewById(R.id.selectUser);
        if (user.getCheckedRadioButtonId() == R.id.customer) {
            accountType = "Customer";
        } else if (user.getCheckedRadioButtonId() == R.id.employee) {
            accountType = "Employee";
        } else {
            accountType = "";
        }
        return accountType;
    }
}

