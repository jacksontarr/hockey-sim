package model;

import java.util.TreeMap;

public class Team {
    private int id;
    private String name;
    private TreeMap<Integer, Skater> roster;

    public Team(int id, String name) {
        this.id = id;
        this.name = name;
        this.roster = new TreeMap<>();
    }

    public int getID() {
        return id;
    }

    public String getName() {
        return name;
    }

    public TreeMap<Integer, Skater> getRoster() {
        return roster;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void addPlayer(Skater player) {
        roster.put(player.getID(), player);
    }

    public void removePlayer(Skater player) {
        roster.remove(player.getID());
    }
}
