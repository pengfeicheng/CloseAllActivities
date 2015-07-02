package com.senscribe.activity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;


public class MainActivity extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    public void onBnClkNext(View view)
    {
        startActivity(new Intent(this,Activity1.class));
    }
}
