package com.nyc.justinstanger.vinylcollector;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.List;

/**
 * Created by justinstanger on 8/9/17.
 */

public class RecyclerViewAdapter extends RecyclerView.Adapter<AlbumViewHolder>{

    private List<AlbumObject> mAlbumList;
    public RecyclerViewAdapter(final List<AlbumObject> albumList){mAlbumList = albumList;}


    @Override
    public AlbumViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View parentView = LayoutInflater.from(parent.getContext()).inflate(R.layout.album_object_view, parent, false);
        AlbumViewHolder viewHolder = new AlbumViewHolder(parentView);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(AlbumViewHolder holder, int position) {
        final AlbumObject current = mAlbumList.get(position);

        holder.mAlbumName.setText(current.getAlbumName());
        holder.mAlbumArtist.setText(current.getAlbumArtist());
        holder.mAlbumYear.setText(current.getAlbumYear());


    }

    @Override
    public int getItemCount() {
        return 0;
    }
}
