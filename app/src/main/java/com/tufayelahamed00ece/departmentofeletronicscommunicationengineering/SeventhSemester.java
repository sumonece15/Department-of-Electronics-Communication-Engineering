package com.tufayelahamed00ece.departmentofeletronicscommunicationengineering;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class SeventhSemester extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_seventh_semester);
    }
    public void GoBooks7th(View view) {
        Intent intent = new Intent(SeventhSemester.this, Books7th.class);
        startActivity(intent);
    }
    public void GoQuestion7th(View view) {
        Intent intent = new Intent(SeventhSemester.this,Question7th.class);
        startActivity(intent);
    }
    public void GoLabReport7(View view) {
        Intent intent = new Intent(SeventhSemester.this,LabReport7.class);
        startActivity(intent);
    }
}
