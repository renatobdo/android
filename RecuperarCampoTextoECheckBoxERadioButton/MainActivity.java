package com.ifsp.recuperartexto;

import androidx.appcompat.app.AppCompatActivity;
import android.widget.*;
import android.os.Bundle;
import android.view.View;

import java.util.zip.CheckedInputStream;

public class MainActivity extends AppCompatActivity {

    private EditText nomeEdit, emailEdit;
    private TextView resultadoTextView;
    private CheckBox basico, intermediario, avancado, expert;
    private String nome, email, resultado, resultadoRadioButton;
    private RadioButton radioButtonFeminino, radioButtonMasculino;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        this.nomeEdit = findViewById(R.id.editTextNome);
        this.emailEdit = findViewById(R.id.editTextEmail);
        this.resultadoTextView = findViewById(R.id.textViewResultado);
        this.resultado = "";
        this.resultadoRadioButton = "";

        basico = findViewById(R.id.checkBasico);
        intermediario = findViewById(R.id.checkIntermediario);
        avancado = findViewById(R.id.checkAvancado);
        expert = findViewById(R.id.checkExpert);

        radioButtonFeminino = findViewById(R.id.radioButtonFeminino);
        radioButtonMasculino = findViewById(R.id.radioButtonMasculino);

    }
    public void checkBox(){
        this.resultado = "";

        if (basico.isChecked()){
            resultado = "básico foi selecionado";
        }
        if (intermediario.isChecked()){
            resultado = resultado +" intermidiário foi selecionado";
        }
        if (avancado.isChecked()){
            resultado = resultado+" avançado foi selecionado";
        }
        if (expert.isChecked()){
            resultado = resultado +" expert foi selecionado";
        }


    }
    public void radioButton(){
        this.resultadoRadioButton = "";
        if (radioButtonMasculino.isChecked()){
            resultadoRadioButton = "masculino selecionado ";

        }else{
            resultadoRadioButton = " feminino selecionado";
        }


    }

    public void enviar(View view){
        nome = nomeEdit.getText().toString();
        email = emailEdit.getText().toString();
        checkBox();
        radioButton();
        resultadoTextView.setText("nome "+nome
                +" e-mail"+ email +"resultado = "+resultado +"resultado" +
                " radioButton = "+resultadoRadioButton);
    }
}
