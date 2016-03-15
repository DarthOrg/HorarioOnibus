package darthorg.com.horarioonibus.view;

import android.os.Bundle;
import android.support.design.widget.NavigationView;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ListView;

import java.util.Arrays;
import java.util.List;

import darthorg.com.horarioonibus.R;

public class Favoritos extends AppCompatActivity {
    List<String> numeroLinha = Arrays.asList("087",
            "073",
            "218",
            "219",
            "191",
            "217",
            "087",
            "073",
            "218",
            "219",
            "191",
            "217",
            "087",
            "073",
            "218",
            "219",
            "191",
            "217",
            "087",
            "073",
            "218",
            "219",
            "191",
            "217");
    List<String> nomeLinha = Arrays.asList("Guaicurus / Gen. Osório",
            "Nova Bahia / Julio de Castilho",
            "Monte castelo",
            "Octávio Pécora",
            "Moreninha Shopping",
            "Bosque de Avilã",
            "Guaicurus / Gen. Osório",
            "Nova Bahia / Julio de Castilho",
            "Monte castelo",
            "Octávio Pécora",
            "Moreninha Shopping",
            "Bosque de Avilã",
            "Guaicurus / Gen. Osório",
            "Nova Bahia / Julio de Castilho",
            "Monte castelo",
            "Octávio Pécora",
            "Moreninha Shopping",
            "Bosque de Avilã",
            "Guaicurus / Gen. Osório",
            "Nova Bahia / Julio de Castilho",
            "Monte castelo",
            "Octávio Pécora",
            "Moreninha Shopping",
            "Bosque de Avilã");
    List<String> tipoLinha = Arrays.asList("Linha Vermelha",
            "Linha Vermelha",
            "Linha Vermelha",
            "Linha Excutiva",
            "Linha Azul",
            "Linha Vermelha",
            "Linha Vermelha",
            "Linha Vermelha",
            "Linha Excutiva",
            "Linha Azul",
            "Linha Vermelha",
            "Linha Vermelha",
            "Linha Vermelha",
            "Linha Excutiva",
            "Linha Azul",
            "Linha Vermelha",
            "Linha Vermelha",
            "Linha Vermelha",
            "Linha Excutiva",
            "Linha Azul");


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_favoritos);

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        toolbar.setTitle("Linhas Favoritas");
        setSupportActionBar(toolbar);

        ListView lvPosts = (ListView) findViewById(R.id.lvLinhasFavoritos);
        AdapterLinhasFavoritos adapterLinhasFavoritos = new AdapterLinhasFavoritos(nomeLinha, tipoLinha, numeroLinha, this);
        lvPosts.setAdapter(adapterLinhasFavoritos);


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
        }else if (id == android.R.id.home) {
            finish();
        }

        return true;
    }
}
