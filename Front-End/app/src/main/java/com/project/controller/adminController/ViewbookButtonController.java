package com.project.controller.adminController;

import android.content.Context;
import android.content.Intent;
import android.view.View;

import com.project.view.adminView.PromoteEmployee;
import com.project.view.adminView.Viewbook;

/**
 * Created by Bill Huang on 2017-11-28.
 */

public class ViewbookButtonController implements View.OnClickListener {

    private Context appContext;

    public ViewbookButtonController(Context context) {
        this.appContext = context;
    }

    @Override
    public void onClick(View view) {
        viewbookAdmin(view);
    }

    /**
     * View the purchases of the store and revenue
     * @param view the current view
     */
    private void viewbookAdmin(View view){
        Intent viewbook = new Intent(this.appContext, Viewbook.class);
        this.appContext.startActivity(viewbook);
    }


}
