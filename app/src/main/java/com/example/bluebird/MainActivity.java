package com.example.bluebird;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btSign = (Button) findViewById(R.id.btnSignIn);

        btSign.setOnClickListener(new View.OnClickListener() {
            @Override

            public void onClick(View view) {
                //implementar método para conectar dados ao banco
            }
        });
    }
}