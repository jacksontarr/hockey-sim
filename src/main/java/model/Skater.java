package model;

import java.util.TreeMap;

public class Skater extends Player{
    private int shooting, passing, defending;

    public Skater(String name, int number, int shooting, int passing, int defending) {
        this.name = name;
        this.number = number;
        this.shooting = shooting;
        this.passing = passing;
        this.defending = defending;
    }

    public int getShooting() {
        return shooting;
    }

    public int getPassing() {
        return passing;
    }

    public int getDefending() {
        return defending;
    }

    public TreeMap<String, Integer> getAttributes() {
        TreeMap<String, Integer> attributes = new TreeMap<>();

        attributes.put("Shooting", shooting);
        attributes.put("Passing", passing);
        attributes.put("Defending", defending);
        
        return attributes;
    }

    public void setShooting(int shooting) {
        this.shooting = shooting;
    }

    public void setPassing(int passing) {
        this.passing = passing;
    }

    public void setDefending(int defending) {
        this.defending = defending;
    }
}
