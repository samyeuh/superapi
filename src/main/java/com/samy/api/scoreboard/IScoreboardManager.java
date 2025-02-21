package com.samy.api.scoreboard;

import com.samy.api.scoreboard.sidebar.ISidebarManager;
import com.samy.api.scoreboard.tab.ITabManager;
import org.bukkit.entity.Player;
import org.bukkit.scoreboard.Objective;

import java.util.List;
import java.util.Map;

public interface IScoreboardManager {

    void setScoreboard(Player player, Objective objective, Map<Player, String> teams);
    void updateScoreboard();
    void updateTab();
    ITabManager getTabManager();
    ISidebarManager getSidebarManager();
}
