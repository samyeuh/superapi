package com.samy.api.scoreboard.tab;

import com.samy.api.rank.IRank;
import org.bukkit.entity.Player;
import org.bukkit.scoreboard.Scoreboard;
import org.bukkit.scoreboard.Team;

import java.util.List;

public interface ITabManager {

    void setHeaderAndFooter(Player player);
    Scoreboard createTabManager(Scoreboard scoreboard, Player player);
    List<Team> createTeams(Scoreboard scoreboard, Player player);
    Team createTeamRank(IRank rank);
    void assignPlayerToTeamRank(Player player);
    void updateTabForPlayers(Scoreboard scoreboard);

}
