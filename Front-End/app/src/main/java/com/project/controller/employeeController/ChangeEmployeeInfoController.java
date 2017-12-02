package com.project.controller.employeeController;

import android.content.Context;
import android.content.Intent;
import android.view.View;

import com.project.view.employeeView.EditInfoEmployee;

/**
 * Created by Bill Huang on 2017-11-29.
 */

public class ChangeEmployeeInfoController implements View.OnClickListener {

    private Context appContext;

    public ChangeEmployeeInfoController(Context context) {
        this.appContext = context;
    }

    @Override
    public void onClick(View view) {
        changeInfoEmployee(view);
    }

    /**
     * Add a new account to the database
     * @param view the current view
     */
    private void changeInfoEmployee(View view){
        Intent changeInfo = new Intent(this.appContext, EditInfoEmployee.class);
        this.appContext.startActivity(changeInfo);
    }
}
