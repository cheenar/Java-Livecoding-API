package com.cheenar.lca.tests;

import com.cheenar.lca.api.Livecoding;
import com.cheenar.lca.api.Orderings;
import com.cheenar.lca.api.RequestType;
import com.cheenar.lca.api.Searchs;
import com.cheenar.lca.api.langauges.Languages;
import com.cheenar.lca.api.livestreams.Livestreams;
import com.cheenar.lca.login.LoginHack;

import java.util.HashMap;

/**
 * Created by cheen on 4/17/2016.
 */
public class TestLivestreams
{

    public static void main(String[] args)
    {
        try
        {
            //supply user=args[0] and pass=args[1]
            String sessionCookie = LoginHack.getSessionCookies(args[0], args[1]);

            Livecoding api = new Livecoding(sessionCookie);
            HashMap<String, String> arg = new HashMap<String, String>();
            arg.put("limit", "10"); //how much data you want back
            arg.put("offset", "0"); //offset the return results
            Livestreams languages = (Livestreams) api.request(RequestType.LIVESTREAMS, arg);
            System.out.println(languages.getLivestreams().get(1).getTitle());
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }

}
