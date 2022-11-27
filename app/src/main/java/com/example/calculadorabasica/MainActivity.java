package com.example.calculadorabasica;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText num1, num2;
    TextView result;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        num1 = findViewById(R.id.num1);
        num2 = findViewById(R.id.num2);
        result = findViewById(R.id.result);
    }

    public void sumar(View view){
        float n1, n2, res;
        if ((!num1.getText().toString().isEmpty())&&(!num2.getText().toString().isEmpty())){
            n1 = Float.parseFloat(num1.getText().toString());
            n2 = Float.parseFloat(num2.getText().toString());
            res = n1 + n2;
            result.setText("Suma = "+res);
        }else{
            Toast.makeText(MainActivity.this, "Escriba un valor en el dato 1 o el dato 2", Toast.LENGTH_SHORT).show();
        }

    }
    public void restar(View view){
        float n1, n2, res;
        if ((!num1.getText().toString().isEmpty())&&(!num2.getText().toString().isEmpty())){
            n1 = Float.parseFloat(num1.getText().toString());
            n2 = Float.parseFloat(num2.getText().toString());
            res = n1 - n2;
            result.setText("Resta = "+res);
        }else{
            Toast.makeText(MainActivity.this, "Escriba un valor en el dato 1 o el dato 2", Toast.LENGTH_SHORT).show();
        }
    }
    public void multiplicar(View view){
        float n1, n2, res;
        if ((!num1.getText().toString().isEmpty())&&(!num2.getText().toString().isEmpty())){
            n1 = Float.parseFloat(num1.getText().toString());
            n2 = Float.parseFloat(num2.getText().toString());
            res = n1 * n2;
            result.setText("Multiplicación = "+res);
        }else {
            Toast.makeText(MainActivity.this, "Escriba un valor en el dato 1 o el dato 2", Toast.LENGTH_SHORT).show();
        }
    }
    public void dividir(View view){
        float n1, n2, res;
        if ((!num1.getText().toString().isEmpty())&&(!num2.getText().toString().isEmpty())){
            n1 = Float.parseFloat(num1.getText().toString());
            n2 = Float.parseFloat(num2.getText().toString());
            res = n1 / n2;
            result.setText("División = "+res);
        }else{
            Toast.makeText(MainActivity.this, "Escriba un valor en el dato 1 o el dato 2", Toast.LENGTH_SHORT).show();
        }
    }
    public void limpiar(View view){
        num1.setText("");
        num2.setText("");
        result.setText("");
    }
}