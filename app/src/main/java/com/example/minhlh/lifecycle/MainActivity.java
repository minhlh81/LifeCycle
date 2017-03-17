package com.example.minhlh.lifecycle;

import android.content.res.Configuration;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d("Tag", "OnCreate");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d("Tag", "OnStart");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("Tag", "OnResume");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d("Tag", "OnPause");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d("Tag", "OnRestart");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("Tag", "OnStop");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("Tag", "OnDestroy");
    }

    @Override
    public void onConfigurationChanged(Configuration newConfig) {
        super.onConfigurationChanged(newConfig);
        if (newConfig.orientation == Configuration.ORIENTATION_PORTRAIT){
            Log.d("Tag", "Man hinh doc");
            //setContentView(R.layout.activity_main);
        }
        else if (newConfig.orientation == Configuration.ORIENTATION_LANDSCAPE){
            Log.d("Tag", "Man hinh ngang");
            setContentView(R.layout.activity_main);

        }
    }
}
