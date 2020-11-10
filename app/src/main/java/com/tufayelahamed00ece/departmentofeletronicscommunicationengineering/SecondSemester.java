package com.tufayelahamed00ece.departmentofeletronicscommunicationengineering;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class SecondSemester extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second_semester);
    }
    public void GoBooks2nd(View view){
        Intent intent = new Intent( SecondSemester.this,Books2nd.class );
        startActivity(intent);
    }
    public void GoLabReport2nd(View view){
        Intent intent = new Intent( SecondSemester.this,LabReport2nd.class );
        startActivity(intent);
    }
    public void GoQuestion2nd(View view){
        Intent intent = new Intent( SecondSemester.this,Question2nd.class );
        startActivity(intent);
    }
}
