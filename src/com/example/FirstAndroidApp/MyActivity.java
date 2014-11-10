package com.example.FirstAndroidApp;

import android.app.Activity;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.sip.SipAudioCall;
import android.net.sip.SipManager;
import android.net.sip.SipProfile;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.*;
import android.widget.Button;
import android.widget.ToggleButton;

public class MyActivity extends ActionBarActivity implements View.OnTouchListener{
    /**
     * Called when the activity is first created.
     */

    public String sipAddress = null;

    public SipManager manager = null;
    public SipProfile me = null;
    public SipAudioCall call = null;
    public IncomingCallReceiver callReceiver;

    private static final int CALL_ADDRESS = 1;
    private static final int SET_AUTH_INFO = 2;
    private static final int UPDATE_SETTINGS_DIALOG = 3;
    private static final int HANG_UP = 4;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        Button buttonPushToTalk = (Button) findViewById(R.id.pushToTalk);
        buttonPushToTalk.setOnTouchListener(this);
        //IntentFilter filter = new IntentFilter();
        //filter.addAction("android.SipDemo.INCOMING_CALL");
        //callReceiver = new IncomingCallReceiver();
        //this.registerReceiver(callReceiver, filter);
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu items for use in the action bar
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.main_activity_actions, menu);

        return super.onCreateOptionsMenu(menu);
    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle presses on the action bar items
        switch (item.getItemId()) {
            case R.id.action_search:
                openSearch();
                return true;

            default:
                return super.onOptionsItemSelected(item);
        }
    }
   private void openTheMessagePage(View view){
       Intent intent = new Intent(this, MessageActivity.class);
       startActivity(intent);
   }
    private void openTheSettingsPage(View view){
        Intent intent = new Intent(this, SettingsActivity.class);
        startActivity(intent);
    }
    private void openTheCallPage(View view){
        Intent intent = new Intent(this,CallActivity.class);
        startActivity(intent);
    }
    private void openSearch() {

    }

    @Override
    public boolean onTouch(View v, MotionEvent event) {
        return false;
    }
}
