package com.example.belaihou.projet1;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

import com.example.belaihou.projet1.R;

public class NameViewHolder extends RecyclerView.ViewHolder {
    private TextView txtView;
    public NameViewHolder(@NonNull View itemView){
        super(itemView);
        txtView = itemView.findViewById(R.id.textView);
    }
    public void setContent(String name){
        txtView.setText(name);

    }
}
