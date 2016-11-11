package com.mobile.ck.insureranceapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class SuccessJobActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_success_job);

        OnclickBtn();
    }

    public void OnclickBtn() {
        Button btn_endjob = (Button) findViewById(R.id.btn_endjob);

        btn_endjob.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
//                spin();
                Intent itn = new Intent(SuccessJobActivity.this, MainActivity.class);
                startActivity(itn);
            }
        });
    }
}
