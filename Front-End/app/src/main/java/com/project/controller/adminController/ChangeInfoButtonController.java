package com.project.controller.adminController;

import android.content.Context;
import android.content.Intent;
import android.view.View;

import com.project.view.adminView.EditInfoAdmin;

/**
 * Created by Bill Huang on 2017-11-27.
 */

public class ChangeInfoButtonController implements View.OnClickListener {

    private Context appContext;

    public ChangeInfoButtonController(Context context) {
        this.appContext = context;
    }

    @Override
    public void onClick(View view) {
        changeInfoAdmin(view);
    }

    /**
     * Edit the current info of the admin
     * @param view the current view
     */
    private void changeInfoAdmin(View view){
        Intent changeInfoScreen = new Intent(this.appContext, EditInfoAdmin.class);
        this.appContext.startActivity(changeInfoScreen);
    }
}
