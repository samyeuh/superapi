package com.samy.api;

import org.bukkit.ChatColor;
import org.bukkit.entity.Player;

import java.util.List;

public abstract class TeamGame {

    private final String name;
    private final ChatColor color;
    private final List<Player> players;

    public TeamGame(String name, ChatColor color, List<Player> players) {
        this.name = name;
        this.color = color;
        this.players = players;
    }

    public String getName() {
        return name;
    }

    public ChatColor getColor() {
        return color;
    }

    public List<Player> getPlayers() {
        return players;
    }
}
