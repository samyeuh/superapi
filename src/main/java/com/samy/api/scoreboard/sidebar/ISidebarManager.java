package com.samy.api.scoreboard.sidebar;

import org.bukkit.entity.Player;
import org.bukkit.scoreboard.Objective;
import org.bukkit.scoreboard.Scoreboard;

import java.util.List;

public interface ISidebarManager {

        Scoreboard createSidebar(Scoreboard scoreboard, String title, List<String> lines, Player player);
        void setObjective(Objective objective, Player player);
        void updateSidebarForPlayer(Player player, Scoreboard scoreboard);
        void resetScoreboard(Scoreboard scoreboard);
        Objective choseObjective(Objective obj, String line, Player player, int score);

}
