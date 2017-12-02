package com.project.view.customerView;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;

import com.project.controller.customerController.EditCustomerButtonController;
import com.project.controller.editInfoController.EditInfoController;
import com.project.view.R;

public class UserProfile extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.user_profile);
        Button edit = (Button)findViewById(R.id.change_info);
        edit.setOnClickListener(new EditCustomerButtonController(this));
    }
}
