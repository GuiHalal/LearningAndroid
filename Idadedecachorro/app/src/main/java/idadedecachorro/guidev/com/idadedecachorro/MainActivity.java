package idadedecachorro.guidev.com.idadedecachorro;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText caixaTexto;
    private Button botaoIdade;
    private TextView resultadoIdade;
        
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        caixaTexto = (EditText) findViewById(R.id.campoEntradaID);
        botaoIdade = (Button) findViewById(R.id.botaoCalculaID);
        resultadoIdade = (TextView) findViewById(R.id.ResultadoID);

        botaoIdade.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //recebe valor digitado
                String textoDigitado = caixaTexto.getText().toString();

                if (textoDigitado.isEmpty()) {
                    //escrever mensagem de erro
                    resultadoIdade.setText("ERRO. Favor digite um valor");
                }
                else {

                    int valorDigitado = Integer.parseInt(textoDigitado);
                    int resultadoFinal = valorDigitado * 7;

                    resultadoIdade.setText("A idade do seu cachorro em anos humanos é " + resultadoFinal + " anos.");
                }
            }
        });


    }
}
