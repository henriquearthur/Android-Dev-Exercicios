package com.unama.calculopesoplaneta;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

import com.unama.appexercicios.MainActivity;
import com.unama.appexercicios.R;
import com.unama.pesoideal.PesoIdeal;

public class CalculoPesoPlaneta extends AppCompatActivity {
    private Spinner planetaWidget;
    private EditText pesoTerrestreInput;
    private TextView resultadoPesoPlanetaWidget;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculo_peso_planeta);

        planetaWidget = findViewById(R.id.planetasSelect);
        pesoTerrestreInput = findViewById(R.id.pesoTerrestreInput);
        resultadoPesoPlanetaWidget = findViewById(R.id.resultadoPesoPlaneta);
    }

    public void voltarInicial(View v) {
        Intent intent = new Intent(CalculoPesoPlaneta.this, MainActivity.class);
        CalculoPesoPlaneta.this.startActivity(intent);
    }

    public void calcularPesoPlaneta(View v) {
        String planeta = planetaWidget.getSelectedItem().toString();
        Double pesoTerrestre = Double.parseDouble(pesoTerrestreInput.getText().toString());

        double gravidade = 0.0;

        if (planeta.equals("Mercúrio")) {
            gravidade = 0.37;
        } else if (planeta.equals("Vênus")) {
            gravidade = 0.8;
        } else if (planeta.equals("Marte")) {
            gravidade = 0.38;
        } else if (planeta.equals("Júpiter")) {
            gravidade = 2.64;
        } else if (planeta.equals("Saturno")) {
            gravidade = 1.15;
        } else if (planeta.equals("Urano")) {
            gravidade = 1.17;
        }

        double pesoPlaneta =  (pesoTerrestre / 10) * gravidade;

        resultadoPesoPlanetaWidget.setText("Seu peso em " + planeta + " é: " + pesoPlaneta + "kg");
    }
}
