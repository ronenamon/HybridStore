package com.demo.hybridstore.com.hybridstore.adapters;

import android.graphics.Color;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.demo.hybridstore.com.hybridstore.model.Item;
import com.hybridstore.app.R;
import com.squareup.picasso.Picasso;

import java.util.ArrayList;


public class CardAdapter extends RecyclerView.Adapter<CardAdapter.CardViewHolder> {
    private ArrayList<Item> mCardList;
    private OnItemClickListener mListener;
    private OnItemLongClickListener mListener2;

    public interface OnItemClickListener {
        void onItemClick(int position);
    }
    public interface OnItemLongClickListener {
        boolean onItemLongClick(int position);
    }

    public void setOnItemClickListener(OnItemClickListener listener) {
        mListener = listener;
    }

    public void setOnItemLongClickListener(OnItemLongClickListener listener) {
        mListener2 = listener;
    }
    public static class CardViewHolder extends RecyclerView.ViewHolder {
        public TextView mTitle;
        public ImageView mImageView;
        public TextView mDescription;
        public TextView mPrice;
        public RelativeLayout mSelected;

        public CardViewHolder(View itemView, final OnItemClickListener listener, final OnItemLongClickListener listener2) {
            super(itemView);
            mSelected = itemView.findViewById(R.id.itemSwitcher);
            mTitle = itemView.findViewById(R.id.cardTitle);
            mImageView = itemView.findViewById(R.id.historyImage);
            mDescription = itemView.findViewById(R.id.cardDescription);
            mPrice = itemView.findViewById(R.id.cardTitle2);


            itemView.setOnLongClickListener(new View.OnLongClickListener() {
                @Override
                public boolean onLongClick(View view) {
                    if (listener2 != null) {
                        int position = getAdapterPosition();
                        if (position != RecyclerView.NO_POSITION) {
                            listener2.onItemLongClick(position);
                        }
                    }
                    return true;
                }
            });

            itemView.setOnClickListener(new View.OnClickListener() {

                @Override
                public void onClick(View view) {
                    if (listener != null) {
                        int position = getAdapterPosition();
                        if (position != RecyclerView.NO_POSITION) {
                            listener.onItemClick(position);

                        }
                    }
                }
            });
        }
    }

    public CardAdapter(ArrayList<Item> cardList) {
        mCardList = cardList;
    }

    @Override
    public CardViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.adapter_item, parent, false);
        CardViewHolder cm = new CardViewHolder(v, mListener, mListener2);
        return cm;
    }

    @Override
    public void onBindViewHolder(CardViewHolder holder, int position) {
        Item currentItem = mCardList.get(position);

        int color = Color.parseColor(currentItem.getColor());
        holder.mSelected.setBackgroundColor(color);

        holder.mTitle.setText(currentItem.getTitle());
        Picasso.get().load(currentItem.getImageResource()).into(holder.mImageView);
        holder.mDescription.setText(currentItem.getDescription());
        holder.mPrice.setText(currentItem.getPrice());
    }

    @Override
    public int getItemCount() {
        return mCardList.size();
    }
}
