package com.example.widgets2;

import androidx.appcompat.app.AppCompatActivity;

import android.app.DatePickerDialog;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    RadioGroup radioGroup;
    CheckBox checkBox;
    String s;
    Button button;
    Button b2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        radioGroup=findViewById(R.id.radio);
        checkBox=findViewById(R.id.checkBox);
        button=findViewById(R.id.button);
        b2=findViewById(R.id.button2);


        button.findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "done", Toast.LENGTH_SHORT).show();
            }
        });
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int id=radioGroup.getCheckedRadioButtonId();
                switch (id){
                    case R.id.radioButton:
                        s="Male";
                        break;
                    case R.id.radioButton2:
                        s="Female";
                        break;
                    case R.id.radioButton3:
                        s="Other";
                        break;
                }
                boolean st=checkBox.isChecked();
                if (st){
                    Toast.makeText(MainActivity.this, "Go to next page" + "\n" +s, Toast.LENGTH_SHORT).show();
                }
                else {
                    Toast.makeText(MainActivity.this, "Agree terms and conditions.!", Toast.LENGTH_SHORT).show();
                }
            }
        });


        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                DatePickerDialog obj=new DatePickerDialog(MainActivity.this, null, 2021, 1, 20);
                obj.show();
            }
        });


    }
}