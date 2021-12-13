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
            resultado.setText(
                    "Origem: Bento Gonçalves - rs - Brasil\n" +
                    "Corpo: Médio\n" +
                    "Teor Alcólico: 12%\n" +
                    "Temperatura de Serviço: 16° a 18°C\n" +
                    "Castas de Uva: Assemblage de varietais com predominância de Cabernet Franc e Merlot.\n" +
                    "Aroma: A uva Merlot propicia um vinho de agradáveis aromas, lembrando frutas vermelhas, de acentuada leveza e agradável frescor.\n" +
                    "Paladar: Este vinho, é o resultado do Assemblage de varietais. é um vinho seco, macio e de paladar harmonioso. Tem aroma frutado, de coloração rubi, de boa estrutura e corpo.\n" +
                    "Harmonização: Acompanha queijos de massa média, massas com molhos de tomate, risotos e carne vermelha grelhada.");
            imagemVinho2.setImageResource(R.drawable.vinhotinto);
        }
        if (valorSelecionado.equals("Espumante")) {
            resultado.setText(
                    "Espumante Brasileiro Branco Brut Saint Germain Serra Gaúcha Garrafa 660ml\n" +
                            "Harmonizará com pratos mais leves,devido ao seu frescor e estrutura média. \nAntepastos frios e em conservas,como pequenos peixes com azeite de oliva,filé de anchovas,peixes brancos empanados ou grelhados,vários preparos com frango -como ao alho e óleo"
                         );
            imagemVinho2.setImageResource(R.drawable.espumante);
        }
        if (valorSelecionado.equals("Curiosidades")) {
            resultado.setText("1. Aliado do coração\n" +
                    "2. Potencializador do Cérebro\n" +
                    "3. Aliado na perda de peso\n" +
                    "4. Melhora o desempenho físico\n" +
                    "5. Melhora o sistema imunológico\n" +
                    "6. Aliado do colesterol\n" +
                    "7. Reduz risco de doença renal");
            imagemVinho2.setImageResource(R.drawable.tacaspordia);
        }
        if (valorSelecionado.equals("Escolha")) {
            resultado.setText("");
            imagemVinho2.setImageResource(R.drawable.logovinhos);
        }

    }
}
