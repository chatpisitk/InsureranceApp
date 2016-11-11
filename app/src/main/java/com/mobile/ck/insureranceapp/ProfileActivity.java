package com.mobile.ck.insureranceapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;

public class ProfileActivity extends AppCompatActivity {
    Spinner spn_titlename;
    String entity;
    String spnTitlename;
    String registrationYear, brandCars, carModel, useCategory, dimensionsEngine;
    String TAG = "ProfileActivity";

    EditText txt_name;
    EditText txt_lastname;
    EditText txt_citizenID;
    EditText txt_driver_license;
    EditText txt_birthDay;
    EditText txt_telNo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);

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

        OnclickBtn();
        spin();
    }

    public void OnclickBtn() {
        Button btnNextPage = (Button) findViewById(R.id.btnNextPage);
        txt_name = (EditText) findViewById(R.id.txt_name);
        txt_lastname = (EditText) findViewById(R.id.txt_lastname);
        txt_citizenID = (EditText) findViewById(R.id.txt_citizenID);
        txt_driver_license = (EditText) findViewById(R.id.txt_driver_license);
        txt_birthDay = (EditText) findViewById(R.id.txt_birthDay);
        txt_telNo = (EditText) findViewById(R.id.txt_telNo);

        btnNextPage.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                Intent itn = new Intent(ProfileActivity.this, ProfileAddressActivity.class);
                itn.putExtra("entity", entity);
                itn.putExtra("titlename", spnTitlename.toString());
                itn.putExtra("name", txt_name.getText().toString());
                itn.putExtra("lastname", txt_lastname.getText().toString());
                itn.putExtra("citizenID", txt_citizenID.getText().toString());
                itn.putExtra("driverLc", txt_driver_license.getText().toString());
                itn.putExtra("birthday", txt_birthDay.getText().toString());
                itn.putExtra("telNo", txt_telNo.getText().toString());
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

    public void spin() {
        spn_titlename = (Spinner) findViewById(R.id.spn_titlename);
        spn_titlename.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {

            @Override
            public void onItemSelected(AdapterView<?> arg0, View arg1,
                                       int arg2, long arg3) {
                spnTitlename = spn_titlename.getSelectedItem().toString();
//                Toast.makeText(getApplicationContext(), spnTitlename, Toast.LENGTH_LONG).show();
                Log.d("Log " + TAG, spnTitlename);
            }

            @Override
            public void onNothingSelected(AdapterView<?> arg0) {
                // TODO Auto-generated method stub

            }
        });
    }
}

