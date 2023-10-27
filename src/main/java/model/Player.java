package model;

import java.util.TreeMap;

abstract class Player {
    protected int id, number;
    protected String name;

    public int getID() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getNumber() {
        return number;
    }

    public abstract TreeMap<String, Integer> getAttributes();

    public void setNumber(int number) {
        this.number = number;
    }
}
