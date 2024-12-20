package com.samy.api.party;

import org.bukkit.entity.Player;

import java.util.List;
import java.util.UUID;

public interface IPartyManager {

    boolean isMemberOfAParty(Player player);
    IParty getParty(Player player);
    List<String> getPartyRequestsLeader(Player player);
    void disbandParty(Player player);
    IParty getPartyIfLeader();
    void checkPartyForRequest(Player player, Player target);
    void requestPartyToPlayer(Player player, Player target);
    void accestRequestFromPlayer(Player target, Player sender);
    void acceptMostRecentRequest(Player player);
    void addPlayerToParty(Player sender, Player player);
    void removePlayerFromParty(Player leader, Player oldFriend);
    void leaveParty(Player player);
    List<String> getPartyMembers(Player player);
    void listParty(Player player);


}
