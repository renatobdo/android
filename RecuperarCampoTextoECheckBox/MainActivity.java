package com.ifsp.recuperartexto;

import androidx.appcompat.app.AppCompatActivity;
import android.widget.*;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {
    private EditText nomeEdit, emailEdit;
    private TextView resultadoTextView;
    private String nome, email;
    private CheckBox basico, intermediario, avancado, expert;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EditText nomeEdit = findViewById(R.id.editTextNome);
        EditText emailEdit = findViewById(R.id.editTextEmail);

        nome = nomeEdit.getText().toString();
        email = emailEdit.getText().toString();

        resultadoTextView = findViewById(R.id.textViewResultado);

        basico = findViewById(R.id.checkBasico);
        intermediario = findViewById(R.id.checkIntermediario);
        avancado = findViewById(R.id.checkAvancado);
        expert = findViewById(R.id.checkExpert);

    }
    public void checkBox(){
        String resultado = "";

        if (basico.isChecked()){
            resultado = "básico selecionado";
        }
        /* *******************  ou
        if(basico.isChecked()){
            resultado = basico.getText().toString();
        } */
        if (intermediario.isChecked()){
            resultado = resultado +" intermediário selecionado";
        }
        if (avancado.isChecked()){
            resultado = resultado+" avançado selecionado";
        }
        if (expert.isChecked()){
            resultado = resultado+" expert selecionado";
        }

        resultadoTextView.setText("nome "+nome
                +" e-mail"+ email +" Resultado "+ resultado);

    }

    public void enviar(View view){

        checkBox();

    }
}
