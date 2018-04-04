package frasedodia.guidev.com.frasedodia;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    private TextView textoNovaFrase, textoAutor;
    private Button botaoNovaFrase;
    private  int indiceFrase, indiceAnterior=99;


-

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        textoNovaFrase = (TextView) findViewById(R.id.textoNovaFraseId);
        textoAutor = (TextView) findViewById(R.id.AutorId);
        botaoNovaFrase = (Button) findViewById(R.id.botaoNovaFraseId);

        botaoNovaFrase.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                do {
                    indiceFrase = rand.nextInt(frases.length);
                }while(indiceFrase==indiceAnterior);
                indiceAnterior=indiceFrase;
                textoNovaFrase.setText(frases[indiceFrase][0]);
                textoAutor.setText(frases[indiceFrase][1]);
            }
        });


    }
}
