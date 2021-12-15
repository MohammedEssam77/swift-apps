package com.example.swiftappstask.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.swiftappstask.R;
import com.example.swiftappstask.pojo.Model;

import java.util.ArrayList;
import java.util.List;

public class MullakAdapter extends RecyclerView.Adapter {
    private List<Model> mList;
    private Context mContext;
    private RecyclerClickListener recyclerClickListener;

    public MullakAdapter(Context mContext, RecyclerClickListener recyclerClickListener) {
        this.mContext = mContext;
        this.recyclerClickListener = recyclerClickListener;
        mList = new ArrayList<>();
    }

    public void setList(List<Model> mList) {
        this.mList = mList;
        notifyDataSetChanged();
    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.row_main, parent, false);
        return new MullakViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {
        Model model = mList.get(position);
        MullakViewHolder mullakViewHolder = (MullakViewHolder) holder;
        mullakViewHolder.name.setText(model.getName());
        mullakViewHolder.createdAt.setText(model.getCreatedAt());
        mullakViewHolder.RadioButton.setText(model.getNameAr());

    }

    @Override
    public int getItemCount() {
        return mList.size();
    }

    public class MullakViewHolder extends RecyclerView.ViewHolder {
        TextView name;
        Button createdAt;
        RadioButton RadioButton;
        EditText descriptionAr;

        public MullakViewHolder(@NonNull View itemView) {
            super(itemView);
            name = itemView.findViewById(R.id.name);
            descriptionAr = itemView.findViewById(R.id.descriptionAr);
            RadioButton = itemView.findViewById(R.id.radioButton2);
            createdAt = itemView.findViewById(R.id.button);
            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    if (getAdapterPosition() != -1)
                        recyclerClickListener.recyclerViewListClicked(getAdapterPosition());

                }
            });
        }
    }
}