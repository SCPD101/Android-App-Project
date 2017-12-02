package com.project.view.adminView;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;

import com.project.controller.adminController.promoteEmployeeController.PromoteEmployeeController;
import com.project.view.R;

public class PromoteEmployee extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.promote_employee);
        Button promote = (Button)findViewById(R.id.promote);
        promote.setOnClickListener(new PromoteEmployeeController(this));
    }
}
