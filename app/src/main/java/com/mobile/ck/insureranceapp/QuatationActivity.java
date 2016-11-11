package com.mobile.ck.insureranceapp;

import android.content.Intent;
import android.os.Bundle;
import android.os.StrictMode;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

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

public class QuatationActivity extends AppCompatActivity {
    String url = "http://203.147.42.91/PremiumMotor/JSONProxy/POC/policyentry_motor_createcmppolicy_poc";
    TextView txt_end_protected;
    String entityQua;
    String entity;
    String city, district, subDistrict;
    String titlename, name, lastname, citizenID, driverLc, birthday, telNo;
    String registrationYear, brandCars, carModel, useCategory, dimensionsEngine;
    TextView txtNo_quo, txt_name, txtAddress, txt_birthDay, txt_telNo;
    String TAG = "QuatationActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quatation);
        if (android.os.Build.VERSION.SDK_INT > 9) {
            StrictMode.ThreadPolicy policy = new StrictMode.ThreadPolicy.Builder().permitAll().build();
            StrictMode.setThreadPolicy(policy);
        }

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
                city = null;
                district = null;
                subDistrict = null;
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
                city = extras.getString("city");
                district = extras.getString("district");
                subDistrict = extras.getString("subDistrict");
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
            city = (String) savedInstanceState.getSerializable("City");
            district = (String) savedInstanceState.getSerializable("District");
            subDistrict = (String) savedInstanceState.getSerializable("SubDistrict");
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
        Log.d("Log" + TAG + "Get City", city);
        Log.d("Log" + TAG + "Get District", district);
        Log.d("Log" + TAG + "Get SubDistrict", subDistrict);

//        IntentValue();
//        setValue();
        OnclickBtn();
    }

    public void OnclickBtn() {
        Button btn_submitjob = (Button) findViewById(R.id.btn_submitjob);
        txt_end_protected = (TextView) findViewById(R.id.txt_end_protected);
        btn_submitjob.setOnClickListener(
                new View.OnClickListener() {
                    public void onClick(View v) {

                        makePostRequest();
                        Intent itn = new Intent(QuatationActivity.this, SuccessJobActivity.class);
//                        itn.putExtra("entity", "entity");
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
        nameValuePair.add(new BasicNameValuePair("extraGenPage8", ""));
        nameValuePair.add(new BasicNameValuePair("extraGenPage7", ""));
        nameValuePair.add(new BasicNameValuePair("extraGenPage9", ""));
        nameValuePair.add(new BasicNameValuePair("extraGenPage4", ""));
        nameValuePair.add(new BasicNameValuePair("extraGenPage3", ""));
        nameValuePair.add(new BasicNameValuePair("extraGenPage6", ""));
        nameValuePair.add(new BasicNameValuePair("extraGenPage5", ""));
        nameValuePair.add(new BasicNameValuePair("password", "os@test1"));
        nameValuePair.add(new BasicNameValuePair("extraGenPage2", ""));
        nameValuePair.add(new BasicNameValuePair("extraGenPage1", ""));
        nameValuePair.add(new BasicNameValuePair("longName1", ""));
        nameValuePair.add(new BasicNameValuePair("longName2", ""));
        nameValuePair.add(new BasicNameValuePair("username", "ostest1"));
        nameValuePair.add(new BasicNameValuePair("discountPost", ""));
        nameValuePair.add(new BasicNameValuePair("cover", "TP"));
        nameValuePair.add(new BasicNameValuePair("longName5", ""));
        nameValuePair.add(new BasicNameValuePair("genPage9", ""));
        nameValuePair.add(new BasicNameValuePair("genPage7", ""));
        nameValuePair.add(new BasicNameValuePair("longName3", ""));
        nameValuePair.add(new BasicNameValuePair("riMethod", "0"));
        nameValuePair.add(new BasicNameValuePair("longName4", ""));
        nameValuePair.add(new BasicNameValuePair("genPage8", ""));
        nameValuePair.add(new BasicNameValuePair("genPage5", ""));
        nameValuePair.add(new BasicNameValuePair("genPage6", ""));
        nameValuePair.add(new BasicNameValuePair("genPage3", ""));
        nameValuePair.add(new BasicNameValuePair("genPage4", ""));
        nameValuePair.add(new BasicNameValuePair("genPage1", ""));
        nameValuePair.add(new BasicNameValuePair("agentComm", ""));
        nameValuePair.add(new BasicNameValuePair("grossPremiumAS400P", ""));
        nameValuePair.add(new BasicNameValuePair("replaces", ""));
        nameValuePair.add(new BasicNameValuePair("carMakeCode", "1TO014"));
        nameValuePair.add(new BasicNameValuePair("policyNumberIssue", ""));
        nameValuePair.add(new BasicNameValuePair("branchCode", ""));
        nameValuePair.add(new BasicNameValuePair("policyType", ""));
        nameValuePair.add(new BasicNameValuePair("carMakeDesc", "TOYOTA ALTIS 1.8"));
        nameValuePair.add(new BasicNameValuePair("discount", ""));
        nameValuePair.add(new BasicNameValuePair("carChassis", "87845842219"));
        nameValuePair.add(new BasicNameValuePair("carProvince", "กท"));
        nameValuePair.add(new BasicNameValuePair("clientID_Customer", "16917902"));
        nameValuePair.add(new BasicNameValuePair("staffNo", "43061"));
        nameValuePair.add(new BasicNameValuePair("carRegNo", "10367"));
        nameValuePair.add(new BasicNameValuePair("underwritingMenu", ""));
        nameValuePair.add(new BasicNameValuePair("carYearReg", "2015"));
        nameValuePair.add(new BasicNameValuePair("agentNo", "90002373"));
        nameValuePair.add(new BasicNameValuePair("vatMethod", "1"));
        nameValuePair.add(new BasicNameValuePair("genPage10", ""));
        nameValuePair.add(new BasicNameValuePair("genPage11", ""));
        nameValuePair.add(new BasicNameValuePair("reference2", ""));
        nameValuePair.add(new BasicNameValuePair("systemMenu", ""));
        nameValuePair.add(new BasicNameValuePair("reference1", ""));
        nameValuePair.add(new BasicNameValuePair("capacity", ""));
        nameValuePair.add(new BasicNameValuePair("campaign", ""));
        nameValuePair.add(new BasicNameValuePair("seatPassenger1", ""));
        nameValuePair.add(new BasicNameValuePair("seatPassenger2", ""));
        nameValuePair.add(new BasicNameValuePair("grossPremiumAS400", ""));
        nameValuePair.add(new BasicNameValuePair("extraGenPage11", ""));
        nameValuePair.add(new BasicNameValuePair("expiryDate", "01012017"));
        nameValuePair.add(new BasicNameValuePair("grossPremium", "600"));
        nameValuePair.add(new BasicNameValuePair("extraGenPage10", ""));
        nameValuePair.add(new BasicNameValuePair("occupationCode", "99"));
        nameValuePair.add(new BasicNameValuePair("inceptionDate", "01012016"));
        nameValuePair.add(new BasicNameValuePair("carEngine", "FDAF27FAJD"));
        nameValuePair.add(new BasicNameValuePair("genPage12", ""));
        nameValuePair.add(new BasicNameValuePair("extraGenPage12", ""));
        nameValuePair.add(new BasicNameValuePair("replacedPol", ""));

        try {
            httpPost.setEntity(new UrlEncodedFormEntity(nameValuePair));
            HttpResponse response = httpClient.execute(httpPost);
            entity = EntityUtils.toString(response.getEntity());
            Log.d("Log " + TAG + "Post Entity ", entity);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public void setValue() {
        txtNo_quo = (TextView) findViewById(R.id.txtNo_quo);
        txt_name = (TextView) findViewById(R.id.txt_name);
        txtAddress = (TextView) findViewById(R.id.txtAddress);
        txt_birthDay = (TextView) findViewById(R.id.txt_birthDay);
        txt_telNo = (TextView) findViewById(R.id.txt_telNo);
//        String Name = titlename.toString() + name.toString() + lastname.toString();
//        String Address = city.toString() + district.toString() + subDistrict.toString();
//
//        txtNo_quo.setText(carModel.toString());
//        txt_name.setText(Name);
//        txtAddress.setText(Address);
//        txt_birthDay.setText(birthday.toString());
//        txt_telNo.setText(telNo.toString());
    }

}
