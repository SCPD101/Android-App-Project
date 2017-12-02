package com.project.controller.adminController;

import android.content.Context;
import android.content.Intent;
import android.view.View;

import com.project.view.adminView.CreateNewAccountAdmin;

/**
 * Created by Bill Huang on 2017-11-28.
 */

public class AddUserButtonController implements View.OnClickListener {

    private Context appContext;

    public AddUserButtonController(Context context) {
        this.appContext = context;
    }

    @Override
    public void onClick(View view) {
        addNewUser(view);
    }
    /**
     * Add a new account to the database
     * @param view the current view
     */
    private void addNewUser(View view){
        Intent addUser = new Intent(this.appContext, CreateNewAccountAdmin.class);
        this.appContext.startActivity(addUser);
    }
}
