package com.biFebriansyah.dashboard;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private CardView bank,attch,wifi,watch,setting;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        bank = (CardView) findViewById(R.id.bankId);
        attch = (CardView) findViewById(R.id.attachId);
        wifi = (CardView) findViewById(R.id.networkId);
        watch = (CardView) findViewById(R.id.watchId);
        setting = (CardView) findViewById(R.id.settingId);

        bank.setOnClickListener(this);
        attch.setOnClickListener(this);
        wifi.setOnClickListener(this);
        watch.setOnClickListener(this);
        setting.setOnClickListener(this);

    }


    @Override
    public void onClick(View view) {
        Intent i ;

        switch (view.getId()) {
            case R.id.bankId:
                i = new Intent(this, Bank.class); startActivity(i);
                break;
            case R.id.attachId:
                i = new Intent(this, Attach.class); startActivity(i);
                break;
            case R.id.networkId:
                i = new Intent(this, Wifi.class); startActivity(i);
                break;
            case R.id.settingId:
                i = new Intent(this, Setting.class); startActivity(i);
                break;
            default: break;
        }

    }
}