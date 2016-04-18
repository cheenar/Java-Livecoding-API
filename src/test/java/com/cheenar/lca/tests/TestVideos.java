package com.cheenar.lca.tests;

import com.cheenar.lca.api.*;
import com.cheenar.lca.api.user.Videos;
import com.cheenar.lca.login.LoginHack;

import java.util.HashMap;

/**
 * Created by cheen on 4/17/2016.
 */
public class TestVideos
{

    public static void main(String[] args)
    {
        try
        {
            //supply user=args[0] and pass=args[1]
            String sessionCookie = LoginHack.getSessionCookies(args[0], args[1]);

            Livecoding api = new Livecoding(sessionCookie);
            HashMap<String, String> arg = new HashMap<String, String>();
            arg.put("limit", "9999"); //how much data you want back
            arg.put("offset", "0"); //offset the return results

            //Filter test

            //hashmap, filter, search term
            Filters.applyFilter(arg, Filters.Filter.CODING__SLUG, "java");
            Filters.applyFilter(arg, Filters.Filter.DIFFICULTYLEVEL, "beginner");
            Filters.applyFilter(arg, Filters.Filter.LANGUAGE__NAME, "English");
            Filters.applyFilter(arg, Filters.Filter.REGION, "us-stlouis");

            Searchs.applySearch(arg, Searchs.Search.DESCRIPTION, "test");
            Orderings.applyOrdering(arg, Orderings.Ordering.SLUG, "phpcoder");


            Videos videos = (Videos) api.request(RequestType.USER_VIDEOS, arg);
            System.out.println(videos.getVideos().size());
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }

}
