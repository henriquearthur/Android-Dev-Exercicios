package com.unama.descontorestaurante;

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
import com.unama.calculonota.CalculoNota;

public class DescontoRestaurante extends AppCompatActivity {
    private EditText nomePessoaWidget;
    private EditText valorContaWidget;
    private TextView resultadoRestauranteWidget;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_desconto_restaurante);

        nomePessoaWidget = findViewById(R.id.nomePessoa);
        valorContaWidget = findViewById(R.id.valorConta);
        resultadoRestauranteWidget = findViewById(R.id.resultadoRestaurante);
    }

    public void voltarInicial(View v) {
        Intent intent = new Intent(DescontoRestaurante.this, MainActivity.class);
        DescontoRestaurante.this.startActivity(intent);
    }

    public void calcularRestaurante(View v) {
        String nome = nomePessoaWidget.getText().toString();
        double valor = Double.parseDouble(valorContaWidget.getText().toString());
        char letra = Character.toLowerCase(nome.charAt(0));

        String resultado;

        if (letra == 'a' || letra == 'e' || letra == 'i' || letra == 'o' || letra == 'u') {
            resultado = "Parabéns, você ganhou 30% de desconto! Aproveite!";

            valor = valor - (0.3 * valor);
        } else {
            resultado = "Que pena! Nesta semana o desconto não é para seu nome; mas continue nos prestigiando que sua vez chegará.";
        }

        resultadoRestauranteWidget.setText(resultado + "\n\nValor final: R$" + valor);
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
