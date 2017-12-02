package com.project.view.customerView;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;

import com.project.controller.customerController.shoppingCartController.ShoppingCartController;
import com.project.view.R;

public class ShoppingCart extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.mycartlayout);
        Button checkout = (Button)findViewById(R.id.checkOut);
        checkout.setOnClickListener(new ShoppingCartController(this));
    }
}
