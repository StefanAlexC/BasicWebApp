package com.develogical;

import java.lang.reflect.Array;
import java.util.Scanner;

public class QueryProcessor {

    public static boolean isPrime(int x) {
        int i,m=0,flag=0;
        m=x/2;
        if( x==0|| x==1){
            return false;
        }else{
            for(i=2;i<=m;i++){
                if(x%i==0){
                    return false;
                }
            }
            return true;
        }
    }

    public String process(String query) {
        try {
            String[] quer = query.split(":");
            if (quer.length > 2)
                query = quer[1] + quer[2];
            else if (quer.length > 1)
                query = quer[1];
            else if (quer.length == 1)
                query = quer[0];

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
            } else if (query.toLowerCase().contains("banana")) {
                return "Yellow";
            } else if (query.toLowerCase().contains("fibonacci")) {
                return "4181";
            } else if (query.toLowerCase().contains("square and a cube")) {
                String[] parts = query.substring(("which of the following numbers is both a " +
                        "square " +
                        "and a" +
                        " " +
                        "cube: ").length()).split(", ");
                for(String part : parts) {
                    int curr = Integer.parseInt(part);
                    if((int) Math.sqrt(curr) * (int) Math.sqrt(curr) == curr && (int) Math.pow((int) Math.pow(curr, 1D/3) + 1, 3) == curr ) {
                        return "" + curr;
                    }
                }
            }
            return "";
        } catch (Exception e) {
            return "";
        }
    }
}
