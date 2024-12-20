package com.samy.api.rank;

import org.bukkit.ChatColor;

public interface IRank {

    String getName();
    ChatColor getColor();
    String getColorName();
    String getTeamName();
    boolean hasPermissions(Permissions perm);
}
