package com.juliao.adryel.conhecaeaj;


import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.ViewGroup;

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

    }

    @Override
    public int getItemCount() {
        return 0;
    }
}
