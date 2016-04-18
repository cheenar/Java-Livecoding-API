package com.cheenar.lca.tests;

import com.cheenar.lca.api.Livecoding;
import com.cheenar.lca.api.RequestType;
import com.cheenar.lca.api.user.Video;
import com.cheenar.lca.api.user.Videos;
import com.cheenar.lca.login.LoginHack;

import java.util.HashMap;

/**
 * Created by cheen on 4/17/2016.
 */
public class TestVideosList
{

    public static void main(String[] args)
    {
        try
        {
            //supply user=args[0] and pass=args[1]
            String sessionCookie = LoginHack.getSessionCookies(args[0], args[1]);

            Livecoding api = new Livecoding(sessionCookie);
            HashMap<String, String> arg = new HashMap<String, String>();
            arg.put("limit", "10");
            Videos video = (Videos) api.request(RequestType.VIDEOS, arg);
            System.out.println(video.getVideos().get(0).getTitle());
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }

}
