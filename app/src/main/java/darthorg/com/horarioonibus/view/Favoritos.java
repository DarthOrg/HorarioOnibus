package darthorg.com.horarioonibus.view;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

import darthorg.com.horarioonibus.R;
import darthorg.com.horarioonibus.model.Linha;

public class Favoritos extends AppCompatActivity {

    List<Linha> linhas = new ArrayList<>();

    Linha linhaAtoa = new Linha("080", "Centro", "General Osório");
    Linha linhaAtoa2 = new Linha("020", "Bairro", "Lagoa da Cruz");
    Linha linhaAtoa3 = new Linha("301", "Executivo", "Onibus executivo");


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_favoritos);

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        toolbar.setTitle("Linhas Favoritas");
        setSupportActionBar(toolbar);

        ListView lvLinhasFavoritos = (ListView) findViewById(R.id.lvLinhasFavoritos);

        AdapterLinhasFavoritos adapterLinhas = new AdapterLinhasFavoritos(linhas,this);
        lvLinhasFavoritos.setAdapter(adapterLinhas);


        linhas.add(linhaAtoa);
        linhas.add(linhaAtoa2);
        linhas.add(linhaAtoa3);
        linhas.add(linhaAtoa);
        linhas.add(linhaAtoa2);
        linhas.add(linhaAtoa3);
        linhas.add(linhaAtoa);
        linhas.add(linhaAtoa2);
        linhas.add(linhaAtoa3);


        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.favoritos, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_pesquisar) {
            return true;
        } else if (id == android.R.id.home) {
            finish();
        }

        return true;
    }
}
