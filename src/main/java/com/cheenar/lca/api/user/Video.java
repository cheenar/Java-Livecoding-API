package com.cheenar.lca.api.user;

import com.google.gson.annotations.SerializedName;

/**
 * Created by cheen on 4/17/2016.
 */
public class Video
{

    private String url;
    private String slug;
    private String user;
    private String title;
    private String description;
    @SerializedName("coding_category")
    private String codingCategory;
    private String difficulty;
    private String language;
    @SerializedName("product_type")
    private String productType;
    @SerializedName("creation_time")
    private String creationTime;
    private int duration;
    private String region;
    @SerializedName("viewers_overall")
    private int overallViewers;
    @SerializedName("viewing_urls")
    private String viewingURLs;

    public String getUrl() {
        return url;
    }

    public String getSlug() {
        return slug;
    }

    public String getUser() {
        return user;
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

    public String getProductType() {
        return productType;
    }

    public String getCreationTime() {
        return creationTime;
    }

    public int getDuration() {
        return duration;
    }

    public String getRegion() {
        return region;
    }

    public int getOverallViewers() {
        return overallViewers;
    }

    public String getViewingURLs() {
        return viewingURLs;
    }
}
