package com.mobile.ck.insureranceapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.Spinner;

public class ProfileAddressActivity extends AppCompatActivity {
    String entity;
    String TAG = "ProfileAddressActivity";
    Spinner spnCity, spnDistrict, spnSubDistrict;
    String city, district, subDistrict;
    String titlename, name, lastname, citizenID, driverLc, birthday, telNo;
    String registrationYear, brandCars, carModel, useCategory, dimensionsEngine;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profileaddress);

        if (savedInstanceState == null) {
            Bundle extras = getIntent().getExtras();
            if (extras == null) {
                entity = null;
                titlename = null;
                name = null;
                lastname = null;
                citizenID = null;
                driverLc = null;
                birthday = null;
                telNo = null;
                registrationYear = null;
                brandCars = null;
                carModel = null;
                useCategory = null;
                dimensionsEngine = null;
            } else {
                entity = extras.getString("entity");
                titlename = extras.getString("titlename");
                name = extras.getString("name");
                lastname = extras.getString("lastname");
                citizenID = extras.getString("citizenID");
                driverLc = extras.getString("driverLc");
                birthday = extras.getString("birthday");
                telNo = extras.getString("telNo");
                registrationYear = extras.getString("registrationYear");
                brandCars = extras.getString("brandCars");
                carModel = extras.getString("carModel");
                useCategory = extras.getString("useCategory");
                dimensionsEngine = extras.getString("dimensionsEngine");
            }
        } else {
            entity = (String) savedInstanceState.getSerializable("entity");
            titlename = (String) savedInstanceState.getSerializable("titlename");
            name = (String) savedInstanceState.getSerializable("name");
            lastname = (String) savedInstanceState.getSerializable("lastname");
            citizenID = (String) savedInstanceState.getSerializable("citizenID");
            driverLc = (String) savedInstanceState.getSerializable("driverLc");
            birthday = (String) savedInstanceState.getSerializable("birthday");
            telNo = (String) savedInstanceState.getSerializable("telNo");
            registrationYear = (String) savedInstanceState.getSerializable("registrationYear");
            brandCars = (String) savedInstanceState.getSerializable("brandCars");
            carModel = (String) savedInstanceState.getSerializable("carModel");
            useCategory = (String) savedInstanceState.getSerializable("useCategory");
            dimensionsEngine = (String) savedInstanceState.getSerializable("dimensionsEngine");
        }
        Log.d("Log" + TAG + "Get Entity", entity);
        Log.d("Log" + TAG + "Get Titlename", titlename);
        Log.d("Log" + TAG + "Get Name", name);
        Log.d("Log" + TAG + "Get Lastname", lastname);
        Log.d("Log" + TAG + "Get CitizenID", citizenID);
        Log.d("Log" + TAG + "Get DriverLc", driverLc);
        Log.d("Log" + TAG + "Get Birthday", birthday);
        Log.d("Log" + TAG + "Get TelNo", telNo);
        Log.d("Log" + TAG + "Get RegistrationYear", registrationYear);
        Log.d("Log" + TAG + "Get BrandCars", brandCars);
        Log.d("Log" + TAG + "Get CarModel", carModel);
        Log.d("Log" + TAG + "Get UseCategory", useCategory);
        Log.d("Log" + TAG + "Get DimensionsEngine", dimensionsEngine);

        SelectSpinner();
        OnclickBtn();
    }

    public void OnclickBtn() {
        Button btnNextPage = (Button) findViewById(R.id.btnNextPage);

        btnNextPage.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {

                Intent itn = new Intent(ProfileAddressActivity.this, DetailCarsActivity.class);
                itn.putExtra("entity", entity);
                itn.putExtra("titlename", titlename.toString());
                itn.putExtra("name", name.toString());
                itn.putExtra("lastname", lastname.toString());
                itn.putExtra("citizenID", citizenID.toString());
                itn.putExtra("driverLc", driverLc.toString());
                itn.putExtra("birthday", birthday.toString());
                itn.putExtra("telNo", telNo.toString());
                itn.putExtra("city", city.toString());
                itn.putExtra("district", district.toString());
                itn.putExtra("subDistrict", subDistrict.toString());
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

    public void SelectSpinner() {
        spnCity = (Spinner) findViewById(R.id.spnCity);
        spnCity.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {

            @Override
            public void onItemSelected(AdapterView<?> arg0, View arg1,
                                       int arg2, long arg3) {
                city = spnCity.getSelectedItem().toString();
//                Toast.makeText(getApplicationContext(), city, Toast.LENGTH_LONG).show();
                Log.d("Log " + TAG, city);
            }

            @Override
            public void onNothingSelected(AdapterView<?> arg0) {
                // TODO Auto-generated method stub

            }
        });
        spnDistrict = (Spinner) findViewById(R.id.spnDistrict);
        spnDistrict.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {

            @Override
            public void onItemSelected(AdapterView<?> arg0, View arg1,
                                       int arg2, long arg3) {
                district = spnDistrict.getSelectedItem().toString();
//                Toast.makeText(getApplicationContext(), district, Toast.LENGTH_LONG).show();
                Log.d("Log " + TAG, district);
            }

            @Override
            public void onNothingSelected(AdapterView<?> arg0) {
                // TODO Auto-generated method stub

            }
        });
        spnSubDistrict = (Spinner) findViewById(R.id.spnSubDistrict);
        spnSubDistrict.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {

            @Override
            public void onItemSelected(AdapterView<?> arg0, View arg1,
                                       int arg2, long arg3) {
                subDistrict = spnSubDistrict.getSelectedItem().toString();
//                Toast.makeText(getApplicationContext(), subDistrict, Toast.LENGTH_LONG).show();
                Log.d("Log " + TAG, subDistrict);
            }

            @Override
            public void onNothingSelected(AdapterView<?> arg0) {
                // TODO Auto-generated method stub

            }
        });

    }

}
