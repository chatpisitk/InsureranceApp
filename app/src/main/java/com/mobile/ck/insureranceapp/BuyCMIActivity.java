package com.mobile.ck.insureranceapp;

import android.content.Intent;
import android.os.Bundle;
import android.os.StrictMode;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.Spinner;

import org.apache.http.HttpResponse;
import org.apache.http.NameValuePair;
import org.apache.http.client.HttpClient;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.message.BasicNameValuePair;
import org.apache.http.util.EntityUtils;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class BuyCMIActivity extends AppCompatActivity {
    String entity;
    Button btn_calculate_cmi;
    String url = "http://203.147.42.91/PremiumMotor/JSONProxy/POC/inquirypremiumpackagecmp_poc";
    Spinner registration_year, brand_cars, car_model, use_category, dimensions_engine;
    String registrationYear, brandCars, carModel, useCategory, dimensionsEngine;
    String TAG = "BuyCMIActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_buy_cmi);
        if (android.os.Build.VERSION.SDK_INT > 9) {
            StrictMode.ThreadPolicy policy = new StrictMode.ThreadPolicy.Builder().permitAll().build();
            StrictMode.setThreadPolicy(policy);
        }

        btn_calculate_cmi = (Button) findViewById(R.id.btn_calculate_cmi);

        SelectSpinner();
        OnclickBtn();
    }

    public void OnclickBtn() {


        btn_calculate_cmi.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                makePostRequest();
                Intent itn = new Intent(BuyCMIActivity.this, SelectPakageActivity.class);
                itn.putExtra("entity", entity);
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

    private void makePostRequest() {
        HttpClient httpClient = new DefaultHttpClient();
        // replace with your url
        HttpPost httpPost = new HttpPost(url);


        //Post Data
        List<NameValuePair> nameValuePair = new ArrayList<NameValuePair>(2);
        nameValuePair.add(new BasicNameValuePair("username", "test_user"));
        nameValuePair.add(new BasicNameValuePair("password", "123456789"));
        nameValuePair.add(new BasicNameValuePair("username", "2"));
        nameValuePair.add(new BasicNameValuePair("packageName", "PACKAGE_CMP"));
        nameValuePair.add(new BasicNameValuePair("agentNo", "90002373"));
        nameValuePair.add(new BasicNameValuePair("carCode", "1.10"));
        nameValuePair.add(new BasicNameValuePair("sourceNo", "500102"));
        nameValuePair.add(new BasicNameValuePair("password", ""));
        try {
            httpPost.setEntity(new UrlEncodedFormEntity(nameValuePair));

            HttpResponse response = httpClient.execute(httpPost);
            entity = EntityUtils.toString(response.getEntity());
            Log.d("Log " + TAG + "Post Entity ", entity);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public void SelectSpinner() {
        registration_year = (Spinner) findViewById(R.id.registration_year);
        registration_year.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {

            @Override
            public void onItemSelected(AdapterView<?> arg0, View arg1,
                                       int arg2, long arg3) {
                registrationYear = registration_year.getSelectedItem().toString();
//                Toast.makeText(getApplicationContext(), registrationYear, Toast.LENGTH_LONG).show();
                Log.d("Log " + TAG, registrationYear);
            }

            @Override
            public void onNothingSelected(AdapterView<?> arg0) {
                // TODO Auto-generated method stub

            }
        });
        brand_cars = (Spinner) findViewById(R.id.brand_cars);
        brand_cars.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {

            @Override
            public void onItemSelected(AdapterView<?> arg0, View arg1,
                                       int arg2, long arg3) {
                brandCars = brand_cars.getSelectedItem().toString();
//                Toast.makeText(getApplicationContext(), brandCars, Toast.LENGTH_LONG).show();
                Log.d("Log " + TAG, brandCars);
            }

            @Override
            public void onNothingSelected(AdapterView<?> arg0) {
                // TODO Auto-generated method stub

            }
        });
        car_model = (Spinner) findViewById(R.id.car_model);
        car_model.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {

            @Override
            public void onItemSelected(AdapterView<?> arg0, View arg1,
                                       int arg2, long arg3) {
                carModel = car_model.getSelectedItem().toString();
//                Toast.makeText(getApplicationContext(), carModel, Toast.LENGTH_LONG).show();
                Log.d("Log " + TAG, carModel);
            }

            @Override
            public void onNothingSelected(AdapterView<?> arg0) {
                // TODO Auto-generated method stub

            }
        });
        use_category = (Spinner) findViewById(R.id.use_category);
        use_category.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {

            @Override
            public void onItemSelected(AdapterView<?> arg0, View arg1,
                                       int arg2, long arg3) {
                useCategory = use_category.getSelectedItem().toString();
//                Toast.makeText(getApplicationContext(), useCategory, Toast.LENGTH_LONG).show();
                Log.d("Log " + TAG, useCategory);
            }

            @Override
            public void onNothingSelected(AdapterView<?> arg0) {
                // TODO Auto-generated method stub

            }
        });
        dimensions_engine = (Spinner) findViewById(R.id.dimensions_engine);
        dimensions_engine.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {

            @Override
            public void onItemSelected(AdapterView<?> arg0, View arg1,
                                       int arg2, long arg3) {
                dimensionsEngine = dimensions_engine.getSelectedItem().toString();
//                Toast.makeText(getApplicationContext(), dimensionsEngine, Toast.LENGTH_LONG).show();
                Log.d("Log " + TAG, dimensionsEngine);
            }

            @Override
            public void onNothingSelected(AdapterView<?> arg0) {
                // TODO Auto-generated method stub

            }
        });
    }

}
