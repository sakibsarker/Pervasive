package com.divlapsoft.exprimental;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Display;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText textName,textAge;
    Button viewBtn;
    TextView viewOutput;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textName=findViewById(R.id.name);
        textAge=findViewById(R.id.age);
        viewBtn=findViewById(R.id.btn);
        viewOutput=findViewById(R.id.outword);

        viewBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String name=textName.getText().toString();
                String age=textAge.getText().toString();
                viewOutput.setText(name+"\n"+age);
            }
        });
    }
}