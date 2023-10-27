package model;

import java.util.TreeMap;

public class Goalie extends Player{
    private int rating;

    public Goalie(String name, int number, int rating) {
        this.name = name;
        this.number = number;
        this.rating = rating;
    }

    public int getRating() {
        return rating;
    }

    public TreeMap<String, Integer> getAttributes() {
        TreeMap<String, Integer> attributes = new TreeMap<>();

        attributes.put("Rating", rating);
        
        return attributes;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }
}
