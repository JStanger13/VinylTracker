package com.nyc.justinstanger.vinylcollector;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by justinstanger on 8/9/17.
 */

public class AlbumViewHolder extends RecyclerView.ViewHolder {
    public TextView mAlbumName;
    public TextView mAlbumArtist;
    public TextView mAlbumYear;
    public ImageView mAlbumArt;

    public AlbumViewHolder(View itemView) {
        super(itemView);

        mAlbumName = (TextView) itemView.findViewById(R.id.album_title);
        mAlbumYear = (TextView) itemView.findViewById(R.id.album_year);
        mAlbumArtist = (TextView) itemView.findViewById(R.id.album_artist);
        mAlbumArt = (ImageView) itemView.findViewById(R.id.album_art);


    }
}
