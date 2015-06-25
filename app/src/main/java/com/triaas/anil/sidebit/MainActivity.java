package com.triaas.anil.sidebit;

import android.app.ActionBar;
import android.app.Activity;
import android.content.Intent;
import android.graphics.Color;
import android.support.v7.app.ActionBarActivity;
import android.support.v7.widget.Toolbar;
import android.graphics.Typeface;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.style.TypefaceSpan;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;


public class MainActivity extends ActionBarActivity {

    private Toolbar mToolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        mToolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(mToolbar);
        getSupportActionBar().setDisplayShowHomeEnabled(true);

        Typeface type = Typeface.createFromAsset(getAssets(),"CrescentRegular.ttf");
        TextView messtext= (TextView) findViewById(R.id.mess);
        ImageView messimg=(ImageView) findViewById(R.id.messmenu);

        messimg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this, MessMenu.class);
                startActivity(i);


            }
        });

        //messtext.setTypeface(type);
        //some changes done by me
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        switch (item.getItemId()) {
            case R.id.about:
                About();
                return true;
            case R.id.account:
                Account();
                return true;
            case R.id.help:
                Help();
            case R.id.like:
                LikeApp();
            case R.id.notification:
                Notification();
            default:
                return super.onOptionsItemSelected(item);
        }


    }
    private void About(){
        Intent i = new Intent(MainActivity.this, About.class);
        startActivity(i);

    }
    private void Account(){
        Intent i = new Intent(MainActivity.this, Account.class);
        startActivity(i);

    }
    private void Help(){
        Intent i = new Intent(MainActivity.this, Help.class);
        startActivity(i);

    }
    private void LikeApp(){
        Intent i = new Intent(MainActivity.this, LikeApp.class);
        startActivity(i);

    }
    private void Notification(){
        Intent i = new Intent(MainActivity.this, Notification.class);
        startActivity(i);

    }
}
