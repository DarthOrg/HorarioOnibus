package darthorg.com.horarioonibus.view;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

/**
 * Adapter para a tela de Sobre e Posts
 * Created by Gustavo on 03/03/2016.
 */
public class TabLayoutEtinerarios extends FragmentPagerAdapter {
    private Context context;

    public TabLayoutEtinerarios(Context context, FragmentManager fm) {
        super(fm);
        this.context = context;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        if (position == 0) {
            return "A";
        }
        return "B";
    }

    @Override
    public Fragment getItem(int position) {
        Fragment f = null;
        if (position == 0) {
            f = new FragmentA();
        } else if (position == 1) {
            f = new FragmentB();
        }
        return f;
    }

    @Override
    public int getCount() {
        return 2;
    }
}
