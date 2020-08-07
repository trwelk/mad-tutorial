package com.example.usingstrings;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView txtView2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtView2 = findViewById(R.id.textView2);
        txtView2.setText(R.string.Msg2);
        Log.i(tag:"LifeCycle", msg:"OnCreate() invoked");


    }

    public void onStart(){
        super.onStart();
        Log.i(tag:"LifeCycle", msg:"OnStart() invoked");
    }

    public void OnRestart(){
        super.onRestart();
        Log.i(tag:"LifeCycle", msg:"OnRestart() invoked");

    }
}