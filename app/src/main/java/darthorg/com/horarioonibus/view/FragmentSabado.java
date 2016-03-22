package darthorg.com.horarioonibus.view;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import darthorg.com.horarioonibus.R;


public class FragmentSabado extends Fragment {


    public FragmentSabado() {    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_sabado, container, false);
    }


}
