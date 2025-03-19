package org.mutableandImmutable;

import java.util.List;

public class MutableChildOfHistoricTeam extends HistoricTeam{

        private String name;
        private int year;
        private List<Player> players;

        public MutableChildOfHistoricTeam(String name, List<Player> players , int year) {
            super(name, players, year);

            this.setName(name);
            this.setYear(year);
            this.setPlayers(players);
        }

        public List<Player> getPlayers() {
            return players;
        }

        @Override
        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public void setPlayers(List<Player> players) {
            this.players = players;
        }

        @Override
        public int getYear() {
            return year;
        }

        public void setYear(int year) {
            this.year = year;
        }
    }
