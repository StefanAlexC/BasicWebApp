package com.develogical;

import java.lang.reflect.Array;
import java.util.Scanner;

public class QueryProcessor {

    public String process(String query) {
        try {
            String[] quer = query.split(":");
            query = quer[1] + quer[2];

            if (query.toLowerCase().contains("shakespeare")) {
                return "William Shakespeare (26 April 1564 - 23 April 1616) was an " +
                        "English poet, playwright, and actor, widely regarded as the greatest " +
                        "writer in the English language and the world's pre-eminent dramatist.";
            } else if (query.toLowerCase().contains("milk")) {
                return "Please mister gib milk";
            } else if (query.toLowerCase().contains(" what is your team name")) {
                return "Milky Way";
            } else if (query.toLowerCase().contains("plus")) {
                String strt = query;
                String[] partsts = strt.split(" ");
                return "" + (Integer.parseInt(partsts[3]) + Integer.parseInt(partsts[5]));
            } else if (query.toLowerCase().contains("largest")) {
                String str = query.substring((
                        " which of the following numbers is the largest ").length());
                String[] parts = str.split(", ");
                int largest = Integer.parseInt(parts[0]);
                for(String part : parts) {
                    int curr = Integer.parseInt(part);
                    if(curr > largest) {
                        largest = curr;
                    }
                }
                return "" + largest;
            } else if (query.toLowerCase().contains("multiplied")) {
                String strt = query;
                String[] partsts = strt.split(" ");
                return "" + (Integer.parseInt(partsts[3]) * Integer.parseInt(partsts[5]));
            } else if (query.toLowerCase().contains("eiffel tower")) {
                return "Paris";
            } else if (query.toLowerCase().contains("minus")) {
                String strt = query;
                String[] partsts = strt.split(" ");
                return "" + (Integer.parseInt(partsts[3]) / Integer.parseInt(partsts[5]));
            } else if (query.toLowerCase().contains("divided by")) {
                String strt = query;
                String[] partsts = strt.split(" ");
                return "" + (Integer.parseInt(partsts[3]) / Integer.parseInt(partsts[5]));
            } else if (query.toLowerCase().contains("theresa may")) {
                return "2016";
            } else if (query.toLowerCase().contains("james bond")) {
                return "Sean Connery";
            }
            return "";
        } catch (Exception e) {
            return "";
        }
    }
}
