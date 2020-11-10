package com.tufayelahamed00ece.departmentofeletronicscommunicationengineering;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void GoFacultymembers(View view){
        Intent intent=new Intent(MainActivity.this,Facultymembers.class);
        startActivity(intent);

    }
    public void GoECESyllabus(View view){
        Intent intent=new Intent(MainActivity.this,ECESyllabus.class);
        startActivity(intent);

    }

    public void GoFirst(View view) {
        Intent intent = new Intent(MainActivity.this, FirstSemester.class);
        startActivity(intent);
    }

    public void GoSecond(View view) {
        Intent intent = new Intent(MainActivity.this, SecondSemester.class);
        startActivity(intent);
    }
    public void GoThird(View view) {
        Intent intent = new Intent(MainActivity.this, ThirdSemester.class);
        startActivity(intent);
    }
    public void GoFourth(View view) {
        Intent intent = new Intent(MainActivity.this, FourthSemester.class);
        startActivity(intent);

    }
    public void GoFifth(View view) {
        Intent intent = new Intent(MainActivity.this, FifthSemester.class);
        startActivity(intent);
    }

    public void GoSixth(View view) {
        Intent intent = new Intent(MainActivity.this, SixthSemester.class);
        startActivity(intent);
    }

    public void GoSeventh(View view) {
        Intent intent = new Intent(MainActivity.this, SeventhSemester.class);
        startActivity(intent);
    }
    public void GoEight(View view) {
        Intent intent = new Intent(MainActivity.this, Eightsemester.class);
        startActivity(intent);
    }
    public void GoEcrc(View view) {
        Intent intent = new Intent(MainActivity.this, EcrcIst.class);
        startActivity(intent);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu){

        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.mainmenu,menu);
        return true;
    }
   public boolean onOptionsItemSelected(MenuItem item){
        // This method catches Item Select Activity
       // When any item selects from menu option it works
        switch (item.getItemId()){
            // it
            case R.id.aboutmanu1:
                Toast.makeText(this,"About Selected",Toast.LENGTH_SHORT).show();
                Intent intentAbout = new Intent(MainActivity.this, About.class);
                startActivity(intentAbout);
                break;
                //action with ID action_settings was selected
            case R.id.helpmanu1:
                Toast.makeText(this,"Help Selected",Toast.LENGTH_SHORT).show();
                Intent intentHelp = new Intent(MainActivity.this, Help.class);
                startActivity(intentHelp);
                break;
            default:
                    break;
            case R.id.aboutist:
                Toast.makeText(this,"About IST Selected",Toast.LENGTH_SHORT).show();
                Intent intentAboutIST = new Intent(MainActivity.this, AboutIST.class);
                startActivity(intentAboutIST);
                break;

        }

        return true;
   }




}
