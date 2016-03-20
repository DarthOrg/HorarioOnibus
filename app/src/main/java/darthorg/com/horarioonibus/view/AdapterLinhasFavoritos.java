package darthorg.com.horarioonibus.view;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

import darthorg.com.horarioonibus.R;
import darthorg.com.horarioonibus.model.Linha;

/**
 * Created by Gustavo on 08/03/2016.
 */
public class AdapterLinhasFavoritos extends BaseAdapter {

    List<Linha> linhas;

    private Context context;
    private LayoutInflater inflater;

    public AdapterLinhasFavoritos(List<Linha> linhas, Context context) {
        this.linhas = linhas;
        this.context = context;

        this.inflater = (LayoutInflater) context.getSystemService(context.LAYOUT_INFLATER_SERVICE);
    }

    @Override
    public int getCount() {
        return linhas.size();
    }

    @Override
    public Object getItem(int position) {
        return linhas.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        View v = inflater.inflate(R.layout.adapter_linhas_favoritos, null);

        // TODO: Dar um jeito de trazer as imagens  08/03/2016

        TextView txtNomeLinha = (TextView) v.findViewById(R.id.txtNomeLinha);
        txtNomeLinha.setText(linhas.get(position).getNomeLinha());

        TextView txtTipoLinha = (TextView) v.findViewById(R.id.txtTipoLinha);
        txtTipoLinha.setText(linhas.get(position).getTipoLinha());

        // TODO: Dar um jeito de trazer as imagens  08/03/2016
        FrameLayout imgLinha = (FrameLayout) v.findViewById(R.id.imgLinha);

        TextView txtNumeroLinha = (TextView) v.findViewById(R.id.txtNumeroLinha);
        txtNumeroLinha.setText(linhas.get(position).getNumeroLinha());

        // TODO: Dar um jeito de trazer as imagens  08/03/2016
        ImageView btnFavoritos = (ImageView) v.findViewById(R.id.btnDeleteFavoritos);

        if (linhas.get(position).getTipoLinha() == "Centro") {
            txtTipoLinha.setTextColor(v.getResources().getColor(R.color.colorLinhaVermelha));
            imgLinha.setBackgroundColor(v.getResources().getColor(R.color.colorLinhaVermelha));
        } else if (linhas.get(position).getTipoLinha() == "Bairro") {
            txtTipoLinha.setTextColor(v.getResources().getColor(R.color.colorLinhaAzul));
            imgLinha.setBackgroundColor(v.getResources().getColor(R.color.colorLinhaAzul));
        } else if (linhas.get(position).getTipoLinha() == "Executivo") {
            txtTipoLinha.setTextColor(v.getResources().getColor(R.color.colorLinhaExecutiva));
            imgLinha.setBackgroundColor(v.getResources().getColor(R.color.colorLinhaExecutiva));
        }


        return v;
    }
}
