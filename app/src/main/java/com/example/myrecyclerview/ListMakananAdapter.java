package com.example.myrecyclerview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;

import java.util.ArrayList;

public class ListMakananAdapter extends RecyclerView.Adapter<ListMakananAdapter.CategoryViewHolder> {
    private Context context;
    private ArrayList<Makanan> listMakanan;
    private ArrayList<Makanan> getListPresident() {
        return listMakanan;
    }

    void setListMakanan(ArrayList<Makanan> listMakanan) {
        this.listMakanan = listMakanan;
    }
    ListMakananAdapter(Context context) {
        this.context = context;
    }

     @NonNull
     @Override
     public CategoryViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View itemRow = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_row_makanan, viewGroup, false);
        return new CategoryViewHolder(itemRow);
    }
    @Override
    public void onBindViewHolder(@NonNull CategoryViewHolder categoryViewHolder, int position) {
         categoryViewHolder.tvName.setText(getListPresident().get(position).getName());
         categoryViewHolder.tvRemarks.setText(getListPresident().get(position).getRemarks());

         Glide.with(context).load(getListPresident().get(position).getPhoto()).apply(new RequestOptions().override(55, 55)).into(categoryViewHolder.imgPhoto);
    }

            @Override
    public int getItemCount() {
          return getListPresident().size();
    }

    class CategoryViewHolder extends RecyclerView.ViewHolder {
        TextView tvName;
        TextView tvRemarks;
        ImageView imgPhoto;

        CategoryViewHolder(@NonNull View itemView) {
            super(itemView);
            tvName = itemView.findViewById(R.id.tv_item_name);
            tvRemarks = itemView.findViewById(R.id.tv_item_remarks);
            imgPhoto = itemView.findViewById(R.id.img_item_photo);
        }
    }
 }