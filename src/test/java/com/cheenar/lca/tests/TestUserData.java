package com.cheenar.lca.tests;

import com.cheenar.lca.api.Livecoding;
import com.cheenar.lca.api.RequestType;
import com.cheenar.lca.api.user.User;
import com.cheenar.lca.login.LoginHack;

import java.util.HashMap;

/**
 * Created by cheen on 4/17/2016.
 */
public class TestUserData
{

    public static void main(String[] args)
    {
        try
        {
            //supply user=args[0] and pass=args[1]
            String sessionCookie = LoginHack.getSessionCookies(args[0], args[1]);

            Livecoding api = new Livecoding(sessionCookie);
            HashMap<String, String> arg = new HashMap<String, String>();
            User user = (User) api.request(RequestType.USER, arg);
            System.out.println(user.getYearsProgramming());
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }

}
