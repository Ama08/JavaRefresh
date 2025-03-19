package org.mutableandImmutable;

import java.util.ArrayList;
import java.util.List;

public class HistoricTeam {
    private String name;
    private int year;
    private List<Player> players;

    public HistoricTeam(String name, List<Player> players, int year) {
        this.name = name;
        this.year = year;
        for (Player player : players) {
            Player clonedPlayer = new Player(player.getName(),player.getAge());
            this.players.add(clonedPlayer);
        }

    }

    public String getName() {
        return name;
    }

    public List<Player> getPlayers() {
        List<Player> clonedPlayers = new ArrayList<Player>();

        for (Player player : players) {
            Player clonedPlayer = new Player(player.getName(),player.getAge());
            clonedPlayers.add(clonedPlayer);
        }

        return clonedPlayers;

    }

    public int getYear() {
        return year;
    }
}
