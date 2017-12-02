package com.project.controller.editInfoController;

import android.content.Context;
import android.content.Intent;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import com.project.view.adminView.AdminLayout;
import com.project.view.customerView.UserProfile;
import com.project.view.employeeView.EditInfoEmployee;
import com.project.view.employeeView.EmployeeLayout;

/**
 * Created by Bill Huang on 2017-12-01.
 */

public class EditInfoController implements View.OnClickListener {

    private Context appContext;
    private String accountType;

    public EditInfoController(Context context, String accountType) {
        this.appContext = context;
        this.accountType = accountType;
    }

    @Override
    public void onClick(View view) {
        saveChanges(view);
    }

    /**
     * Save the new changes and go back to the menu
     * @param view the current view
     */
    private void saveChanges(View view) {
        //Check the account type
        Intent save;
        if (this.accountType.equals("Admin")) {
            save = new Intent(this.appContext, AdminLayout.class);
        } else if (this.accountType.equals("Employee")){
            save = new Intent(this.appContext, EmployeeLayout.class);
        } else {
            save = new Intent(this.appContext, UserProfile.class);
        }
        //Print a message saving the new info and go back to the menu
        CharSequence message = "Changes successfully saved";
        Toast.makeText(this.appContext, message, Toast.LENGTH_SHORT).show();
        this.appContext.startActivity(save);
    }
}
