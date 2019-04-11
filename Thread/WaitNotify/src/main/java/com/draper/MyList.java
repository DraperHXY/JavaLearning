package com.draper;

import java.util.ArrayList;
import java.util.List;

/**
 * @author draper_hxy
 */
public class MyList {

    private static List list = new ArrayList();

    public static void add() {
        list.add("Draper");
    }

    public static int getSize() {
        return list.size();
    }

}
