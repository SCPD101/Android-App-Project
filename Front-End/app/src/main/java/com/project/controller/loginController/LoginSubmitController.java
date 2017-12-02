package com.project.controller.loginController;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioGroup;
import android.widget.Toast;

import com.project.view.R;
import com.project.view.adminView.AdminLayout;
import com.project.view.customerView.UserLayout;
import com.project.view.employeeView.EmployeeLayout;
import com.project.view.loginView.MainActivity;

public class LoginSubmitController implements View.OnClickListener {
    private Context appContext;

    public LoginSubmitController (Context context) {
        this.appContext = context;
    }

    @Override
    public void onClick(View view) {
        logIn(view);
    }

    /**
     * Select which type of user to login
     * @param view the current view
     * @return the type of user to login
     */
    private String selectUser(View view){
        String accountType = "";
        RadioGroup user = (RadioGroup)((AppCompatActivity)appContext).findViewById(R.id.selectUser);
        if (user.getCheckedRadioButtonId() == R.id.selectCustomer) {
            accountType = "Customer";
        } else if (user.getCheckedRadioButtonId() == R.id.selectAdmin) {
            accountType = "Admin";
        } else if (user.getCheckedRadioButtonId() == R.id.selectEmployee) {
            accountType = "Employee";
        } else {
            accountType = "";
        }
        return accountType;
    }

    /**
     * Login the user with the correct authorization
     * @param view the current view
     */
    private void logIn(View view){

        //Obtain the strings inputted by the user
        EditText enterUserId = (EditText) ((MainActivity)appContext).findViewById(R.id.enterUserId);
        String userIdInput = enterUserId.getText().toString();
        EditText enterPassword = (EditText)
                  ((MainActivity)appContext).findViewById(R.id.enterPassword);
        String password = enterPassword.getText().toString();
        String accountType = selectUser(view);

        //Check the input of the user
        int duration = Toast.LENGTH_SHORT;
        CharSequence message = "";
        if (userIdInput.length() == 0) {
            //Print the error message if the userID has not been inputted
            message = "Please enter your userID";
            Toast.makeText(this.appContext, message, duration).show();
        } else if (password.length() == 0) {
            //Print the error message if the password has not been inputted
            message = "Please enter your password";
            Toast.makeText(this.appContext, message, duration).show();
        } else if (accountType.length() == 0) {
            //Print the error message if the type of user has not been selected
            message = "Please select the type of user to login";
            Toast.makeText(this.appContext, message, duration).show();
        } else {
            int userId = Integer.valueOf(userIdInput);
            //Check the account type
            Intent welcomeScreen;
            if (accountType.equals("Customer")) {
                welcomeScreen = new Intent(this.appContext, UserLayout.class);
            } else if (accountType.equals("Admin")) {
                welcomeScreen = new Intent(this.appContext, AdminLayout.class);
            } else {
                welcomeScreen = new Intent(this.appContext, EmployeeLayout.class);
            }
            this.appContext.startActivity(welcomeScreen);
        }
    }

}
