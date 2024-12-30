package com.samy.api;

import com.samy.api.friends.IFriendsManager;
import com.samy.api.message.IMessageManager;
import com.samy.api.party.IPartyManager;
import com.samy.api.queue.IQueueManager;
import com.samy.api.rank.IRankManager;
import com.samy.api.scoreboard.IScoreboardManager;
import org.bukkit.plugin.java.JavaPlugin;

public abstract class SuperAPI {

    private static SuperAPI instance;
    private final JavaPlugin plugin;

    public SuperAPI(JavaPlugin plugin) {
        this.plugin = plugin;
        instance = this;
    }

    public static SuperAPI getInstance() {
        return instance;
    }
    public JavaPlugin getPlugin() { return plugin; }

    public abstract String getServerName();
    public abstract IFriendsManager getFriendsManager();
    public abstract IMessageManager getMessageManager();
    public abstract IPartyManager getPartyManager();
    public abstract IRankManager getRankManager();
    public abstract IScoreboardManager getScoreboardManager();
    public abstract IQueueManager getQueueManager();


}
