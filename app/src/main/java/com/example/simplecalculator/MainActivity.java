package com.example.simplecalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText number1, number2;
    TextView textView;
    Button btnone,btntwo,btnthree,btnfour;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        number1= (EditText)findViewById(R.id.num1);
        number2= (EditText)findViewById(R.id.num2);
        textView= (TextView)findViewById(R.id.result);
        btnone= (Button)findViewById(R.id.btnAdd);
        btntwo= (Button)findViewById(R.id.btnSubtract);
        btnthree= (Button)findViewById(R.id.btnMultply);
        btnfour= (Button)findViewById(R.id.btnDIVIDE);

        btnone.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (number1.getText().toString().length() != 0  && number2.getText().toString().length() != 0) {
                    double num1 = Double.parseDouble(number1.getText().toString());
                    double num2 = Double.parseDouble(number2.getText().toString());

                    double res = num1 + num2;
                    textView.setText("");

                }else {
                    Toast.makeText(MainActivity.this, "Please Enter the numbers properly", Toast.LENGTH_SHORT).show();
                }
            }
        });
        btntwo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (number1.getText().toString().length() != 0  && number2.getText().toString().length() != 0) {
                    double num1 = Double.parseDouble(number1.getText().toString());
                    double num2 = Double.parseDouble(number2.getText().toString());

                    double res = num1 - num2;
                    textView.setText("");
                }else {
                    Toast.makeText(MainActivity.this, "Please Enter the numbers properly", Toast.LENGTH_SHORT).show();
                }
            }
        });
        btnthree.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (number1.getText().toString().length() != 0  && number2.getText().toString().length() != 0) {
                    double num1 = Double.parseDouble(number1.getText().toString());
                    double num2 = Double.parseDouble(number2.getText().toString());

                    double res = num1 * num2;
                    textView.setText("");
                }else {
                    Toast.makeText(MainActivity.this, "Please Enter the numbers properly", Toast.LENGTH_SHORT).show();
                }
            }
        });
        btnfour.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (number1.getText().toString().length() != 0  && number2.getText().toString().length() != 0) {
                    double num1 = Double.parseDouble(number1.getText().toString());
                    double num2 = Double.parseDouble(number2.getText().toString());

                    double res = num1 / num2;
                    textView.setText("");
                }else {
                    Toast.makeText(MainActivity.this, "Please Enter the numbers properly", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}
