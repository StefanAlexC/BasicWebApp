package com.develogical;

import java.lang.reflect.Array;
import java.util.Scanner;

public class QueryProcessor {

    public String process(String query) {
        try {
            String[] quer = query.split(":");
            query = quer[1];

            if (query.toLowerCase().contains("shakespeare")) {
                return "William Shakespeare (26 April 1564 - 23 April 1616) was an " +
                        "English poet, playwright, and actor, widely regarded as the greatest " +
                        "writer in the English language and the world's pre-eminent dramatist.";
            } else if (query.toLowerCase().contains("milk")) {
                return "Please mister gib milk";
            } else if (query.toLowerCase().contains(" what is your team name")) {
                return "Milky Way";
            } else if (query.toLowerCase().contains("plus")) {
                Scanner scanner = new Scanner(query.toLowerCase());
                return "" + scanner.nextInt() + scanner.nextInt();
            }
            return "";
        } catch (Exception e) {
            return "";
        }
    }
}
