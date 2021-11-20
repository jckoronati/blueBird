package com.example.bluebird;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btSign = (Button) findViewById(R.id.btnSignIn);

        btSign.setOnClickListener(new View.OnClickListener() {
            @Override

            // Conectar com o banco e inserir dados no campo da tabela
            public void onClick(View view) {
                //                EditText name = (EditText) findViewById(R.id.edtName);
            }
        });
    }
}