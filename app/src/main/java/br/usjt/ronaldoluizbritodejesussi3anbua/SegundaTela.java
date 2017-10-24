package br.usjt.ronaldoluizbritodejesussi3anbua;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

/**
 * Created by RonaldoLuizBritodeJe on 21/10/2017.
 */

public class SegundaTela extends AppCompatActivity {

    private TextView exibeTextoTextView;
    private ListView listaLivro;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_segunda_tela);
        exibeTextoTextView = (TextView) findViewById(R.id.exibeTextoTextView);
        listaLivro = (ListView) findViewById(R.id.listaLivro);
        Intent i = getIntent();
        Bundle b = i.getExtras();
        int lista = b.getInt("int");
        String texto = b.getString("txt");
        exibeTextoTextView.setText(texto);
        listaLivros(lista);
    }

    private void listaLivros(int id){
        ArrayAdapter<String> adapter;
        if(id==0) {
            adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, getResources().getStringArray(R.array.tecnico));
        }else {
            adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, getResources().getStringArray(R.array.literatura));
        }

        listaLivro.setAdapter(adapter);
    }
}
