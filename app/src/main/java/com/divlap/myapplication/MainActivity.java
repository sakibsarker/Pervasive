package com.divlap.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    EditText et_firstName,et_lastName;
    Button btn_showData;
    TextView tv_data;
    String str_firstName,str_lastName;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        et_firstName=(EditText) findViewById(R.id.et_firstName);
        et_lastName=(EditText) findViewById(R.id.et_lastName);
        btn_showData=(Button) findViewById(R.id.btn_showData);
        tv_data=(TextView) findViewById(R.id.tv_data);

        btn_showData.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {
        int viewId= view.getId();
        if(viewId==R.id.btn_showData){
            str_firstName=et_firstName.getText().toString().trim();
            str_lastName=et_lastName.getText().toString().trim();
            String name=str_firstName+" "+str_lastName;
            tv_data.setText(name);
            
        }

    }
}