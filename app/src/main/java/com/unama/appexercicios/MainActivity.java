package com.unama.appexercicios;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.unama.calcularligacao.CalcularLigacao;
import com.unama.calculonota.CalculoNota;
import com.unama.calculopesoplaneta.CalculoPesoPlaneta;
import com.unama.calculovalory.CalculoValorY;
import com.unama.categorianadador.CategoriaNadador;
import com.unama.descontorestaurante.DescontoRestaurante;
import com.unama.escolhaanimais.EscolhaAnimais;
import com.unama.pesoideal.PesoIdeal;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void abrirPesoIdeal(View v) {
        Intent intent = new Intent(MainActivity.this, PesoIdeal.class);
        MainActivity.this.startActivity(intent);
    }

    public void abrirLigacao(View v) {
        Intent intent = new Intent(MainActivity.this, CalcularLigacao.class);
        MainActivity.this.startActivity(intent);
    }

    public void abrirEscolhaAnimais(View v) {
        Intent intent = new Intent(MainActivity.this, EscolhaAnimais.class);
        MainActivity.this.startActivity(intent);
    }

    public void abrirPesoPlaneta(View v) {
        Intent intent = new Intent(MainActivity.this, CalculoPesoPlaneta.class);
        MainActivity.this.startActivity(intent);
    }

    public void abrirCalculoValorY(View v) {
        Intent intent = new Intent(MainActivity.this, CalculoValorY.class);
        MainActivity.this.startActivity(intent);
    }

    public void abrirCalculoNota(View v) {
        Intent intent = new Intent(MainActivity.this, CalculoNota.class);
        MainActivity.this.startActivity(intent);
    }

    public void abrirCategoriaNadador(View v) {
        Intent intent = new Intent(MainActivity.this, CategoriaNadador.class);
        MainActivity.this.startActivity(intent);
    }

    public void abrirDescontoRestaurante(View v) {
        Intent intent = new Intent(MainActivity.this, DescontoRestaurante.class);
        MainActivity.this.startActivity(intent);
    }
}

