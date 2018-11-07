package br.edu.unifeso.controleestacionamento.Activity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import br.edu.unifeso.controleestacionamento.R;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void abrirCadVeiculo (View v){
        Intent CadVeiculo;
       CadVeiculo = new Intent(this, br.edu.unifeso.controleestacionamento.class);
         startActivity(CadVeiculo);
    }
    public void abrirConsVeiculo (View v) {
        Intent ConsVeiculo = new Intent(this, br.edu.unifeso.controleestacionamento.class);
        startActivity(ConsVeiculo);
    }




}
