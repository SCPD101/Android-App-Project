package com.project.controller.initializeController;

import android.content.Context;
import android.content.Intent;
import android.view.View;

import com.project.view.loginView.MainActivity;

/**
 * Created by Bill Huang on 2017-12-01.
 */

public class FinishSetUpController implements View.OnClickListener {

    private Context appContext;

    public FinishSetUpController(Context context) {
        this.appContext = context;
    }

    @Override
    public void onClick(View view) {
        Intent login = new Intent(this.appContext, MainActivity.class);
        this.appContext.startActivity(login);
    }
}
