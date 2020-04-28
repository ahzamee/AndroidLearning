package com.ewu.androidpractice.adapter;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import com.ewu.androidpractice.model.Datamodel;
import com.ewu.androidpractice.R;

import java.util.List;

public class DataAdapter extends RecyclerView.Adapter<DataAdapter.ViewHolder> {

    private List<Datamodel> datamodels;

    public DataAdapter(List<Datamodel> datamodels) {
        this.datamodels = datamodels;
    }

    public DataAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType){
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.user_info,parent,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(DataAdapter.ViewHolder holder, int position) {
        final Datamodel datamodel = datamodels.get(position);
        Log.d("data",datamodel.getEmail());
        holder.name.setText(datamodel.getName());
        holder.email.setText(datamodel.getEmail());
        holder.phone_number.setText(datamodel.getPhoneNumber());
    }

    @Override
    public int getItemCount() {
        return datamodels.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{

        private TextView name;
        private TextView email;
        private TextView phone_number;

        public ViewHolder(View itemView) {
            super(itemView);
            name = (TextView)itemView.findViewById(R.id.name);
            email = (TextView)itemView.findViewById(R.id.email);
            phone_number = (TextView)itemView.findViewById(R.id.phone);
        }
    }
}
