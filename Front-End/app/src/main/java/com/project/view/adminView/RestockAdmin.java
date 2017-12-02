package com.project.view.adminView;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;

import com.project.controller.restockController.RestockController;
import com.project.view.R;

public class RestockAdmin extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.restock_items);
        Button restock = (Button)findViewById(R.id.restock);
        restock.setOnClickListener(new RestockController(this, "Admin"));
    }
}
