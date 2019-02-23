package com.example.tugasreclerview4grid.Fragment;

import android.content.Context;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v4.app.FragmentActivity;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.tugasreclerview4grid.DetailActivity;
import com.example.tugasreclerview4grid.R;

class HomeAdapeter extends RecyclerView.Adapter<OutViewHolder> {
    Context context1;
    String[] namahome;
    String[] harganya;
    int[] gambarhome;
    public HomeAdapeter(Context context, String[] namahome, int[] gambarhome, String[] harganya) {
        this.context1 = context;
        this.namahome = namahome;
        this.harganya = harganya;
        this.gambarhome = gambarhome;

    }

    @NonNull
    @Override
    public OutViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {

        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.home_home,viewGroup,false);
        return new OutViewHolder(view);

    }

    @Override
    public void onBindViewHolder(@NonNull OutViewHolder outViewHolder, final int i) {
        outViewHolder.imghome.setImageResource(gambarhome[i]);
        outViewHolder.tvhome.setText(namahome[i]);
        outViewHolder.tvharganya.setText(harganya[i]);
        outViewHolder.rll.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent pp = new Intent(context1, DetailActivity.class);
                pp.putExtra("namahome",namahome[i]);
                pp.putExtra("harganya",harganya[i]);
                pp.putExtra("gambarhome",gambarhome[i]);
                context1.startActivity(pp);
            }
        });

    }

    @Override
    public int getItemCount() {
        return namahome.length;
    }
}
