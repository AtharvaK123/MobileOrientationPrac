package com.example.orientation;

import androidx.appcompat.app.AppCompatActivity;

import android.content.res.Configuration;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    TextView p1, p2, l1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        p1 = findViewById(R.id.textView);
        p2 = findViewById(R.id.textView2);
        l1 = findViewById(R.id.textView3);

        Log.d("tag", getResources().getConfiguration().orientation + "");

        if(getResources().getConfiguration().orientation == Configuration.ORIENTATION_PORTRAIT){
            p1.setText("Port 1");
            p2.setText("Port 2");
            Toast.makeText(this, "We are in Portrait Mode", Toast.LENGTH_SHORT);
        }
        else {
            l1.setText("PORT 3");
            Toast.makeText(this, "We are in Landscape Mode", Toast.LENGTH_SHORT);
        }
    }
}