package com.cheenar.lca.tests;

import com.cheenar.lca.login.LoginHack;

/**
 * Created by cheen on 4/17/2016.
 */
public class TestLogin
{

    public static void main(String[] args)
    {
        try
        {
            //supply user=args[0] and pass=args[1]
            String sessionCookie = LoginHack.getSessionCookies(args[0], args[1]);
            System.out.println(sessionCookie); //if login successful, show cookie
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }

}
