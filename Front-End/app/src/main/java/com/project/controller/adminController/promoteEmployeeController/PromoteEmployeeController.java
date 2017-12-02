package com.project.controller.adminController.promoteEmployeeController;

import android.content.Context;
import android.content.Intent;
import android.view.View;
import android.widget.Toast;

import com.project.view.adminView.AdminLayout;
import com.project.view.adminView.PromoteEmployee;

/**
 * Created by Bill Huang on 2017-12-01.
 */

public class PromoteEmployeeController implements View.OnClickListener {

    private Context appContext;

    public PromoteEmployeeController(Context context) {
        this.appContext = context;
    }

    @Override
    public void onClick(View view) {
        promote(view);
    }

    /**
     * Promote the employees and return back to the main menu.
     * @param view the current view
     */
    private void promote(View view) {
        Intent menu = new Intent(this.appContext, AdminLayout.class);
        Toast.makeText(this.appContext,"Employees Promoted",Toast.LENGTH_SHORT).show();
        this.appContext.startActivity(menu);
    }
}
