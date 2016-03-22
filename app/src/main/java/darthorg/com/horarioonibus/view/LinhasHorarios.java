package darthorg.com.horarioonibus.view;

import android.content.Context;
import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.content.ContextCompat;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.webkit.WebSettings;

import darthorg.com.horarioonibus.R;

public class LinhasHorarios extends AppCompatActivity {
    private ViewPager viewPager;
    private TabLayout tabLayout;
    private Toolbar toolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_linhas_horarios);
        toolbar = (android.support.v7.widget.Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        viewPager = (ViewPager) findViewById(R.id.viewPagerLinhaHorarios);
        tabLayout = (TabLayout) findViewById(R.id.tabLayoutLinhasHorarios);

        viewPager.setAdapter(new TabLayoutLinhasHorarios(this, getSupportFragmentManager()));

        tabLayout.setupWithViewPager(viewPager);
        int corOn = ContextCompat.getColor(this, R.color.colorBarraTab);
        int corOff = ContextCompat.getColor(this, R.color.colorTabOff);
        int corBarra = ContextCompat.getColor(this, R.color.colorBarraTab);
        tabLayout.setTabTextColors(corOff, corOn);
        tabLayout.setSelectedTabIndicatorColor(corBarra);
        tabLayout.setSelectedTabIndicatorHeight(10);


        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.linhas_horarios, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_add_favoritos) {
            return true;
        }else if (id == R.id.action_edtinerario) {
            return true;
        } else if (id == android.R.id.home) {
            finish();
        }

        return true;
    }


}
