package com.appblocky.womensafetyapp;


import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.AsyncTask;
import android.os.Bundle;

import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import org.json.JSONException;
import org.json.JSONObject;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

import androidx.appcompat.app.AppCompatActivity;

public class LoginActivity extends AppCompatActivity {

    String uname,passwd,ip;

    URL url;
    EditText edtLoginUserName,edtLoginPassword;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        edtLoginUserName=findViewById(R.id.edtLoginUserName);
        edtLoginPassword=findViewById(R.id.edtLoginPassword);

    }


    public void btnLogin(View view) {

        uname=edtLoginUserName.getText().toString();
        passwd=edtLoginPassword.getText().toString();



        if(uname.equals("admin")&& passwd.equals("admin"))
        {
            Intent i = new Intent(getApplicationContext(), MainActivity.class);
            i.putExtra("email", uname);
            startActivity(i);
            finish();
        }
        else {
            Toast.makeText(getApplicationContext(),"Invalid Username/password",Toast.LENGTH_SHORT).show();
        }
    }


}
