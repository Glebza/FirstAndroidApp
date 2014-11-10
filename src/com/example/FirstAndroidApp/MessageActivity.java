package com.example.FirstAndroidApp;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;

/**
 * Created by Глеб on 10.11.2014.
 */
public class MessageActivity extends ActionBarActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.message_page_layout);
    }
}
