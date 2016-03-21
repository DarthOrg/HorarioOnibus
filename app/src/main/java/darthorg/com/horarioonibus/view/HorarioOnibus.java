package darthorg.com.horarioonibus.view;


import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

import darthorg.com.horarioonibus.R;
import darthorg.com.horarioonibus.model.Linha;

public class HorarioOnibus extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {

    List<Linha> linhas = new ArrayList<>();

    Linha linhaAtoa = new Linha( "080","Centro","General Osório");
    Linha linhaAtoa2 = new Linha( "020","Bairro","Lagoa da Cruz");
    Linha linhaAtoa3 = new Linha( "301","Executivo","Onibus executivo");

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_horario_onibus);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        ListView lvPosts = (ListView) findViewById(R.id.lvLinhas);

        final  NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.setDrawerListener(toggle);
        toggle.syncState();

        //Adicionando os Objetos Linha na lista de Linhas

        linhas.add(linhaAtoa);
        linhas.add(linhaAtoa2);
        linhas.add(linhaAtoa3);
        linhas.add(linhaAtoa);
        linhas.add(linhaAtoa2);
        linhas.add(linhaAtoa3);
        linhas.add(linhaAtoa);
        linhas.add(linhaAtoa2);
        linhas.add(linhaAtoa3);
        linhas.add(linhaAtoa);
        linhas.add(linhaAtoa2);
        linhas.add(linhaAtoa3);
        linhas.add(linhaAtoa);
        linhas.add(linhaAtoa2);
        linhas.add(linhaAtoa3);
        linhas.add(linhaAtoa);
        linhas.add(linhaAtoa2);
        linhas.add(linhaAtoa3);
        linhas.add(linhaAtoa);
        linhas.add(linhaAtoa2);
        linhas.add(linhaAtoa3);
        linhas.add(linhaAtoa);
        linhas.add(linhaAtoa2);
        linhas.add(linhaAtoa3);

        // Configurando a lista de Linhas no Adapter de Linhas
        AdapterLinhas adapterLinhas = new AdapterLinhas(linhas,this);
        lvPosts.setAdapter(adapterLinhas);


    }


    @Override
    public void onBackPressed() {
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }

    }




    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.horario_onibus, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_configuracoes) {

        }else if (id == R.id.action_pesquisar) {
            return true;
        }else if (id == R.id.action_favoritos) {

            Intent intent = new Intent(this,Favoritos.class);
            startActivity(intent);

        }

        return super.onOptionsItemSelected(item);
    }

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();

        if (id == R.id.nav_horarios) {
            // Handle the camera action
        } else if (id == R.id.nav_favoritos) {


            Intent intent = new Intent(this,Favoritos.class);
            startActivity(intent);

        } else if (id == R.id.nav_temas) {

        } else if (id == R.id.nav_configuracoes) {

        } else if (id == R.id.nav_compartilhar_app) {

        } else if (id == R.id.nav_sobre) {

        }else if (id == R.id.nav_feedback) {

        }

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }

}
