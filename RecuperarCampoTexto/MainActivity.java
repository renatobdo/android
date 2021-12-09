package com.ifsp.recuperartexto;

import androidx.appcompat.app.AppCompatActivity;
import android.widget.EditText;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void enviar(View view){
        EditText nome = findViewById(R.id.editTextNome);
        TextView resultado = findViewById(R.id.textViewResultado);

        


    }
}
