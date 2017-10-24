package br.usjt.ronaldoluizbritodejesussi3anbua;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemSelectedListener;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;

import br.usjt.ronaldoluizbritodejesussi3anbua.R;
import br.usjt.ronaldoluizbritodejesussi3anbua.SegundaTela;

public class PrimeiraTela extends AppCompatActivity implements OnItemSelectedListener {

    private EditText editTextNome;
    private Spinner listaLivro;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_primeira_tela);
        editTextNome = (EditText)findViewById(R.id.editTextNome);
        listaLivro = (Spinner) findViewById(R.id.planets_spinner);
        // Create an ArrayAdapter using the string array and a default spinner layout
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this, R.array.planets_array, android.R.layout.simple_spinner_item);
        // Specify the layout to use when the list of choices appears
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        // Apply the adapter to the spinner
        listaLivro.setAdapter(adapter);
        
    }

    public void enviarMensagem(View v){
        String texto = editTextNome.getText().toString();
        int lista = listaLivro.getSelectedItemPosition();
        Bundle b =new Bundle();
        b.putString("txt", texto);
        b.putInt("int", lista);
        Intent i = new Intent (this, SegundaTela.class);
        i.putExtras(b);
        startActivity(i);
    }

    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {

    }
}
