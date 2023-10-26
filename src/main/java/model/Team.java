package model;

import java.util.TreeMap;

public class Team {
    private int id;
    private String name;
    private TreeMap<Integer, Player> roster;

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

    public TreeMap<Integer, Player> getRoster() {
        return roster;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void addPlayer(Player player) {
        roster.put(player.getID(), player);
    }

    public void removePlayer(Player player) {
        roster.remove(player.getID());
    }
}
