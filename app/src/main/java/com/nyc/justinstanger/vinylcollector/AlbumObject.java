package com.nyc.justinstanger.vinylcollector;

/**
 * Created by justinstanger on 8/9/17.
 */

public class AlbumObject {
    String albumName;
    String albumYear;
    String albumArtist;

    public AlbumObject(String name, String year, String artist){
        albumName = name;
        albumYear = year;
        albumArtist = artist;
    }

    public String getAlbumName() {
        return albumName;
    }

    public void setAlbumName(String albumName) {
        this.albumName = albumName;
    }

    public String getAlbumYear() {
        return albumYear;
    }

    public void setAlbumYear(String albumYear) {
        this.albumYear = albumYear;
    }

    public String getAlbumArtist() {
        return albumArtist;
    }

    public void setAlbumArtist(String albumArtist) {
        this.albumArtist = albumArtist;
    }
}
