package com.project.controller.customerController;

import android.content.Context;
import android.content.Intent;
import android.view.View;

import com.project.view.customerView.EditInfoCustomer;
import com.project.view.customerView.ShoppingCart;

/**
 * Created by Bill Huang on 2017-12-01.
 */

public class EditCustomerButtonController implements View.OnClickListener {

    private Context appContext;

    public EditCustomerButtonController(Context context) {
        this.appContext = context;
    }

    @Override
    public void onClick(View view) {
        Intent edit = new Intent(this.appContext, EditInfoCustomer.class);
        this.appContext.startActivity(edit);
    }
}
