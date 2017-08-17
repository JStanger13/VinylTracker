package com.nyc.justinstanger.vinylcollector;

/**
 * Created by justinstanger on 8/9/17.
 */
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.PUT;
import retrofit2.http.Path;
import retrofit2.http.Query;

public interface OpenAlbumService {
    @GET("?format=12\"")
    Call<DiscogsAPI> getAlbums();
    //need to make search queries
}
