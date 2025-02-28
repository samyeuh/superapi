package com.samy.api.scoreboard.tab;

import com.samy.api.TeamGame;
import com.samy.api.rank.IRank;
import org.bukkit.entity.Player;
import org.bukkit.scoreboard.Score;
import org.bukkit.scoreboard.Scoreboard;
import org.bukkit.scoreboard.Team;

import java.util.List;
import java.util.Map;

public interface ITabManager {

    void setHeaderAndFooter(Player player);
    Scoreboard createTeamTabManager(Scoreboard scoreboard, Player player, Map<Player, TeamGame> teams);
    Scoreboard createTabManager(Scoreboard scoreboard, Player player);
    List<Team> createTeams(Scoreboard scoreboard, Player player);
    Team createTeamRank(IRank rank);
    void assignPlayerToTeamRank(Player player);
    void updateTabForPlayers(Scoreboard scoreboard);

}
