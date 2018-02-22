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
    private  int indiceFrase;



    Random rand = new Random();

    private String[][] frases = new String[][]{
            {"Se você conhece o inimigo e conhece a si mesmo, não precisa temer o resultado de cem batalhas. Se você se conhece mas não conhece o inimigo, para cada vitória ganha sofrerá também uma derrota. Se você não conhece nem o inimigo nem a si mesmo, perderá todas as batalhas...", "Sun Tzu"},
            {"Aquele que se empenha a resolver as dificuldades resolve-as antes que elas surjam. Aquele que se ultrapassa a vencer os inimigos triunfa antes que as suas ameaças se concretizem.", "Sun Tzu"},
            {"Penso noventa e nove vezes e nada descubro; deixo de pensar, mergulho em profundo silêncio - e eis que a verdade se me revela.", "Albert Einstein"},
    };


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
                indiceFrase = rand.nextInt(frases.length);
                textoNovaFrase.setText(frases[indiceFrase][0]);
                textoAutor.setText(frases[indiceFrase][1]);

            }
        });


    }
}
