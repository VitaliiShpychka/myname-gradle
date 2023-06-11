package org.example;


import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class Main {
    public static void main(String[] args) {
        Human mi = new Human("Vitalii", "Shpychka");

        Gson gson = new GsonBuilder().setPrettyPrinting().create();

        String s = gson.toJson(mi);
        System.out.println(s);

    }
}