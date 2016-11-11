package com.mobile.ck.insureranceapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        OnclickBtn();
    }

    public void OnclickBtn() {
        Button btn_buy = (Button) findViewById(R.id.btn_buy);
        Button btn_buyfix = (Button) findViewById(R.id.btn_buyfix);

        btn_buy.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                Intent itn = new Intent(MainActivity.this, BuyActivity.class);
                startActivity(itn);
            }
        });

        btn_buyfix.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                Intent itn = new Intent(MainActivity.this, BuyCMIActivity.class);
                startActivity(itn);
            }
        });
    }
}
