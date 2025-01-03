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
    private OnItemClickListener onItemClickListener;

    public InProvinsiAdapter(List<Map<String, String>> data, OnItemClickListener onItemClickListener) {
        this.data = data;
        this.onItemClickListener = onItemClickListener;
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
        Map<String, String> gunung = data.get(position);

        // Retrieve map data with null checks and provide default values if necessary
        String namaGunung = gunung.get("nama") != null ? gunung.get("nama") : "Nama tidak tersedia";
        String tinggiGunung = gunung.get("tinggi") != null ? gunung.get("tinggi") : "Tinggi tidak tersedia";
        holder.textView1.setText(namaGunung);
        holder.textView2.setText(tinggiGunung);

        // Safely handle the image name and provide fallback if null
        String imageName = gunung.get("img");
        if (imageName != null && !imageName.isEmpty()) {
            int imageResId = holder.itemView.getContext().getResources().getIdentifier(imageName, "drawable", holder.itemView.getContext().getPackageName());
            if (imageResId != 0) {
                holder.imageView.setImageResource(imageResId);
            } else {
                // Set a default image if the resource is not found
                holder.imageView.setImageResource(R.drawable.bromo);  // Replace with your default image resource
            }
        } else {
            // Set a default image if imageName is null or empty
            holder.imageView.setImageResource(R.drawable.bromo);  // Replace with your default image resource
        }

        // Set item click listener
        holder.itemView.setOnClickListener(v -> {
            if (onItemClickListener != null) {
                onItemClickListener.onItemClick(data.get(position));
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
