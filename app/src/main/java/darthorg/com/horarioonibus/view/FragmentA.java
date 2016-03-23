package darthorg.com.horarioonibus.view;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import darthorg.com.horarioonibus.R;


/**
 * A simple {@link Fragment} subclass.
 */
public class FragmentA extends Fragment {


    public FragmentA() {    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_a_etinerarios, container, false);
    }

}
