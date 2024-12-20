package com.samy.api.scoreboard;

import com.samy.api.scoreboard.sidebar.ISidebarManager;
import com.samy.api.scoreboard.tab.ITabManager;
import org.bukkit.entity.Player;

import java.util.List;

public interface IScoreboardManager {

    void setScoreboard(Player player, String title, List<String> lines);
    void updateScoreboard();
    void updateTab();
    void updateSidebar();
    ITabManager getTabManager();
    ISidebarManager getSidebarManager();
}
