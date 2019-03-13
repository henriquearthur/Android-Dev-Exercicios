package com.unama.pesoideal;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioGroup;
import android.widget.TextView;

import com.unama.appexercicios.MainActivity;
import com.unama.appexercicios.R;

public class PesoIdeal extends AppCompatActivity {

    private EditText alturaInput;
    private RadioGroup rdSexoInput;
    private TextView txtResultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_peso_ideal);

        alturaInput = findViewById(R.id.altura);
        rdSexoInput = findViewById(R.id.rdSexo);
        txtResultado = findViewById(R.id.resultadoPesoIdeal);
    }

    public void voltarInicial(View v) {
        Intent intent = new Intent(PesoIdeal.this, MainActivity.class);
        PesoIdeal.this.startActivity(intent);
    }

    public void calcularPeso(View v) {
        double altura = Double.parseDouble(alturaInput.getText().toString());

        int idRespEscolhida = rdSexoInput.getCheckedRadioButtonId();
        double peso = 0.0;

        if(idRespEscolhida == R.id.rdMasc) {
            peso = (72.7 * altura) - 58;
        } else if (idRespEscolhida == R.id.rdFem) {
            peso = (62.1 * altura) - 44.7;
        }

        txtResultado.setText("Seu peso ideal é: " + peso + "kg");
    }
}
