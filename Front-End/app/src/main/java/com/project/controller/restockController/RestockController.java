package com.project.controller.restockController;

import android.content.Context;
import android.content.Intent;
import android.view.View;
import android.widget.Toast;

import com.project.view.adminView.AdminLayout;
import com.project.view.employeeView.EmployeeLayout;

/**
 * Created by Bill Huang on 2017-12-01.
 */

public class RestockController implements View.OnClickListener {

    private Context appContext;
    private String accountType;

    public RestockController(Context context, String accountType) {
        this.appContext = context;
        this.accountType = accountType;
    }

    @Override
    public void onClick(View view) {
        restock(view);
    }

    /**
     * Restock the items and go back to the new menu
     * @param view the current view
     */
    private void restock(View view) {
        //Check the account type
        Intent restock;
        if (this.accountType.equals("Admin")) {
            restock = new Intent(this.appContext, AdminLayout.class);
        } else {
            restock = new Intent(this.appContext, EmployeeLayout.class);
        }
        //Print a message restocking the items
        CharSequence message = "Items restocked";
        Toast.makeText(this.appContext, message, Toast.LENGTH_SHORT).show();
        this.appContext.startActivity(restock);
    }
}
