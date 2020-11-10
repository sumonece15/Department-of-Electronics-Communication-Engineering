package com.tufayelahamed00ece.departmentofeletronicscommunicationengineering;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

public class ZoomActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_zoom );
        zoom();
        new Handler().postDelayed( new Runnable() {
            @Override
            public void run() {
                Intent homeIntent= new Intent(ZoomActivity.this,MainActivity.class);
                startActivity(homeIntent);
                finish();
            }
        },3000);
    }



    public void zoom(){
        ImageView image = (ImageView)findViewById(R.id.zoom);
        Animation animation1 = AnimationUtils.loadAnimation(getApplicationContext(),
                R.anim.zoom);
        image.startAnimation(animation1);
    }

}
