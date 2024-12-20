package com.samy.api.message;

import org.bukkit.entity.Player;

public interface IMessageManager {

        void sendMessage(Player sender, Player receiver, String message);
        void respondMessage(Player sender, String message);
}
