package com.example.bluebird;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.bluebird.dao.PeopleDAO;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btSign = (Button) findViewById(R.id.btnSignIn);

        btSign.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                EditText name = (EditText) findViewById(R.id.edtName);
                EditText fantasyName = (EditText) findViewById(R.id.edtSocialName);
                EditText gender = (EditText) findViewById(R.id.edGender);
                EditText fatherName = (EditText) findViewById(R.id.edtFatherName);
                EditText motherName = (EditText) findViewById(R.id.edtMotherName);
                EditText income = (EditText) findViewById(R.id.edMoneyAmout);

                PeopleDAO dao = new PeopleDAO(getBaseContext());

                try {
                    if(dao.create(name.getText().toString(), fantasyName.getText().toString(), gender.getText().toString(), fatherName.getText().toString(), motherName.getText().toString(), Double.parseDouble(income.getText().toString()))) {
                        Toast.makeText(getBaseContext(), "Dados salvos com sucesso", Toast.LENGTH_SHORT).show();
                    } else {
                        Toast.makeText(getBaseContext(), "Ocorreu um erro tente novamente mais tarde!", Toast.LENGTH_SHORT).show();
                    }
                } catch (Exception e) {
                    Toast.makeText(getBaseContext(), e.getMessage().toString(), Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}