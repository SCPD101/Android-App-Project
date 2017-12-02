package com.project.controller.employeeController;

import android.content.Context;
import android.content.Intent;
import android.view.View;

import com.project.view.employeeView.RestockEmployee;

/**
 * Created by Bill Huang on 2017-11-29.
 */

public class RestockEmployeeController implements View.OnClickListener {

    private Context appContext;

    public RestockEmployeeController(Context context) {
        this.appContext = context;
    }

    @Override
    public void onClick(View view) {
        restockInv(view);
    }

    /**
     * Access the restock inventory layout.
     * @param view the current view
     */
    private void restockInv(View view){
        Intent restock = new Intent(this.appContext, RestockEmployee.class);
        this.appContext.startActivity(restock);
    }

}
