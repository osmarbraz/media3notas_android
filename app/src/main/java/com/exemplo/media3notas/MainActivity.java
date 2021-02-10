package com.exemplo.media3notas;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private EditText editTextNota1;
    private EditText editTextNota2;
    private EditText editTextNota3;
    private EditText editTextResultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Associa os componentes da interface aos componentes da classe
        editTextNota1 = findViewById(R.id.editTextNota1);
        editTextNota2 = findViewById(R.id.editTextNota2);
        editTextNota3 = findViewById(R.id.editTextNota3);
        editTextResultado = findViewById(R.id.editTextResultado);
    }

    public void onClickButtonCalcular(View v) {
        if (!editTextNota1.getText().toString().equals("")) {
            if (!editTextNota2.getText().toString().equals("")) {
                if (!editTextNota3.getText().toString().equals("")) {
                    double soma = Double.parseDouble(editTextNota1.getText().toString()) + Double.parseDouble(editTextNota2.getText().toString()) + Double.parseDouble(editTextNota3.getText().toString());
                    double media = soma / 3;
                    editTextResultado.setText("" + media);
                } else {
                    Toast.makeText(MainActivity.this, "Digite a nota 3!", Toast.LENGTH_SHORT).show();
                    //Coloca o foco na caixa de texto número1
                    editTextNota3.requestFocus();
                }
            } else {
                Toast.makeText(MainActivity.this, "Digite a nota 2!", Toast.LENGTH_SHORT).show();
                //Coloca o foco na caixa de texto número1
                editTextNota2.requestFocus();
            }
        } else {
            Toast.makeText(MainActivity.this, "Digite a nota 1!", Toast.LENGTH_SHORT).show();
            //Coloca o foco na caixa de texto número1
            editTextNota1.requestFocus();
        }
    }

    public void onClickButtonLimpar(View v) {
        editTextNota1.setText("");
        editTextNota2.setText("");
        editTextNota3.setText("");
        editTextResultado.setText("");
    }

    public void onClickBotaoFechar(View v) {
        System.exit(0);
    }

}