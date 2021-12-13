package com.ifsp.encontrarvinho;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.*;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void onClickEncontreVinho(View view){

        TextView resultado = findViewById(R.id.textViewResultado);
        Spinner tiposVinhos = (Spinner) findViewById(R.id.tiposDeVinhos);
        String valorSelecionado = String.valueOf(tiposVinhos.getSelectedItem());

        resultado.setText(valorSelecionado);

        ImageView imagemVinho2 = (ImageView)findViewById(R.id.imageViewVinho);
        if (valorSelecionado.equals("Branco")) {
            resultado.setText("Um vinho branco de intensos aromas de flores e frutas tropicais como maracujá, maçã e abacaxi. Leve e saboroso, é agradável e de grande frescor.\n" +
                    "Cor: Amarelo palha com tons esverdeado.\n" +
                    "Aroma: De Intensos aromas de flores e frutas tropicais como maracujá, maçã e abacaxi.\n" +
                    "Paladar: Leve e saboroso, é agradável e de grande frescor.\n" +
                    "Harmonização: Peito de frango com legumes salteados, coxinha de galinha, bolinho de bacalhau, risoles de queijo e presunto, empadinhas de palmito, casquinha de siri, espaguete com frutos do mar, filé de pescada empanada.\n" +
                    "Álcool: 12.5%\n" +
                    "Volume: 750ml");
            imagemVinho2.setImageResource(R.drawable.vinhobrancochile);
        }
        if (valorSelecionado.equals("Tinto")) {
            resultado.setText("Um vinho de intensos aromas de flores e frutas tropicais);
            imagemVinho2.setImageResource(R.drawable.vinhotintochile);
        }

    }
}
