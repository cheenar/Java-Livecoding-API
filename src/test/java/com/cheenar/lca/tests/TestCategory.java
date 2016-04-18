package com.cheenar.lca.tests;

import com.cheenar.lca.api.Livecoding;
import com.cheenar.lca.api.RequestType;
import com.cheenar.lca.api.codecategories.Categories;
import com.cheenar.lca.api.codecategories.Category;
import com.cheenar.lca.login.LoginHack;

import java.util.HashMap;

/**
 * Created by cheen on 4/17/2016.
 */
public class TestCategory
{

    public static void main(String[] args)
    {
        try
        {
            //supply user=args[0] and pass=args[1]
            String sessionCookie = LoginHack.getSessionCookies(args[0], args[1]);

            Livecoding api = new Livecoding(sessionCookie);
            HashMap<String, String> arg = new HashMap<String, String>();
            arg.put("name", "Java"); //name of category you want
            Category categories = (Category) api.request(RequestType.CODING_CATEGORIES_NAME, arg);
            System.out.println(categories.getSort());
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }

}
