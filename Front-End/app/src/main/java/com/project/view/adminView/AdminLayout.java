package com.project.view.adminView;

import android.support.v7.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.project.controller.adminController.AddUserButtonController;
import com.project.controller.adminController.ChangeInfoButtonController;
import com.project.controller.adminController.PromoteEmployeeButtonController;
import com.project.controller.adminController.RestockButtonController;
import com.project.controller.adminController.ViewbookButtonController;
import com.project.view.R;

public class AdminLayout extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.admin_layout);
        Button changeInfo = (Button)findViewById(R.id.changeInfo);
        changeInfo.setOnClickListener(new ChangeInfoButtonController(this));

        Button restock = (Button)findViewById(R.id.restock);
        restock.setOnClickListener(new RestockButtonController(this));

        Button addUser = (Button)findViewById(R.id.addUser);
        addUser.setOnClickListener(new AddUserButtonController(this));

        Button promote = (Button)findViewById(R.id.promoteEmployee);
        promote.setOnClickListener(new PromoteEmployeeButtonController(this));

        Button viewbook = (Button)findViewById(R.id.viewbook);
        viewbook.setOnClickListener(new ViewbookButtonController(this));
    }












}
