package com.samy.api.party;

import org.bukkit.entity.Player;

import java.util.List;
import java.util.UUID;

public interface IParty {

    UUID getLeaderId();
    List<UUID> getMembers();
    List<UUID> getMembersWithoutLeader();
    void addMember(Player player);
    void removeMember(Player player);
    boolean isMember(Player player);
    boolean isLeader(Player player);

}
