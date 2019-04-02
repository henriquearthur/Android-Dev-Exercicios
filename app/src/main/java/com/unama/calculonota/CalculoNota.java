package com.unama.calculonota;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import android.widget.TextView;

import com.unama.appexercicios.MainActivity;
import com.unama.appexercicios.R;
import com.unama.calcularligacao.CalcularLigacao;

public class CalculoNota extends AppCompatActivity {
    private EditText nomeAlunoWidget;
    private EditText notaAv1Widget;
    private EditText notaAv2Widget;
    private TextView resultadoMediaAlunoWidget;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculo_nota);

        nomeAlunoWidget = findViewById(R.id.nomeAluno);
        notaAv1Widget = findViewById(R.id.notaAv1);
        notaAv2Widget = findViewById(R.id.notaAv2);
        resultadoMediaAlunoWidget = findViewById(R.id.resultadoMediaAluno);

    }

    public void voltarInicial(View v) {
        Intent intent = new Intent(CalculoNota.this, MainActivity.class);
        CalculoNota.this.startActivity(intent);
    }

    public void calcularMedia(View v) {
        String nome = nomeAlunoWidget.getText().toString();
        double notaAv1 = Double.parseDouble(notaAv1Widget.getText().toString());
        double notaAv2 = Double.parseDouble(notaAv2Widget.getText().toString());
        double media = (notaAv1 + notaAv2) / 2;

        String status;

        if (media >= 7) {
            status = "Aprovado";
        } else if (media < 4) {
            status = "Reprovado";
        } else {
            status = "Em prova final";
        }

        resultadoMediaAlunoWidget.setText(nome + ", sua média foi " + media + " e você está " + status);
        hideKeyboard(this);
    }

    public static void hideKeyboard(Activity activity) {
        InputMethodManager imm = (InputMethodManager) activity.getSystemService(Activity.INPUT_METHOD_SERVICE);
        //Find the currently focused view, so we can grab the correct window token from it.
        View view = activity.getCurrentFocus();
        //If no view currently has focus, create a new one, just so we can grab a window token from it
        if (view == null) {
            view = new View(activity);
        }
        imm.hideSoftInputFromWindow(view.getWindowToken(), 0);
    }
}
