package souza.guilherme.primeiraapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity{ //A classe MainActivy é a tela principal da apliacação

    @Override
    protected void onCreate(Bundle savedInstanceState){ //OnCreate é chamado toda vez que a tela está sendo criada
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main); //Constrói os elementos de interface que foram definidos no arquivo xml
        Button btnEnviar = findViewById(R.id.btnEnviar); //Pega o elemento btnEnviar da classe Botão através de seu id
        btnEnviar.setOnClickListener(new View.OnClickListener() { //Define o que ocorre para quando o botão for clicado
            @Override
            public void onClick(View v) { //É executado quando o botão for clicado
                EditText etDigiteAqui = findViewById(R.id.etDigiteAqui); //Pega o texto que foi digitado no elemento etDigiteAqui
                String TextoDigitado = etDigiteAqui.getText().toString(); //Converte o texto para uma String
                Intent i = new Intent(MainActivity.this, NextActivity.class); //Cria uma Intent (passagem de uma tela a outra)
                i.putExtra("batata-frita", TextoDigitado); //Dentro do Intent, colocamos o valor TextoDigitado associado a chave "batata_frita"
                startActivity(i); //inicia a Activity
            }
        });
    }
}