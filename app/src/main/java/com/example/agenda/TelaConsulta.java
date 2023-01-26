package com.example.agenda;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class TelaConsulta extends AppCompatActivity {

    Button btn_data1, btn_data2, btn_data3, btn_voltar2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela_consulta);

        btn_data1=(Button) findViewById(R.id.btn_data1);
        btn_data2=(Button) findViewById(R.id.btn_data2);
        btn_data3=(Button) findViewById(R.id.btn_data3);
        btn_voltar2=(Button) findViewById(R.id.btn_voltar2);
    }

    public void abrir_tela_suceso(View v){
        Intent it_tela_suceso=new Intent(this,TelaSuceso.class);
        startActivity(it_tela_suceso);
    }


    public void abrir_tela_Main(View v){
        Intent it_main_activity=new Intent(this,MainActivity.class);
        startActivity(it_main_activity);
    }

}