package com.muhamadarief.tongsik.Adapter;

import android.content.Context;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.muhamadarief.tongsik.R;
import com.muhamadarief.tongsik.Model.Tongkrongan;

import org.w3c.dom.Text;

import java.util.ArrayList;

/**
 * Created by Muhamad Arief on 30/08/2016.
 */
public class TongkronganAdapter extends RecyclerView.Adapter<TongkronganAdapter.HolderItem> {

    private Context mContext;
    private ArrayList<Tongkrongan> mTongkrongan;

    public TongkronganAdapter(Context context, ArrayList<Tongkrongan> tongkrongan){
        this.mContext = context;
        this.mTongkrongan = tongkrongan;
    }

    @Override
    public HolderItem onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.card_item, parent, false);
        HolderItem holderItem = new HolderItem(v);
        return holderItem;
    }

    @Override
    public void onBindViewHolder(HolderItem holder, int position) {
        Tongkrongan currentTongkrongan = mTongkrongan.get(position);

        holder.mImage.setImageResource(currentTongkrongan.getmImage());
        holder.mNama.setText(currentTongkrongan.getmNama());
        holder.mAlamat.setText(currentTongkrongan.getmAlamat());
        holder.mHarga.setText(currentTongkrongan.getmHarga());

    }

    @Override
    public int getItemCount() {
        return mTongkrongan.size();
    }

    public class HolderItem extends RecyclerView.ViewHolder {
        public CardView cvItem;
        public ImageView mImage;
        public TextView mNama;
        public TextView mAlamat;
        public TextView mHarga;

        public HolderItem(View itemView) {
            super(itemView);
            cvItem = (CardView) itemView.findViewById(R.id.cvItem);
            mImage = (ImageView) itemView.findViewById(R.id.img_icon);
            mNama = (TextView) itemView.findViewById(R.id.tvNama);
            mAlamat = (TextView) itemView.findViewById(R.id.tvAlamat);
            mHarga = (TextView) itemView.findViewById(R.id.tvHarga);
        }
    }
}
