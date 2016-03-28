package com.vogella.android.testapp;

import android.app.Activity;
import android.os.Bundle;

/**
 * Created by ogziskin on 0028 28/03/16.
 */
public class SecondActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.second_layout);
    }
}
