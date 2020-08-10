package com.abc.retrofit;

import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.jakewharton.picasso.OkHttp3Downloader;
import com.squareup.picasso.Picasso;

import java.util.List;

public class CustomAdapter extends RecyclerView.Adapter<CustomAdapter.CustomViewHolder> {
    private Pokemon pokemonList;
    private Context context;
public static final String TAG= "Custom Adapter";
    public CustomAdapter(Pokemon pokemonList, Context context) {
        this.pokemonList = pokemonList;
        this.context = context;
    }
    class  CustomViewHolder extends  RecyclerView.ViewHolder{
        public View mView;
        TextView txtTitle;
        private ImageView pokemon;

        public CustomViewHolder(@NonNull View itemView) {
            super(itemView);
            this.mView = itemView;

            txtTitle=mView.findViewById(R.id.title);
            pokemon=mView.findViewById(R.id.image_view);

        }

    }

    @NonNull
    @Override
    public CustomViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater =LayoutInflater.from((parent.getContext()));
        View view = layoutInflater.inflate(R.layout.pokelist, parent, false);
        return new CustomViewHolder( view);
    }
    @Override
    public void onBindViewHolder(CustomViewHolder holder, int position) {
        String name=pokemonList.getResults().get(position).getName();
        Log.d(TAG,"title="+name);
        holder.txtTitle.setText(name);

        Picasso.Builder builder = new Picasso.Builder(context);
        builder.downloader(new OkHttp3Downloader(context));
        builder.build().load(pokemonList.getResults().get(position).getUrl())
                .placeholder((R.drawable.ic_launcher_background))
                .error(R.drawable.ic_launcher_background)
                .into(holder.pokemon);

    }
    @Override
    public int getItemCount() {
        return pokemonList.getResults().size();
    }
}
