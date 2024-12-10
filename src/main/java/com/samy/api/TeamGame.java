package com.samy.api;

import org.bukkit.ChatColor;
import org.bukkit.entity.Player;

import java.util.List;

public abstract class TeamGame {

    public String name;
    public ChatColor color;
    public List<Player> players;

    public TeamGame(String name, ChatColor color, List<Player> players) {
        this.name = name;
        this.color = color;
        this.players = players;
    }
}
