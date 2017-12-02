package com.project.view.employeeView;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.project.controller.adminController.AddUserButtonController;
import com.project.controller.employeeController.AddUserEmployeeController;
import com.project.controller.employeeController.ChangeEmployeeInfoController;
import com.project.controller.employeeController.RestockEmployeeController;
import com.project.view.R;

public class EmployeeLayout extends AppCompatActivity {

    @Override
    /**
     * Set up the layout for the employee interface
     */
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.employee_layout);
        Button changeInfo = (Button)findViewById(R.id.changeInfo);
        changeInfo.setOnClickListener(new ChangeEmployeeInfoController(this));

        Button restock = (Button)findViewById(R.id.restock);
        restock.setOnClickListener(new RestockEmployeeController(this));

        Button addUser = (Button)findViewById(R.id.addUser);
        addUser.setOnClickListener(new AddUserEmployeeController(this));

    }




    /**
     * Access the add user layout.
     * @param view the current view
     */
    public void addUser(View view){
        Intent addUser = new Intent(this, CreateNewAccountEmployee.class);
        startActivity(addUser);
    }
}
