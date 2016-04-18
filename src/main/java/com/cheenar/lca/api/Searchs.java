package com.cheenar.lca.api;

import java.util.HashMap;

/**
 * Created by cheen on 4/17/2016.
 */
public class Searchs
{

    public enum Search
    {
        TITLE,
        DESCRIPTION,
        FILENAME,
        SLUG;
    }

    public static void applySearch(HashMap<String, String> args, Search search, String value)
    {
        args.put(search.name().toLowerCase(), value);
    }

}
