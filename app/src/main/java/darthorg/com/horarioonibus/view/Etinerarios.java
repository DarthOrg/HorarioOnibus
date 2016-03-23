package darthorg.com.horarioonibus.view;

import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.content.ContextCompat;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;

import darthorg.com.horarioonibus.R;

public class Etinerarios extends AppCompatActivity {
    private ViewPager viewPager;
    private TabLayout tabLayout;
    private Toolbar toolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_etinerarios);
        toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        viewPager = (ViewPager) findViewById(R.id.viewPagerEtinerarios);
        tabLayout = (TabLayout) findViewById(R.id.tabLayoutEtinerarios);

        viewPager.setAdapter(new TabLayoutEtinerarios(this, getSupportFragmentManager()));

        tabLayout.setupWithViewPager(viewPager);
        int corOn = ContextCompat.getColor(this, R.color.colorBarraTab);
        int corOff = ContextCompat.getColor(this, R.color.colorTabOff);
        int corBarra = ContextCompat.getColor(this, R.color.colorBarraTab);
        tabLayout.setTabTextColors(corOff, corOn);
        tabLayout.setSelectedTabIndicatorColor(corBarra);
        tabLayout.setSelectedTabIndicatorHeight(7);


        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

    }


    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == android.R.id.home) {
            finish();
        }
        return true;
    }


}
