package com.samy.api.scoreboard.sidebar;

import org.bukkit.entity.Player;
import org.bukkit.scoreboard.Objective;
import org.bukkit.scoreboard.Scoreboard;

import java.util.List;

public interface ISidebarManager {

        Scoreboard setSidebar(Scoreboard scoreboard, Player player, Objective objective);

}
