package com.mobile.ck.insureranceapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class SelectPakageActivity extends AppCompatActivity {
    String entity;
    String registrationYear, brandCars, carModel, useCategory, dimensionsEngine;
    String TAG = "SelectPakageActivity";

    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_selectpakage);

        if (savedInstanceState == null) {
            Bundle extras = getIntent().getExtras();
            if (extras == null) {
                entity = null;
                registrationYear = null;
                brandCars = null;
                carModel = null;
                useCategory = null;
                dimensionsEngine = null;
            } else {
                entity = extras.getString("entity");
                registrationYear = extras.getString("registrationYear");
                brandCars = extras.getString("brandCars");
                carModel = extras.getString("carModel");
                useCategory = extras.getString("useCategory");
                dimensionsEngine = extras.getString("dimensionsEngine");
            }
        } else {
            entity = (String) savedInstanceState.getSerializable("entity");
            registrationYear = (String) savedInstanceState.getSerializable("registrationYear");
            brandCars = (String) savedInstanceState.getSerializable("brandCars");
            carModel = (String) savedInstanceState.getSerializable("carModel");
            useCategory = (String) savedInstanceState.getSerializable("useCategory");
            dimensionsEngine = (String) savedInstanceState.getSerializable("dimensionsEngine");
        }
        Log.d("Log" + TAG + "Get Entity", entity);
        Log.d("Log" + TAG + "Get RegistrationYear", registrationYear);
        Log.d("Log" + TAG + "Get BrandCars", brandCars);
        Log.d("Log" + TAG + "Get CarModel", carModel);
        Log.d("Log" + TAG + "Get UseCategory", useCategory);
        Log.d("Log" + TAG + "Get DimensionsEngine", dimensionsEngine);

//        IntentValue();
        OnclickBtn();
    }

    public void OnclickBtn() {
        Button btn_selectPaln = (Button) findViewById(R.id.btn_selectPaln);

        btn_selectPaln.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {

                Intent itn = new Intent(SelectPakageActivity.this, CalculatePlanActivity.class);
                itn.putExtra("entity", entity.toString());
                itn.putExtra("registrationYear", registrationYear.toString());
                itn.putExtra("brandCars", brandCars.toString());
                itn.putExtra("carModel", carModel.toString());
                itn.putExtra("useCategory", useCategory.toString());
                itn.putExtra("dimensionsEngine", dimensionsEngine.toString());
                Log.d("Log" + TAG + "Intent Entity", entity);
                startActivity(itn);
            }
        });
    }
}