package com.cheenar.lca.api.user;

import com.google.gson.annotations.SerializedName;
import java.util.List;

/**
 * Created by cheen on 4/17/2016.
 */

public class User
{
    private String url;
    private String username;
    private String slug;
    private String country;
    private String city;
    @SerializedName("favorite_programming")
    private String favoriteProgramming;
    @SerializedName("favorite_ide")
    private String favoriteIDE;
    @SerializedName("favorite_coding_background_music")
    private String favoriteCodingBackgroundMusic;
    @SerializedName("favorite_code")
    private String favoriteCode;
    @SerializedName("years_programming")
    private int yearsProgramming;
    @SerializedName("want_learn")
    private List<String> wantLearn;
    @SerializedName("registration_date")
    private String registrationDate;

    public String getUrl() {
        return url;
    }

    public String getUsername() {
        return username;
    }

    public String getSlug() {
        return slug;
    }

    public String getCountry() {
        return country;
    }

    public String getCity() {
        return city;
    }

    public String getFavoriteProgramming() {
        return favoriteProgramming;
    }

    public String getFavoriteIDE() {
        return favoriteIDE;
    }

    public String getFavoriteCodingBackgroundMusic() {
        return favoriteCodingBackgroundMusic;
    }

    public String getFavoriteCode() {
        return favoriteCode;
    }

    public int getYearsProgramming() {
        return yearsProgramming;
    }

    public List<String> getWantLearn() {
        return wantLearn;
    }

    public String getRegistrationDate() {
        return registrationDate;
    }
}
