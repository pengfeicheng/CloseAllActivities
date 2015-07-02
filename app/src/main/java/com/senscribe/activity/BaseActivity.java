package com.senscribe.activity;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;


public class BaseActivity extends Activity {

    protected TextView txt_label = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test);

        txt_label = (TextView)findViewById(R.id.txt_label);
        txt_label.setText(getClass().getName());
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d("Activity","onPause -> "+getClass().getName());
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("Activity","onDestroy -> "+getClass().getName());
    }
}
