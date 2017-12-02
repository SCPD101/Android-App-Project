package com.project.controller.createAccountController;

import android.content.Context;
import android.content.Intent;
import android.view.View;

import com.project.view.adminView.AdminLayout;
import com.project.view.employeeView.EmployeeLayout;

/**
 * Created by Bill Huang on 2017-12-01.
 */

public class NewAccountViewController implements View.OnClickListener {

    private Context appContext;
    private String accountAuthorization;

    public NewAccountViewController(Context context, String accountAuthorization) {
        this.appContext = context;
        this.accountAuthorization = accountAuthorization;
    }

    @Override
    public void onClick(View view) {
        goToMenu(view);
    }

    /**
     * Go back to the respective menu screen.
     * @param view the current view
     */
    private void goToMenu(View view) {
        //Check the account authorization to go back to the screen
        Intent menu;
        if (this.accountAuthorization.equals("Admin")) {
            menu = new Intent(this.appContext, AdminLayout.class);
        } else {
            menu = new Intent(this.appContext, EmployeeLayout.class);
        }
        this.appContext.startActivity(menu);
    }
}
