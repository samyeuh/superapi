package com.samy.api.friends;

import org.bukkit.entity.Player;

import java.util.List;
import java.util.Map;
import java.util.UUID;

public interface IFriendsManager {

    void sendRequest(Player sender, Player receiver);
    void acceptRequest(Player sender, Player receiver);
    void acceptMostRequest(Player sender);
    void addFriend(Player sender, Player receiver);
    void removeFriend(Player sender, Player receiver);
    boolean areFriends(Player sender, Player receiver);
    List<UUID> getFriends(Player sender);
    List<String> getOnlineFriends(Player sender);
    List<String> getOfflineFriends(Player sender);
    List<String> getRequests(Player player);
    Map<UUID, List<UUID>> getFriendsMap();


}
