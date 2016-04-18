package com.cheenar.lca;

import com.cheenar.lca.api.Livecoding;
import com.cheenar.lca.api.RequestType;
import com.cheenar.lca.api.codecategories.Categories;
import com.cheenar.lca.api.codecategories.Category;
import com.cheenar.lca.api.user.User;
import com.cheenar.lca.api.user.Video;
import com.cheenar.lca.login.LoginHack;
import com.mashape.unirest.http.Headers;
import com.mashape.unirest.http.HttpResponse;
import com.mashape.unirest.http.Unirest;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * Created by cheen on 4/17/2016.
 */
public class Water
{

    public static void main(String[] args) throws Exception
    {
        //this is a whatever class
        //HttpResponse<String> resp = Unirest.get("https://www.livecoding.tv/api/user/?format=json").header("cookie", "__cfduid=d76adc5ee6514e4f0eed45dd478c77d441460853872; optimizelyEndUserId=oeu1460853842913r0.583642712553867; _ym_uid=1460853844605786366; poll_445=445; __insp_wid=1217608576; __insp_nv=true; __insp_ref=aHR0cHM6Ly93d3cubGl2ZWNvZGluZy50di9taWNoYWVsamNhbGtpbnMv; __insp_targlpu=https%3A%2F%2Fwww.livecoding.tv%2Flivestreams%2F; __insp_targlpt=Livestreams%20and%20videos; __insp_norec_sess=true; __zlcmid=aCfU2KLxj55XJw; _ym_isad=1; sessionid=1evhtn4874lll6dv8jjotfcy0qyt0412; _gat=1; csrftoken=ZOnMgPgR9qQpP4s3yl2hdjFDxZwVgK1y; optimizelySegments=%7B%223017870218%22%3A%22gc%22%2C%223030410196%22%3A%22false%22%2C%223035220039%22%3A%22referral%22%7D; optimizelyBuckets=%7B%7D; mp_2b964db267812ed3775b8eb3c692611f_mixpanel=%7B%22distinct_id%22%3A%20%2215421aca65c1ce-0412d0eb78f899-c393062-2a3000-15421aca65d148%22%2C%22%24initial_referrer%22%3A%20%22http%3A%2F%2Fhackforums.net%2Fshowthread.php%3Ftid%3D5236443%22%2C%22%24initial_referring_domain%22%3A%20%22hackforums.net%22%2C%22__alias%22%3A%20%22yamishibai%22%2C%22__mps%22%3A%20%7B%7D%2C%22__mpso%22%3A%20%7B%7D%2C%22__mpa%22%3A%20%7B%7D%2C%22__mpu%22%3A%20%7B%7D%2C%22__mpap%22%3A%20%5B%5D%2C%22%24search_engine%22%3A%20%22google%22%7D; _ga=GA1.2.764371208.1460853843; _ym_visorc_34141600=w; __insp_slim=1460927406943; mp_mixpanel__c=107; lctvsid1=1evhtn4874lll6dv8jjotfcy0qyt0412").asString();
        //System.out.println(resp.getBody());

        /*String cookie = LoginHack.getSessionCookies(args[0], args[1]);

        Livecoding api = new Livecoding(cookie);
        HashMap<String, String> arg = new HashMap<String, String>();
        List<Video> user = (List<Video>) api.request(RequestType.VIDEO_LATEST, arg);
        System.out.println(user.size());*/
    }

}
