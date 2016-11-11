package com.mobile.ck.insureranceapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;

public class BuyActivity extends AppCompatActivity {

    String entity;
    Button btn_calculate;
    String url = "http://203.147.42.91/PremiumMotor/JSONProxy/POC/inquirypremiumpackagecmp_poc";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_buy);
//        btn_calculate = (Button) findViewById(R.id.btn_calculate);

//        OnclickBtn();
    }

//    public void OnclickBtn() {
//
//
//        btn_calculate.setOnClickListener(new View.OnClickListener() {
//
//            public void onClick(View v) {
//            }
//
//
//        });
//    }
}