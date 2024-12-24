package com.samy.api.queue;

import org.bukkit.entity.Player;

import java.util.Queue;

public interface IQueueManager {

    void addPlayer(Player player, String game);
    void sendPlayerToGame(Player player);
    Queue<Player> getQueue();
    Player pollNextPlayer();
    boolean isQueueEmpty();

}
