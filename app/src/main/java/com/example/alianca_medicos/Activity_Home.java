package com.example.alianca_medicos;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Activity_Home extends AppCompatActivity implements View.OnClickListener {

    Button opcoes;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout__home);

        opcoes = findViewById(R.id.btnOpcoes);

        opcoes.setOnClickListener(this);
    }


    @Override
    public void onClick(View v) {
        Intent intent = new Intent(this, Activity_Perfil.class);
        startActivity(intent);
    }
}