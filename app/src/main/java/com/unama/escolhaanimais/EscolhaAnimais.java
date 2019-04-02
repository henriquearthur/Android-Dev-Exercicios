package com.unama.escolhaanimais;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Spinner;
import android.widget.TextView;

import com.unama.appexercicios.MainActivity;
import com.unama.appexercicios.R;
import com.unama.calcularligacao.CalcularLigacao;

public class EscolhaAnimais extends AppCompatActivity {
    private Spinner animal1Widget;
    private Spinner animal2Widget;
    private Spinner animal3Widget;
    private TextView resultadoWidget;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_escolha_animais);

        animal1Widget = findViewById(R.id.animal1);
        animal2Widget = findViewById(R.id.animal2);
        animal3Widget = findViewById(R.id.animal3);
        resultadoWidget = findViewById(R.id.resultadoAnimal);
    }

    public void voltarInicial(View v) {
        Intent intent = new Intent(EscolhaAnimais.this, MainActivity.class);
        EscolhaAnimais.this.startActivity(intent);
    }

    public void calcularAnimal(View v) {
        String a1 = animal1Widget.getSelectedItem().toString();
        String a2 = animal2Widget.getSelectedItem().toString();
        String a3 = animal3Widget.getSelectedItem().toString();

        String animal = "";

        if (a1.equals("Vertebrado")) {
            if (a2.equals("Ave")) {
                if(a3.equals("Carnívoro")) {
                    animal = "Águia";
                }

                if(a3.equals("Onívoro")) {
                    animal = "Pomba";
                }
            }

            if (a2.equals("Mamífero")) {
                if(a3.equals("Onívoro")) {
                    animal = "Homem";
                }

                if(a3.equals("Herbívoro")) {
                    animal = "Vaca";
                }
            }
        }

        if (a1.equals("Invertebrado")) {
            if (a2.equals("Inseto")) {
                if(a3.equals("Hematofago")) {
                    animal = "Pulga";
                }

                if(a3.equals("Herbívoro")) {
                    animal = "Lagarta";
                }
            }

            if (a2.equals("Anelídeo")) {
                if(a3.equals("Hematofago")) {
                    animal = "Sanguessuga";
                }

                if(a3.equals("Onívoro")) {
                    animal = "Minhoca";
                }
            }
        }

        if (animal.equals("")) {
            animal = "Impossível de escolher";
        }



        resultadoWidget.setText("O animal escolhido é " + animal);


    }
}
