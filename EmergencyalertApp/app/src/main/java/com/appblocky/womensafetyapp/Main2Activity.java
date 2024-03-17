package com.appblocky.womensafetyapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class Main2Activity extends AppCompatActivity {
    EditText edtNum1,edtNum2;
    EditText edtNum3,edtNum4;
    String num1,num2,onum1,onum2;
    String num3,num4,onum3,onum4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        edtNum1=(EditText)findViewById(R.id.editText);
        edtNum2=(EditText)findViewById(R.id.editText2);
        edtNum3=(EditText)findViewById(R.id.editText3);
        edtNum4=(EditText)findViewById(R.id.editText4);

        SharedPreferences sharedPreferences = getSharedPreferences("womensafety", Context.MODE_PRIVATE);
        onum1=sharedPreferences.getString("num1","0");
        onum2=sharedPreferences.getString("num2","0");
        onum3=sharedPreferences.getString("num3","0");
        onum4=sharedPreferences.getString("num4","0");

        edtNum1.setText(onum1);
        edtNum2.setText(onum2);
        edtNum3.setText(onum3);
        edtNum4.setText(onum4);
    }

    public void btnSaveNUm(View view) {

        num1=edtNum1.getText().toString();
        num2=edtNum2.getText().toString();
        num3=edtNum3.getText().toString();
        num4=edtNum4.getText().toString();


        SharedPreferences sharedPreferences = getSharedPreferences("womensafety",Context.MODE_PRIVATE);

        SharedPreferences.Editor editor=sharedPreferences.edit();
        editor.putString("num1",num1);
        editor.putString("num2",num2);
        editor.putString("num3",num3);
        editor.putString("num4",num4);
        editor.commit();
        Toast.makeText(this,"Mobile numbers saved",Toast.LENGTH_SHORT).show();
    }

    public void btnCloseClk(View view) {
        finish();
    }
}
