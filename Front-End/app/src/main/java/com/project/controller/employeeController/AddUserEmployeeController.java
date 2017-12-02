package com.project.controller.employeeController;

import android.content.Context;
import android.content.Intent;
import android.view.View;

import com.project.view.adminView.CreateNewAccountAdmin;
import com.project.view.employeeView.CreateNewAccountEmployee;

/**
 * Created by Bill Huang on 2017-11-29.
 */

public class AddUserEmployeeController implements View.OnClickListener {

    private Context appContext;

    public AddUserEmployeeController(Context context) {
        this.appContext = context;
    }

    @Override
    public void onClick(View view) {
        Intent addUser = new Intent(this.appContext, CreateNewAccountEmployee.class);
        this.appContext.startActivity(addUser);
    }
}
