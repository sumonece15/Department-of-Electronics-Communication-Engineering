package com.tufayelahamed00ece.departmentofeletronicscommunicationengineering;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class SixthSemester extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sixth_semester);
    }
    public void GoBooks6th(View view) {
        Intent intent = new Intent(SixthSemester.this, Books6th.class);
        startActivity(intent);
    }
    public void GoQuestion6th(View view) {
        Intent intent = new Intent(SixthSemester.this,Question6th.class);
        startActivity(intent);
    }
    public void GoLabReport6(View view) {
        Intent intent = new Intent(SixthSemester.this,LabReport6.class);
        startActivity(intent);
    }
}
