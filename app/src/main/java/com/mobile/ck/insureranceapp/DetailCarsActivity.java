package com.mobile.ck.insureranceapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class DetailCarsActivity extends AppCompatActivity {
    String entity;
    String registrationYear, brandCars, carModel, useCategory, dimensionsEngine;
    String city, district, subDistrict;
    String titlename, name, lastname, citizenID, driverLc, birthday, telNo;
    String TAG = "DetailCarsActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_cars);

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
                city = null;
                district = null;
                subDistrict = null;
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
                city = extras.getString("city");
                district = extras.getString("district");
                subDistrict = extras.getString("subDistrict");
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
            city = (String) savedInstanceState.getSerializable("city");
            district = (String) savedInstanceState.getSerializable("district");
            subDistrict = (String) savedInstanceState.getSerializable("subDistrict");
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
        Log.d("Log" + TAG + "Get city", city);
        Log.d("Log" + TAG + "Get district", district);
        Log.d("Log" + TAG + "Get subDistrict", subDistrict);
        Log.d("Log" + TAG + "Get RegistrationYear", registrationYear);
        Log.d("Log" + TAG + "Get BrandCars", brandCars);
        Log.d("Log" + TAG + "Get CarModel", carModel);
        Log.d("Log" + TAG + "Get UseCategory", useCategory);
        Log.d("Log" + TAG + "Get DimensionsEngine", dimensionsEngine);

        OnclickBtn();
    }

    public void OnclickBtn() {
        Button btnNextPage = (Button) findViewById(R.id.btnNextPage);

        btnNextPage.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {

                Intent itn = new Intent(DetailCarsActivity.this, QuatationActivity.class);
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

}
