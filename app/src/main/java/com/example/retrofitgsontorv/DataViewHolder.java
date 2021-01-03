package com.example.retrofitgsontorv;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class DataViewHolder extends RecyclerView.ViewHolder
{
    TextView name,capital,currency;
    public DataViewHolder(@NonNull View itemView)
    {
        super(itemView);

        name=itemView.findViewById(R.id.country);
        capital=itemView.findViewById(R.id.capital);
        currency=itemView.findViewById(R.id.currency);
    }
}
