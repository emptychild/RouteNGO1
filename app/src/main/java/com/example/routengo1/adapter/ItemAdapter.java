package com.example.routengo1.adapter;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.routengo1.R;
import com.example.routengo1.model.Unit;

import java.util.List;


/**
 * Created by megaman on 14.01.2017.
 */

public class ItemAdapter extends RecyclerView.Adapter<ItemAdapter.MyViewHolder> {
    private List<Unit> itemList;

    public ItemAdapter(List<Unit> itemList) {
        this.itemList = itemList;
    }

    public List<Unit> getItemList() {
        return itemList;
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        return new MyViewHolder(LayoutInflater.from(parent.getContext())
                .inflate(R.layout.card_item, parent));
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {
        Unit item = itemList.get(position);
        holder.title.setText(item.getTitle());
        holder.description.setText(item.getDescription());
    }

    @Override
    public int getItemCount() {
        return 0;
    }

    public static class MyViewHolder extends RecyclerView.ViewHolder {
        TextView title;
        TextView description;

        public MyViewHolder(View itemView) {
            super(itemView);
            title = (TextView) itemView.findViewById(R.id.title_txt);
            description = (TextView) itemView.findViewById(R.id.description);
        }
    }
}
