package darthorg.com.horarioonibus.view;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

/**
 * Adapter para a tela de Sobre e Posts
 * Created by Gustavo on 03/03/2016.
 */
public class TabLayoutLinhasHorarios extends FragmentPagerAdapter {
    private Context context;

    public TabLayoutLinhasHorarios(Context context, FragmentManager fm) {
        super(fm);
        this.context = context;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        if (position == 0) {
            return "Segunda à Sexta";
        }else if (position == 1){
            return "Sábado";
        }
        return "Domingo e Feriados";
    }

    @Override
    public Fragment getItem(int position) {
        Fragment f = null;
        if (position == 0) {
            f = new FragmentSegundaSexta();
        } else if (position == 1) {
            f = new FragmentSabado();
        }else if (position == 2) {
            f = new FragmentDomingoFeriados();
        }
        return f;
    }

    @Override
    public int getCount() {
        return 3;
    }
}
