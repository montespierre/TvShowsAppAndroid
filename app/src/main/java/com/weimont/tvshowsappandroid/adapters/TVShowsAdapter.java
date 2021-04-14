package com.weimont.tvshowsappandroid.adapters;

import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.databinding.DataBindingUtil;
import androidx.recyclerview.widget.RecyclerView;

import com.weimont.tvshowsappandroid.R;
import com.weimont.tvshowsappandroid.databinding.ItemContainerTvShowBinding;
import com.weimont.tvshowsappandroid.models.TVShow;

import java.util.List;

public class TVShowsAdapter extends RecyclerView.Adapter<TVShowsAdapter.TVShowsViewHolder>{

    private List<TVShow> tvShows;
    private LayoutInflater layoutInflater;

    public TVShowsAdapter(List<TVShow> tvShows) {
        this.tvShows = tvShows;
    }

    @NonNull
    @Override
    public TVShowsViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        if(layoutInflater == null){
            layoutInflater = LayoutInflater.from(parent.getContext());
        }
        ItemContainerTvShowBinding tvShowBinding = DataBindingUtil.inflate(
                layoutInflater, R.layout.item_container_tv_show, parent, false
        );
        return new TVShowsViewHolder(tvShowBinding);
    }

    @Override
    public void onBindViewHolder(@NonNull TVShowsViewHolder holder, int position) {
        holder.bindTVShow(tvShows.get(position));

    }


    @Override
    public int getItemCount() {
        return tvShows.size();
    }


    static class TVShowsViewHolder extends RecyclerView.ViewHolder{

        private ItemContainerTvShowBinding itemContainerTvShowBinding;

        public TVShowsViewHolder(ItemContainerTvShowBinding itemContainerTvShowBinding){
            super(itemContainerTvShowBinding.getRoot());
            this.itemContainerTvShowBinding = itemContainerTvShowBinding;
        }

        public void bindTVShow(TVShow tvShow){
            itemContainerTvShowBinding.setTvShow(tvShow);
            itemContainerTvShowBinding.executePendingBindings();
        }
    }
}
