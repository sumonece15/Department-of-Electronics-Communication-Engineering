package com.tufayelahamed00ece.departmentofeletronicscommunicationengineering;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class FourthSemester extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fourth_semester);
    }
    public void GoBooks4th(View view) {
        Intent intent = new Intent(FourthSemester.this, Books4th.class);
        startActivity(intent);
    }

    public void GoQuestion4th(View view) {
        Intent intent = new Intent(FourthSemester.this,Question4th.class);
        startActivity(intent);
    }
    public void GoLabReport4(View view) {
        Intent intent = new Intent(FourthSemester.this,LabReport8.class);
        startActivity(intent);
    }
}
