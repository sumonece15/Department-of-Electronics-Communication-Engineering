package com.tufayelahamed00ece.departmentofeletronicscommunicationengineering;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class ThirdSemester extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third_semester);
    }
    public void GoBooks3rd(View view) {
        Intent intent = new Intent(ThirdSemester.this,Books3rd.class);
        startActivity(intent);
    }
    public void GoQuestion3rd(View view) {
        Intent intent = new Intent(ThirdSemester.this,Question3rd.class);
        startActivity(intent);
    }
    public void GoLabReport3 (View view) {
        Intent intent = new Intent(ThirdSemester.this,LabReport3.class);
        startActivity(intent);
    }
}
