package com.example.agenda;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class TelaSuceso extends AppCompatActivity {

    Button btn_concluir;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela_suceso);

        btn_concluir=(Button) findViewById(R.id.btn_concluir);

    }

    public void abrir_tela_Main(View v){
        Intent it_main_activity=new Intent(this,MainActivity.class);
        startActivity(it_main_activity);
    }
}