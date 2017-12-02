package com.project.view.customerView;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.project.controller.customerController.CartButtonController;
import com.project.controller.customerController.ProfileButtonController;
import com.project.view.R;

public class UserLayout extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.userlayout);

        //Set up the Buttons
        Button cart = (Button)findViewById(R.id.cart);
        cart.setOnClickListener(new CartButtonController(this));
        Button profile = (Button)findViewById(R.id.view_profile);
        profile.setOnClickListener(new ProfileButtonController(this));
    }


}
