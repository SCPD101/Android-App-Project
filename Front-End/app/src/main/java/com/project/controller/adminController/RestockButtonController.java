package com.project.controller.adminController;

import android.content.Context;
import android.content.Intent;
import android.view.View;

import com.project.view.adminView.RestockAdmin;

/**
 * Created by Bill Huang on 2017-11-28.
 */

public class RestockButtonController implements View.OnClickListener {

    private Context appContext;

    public RestockButtonController(Context context) {
        this.appContext = context;
    }

    @Override
    public void onClick(View view) {
        restockInventory(view);
    }

    /**
     * Go to the restock inventory layout.
     * @param view the current view
     */
    private void restockInventory(View view){
        Intent restock = new Intent(this.appContext, RestockAdmin.class);
        this.appContext.startActivity(restock);
    }
}
