package com.cheenar.lca.login;

import com.mashape.unirest.http.Headers;
import com.mashape.unirest.http.HttpResponse;
import com.mashape.unirest.http.Unirest;

import java.util.ArrayList;

/**
 * Created by cheen on 4/17/2016.
 */
public class LoginHack
{

    public static String getSessionCookies(String user, String pass) throws Exception
    {
        if(user == "" || user == null)
        {
            throw new Exception("User invalid");
        }
        if(pass == "" || pass == null)
        {
            throw new Exception("Pass invalid");
        }

        //Retrive th CSRFMMiddleware Formkey
        HttpResponse<String> resp = Unirest.get("https://www.livecoding.tv/accounts/login/").asString();

        String body[] = resp.getBody().split("\n");
        String token = "";
        for(String line : body)
        {
            if(line.contains("csrfmiddlewaretoken"))
            {
                String line_parts[] = line.replaceAll(" ", "").split("'");
                token = line_parts[5];
            }
        }

        //Grab the cookies necessary to make login request
        Headers headers = resp.getHeaders();
        ArrayList<String> cookies = null;
        cookies = (ArrayList<String>) headers.get("Set-Cookie");

        //Create a cookie string
        StringBuilder cookie = new StringBuilder();
        for(String c : cookies)
        {
            cookie.append(c.split(";")[0]).append(";");
        }

        //Do the actual login
        HttpResponse<String> postReq = Unirest.post("https://www.livecoding.tv/accounts/login/").header("referer", "https://www.livecoding.tv/accounts/login/").header("cookie", cookie.toString()).field("csrfmiddlewaretoken", token).field("login", user).field("password", pass).asString();
        System.out.println(postReq.getHeaders().get("Set-Cookie"));

        //Rebuild that cookie string with the new cookies
        cookies = null;
        cookies = (ArrayList) postReq.getHeaders().get("Set-Cookie");
        for(String c : cookies)
        {
            System.out.println(c);
            cookie.append(c.split(";")[0]).append(";");
        }

        //authentication data
        System.out.println(cookie.toString());
        return cookie.toString();
    }

}
