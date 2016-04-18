package com.cheenar.lca.tests;

import com.cheenar.lca.api.Livecoding;
import com.cheenar.lca.api.RequestType;
import com.cheenar.lca.api.user.Video;
import com.cheenar.lca.login.LoginHack;

import java.util.HashMap;
import java.util.List;

/**
 * Created by cheen on 4/17/2016.
 */
public class TestVideoLatest
{

    public static void main(String[] args)
    {
        try
        {
            String cookie = LoginHack.getSessionCookies(args[0], args[1]);
            Livecoding api = new Livecoding(cookie);
            HashMap<String, String> arg = new HashMap<String, String>();
            List<Video> user = (List<Video>) api.request(RequestType.VIDEO_LATEST, arg);
            System.out.println(user.size());
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }

}
