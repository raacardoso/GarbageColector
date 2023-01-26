package com.example.agenda;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText et_tipo, et_quantidade, et_endereco;
    Button btn_consultar;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        et_tipo=(EditText) findViewById(R.id.et_tipo);
        et_quantidade=(EditText) findViewById(R.id.et_quantidade);
        et_endereco=(EditText) findViewById(R.id.et_endereco);
        //btn_voltar=(Button) findViewById(R.id.btn_voltar);
        //btn_gravar=(Button) findViewById(R.id.btn_gravar);
        btn_consultar=(Button) findViewById(R.id.btn_consultar);
    }

    public void abrir_tela_consulta(View v){
        Intent it_tela_consulta=new Intent(this,TelaConsulta.class);
        startActivity(it_tela_consulta);
    }

}
