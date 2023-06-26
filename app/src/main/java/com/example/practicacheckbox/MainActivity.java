package com.example.practicacheckbox;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private EditText et1;
    private EditText et2;
    private TextView tv1;
    private CheckBox cb1, cb2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        et1 = (EditText) findViewById(R.id.txt_num1);
        et2 = (EditText) findViewById(R.id.txt_num2);
        tv1 = (TextView) findViewById(R.id.text_result);
        cb1 = (CheckBox) findViewById(R.id.sumar);
        cb2 = (CheckBox) findViewById(R.id.restar);
    }
    //Este metodo realiza los resultados

    public void Calcular(View view) {
        String valor1_String = et1.getText().toString();
        String valor2_String = et2.getText().toString();

        int valor1_int = Integer.parseInt(valor1_String);
        int valor2_int = Integer.parseInt(valor2_String);
        
        if ((cb1.isChecked() == true) && (cb2.isChecked() == false)){
            int suma = valor1_int + valor2_int;
            String result = String.valueOf(suma);
            tv1.setText("Suma = " + result);
        } else if ((cb2.isChecked() == true) && (cb1.isChecked() == false)) {
            int resta = valor1_int - valor2_int;
            String result = String.valueOf(resta);
            tv1.setText("Resta = " + result);
        } else if ((cb1.isChecked() == true) && (cb2.isChecked() == true)   ) {
            int suma = valor1_int + valor2_int;
            String result_suma = String.valueOf(suma);
            int resta = valor1_int - valor2_int;
            String result_resta = String.valueOf(resta);
            tv1.setText("Suma = " + result_suma + " y resta = " + result_resta);
        } else if ((cb1.isChecked() == false) && (cb2.isChecked() == false)) {
            tv1.setText("");
            Toast.makeText(this, "Debe elegir una operación", Toast.LENGTH_LONG).show();
        }

    }
}