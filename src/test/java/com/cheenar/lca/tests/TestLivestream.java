package com.cheenar.lca.tests;

import com.cheenar.lca.api.Livecoding;
import com.cheenar.lca.api.RequestType;
import com.cheenar.lca.api.livestreams.Livestream;
import com.cheenar.lca.api.livestreams.Livestreams;
import com.cheenar.lca.login.LoginHack;

import java.util.HashMap;

/**
 * Created by cheen on 4/17/2016.
 */
public class TestLivestream
{

    public static void main(String[] args)
    {
        try
        {
            //supply user=args[0] and pass=args[1]
            String sessionCookie = LoginHack.getSessionCookies(args[0], args[1]);

            Livecoding api = new Livecoding(sessionCookie);
            HashMap<String, String> arg = new HashMap<String, String>();
            arg.put("user__slug", "yamishibai");
            Livestream languages = (Livestream) api.request(RequestType.LIVESTREAM_SLUG, arg);
            System.out.println(languages.getTitle());
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }

}
