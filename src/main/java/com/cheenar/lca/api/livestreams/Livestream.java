package com.cheenar.lca.api.livestreams;

import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Created by cheen on 4/17/2016.
 */
public class Livestream
{

    private String url;
    private String user;
    @SerializedName("user__slug")
    private String slug;
    private String title;
    private String description;
    @SerializedName("coding_category")
    private String codingCategory;
    private String difficulty;
    private String language;
    private String tags;
    @SerializedName("is_live")
    private boolean isLive;
    @SerializedName("viewers_live")
    private int liveViewerCount;
    @SerializedName("viewing_urls")
    private List<String> viewingURLs;

    public String getUrl() {
        return url;
    }

    public String getUser() {
        return user;
    }

    public String getSlug() {
        return slug;
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

    public String getCodingCategory() {
        return codingCategory;
    }

    public String getDifficulty() {
        return difficulty;
    }

    public String getLanguage() {
        return language;
    }

    public String getTags() {
        return tags;
    }

    public boolean isLive() {
        return isLive;
    }

    public int getLiveViewerCount() {
        return liveViewerCount;
    }

    public List<String> getViewingURLs() {
        return viewingURLs;
    }
}
