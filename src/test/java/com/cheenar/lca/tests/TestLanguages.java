package com.cheenar.lca.tests;

import com.cheenar.lca.api.Livecoding;
import com.cheenar.lca.api.RequestType;
import com.cheenar.lca.api.codecategories.Categories;
import com.cheenar.lca.api.langauges.Languages;
import com.cheenar.lca.login.LoginHack;

import java.util.HashMap;

/**
 * Created by cheen on 4/17/2016.
 */
public class TestLanguages
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
            Languages languages = (Languages) api.request(RequestType.LANGUAGES, arg);
            System.out.println(languages.getLanguages().get(0).getName());
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }

}
