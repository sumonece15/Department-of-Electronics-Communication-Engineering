package com.tufayelahamed00ece.departmentofeletronicscommunicationengineering;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Eightsemester extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_eightsemester);
    }
    public void GoBooks8th(View view) {
        Intent intent = new Intent(Eightsemester.this, Books8th.class);
        startActivity(intent);
    }
    public void GoQuestion8th(View view) {
        Intent intent = new Intent(Eightsemester.this,Question8th.class);
        startActivity(intent);
    }
    public void GoLabReport8(View view) {
        Intent intent = new Intent(Eightsemester.this,LabReport8.class);
        startActivity(intent);
    }


    }

