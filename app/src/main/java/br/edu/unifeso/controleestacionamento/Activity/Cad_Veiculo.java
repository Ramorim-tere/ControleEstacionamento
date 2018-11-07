package br.edu.unifeso.controleestacionamento.Activity;

import android.content.Context;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import br.edu.unifeso.controleestacionamento.R;

public class Cad_Veiculo extends AppCompatActivity {

    EditText nome, marca, placa;
    Button limpar, salvar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cad__veiculo);


        limpar = (Button) findViewById(R.id.btnLimpar);
        salvar = (Button) findViewById(R.id.btnSalvar);

        nome = (EditText) findViewById(R.id.editNome);
        marca= (EditText) findViewById(R.id.editMarca);
        placa= (EditText) findViewById(R.id.editPlaca);
    }
    public void limpar (View view){
        nome.setText("");
        marca.setText("");
        placa.setText("");
    }
    public void salvar (View view){
        SharedPreferences prefs = getSharedPreferences("preferencias", Context.MODE_PRIVATE);
        SharedPreferences.Editor ed = prefs.edit();
        ed.putString("nome",nome.getText().toString());
        ed.putString("marca",marca.getText().toString());
        ed.putString("placa",placa.getText().toString());

        ed.apply();
        Toast.makeText(getBaseContext(), "Gravado com Sucesso", Toast.LENGTH_SHORT).show();




    }
}
