package com.project.controller.customerController;

import android.content.Context;
import android.content.Intent;
import android.view.View;

import com.project.view.customerView.ShoppingCart;
import com.project.view.customerView.UserProfile;

/**
 * Created by Bill Huang on 2017-12-01.
 */

public class CartButtonController implements View.OnClickListener {

    private Context appContext;

    public CartButtonController(Context context) {
        this.appContext = context;
    }

    @Override
    public void onClick(View view) {
        Intent cart = new Intent(this.appContext, ShoppingCart.class);
        this.appContext.startActivity(cart);
    }
}
