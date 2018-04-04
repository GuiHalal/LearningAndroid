package gasolinaoualcool.guidev.com.gasolinaoualcool;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private Button verificar;
    private TextView resultado;
    private EditText precoGas, precoAlcool;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //localizando elementos na tela
        precoAlcool =(EditText) findViewById(R.id.CampoAlcoolID);
        precoGas = (EditText) findViewById(R.id.CampoGasID);
        verificar = (Button) findViewById(R.id.ButtonID);
        resultado = (TextView) findViewById(R.id.ResultadoID);

        //função que trata o clique no botão verificar

        verificar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                //recuperar valores digitados nos campos
                String precoAl = precoAlcool.getText().toString();
                String precoGasolina = precoGas.getText().toString();

                //converte para número:

                Double alcool, gasolina;
                alcool = Double.parseDouble(precoAl);
                gasolina = Double.parseDouble(precoGasolina);

                Double resul=0.00;
                //mostrando resultado

                try {
                    resul = alcool/gasolina; //tratar excessão de divisão por zero
                } catch (Exception e) {
                    e.printStackTrace();
                    resultado.setText("entre com os valores");
                }

                    if(resul>=0.7)
                        resultado.setText("USE GASOLINA");
                    else
                        resultado.setText("USE ALCOOL");

            }
        });

    }
}
