package souza.guilherme.primeiraapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import android.content.Intent;
import android.widget.TextView;

public class NextActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_next); // Define visualização de conteúdo
        Intent i = getIntent(); //Obtemos o Intent
        String textoDigitado = i.getStringExtra("batata-frita"); //pegamos a string que foi passada como parâmetro (no Intent) através da chave "batata-frita"
        TextView tvTexto = findViewById(R.id.tvTexto); //Pega o elemento tvTexto da classe TextView
        tvTexto.setText(textoDigitado); //Define o texto do elemento tvTexto com
    }
}