package com.samy.api.rank;

import org.bukkit.entity.Player;

import java.util.List;

public interface IRankManager {

    List<IRank> getRanks();
    void setRank(Player player, IRank rank);
    IRank getRank(Player player);
    IRank findRank(String rankName);
    void removeRank(Player player);
    IRank getJoueurRank();
}
