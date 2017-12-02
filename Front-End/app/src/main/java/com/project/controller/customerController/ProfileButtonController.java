package com.project.controller.customerController;

import android.content.Context;
import android.content.Intent;
import android.view.View;

import com.project.view.customerView.UserProfile;

/**
 * Created by Bill Huang on 2017-12-01.
 */

public class ProfileButtonController implements View.OnClickListener {

    private Context appContext;

    public ProfileButtonController(Context context) {
        this.appContext = context;
    }

    @Override
    public void onClick(View view) {
        Intent profile = new Intent(this.appContext, UserProfile.class);
        this.appContext.startActivity(profile);
    }
}
