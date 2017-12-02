package com.project.controller.initializeController;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import com.project.view.R;
import com.project.view.initializationView.InitializeEmployee;
import com.project.view.newAccountResultView.NewAccountResultLayout;

/**
 * Created by Bill Huang on 2017-12-01.
 */

public class CreateAdminController implements View.OnClickListener {

    private Context appContext;

    public CreateAdminController(Context context) {
        this.appContext = context;
    }

    @Override
    public void onClick(View view) {
        createAdmin(view);
    }

    /**
     * Create the new admin for the new store.
     * @param view the current view
     */
    private void createAdmin(View view) {
        String name = this.getName();
        String age = this.getAge();
        String address = this.getAddress();
        String password = this.getPassword();
        String confirmedPassword = this.getConfirmedPassword();

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
        } else if (!(password.equals(confirmedPassword))) {
            message = "The password you entered does not match your original password";
            Toast.makeText(this.appContext, message, Toast.LENGTH_SHORT).show();
        } else {
            //Send the new info to the new screen
            Intent review = new Intent(this.appContext, InitializeEmployee.class);
            this.appContext.startActivity(review);

        }
    }

    /**
     * Get the name of the admin
     * @return the name
     */
    private String getName() {
        EditText name = (EditText)((AppCompatActivity)appContext).findViewById(R.id.name);
        return name.getText().toString();
    }

    /**
     * Get the age of the admin
     * @return the age in string
     */
    private String getAge() {
        EditText age = (EditText)((AppCompatActivity)appContext).findViewById(R.id.age);
        return age.getText().toString();
    }

    /**
     * Get the address of the admin
     * @return the address of the admin
     */
    private String getAddress() {
        EditText address =
                (EditText)((AppCompatActivity)appContext).findViewById(R.id.address);
        return address.getText().toString();
    }

    /**
     * Get the password of the admin
     * @return the password of the admin
     */
    private String getPassword() {
        EditText password =
                (EditText)((AppCompatActivity)appContext).findViewById(R.id.password);
        return password.getText().toString();
    }

    /**
     * Get the confirmed password of the admin
     * @return the confirmed password of the admin
     */
    private String getConfirmedPassword() {
        EditText confirmedPassword =
                (EditText)((AppCompatActivity)appContext).findViewById(R.id.confirmPassword);
        return confirmedPassword.getText().toString();
    }
}
