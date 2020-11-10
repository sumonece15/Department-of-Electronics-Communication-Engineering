package com.tufayelahamed00ece.departmentofeletronicscommunicationengineering;

import android.content.Context;
import android.content.Intent;
import android.content.res.AssetManager;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Toast;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class ECESyllabus extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_ecesyllabus );
    }

    public void GoCourseOutline(View view) {
        Intent intent = new Intent(ECESyllabus.this, CourseOutline.class);
        startActivity(intent);
    }
}