package com.cheenar.lca.api;

import java.util.HashMap;

/**
 * Created by cheen on 4/17/2016.
 */
public class Filters
{

    public enum Filter
    {
        DIFFICULTYLEVEL,
        REGION,
        CODING__SLUG,
        LANGUAGE__NAME;
    }

    public static void applyFilter(HashMap<String, String> args, Filter filter, String search)
    {
        args.put(filter.name().toLowerCase(), search);
    }

}
