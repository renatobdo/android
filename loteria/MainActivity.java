package com.example.loteria;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import java.util.Arrays;
import java.util.Random;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
//https://exame.com/pop/mega-da-virada-numeros-mais-sorteados/
    private TextView resultadoText6,resultadoText7, resultadoText8, resultadoText9;
    private int numerosSorteadosPeloMenosDuasVezes[] = {2, 3, 5, 11, 17, 18, 20, 22, 33,
        34, 35, 36, 37, 38, 40, 41, 42, 51, 53, 56, 58};
    private int numerosSorteadosPeloMenosUmaVez[] = {1, 4, 6, 12, 14, 16, 24, 25, 27, 29,
        30, 31, 32, 43, 45, 46, 47, 49, 50, 52, 55, 57};
    private int numerosNuncaSorteados[] = {7, 8, 9, 13, 15, 19, 21, 23, 26, 28, 39, 44,
        48, 54, 59, 60};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        resultadoText6 = findViewById(R.id.textView6);
        resultadoText7 = findViewById(R.id.textView7);
        resultadoText8 = findViewById(R.id.textView8);
        resultadoText9 = findViewById(R.id.textView9);


    }
    public void sortear(View view){
        Random rand = new Random();

        int vetor[]  = new int[6];
        int numero = 0;
        ArrayList<Integer> numeroAleatorio = new ArrayList<Integer>();
        for (int i=0; i<6; i++){
            numero = rand.nextInt(numerosSorteadosPeloMenosDuasVezes.length);
            while (numeroAleatorio.contains(numero)) {
                numero = rand.nextInt(numerosSorteadosPeloMenosDuasVezes.length);
            }
            numeroAleatorio.add(numero);
            vetor[i] = numerosSorteadosPeloMenosDuasVezes[numeroAleatorio.get(i)];

        }
        //https://stackoverflow.com/questions/57649095/removing-brackets-from-array
            Arrays.sort(vetor);
            String output = Arrays.toString(vetor);
            resultadoText6.setText(output.substring(1, output.length() - 1));

        int vetor2[]  = new int[6];
        int numero2 = 0;
        ArrayList<Integer> numeroAleatorio2 = new ArrayList<Integer>();
        for (int i=0; i<6; i++){
            numero2 = rand.nextInt(numerosSorteadosPeloMenosUmaVez.length);
            while (numeroAleatorio2.contains(numero2)) {
                numero2 = rand.nextInt(numerosSorteadosPeloMenosUmaVez.length);
            }
            numeroAleatorio2.add(numero2);
            vetor2[i] = numerosSorteadosPeloMenosUmaVez[numeroAleatorio2.get(i)];

        }
        Arrays.sort(vetor2);
        String output2 = Arrays.toString(vetor2);
        resultadoText7.setText(output2.substring(1, output2.length() - 1));

        int vetor3[]  = new int[6];
        int numero3 = 0;
        ArrayList<Integer> numeroAleatorio3 = new ArrayList<Integer>();
        for (int i=0; i<6; i++){
            numero3 = rand.nextInt(numerosNuncaSorteados.length);
            while (numeroAleatorio3.contains(numero3)) {
                numero3 = rand.nextInt(numerosNuncaSorteados.length);
            }
            numeroAleatorio3.add(numero3);
            vetor3[i] = numerosNuncaSorteados[numeroAleatorio3.get(i)];

        }
        Arrays.sort(vetor3);
        String output3 = Arrays.toString(vetor3);
        resultadoText8.setText(output3.substring(1, output3.length() - 1));


        int vetor4[]  = new int[6];
        int numero4 = 0;
        ArrayList<Integer> numeroAleatorio4 = new ArrayList<Integer>();
        for (int i=0; i<6; i++){
            numero4 = rand.nextInt(61);
            while (numeroAleatorio4.contains(numero4) || (numero4 == 0)) {
                numero4 = rand.nextInt(61);
            }
            numeroAleatorio4.add(numero4);
            vetor4[i] = numeroAleatorio4.get(i);

        }
        Arrays.sort(vetor4);
        String output4 = Arrays.toString(vetor4);
        resultadoText9.setText(output4.substring(1, output4.length() - 1));

    }
}
