package com.cheenar.lca.api;

import java.util.HashMap;

/**
 * Created by cheen on 4/17/2016.
 */
public class Orderings
{

    public enum Ordering
    {
        TITLE,
        CREATION_TIME,
        SLUG;
    }

    public static void applyOrdering(HashMap<String, String> args, Ordering order, String value)
    {
        args.put(order.name().toLowerCase(), value);
    }

}
