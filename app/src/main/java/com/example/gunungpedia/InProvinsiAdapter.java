package com.example.gunungpedia;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;
import java.util.Map;

public class InProvinsiAdapter extends RecyclerView.Adapter<InProvinsiAdapter.ViewHolder> {

    private final List<Map<String, String>> data;
    private OnItemClickListener onItemCLickListener;
    public InProvinsiAdapter(List<Map<String, String>> data, OnItemClickListener onItemCLickListener) {
        this.data = data;
        this.onItemCLickListener = onItemCLickListener;

    }
    public interface OnItemClickListener {
        void onItemClick(Map<String, String> d);
    }

    @NonNull
    @Override
    public InProvinsiAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_gunung, parent, false);
        return new InProvinsiAdapter.ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull InProvinsiAdapter.ViewHolder holder, int position) {
        holder.textView1.setText(data.get(position).get("nama"));
        holder.textView2.setText(data.get(position).get("tinggi"));
        holder.itemView.setOnClickListener(v->{
            if (onItemCLickListener != null) {
                onItemCLickListener.onItemClick(data.get(position));
            }
        });
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        TextView textView1, textView2;
        ImageView imageView;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            textView1 = itemView.findViewById(R.id.namagunung);
            textView2 = itemView.findViewById(R.id.tinggi);
            imageView = itemView.findViewById(R.id.imggunung);

        }
    }


    @Override
    public int getItemCount() {
        return data.size();
    }
}
