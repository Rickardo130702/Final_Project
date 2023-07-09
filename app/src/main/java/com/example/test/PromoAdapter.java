package com.example.test;



import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;


public class PromoAdapter extends RecyclerView.Adapter<PromoAdapter.PromoViewHolder> {

    private final LayoutInflater mInflater;
    private List<PromoModel> PromoModelList;
    private LayoutInflater layoutInflater;
    private Context context;
    private PromoAdapter.OnItemClickListener listener;

    public PromoAdapter(List<PromoModel> univModelList, Context context, OnItemClickListener onItemClickListener) {
        this.mInflater = layoutInflater.from(context);
        this.PromoModelList = PromoModelList;
        this.context = context;
        this.listener = onItemClickListener;
    }

    @NonNull
    @Override
    public PromoAdapter.PromoViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = mInflater.inflate(R.layout.item_promo, null);
        return new PromoAdapter.PromoViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull PromoAdapter.PromoViewHolder holder, int position) {
        holder.bindData(PromoModelList.get(position));
    }

    @Override
    public int getItemCount() {
        return PromoModelList.size();
    }

    public void setItem(List<PromoModel> Item) {PromoModelList = Item;}

    public interface OnItemClickListener {
        void onItemClick(PromoModel item);
    }


    public class PromoViewHolder extends RecyclerView.ViewHolder{


        TextView textPromo;
        ImageView ivpromoBurgerKing;


        public PromoViewHolder(@NonNull View itemView) {
            super(itemView);
            textPromo = itemView.findViewById(R.id.textPromo);
            ivpromoBurgerKing = itemView.findViewById(R.id.ivpromoBurgerKing);



        }


        public void bindData(final PromoModel item) {
            textPromo.setText(item.getTeks());
            ivpromoBurgerKing.setImageDrawable(item.getIvpromoBurgerKing());

            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    listener.onItemClick(item);
                }
            });
        }

    }

}





