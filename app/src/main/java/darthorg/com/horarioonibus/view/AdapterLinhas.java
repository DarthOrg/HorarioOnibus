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
import darthorg.com.horarioonibus.model.Linha;

/**
 * Created by Gustavo on 08/03/2016.
 */
public class AdapterLinhas extends BaseAdapter {

    List<Linha> linha;

//    List<String> listNomeLinha;
//    List<String> listTipoLinha;
//    List<String> listNumeroLinha;

    private LayoutInflater inflater;
    private Context context;

    public AdapterLinhas(List<Linha> linha, Context context) {
        this.linha = linha;
        this.context = context;
        this.inflater = (LayoutInflater) context.getSystemService(context.LAYOUT_INFLATER_SERVICE);

    }

    //    public AdapterLinhas(List<String> listNomeLinha, List<String> listTipoLinha, List<String> listNumeroLinha, Context context) {
//
//        this.listNomeLinha = listNomeLinha;
//        this.listTipoLinha = listTipoLinha;
//        this.listNumeroLinha = listNumeroLinha;
//
//        this.inflater = (LayoutInflater) context.getSystemService(context.LAYOUT_INFLATER_SERVICE);
//    }

    @Override
    public int getCount() {
        return linha.size();
    }

    @Override
    public Object getItem(int position) {
        return linha.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        View v = inflater.inflate(R.layout.adapter_linhas, null);


        TextView txtNomeLinha = (TextView) v.findViewById(R.id.txtNomeLinha);
        txtNomeLinha.setText(linha.get(position).getNomeLinha());

        TextView txtTipoLinha = (TextView) v.findViewById(R.id.txtTipoLinha);
        txtTipoLinha.setText(linha.get(position).getTipoLinha());

        // TODO: Dar um jeito de trazer as imagens  08/03/2016
        ImageView imgLinha = (ImageView) v.findViewById(R.id.imgLinha);

        TextView txtNumeroLinha = (TextView) v.findViewById(R.id.txtNumeroLinha);
        txtNumeroLinha.setText(linha.get(position).getNumeroLinha());

        // TODO: Dar um jeito de trazer as imagens  08/03/2016
        ImageView btnFavoritos = (ImageView) v.findViewById(R.id.btnFavoritos);


        return v;
    }
}
