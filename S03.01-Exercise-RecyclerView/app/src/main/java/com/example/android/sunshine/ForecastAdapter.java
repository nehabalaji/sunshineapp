package com.example.android.sunshine;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import org.w3c.dom.Text;

public class ForecastAdapter extends RecyclerView.Adapter<ForecastAdapter.ForecastAdapterViewHolder>{
    private String[] mweatherData;

    @NonNull
    @Override
    public ForecastAdapterViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new ForecastAdapterViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.forecast_list_item,parent,false));

    }

    @Override
    public void onBindViewHolder(@NonNull ForecastAdapterViewHolder holder, int position) {
        String weatherForDay = mweatherData[position];
        holder.mWeatherTextView.setText(weatherForDay);
    }

    @Override
    public int getItemCount() {
        if(mweatherData==null){
            return 0;
        }
        else{
            return mweatherData.length;
        }
    }

    public void setMweatherData(String[] mweatherData) {
        this.mweatherData = mweatherData;
        notifyDataSetChanged();
    }

    public class ForecastAdapterViewHolder extends RecyclerView.ViewHolder{
        public final TextView mWeatherTextView;
        public ForecastAdapterViewHolder(@NonNull View itemView) {
            super(itemView);
            mWeatherTextView = (TextView) itemView.findViewById(R.id.recyclerview_forecast);


        }



    }

}
