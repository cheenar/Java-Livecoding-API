package com.cheenar.lca.api;

import com.cheenar.lca.api.codecategories.Categories;
import com.cheenar.lca.api.codecategories.Category;
import com.cheenar.lca.api.langauges.Language;
import com.cheenar.lca.api.langauges.Languages;
import com.cheenar.lca.api.user.User;
import com.cheenar.lca.api.user.Video;
import com.cheenar.lca.api.user.Videos;
import com.google.gson.Gson;
import com.mashape.unirest.http.Unirest;

import java.util.HashMap;
import java.util.List;

/**
 * Created by cheen on 4/17/2016.
 */
public class Livecoding
{

    private String session;

    public Livecoding(String session)
    {
        this.session = session; //this is th cookies string
    }

    public String addQuery(HashMap<String, String> hash, String key)
    {
        if(!hash.containsKey(key))
            return "";
        return key + "=" + hash.get(key) + "&";
    }

    public Object request(RequestType type, HashMap<String, String> args) throws Exception
    {
        String baseURL = "https://www.livecoding.tv/api/";
        switch(type)
        {
            case CODING_CATEGORIES:
                baseURL += "codingcategories/?";
                for(String key : args.keySet())
                {
                    baseURL += addQuery(args, key);
                }
                break;

            case CODING_CATEGORIES_NAME:
                if(args.get("name") == null) throw new Exception("[Livecoding] no category name supplied");
                baseURL += "codingcategories/" + args.get("name");
                break;

            case LANGUAGES:
                baseURL += "languages/?";
                for(String key : args.keySet())
                {
                    baseURL += addQuery(args, key);
                }
                break;

            case LANGUAGES_SLUG:
                baseURL += "languages/";
                baseURL += args.get("name") + "/?format=json";
                break;

            case USER:
                baseURL = baseURL + "user/";
                break;

            case USERS_SLUG:
                if(args.get("user") == null)
                    throw new Exception("[Livecoding] No user supplied with " + type.name() + " request");
                baseURL = baseURL + "users/" + args.get("user") + "/?format=json";
                break;

            case VIDEOS:
                baseURL += "user/videos/?";
                for(String key : args.keySet())
                {
                    System.out.println(key);
                    baseURL += addQuery(args, key);
                }

                break;

            case VIDEO_LATEST:
                baseURL += "user/videos/latest";
                break;

            default:
                break;
        }

        String json = Unirest.get(baseURL).header("accept", "application/json").asString().getBody();

        switch(type)
        {
            case CODING_CATEGORIES:
                return (Categories) gson.fromJson(json, Categories.class);

            case CODING_CATEGORIES_NAME:
                return (Category) gson.fromJson(json, Category.class);

            case USER:
                return (User) gson.fromJson(json, User.class);

            case USERS_SLUG:
                return (User) gson.fromJson(json, User.class);

            case VIDEOS:
                return (Videos) gson.fromJson(json, Videos.class);

            case VIDEO_LATEST:
                return (List<Video>) gson.fromJson(json, List.class);

            case LANGUAGES_SLUG:
                return (Language) gson.fromJson(json, Language.class);

            case LANGUAGES:
                return (Languages) gson.fromJson(json, Languages.class);

            default:
                return null;
        }
    }

    private static Gson gson = new Gson();

}
