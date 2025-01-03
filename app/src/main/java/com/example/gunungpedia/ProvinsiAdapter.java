package com.example.gunungpedia;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class ProvinsiAdapter extends RecyclerView.Adapter<ProvinsiAdapter.ViewHolder> {

    private final List<String> data;
    private ProvinsiAdapter.OnItemClickListener onItemCLickListener;
    public ProvinsiAdapter (List<String> data, ProvinsiAdapter.OnItemClickListener onItemCLickListener) {
        this.data = data;
        this.onItemCLickListener = onItemCLickListener;

    }
    public interface OnItemClickListener {
        void onItemClick(String d);
    }

    @NonNull
    @Override
    public ProvinsiAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_provinsi, parent, false);
        return new ProvinsiAdapter.ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ProvinsiAdapter.ViewHolder holder, int position) {
        holder.textView.setText(data.get(position));
        holder.itemView.setOnClickListener(v->{
            if (onItemCLickListener != null) {
                onItemCLickListener.onItemClick(data.get(position));
            }
        });
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        TextView textView;
        ImageView imageView;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            textView = itemView.findViewById(R.id.namaprov);
            imageView = itemView.findViewById(R.id.imgprov);

        }
    }


    @Override
    public int getItemCount() {
        return data.size();
    }
}
