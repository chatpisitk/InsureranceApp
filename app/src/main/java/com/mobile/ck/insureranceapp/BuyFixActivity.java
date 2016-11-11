package com.mobile.ck.insureranceapp;


import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.StrictMode;
import android.support.v7.app.ActionBarActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class BuyFixActivity extends ActionBarActivity {
    String url = "http://203.147.42.91/PremiumMotor/JSONProxy/POC/inquirypremiumpackagecmp_poc";
    TextView txtView;
    String entity;
    Button btn_calculatefix;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_buy_fix);

        // Permission StrictMode
        if (Build.VERSION.SDK_INT > 9) {
            StrictMode.ThreadPolicy policy = new StrictMode.ThreadPolicy.Builder().permitAll().build();
            StrictMode.setThreadPolicy(policy);
        }
        btn_calculatefix = (Button) findViewById(R.id.btn_calculatefix);


        OnclickBtn();
    }

    public void OnclickBtn() {


        btn_calculatefix.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
//                makePostRequest();
//                Toast.makeText(getApplicationContext(), "response_body : " + entity, Toast.LENGTH_LONG).show();
                Toast.makeText(getApplicationContext(), "Onclick !!!! ", Toast.LENGTH_LONG).show();
                Intent itn = new Intent(BuyFixActivity.this, SelectPakageActivity.class);
//                itn.putExtra("entity", entity.toString());
                startActivity(itn);
            }
        });
    }

//    private void makePostRequest() {
//        HttpClient httpClient = new DefaultHttpClient();
//        // replace with your url
//        HttpPost httpPost = new HttpPost(url);
//
//
//        //Post Data
//        List<NameValuePair> nameValuePair = new ArrayList<NameValuePair>(2);
//        nameValuePair.add(new BasicNameValuePair("username", "test_user"));
//        nameValuePair.add(new BasicNameValuePair("password", "123456789"));
//        nameValuePair.add(new BasicNameValuePair("username", "2"));
//        nameValuePair.add(new BasicNameValuePair("packageName", "PACKAGE_CMP"));
//        nameValuePair.add(new BasicNameValuePair("agentNo", "90002373"));
//        nameValuePair.add(new BasicNameValuePair("carCode", "1.10"));
//        nameValuePair.add(new BasicNameValuePair("sourceNo", "500102"));
//        nameValuePair.add(new BasicNameValuePair("password", ""));
//        try {
//            httpPost.setEntity(new UrlEncodedFormEntity(nameValuePair));
////            httpPost.setHeader("Content-type", "application/json");
//
//            HttpResponse response = httpClient.execute(httpPost);
//            entity = EntityUtils.toString(response.getEntity());
//            Log.d("Log Entity ", entity);
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//
//    }

}