package com.nyc.justinstanger.vinylcollector;

import java.util.List;

public class DiscogsAPI {

    private Pagination pagination;
    private List<Release> releases = null;

    public Pagination getPagination() {
        return pagination;
    }

    public void setPagination(Pagination pagination) {
        this.pagination = pagination;
    }

    public List<Release> getReleases() {
        return releases;
    }

    public void setReleases(List<Release> releases) {
        this.releases = releases;
    }

}