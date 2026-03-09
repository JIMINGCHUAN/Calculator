package com.example.calculatorapp;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EditText inputFirstNumber = findViewById(R.id.inputFirstNumber);
        EditText inputSecondNumber = findViewById(R.id.inputSecondNumber);
        TextView textResult = findViewById(R.id.textResult);

        Button buttonPlus = findViewById(R.id.Plus);
        Button buttonMinus = findViewById(R.id.Minus);
        Button buttonMultiply = findViewById(R.id.Multiply);
        Button buttonDivide = findViewById(R.id.Divide);

        buttonPlus.setOnClickListener(v -> {
            int a = Integer.parseInt(inputFirstNumber.getText().toString());
            int b = Integer.parseInt(inputSecondNumber.getText().toString());
            int result = a + b;
            textResult.setText(String.valueOf(result));
        });

        buttonMinus.setOnClickListener(v -> {
            int a = Integer.parseInt(inputFirstNumber.getText().toString());
            int b = Integer.parseInt(inputSecondNumber.getText().toString());
            int result = a - b;
            textResult.setText(String.valueOf(result));
        });

        buttonMultiply.setOnClickListener(v -> {
            int a = Integer.parseInt(inputFirstNumber.getText().toString());
            int b = Integer.parseInt(inputSecondNumber.getText().toString());
            int result = a * b;
            textResult.setText(String.valueOf(result));
        });

        buttonDivide.setOnClickListener(v -> {
            int a = Integer.parseInt(inputFirstNumber.getText().toString());
            int b = Integer.parseInt(inputSecondNumber.getText().toString());
            int result = a / b;
            textResult.setText(String.valueOf(result));
        });
    }
}
