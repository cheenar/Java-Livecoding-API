package com.cheenar.lca.api.livestreams;

import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Created by cheen on 4/17/2016.
 */
public class Livestreams
{

    private int count;
    private String next;
    private String previous;
    @SerializedName("results")
    private List<Livestream> livestreams;

    public int getCount() {
        return count;
    }

    public String getNext() {
        return next;
    }

    public String getPrevious() {
        return previous;
    }

    public List<Livestream> getLivestreams() {
        return livestreams;
    }
}
