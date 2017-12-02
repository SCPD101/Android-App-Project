package com.project.controller.customerController.shoppingCartController;

import android.content.Context;
import android.content.Intent;
import android.view.View;

import com.project.view.customerView.ShoppingCart;
import com.project.view.customerView.UserLayout;

/**
 * Created by Bill Huang on 2017-12-01.
 */

public class ShoppingCartController implements View.OnClickListener {

    private Context appContext;

    public ShoppingCartController(Context context) {
        this.appContext = context;
    }

    @Override
    public void onClick(View view) {
        Intent checkout = new Intent(this.appContext, UserLayout.class);
        this.appContext.startActivity(checkout);
    }
}
