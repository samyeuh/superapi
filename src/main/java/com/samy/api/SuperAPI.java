package com.samy.api;

import org.bukkit.entity.Player;

import java.util.List;
import java.util.Map;
import java.util.UUID;

public interface SuperAPI {
    Map<UUID, List<UUID>> getFriends();
    void createRankTab();
    void createTeams(List<TeamGame> teams);
    void joinTeam(Player player, TeamGame team);

    void setScoreboard(String header, List<String> lines, Player player);
}
