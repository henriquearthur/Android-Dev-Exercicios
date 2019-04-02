package com.unama.categorianadador;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import com.unama.appexercicios.MainActivity;
import com.unama.appexercicios.R;
import com.unama.calcularligacao.CalcularLigacao;

public class CategoriaNadador extends AppCompatActivity {
    private EditText idadeNadadorWidget;
    private TextView resultadoNadador;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_categoria_nadador);

        idadeNadadorWidget = findViewById(R.id.idadeNadador);
        resultadoNadador = findViewById(R.id.resultadoNadador);
    }

    public void voltarInicial(View v) {
        Intent intent = new Intent(CategoriaNadador.this, MainActivity.class);
        CategoriaNadador.this.startActivity(intent);
    }

    public void calcularCategoriaNadador(View v) {
        int idade = Integer.parseInt(idadeNadadorWidget.getText().toString());
        String categoria = "";

        if (idade >= 5 && idade <= 7) {
            categoria = "Infantil A";
        } else if (idade >= 8 && idade <= 10) {
            categoria = "Infantil B";
        } else if (idade >= 11 && idade <= 13) {
            categoria = "Juvenil A";
        } else if (idade >= 14 && idade <= 17) {
            categoria = "Juvenil B";
        } else if (idade >= 18) {
            categoria = "Sênior";
        }

        resultadoNadador.setText(categoria);
    }
}
