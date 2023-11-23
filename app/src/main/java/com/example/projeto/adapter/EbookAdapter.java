package com.example.projeto.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.projeto.databinding.EbookItemBinding;
import com.example.projeto.model.ebooks;

import java.util.ArrayList;

public class EbookAdapter extends RecyclerView.Adapter<EbookAdapter.EbookViewHolder>{

    private final ArrayList<ebooks> ebookList;
    private final Context context;

    public EbookAdapter(ArrayList<ebooks> ebookList, Context context) {
        this.ebookList = ebookList;
        this.context = context;
    }

    @NonNull
    @Override
    public EbookViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        EbookItemBinding listItem;
        listItem = EbookItemBinding.inflate(LayoutInflater.from(context),parent,false);
        return new EbookViewHolder(listItem);
    }

    @Override
    public void onBindViewHolder(@NonNull EbookViewHolder holder, int position) {
        holder.binding.imgEbook.setBackgroundResource(ebookList.get(position).getImgEbook());
        holder.binding.txtEbookName.setText(ebookList.get(position).getEbookName());
        holder.binding.txtEbookDescription.setText(ebookList.get(position).getEnbookDescription());
        holder.binding.txtPrice.setText(ebookList.get(position).getPrice());
    }

    @Override
    public int getItemCount() {
        return ebookList.size();
    }

    public static class EbookViewHolder extends RecyclerView.ViewHolder{

        EbookItemBinding binding;

        public EbookViewHolder(EbookItemBinding binding) {
            super(binding.getRoot());
            this.binding = binding;
        }
    }
}