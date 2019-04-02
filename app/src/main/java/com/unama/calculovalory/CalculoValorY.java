package com.unama.calculovalory;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

import com.unama.appexercicios.MainActivity;
import com.unama.appexercicios.R;
import com.unama.calculopesoplaneta.CalculoPesoPlaneta;

public class CalculoValorY extends AppCompatActivity {
    private EditText valorXInput;
    private TextView resultadoValorY;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculo_valor_y);

        valorXInput = findViewById(R.id.valorXInput);
        resultadoValorY = findViewById(R.id.resultadoValorY);
    }

    public void voltarInicial(View v) {
        Intent intent = new Intent(CalculoValorY.this, MainActivity.class);
        CalculoValorY.this.startActivity(intent);
    }

    public void calcularValorY(View v) {
        Double x = Double.parseDouble(valorXInput.getText().toString());

        double y = 8 / (2 - x);

        resultadoValorY.setText("O valor de Y é " + y);
    }
}
