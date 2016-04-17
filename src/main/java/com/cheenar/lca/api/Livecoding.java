package com.cheenar.lca.api;

import com.cheenar.lca.api.codecategories.Categories;
import com.cheenar.lca.api.codecategories.Category;
import com.cheenar.lca.api.user.User;
import com.google.gson.Gson;
import com.mashape.unirest.http.Unirest;
import com.mashape.unirest.request.HttpRequest;

import java.util.HashMap;

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
                baseURL += addQuery(args, "limit");
                baseURL += addQuery(args, "offset");
                break;

            case CODING_CATEGORIES_NAME:
                if(args.get("name") == null) throw new Exception("[Livecoding] no category name supplied");
                baseURL += "codingcategories/" + args.get("name");
                break;

            case USER:
                baseURL = baseURL + "user/";
                break;

            case USERS_SLUG:
                if(args.get("user") == null)
                    throw new Exception("[Livecoding] No user supplied with " + type.name() + " request");
                baseURL = baseURL + "users/" + args.get("user") + "/?format=json";
                break;

            default:
                break;
        }

        String json = Unirest.get(baseURL).asString().getBody();

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

            default:
                return null;
        }
    }

    private static Gson gson = new Gson();

}
