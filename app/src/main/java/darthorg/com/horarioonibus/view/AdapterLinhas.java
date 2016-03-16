package darthorg.com.horarioonibus.view;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

import darthorg.com.horarioonibus.R;

/**
 * Created by Gustavo on 08/03/2016.
 */
public class AdapterLinhas extends BaseAdapter {

    List<String> listNomeLinha;
    List<String> listTipoLinha;
    List<String> listNumeroLinha;

    private LayoutInflater inflater;

    public AdapterLinhas(List<String> listNomeLinha, List<String> listTipoLinha, List<String> listNumeroLinha, Context context) {

        this.listNomeLinha = listNomeLinha;
        this.listTipoLinha = listTipoLinha;
        this.listNumeroLinha = listNumeroLinha;

        this.inflater = (LayoutInflater) context.getSystemService(context.LAYOUT_INFLATER_SERVICE);
    }

    @Override
    public int getCount() {
        return listTipoLinha.size();
    }

    @Override
    public Object getItem(int position) {
        return listTipoLinha.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        View v = inflater.inflate(R.layout.adapter_linhas, null);


        TextView txtNomeLinha = (TextView) v.findViewById(R.id.txtNomeLinha);
        txtNomeLinha.setText(listNomeLinha.get(position));

        TextView txtTipoLinha = (TextView) v.findViewById(R.id.txtTipoLinha);
        txtTipoLinha.setText(listTipoLinha.get(position));

        // TODO: Dar um jeito de trazer as imagens  08/03/2016
        ImageView imgLinha = (ImageView) v.findViewById(R.id.imgLinha);

        TextView txtNumeroLinha = (TextView) v.findViewById(R.id.txtNumeroLinha);
        txtNumeroLinha.setText(listNumeroLinha.get(position));

        // TODO: Dar um jeito de trazer as imagens  08/03/2016
        ImageView btnFavoritos = (ImageView) v.findViewById(R.id.btnFavoritos);


        return v;
    }
}
