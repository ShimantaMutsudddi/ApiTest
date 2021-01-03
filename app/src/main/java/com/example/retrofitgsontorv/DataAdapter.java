package com.example.retrofitgsontorv;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class DataAdapter extends RecyclerView.Adapter<DataViewHolder>
{
    public DataAdapter(List<DataSet> list, Context context)
    {
        this.list = list;
        this.context = context;
    }

    private List<DataSet> list;
    private Context context;
    @NonNull
    @Override
    public DataViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType)
    {
        View view = LayoutInflater.from(context).inflate(R.layout.row,parent,false);
        return new DataViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull DataViewHolder holder, int position)
    {
        DataSet currentdata= list.get(position);

        holder.name.setText(currentdata.getName());
        holder.capital.setText(currentdata.getCapital());
        holder.currency.setText(currentdata.getCurrency());

    }

    @Override
    public int getItemCount()
    {
        return list.size();
    }
}
