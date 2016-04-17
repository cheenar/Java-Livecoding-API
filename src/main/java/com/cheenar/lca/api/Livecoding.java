package com.cheenar.lca.api;

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

    public Object request(RequestType type, HashMap<String, String> args) throws Exception
    {
        String baseURL = "https://www.livecoding.tv/api/";
        switch(type)
        {
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

        switch(type)
        {
            case USER:
                User user = (User) gson.fromJson(Unirest.get(baseURL).asString().getBody(), User.class);
                return user;

            case USERS_SLUG:
                user = (User) gson.fromJson(Unirest.get(baseURL).asString().getBody(), User.class);
                return user;

            default:
                return null;
        }
    }

    private static Gson gson = new Gson();

}
