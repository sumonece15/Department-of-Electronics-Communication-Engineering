package com.tufayelahamed00ece.departmentofeletronicscommunicationengineering;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class FifthSemester extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fifth_semester);
    }
    public void GoBooks5th(View view) {
        Intent intent = new Intent(FifthSemester.this, Books5th.class);
        startActivity(intent);
    }
    public void GoQuestion5th(View view) {
        Intent intent = new Intent(FifthSemester.this, Question5th.class);
        startActivity(intent);
    }
    public void GoLabReport5(View view) {
        Intent intent = new Intent(FifthSemester.this,LabReport5.class);
        startActivity(intent);
    }
}
