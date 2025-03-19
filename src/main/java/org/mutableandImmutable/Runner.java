package org.mutableandImmutable;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Runner {
    public static void main(String[] args) {


        Player player1 = new Player("payer1", 21);
        Player player2 = new Player("payer2", 25);
        Player player3 = new Player("payer3", 30);
        List<Player> players = new ArrayList<>(Arrays.asList(player1, player2, player3));

        HistoricTeam historicTeam = new HistoricTeam("US Hackathon Team", players, 1985);

        player1.setAge(56);
        player2.setAge(60);
        player3.setAge(65);


        List<Player> playersFromTeam = historicTeam.getPlayers();

        for (Player player : playersFromTeam) {
            System.out.println(player.getName()+" age: "+player.getAge());
        }

    }
}
