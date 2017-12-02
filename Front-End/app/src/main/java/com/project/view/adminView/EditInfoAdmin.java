package com.project.view.adminView;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import com.project.controller.editInfoController.EditInfoController;
import com.project.view.R;

/**
 * Created by Bill Huang on 2017-11-22.
 */

public class EditInfoAdmin extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.edit_info);
        Button edit = (Button)findViewById(R.id.save_changes);
        edit.setOnClickListener(new EditInfoController(this, "Admin"));
    }
}
