package com.example.android.newsapp;

import android.content.Intent;
import android.content.res.Resources;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
//import android.util.Log;
import java.lang.String;
import java.util.ArrayList;


public class MainActivity extends AppCompatActivity {

    Resources res;
    String[] sendingArray;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void OnClickButton(View view) {

        Button btn = (Button) view;
        int id = btn.getId();
        res = this.getResources();
        switch (id) {
            case R.id.national:
                sendingArray = res.getStringArray(R.array.national);
                sendData(sendingArray);
                break;
            case R.id.international:
                sendingArray = res.getStringArray(R.array.international);
                sendData(sendingArray);
                break;
            case R.id.sports:
                sendingArray = res.getStringArray(R.array.sports);
                sendData(sendingArray);
                break;
            case R.id.states:
                sendingArray = res.getStringArray(R.array.states);
                sendData(sendingArray);
                break;
            case R.id.business:
                sendingArray = res.getStringArray(R.array.business);
                sendData(sendingArray);
                break;
            case R.id.entertainment:
                sendingArray = res.getStringArray(R.array.entertainment);
                sendData(sendingArray);
                break;
            case R.id.science:
                sendingArray = res.getStringArray(R.array.science);
                sendData(sendingArray);
                break;
        }
    }

    private void sendData(String[] retrievingArray) {
        Intent intent = new Intent(MainActivity.this,Common.class);
        intent.putExtra("sendingArray",retrievingArray);
        this.startActivity(intent);
    }

    /*public void internationalActivity(View view) {
        val = ((Button) findViewById(R.id.international)).getText().toString();

        if(val.equals("International")) {
            i = new Intent(getApplicationContext(), International.class);
            startActivity(i);
        }
        else{
            Log.i("HEY!", val);
        }

    }
    public void sportsActivity(View view) {
        val = ((Button) findViewById(R.id.sports)).getText().toString();

        if(val.equals("Sports")) {
            i = new Intent(getApplicationContext(), Sports.class);
            startActivity(i);
        }
        else{
            Log.i("HEY!", val);
        }
    }
    public void businessActivity(View view) {
        val = ((Button) findViewById(R.id.business)).getText().toString();

        if (val.equals("Business")) {

            i = new Intent(getApplicationContext(), Business.class);
            startActivity(i);
        }
        else{
            Log.i("HEY!", val);
        }
    }
    public void entertainmentActivity(View view) {
        val = ((Button) findViewById(R.id.entertainment)).getText().toString();

        if(val.equals("Entertainment")) {
            i = new Intent(getApplicationContext(), Entertainment.class);
            startActivity(i);
        }
        else{
            Log.i("HEY!", val);
        }
    }
    public void statesActivity(View view) {
        val = ((Button) findViewById(R.id.states)).getText().toString();

        if(val.equals("States")) {
            i = new Intent(getApplicationContext(), States.class);
            startActivity(i);
        }
        else{
            Log.i("HEY!", val);
        }
    }

    public void EditorialActivity(View view) {
        val = ((Button) findViewById(R.id.editorial)).getText().toString();

        if(val.equals("Editorial")) {
            i = new Intent(getApplicationContext(), Editorial.class);
            startActivity(i);
        }
        else{
            Log.i("HEY!", val);
        }
    } */
}

