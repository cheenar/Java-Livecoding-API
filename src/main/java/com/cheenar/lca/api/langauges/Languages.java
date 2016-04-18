package com.cheenar.lca.api.langauges;

import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Created by cheen on 4/17/2016.
 */
public class Languages
{

    private int count;
    private String next;
    private String previous;
    @SerializedName("results")
    private List<Language> languages;

    public int getCount() {
        return count;
    }

    public String getNext() {
        return next;
    }

    public String getPrevious() {
        return previous;
    }

    public List<Language> getLanguages() {
        return languages;
    }
}
