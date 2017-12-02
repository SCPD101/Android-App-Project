package com.project.controller.adminController;

import android.content.Context;
import android.content.Intent;
import android.view.View;
import android.widget.Button;

import com.project.view.adminView.PromoteEmployee;

/**
 * Created by Bill Huang on 2017-11-28.
 */

public class PromoteEmployeeButtonController implements View.OnClickListener {

    private Context appContext;

    public PromoteEmployeeButtonController(Context context) {
        this.appContext = context;
    }

    @Override
    public void onClick(View view) {
        promoteEmployee(view);
    }

    /**
     * Promote employee to admin
     * @param view the current view
     */
    private void promoteEmployee(View view){
        Intent promote = new Intent(this.appContext, PromoteEmployee.class);
        this.appContext.startActivity(promote);
    }
}
