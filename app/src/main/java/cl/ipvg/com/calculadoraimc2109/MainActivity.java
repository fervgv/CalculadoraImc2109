package cl.ipvg.com.calculadoraimc2109;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText peso, altura ;
    Button aceptar;
    TextView resultado;

        float fpeso, faltura ,fresultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

   peso=(EditText) findViewById(R.id.peso);
   altura=(EditText)   findViewById(R.id.altura);
   aceptar=(Button) findViewById(R.id.btaceptar);
   resultado= (TextView) findViewById(R.id.tvresultado);

        aceptar.setOnClickListener(new View.OnClickListener () {
            @Override
            public void onClick(View view) {

            try {

                fpeso=Float.parseFloat (peso.getText().toString());
            faltura=Float.parseFloat(altura.getText().toString());
            fresultado=fpeso/(faltura*faltura);
            resultado.setText("Resultado IMC" + fresultado);
            }catch (NumberFormatException e ) {
                resultado.setText("Error al calcular IMC");
            }
            }
        });

        }
    }

