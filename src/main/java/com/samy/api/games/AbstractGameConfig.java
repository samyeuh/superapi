package com.samy.api.games;

public class AbstractGameConfig {

    int maxPlayers;
    int nbTeams;
    int playersPerTeam;
    String game;

    public AbstractGameConfig(String game, int nbTeams, int playersPerTeam){
        this.game = game;
        this.nbTeams = nbTeams;
        this.playersPerTeam = playersPerTeam;
        this.maxPlayers = nbTeams * playersPerTeam;
    }

    public String getGame(){
        return game;
    }

    public int getMaxPlayers(){
        return maxPlayers;
    }

    public int getNbTeams(){
        return nbTeams;
    }

    public int getPlayersPerTeam(){
        return playersPerTeam;
    }
}
