package com.example.temadam;

import android.media.Image;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class Adapter extends BaseAdapter {

    private List<Tweets> listaTweeturi = new ArrayList<>();

    public Adapter(List<Tweets> lista) {
        this.listaTweeturi = lista;
    }

    @Override
    public int getCount() {
        return listaTweeturi.size();
    }

    @Override
    public Tweets getItem(int i) {
        return listaTweeturi.get(i);
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int pos, View view, ViewGroup viewGroup) {
        LayoutInflater inflater = LayoutInflater.from(viewGroup.getContext());
        View view1 = inflater.inflate(R.layout.item_menu, viewGroup, false);
        ImageView iPhoto = view1.findViewById(R.id.imageView3);
        TextView tvNume = view1.findViewById(R.id.tvnume);
        TextView tvUser = view1.findViewById(R.id.tvuser);
        TextView tvMail = view1.findViewById(R.id.tvmail);
        TextView tvText = view1.findViewById(R.id.tvText);

        Tweets temp = listaTweeturi.get(pos);
        iPhoto.setImageResource(temp.getImage());
        tvNume.setText(temp.getNume());
        tvUser.setText(temp.getUser());
        tvMail.setText(temp.getMail());
        tvText.setText(temp.getText());
        return view1;
    }

    public void updateLista(List<Tweets> listaupd){
        this.listaTweeturi.clear();
        this.listaTweeturi.addAll(listaupd);

        notifyDataSetChanged();
    }
}
