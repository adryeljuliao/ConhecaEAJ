package com.juliao.adryel.conhecaeaj;


import android.content.Context;
import android.preference.PreferenceManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

/**
 * Created by ADRYEL on 14/10/2017.
 */

public class PontoEajAdapter extends RecyclerView.Adapter {

    private Context contexto;
    private List<PontoEaj> listaLocais;

    public PontoEajAdapter(Context contexto, List<PontoEaj> listaLocais) {
        this.contexto = contexto;
        this.listaLocais = listaLocais;
    }

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        return null;
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {
        PontoEajViewHolder pontoEajViewHolder = (PontoEajViewHolder) holder;
        final PontoEaj prontoEaj = listaLocais.get(position);



    }

    @Override
    public int getItemCount() {
        //um if que significa, se a lista não for nula, ele irá retornar o tamanho da lista
        //caso contrario irá retornar a 0
        return listaLocais != null ? listaLocais.size() : 0;
    }


    //Interface com os widgets que irão ser setados no meu layout_inflater_ponts_eaj
    public class PontoEajViewHolder extends RecyclerView.ViewHolder{

        final TextView descricaoLocal;
        final ImageView imageLocal;
        final TextView nomeLocal;
        final TextView horarioFuncionamento;
        final TextView responsavel;

        public PontoEajViewHolder (View view){
            super(view);
            descricaoLocal = (TextView) view.findViewById(R.id.textDescricaoLocalInflar);
            horarioFuncionamento = (TextView) view.findViewById(R.id.textHorarioLocalInflar);
            nomeLocal = (TextView) view.findViewById(R.id.textNomeLocalInflar);
            responsavel = (TextView) view.findViewById(R.id.textResponsavelLocalInflar);
            imageLocal = (ImageView) view.findViewById(R.id.imgLocalInflar);
        }

    }


}
