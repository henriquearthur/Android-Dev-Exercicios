package com.unama.appexercicios;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

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
}
