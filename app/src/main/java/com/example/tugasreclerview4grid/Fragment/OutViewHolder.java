package com.example.tugasreclerview4grid.Fragment;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.example.tugasreclerview4grid.R;

class OutViewHolder extends RecyclerView.ViewHolder {
    ImageView imghome;
    TextView tvhome;
    TextView tvharganya;
    RelativeLayout rll;
    public OutViewHolder(@NonNull View itemView) {
        super(itemView);
        imghome = itemView.findViewById(R.id.img_home);
        tvhome = itemView.findViewById(R.id.tv_home);
        tvharganya = itemView.findViewById(R.id.tv_homee);
        rll = itemView.findViewById(R.id.rl);
    }
}
