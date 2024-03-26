package souza.guilherme.primeiraapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity{

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main); // Define visualização de conteúdo
        Button btnEnviar = findViewById(R.id.btnEnviar); //Pega o elemento btnEnviar da classe Botão através de seu id
        btnEnviar.setOnClickListener(new View.OnClickListener() { //Condição para quando o botão for clicado
            @Override
            public void onClick(View v) { //
                EditText etDigiteAqui = findViewById(R.id.etDigiteAqui); //Pega o texto que foi digitado no elemento etDigiteAqui
                String TextoDigitado = etDigiteAqui.getText().toString(); //Converte o texto para uma String
                Intent i = new Intent(MainActivity.this, NextActivity.class); //Cria uma Intent (passagem de uma tela a outra)
                i.putExtra("batata-frita", TextoDigitado); //Dentro do Intent, colocamos o valor TextoDigitado associado a chave "batata_frita"
                startActivity(i); //inicia a Activity
            }
        });
    }
}