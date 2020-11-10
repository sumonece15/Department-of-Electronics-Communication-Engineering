package com.tufayelahamed00ece.departmentofeletronicscommunicationengineering;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class FirstSemester extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first_semester);
    }


    public void Gobooks(View view) {
        Intent intent = new Intent(FirstSemester.this, Books.class);
        startActivity(intent);
    }
    public void GoLabReport(View view){
        Intent intent = new Intent(FirstSemester.this,LabReport.class);
        startActivity(intent);
    }
    public void GoQuestion(View view) {
        Intent intent = new Intent(FirstSemester.this,Question1st.class);
        startActivity(intent);
    }

}
