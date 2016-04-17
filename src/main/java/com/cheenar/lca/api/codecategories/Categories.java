package com.cheenar.lca.api.codecategories;

import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Created by cheen on 4/17/2016.
 */

public class Categories
{

    private int count;
    private String next;
    private String previous;
    @SerializedName("results")
    private List<Category> categories;

    public int getCount() {
        return count;
    }

    public String getNext() {
        return next;
    }

    public String getPrevious() {
        return previous;
    }

    public List<Category> getCategories() {
        return categories;
    }
}
