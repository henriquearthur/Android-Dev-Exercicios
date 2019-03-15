package com.unama.calcularligacao;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

import com.unama.appexercicios.MainActivity;
import com.unama.appexercicios.R;
import com.unama.pesoideal.PesoIdeal;

public class CalcularLigacao extends AppCompatActivity {

    private Spinner operadoraWidget;
    private EditText minLigacaoWidget;
    private TextView resultadoValorLigacaoWidget;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calcular_ligacao);

        operadoraWidget = findViewById(R.id.operadora);
        minLigacaoWidget = findViewById(R.id.minLigacao);
        resultadoValorLigacaoWidget = findViewById(R.id.resultadoValorLigacao);
    }

    public void voltarInicial(View v) {
        Intent intent = new Intent(CalcularLigacao.this, MainActivity.class);
        CalcularLigacao.this.startActivity(intent);
    }

    public void calcularLigacao(View v) {
        String op = operadoraWidget.getSelectedItem().toString();
        Double segLigacao = Double.parseDouble(minLigacaoWidget.getText().toString()) - 5.0;

        double valorPorSegundo = 0.0;

        if (op.equals("OP1")) {
            valorPorSegundo = 0.02;
        } else if (op.equals("OP2")) {
            valorPorSegundo = 0.025;
        } else if (op.equals("OP3")) {
            valorPorSegundo = 0.019;
        }

        double valorLigacao = segLigacao * valorPorSegundo;
        resultadoValorLigacaoWidget.setText("O valor da ligação é de R$" + valorLigacao);


    }
}
