package tech.shadowsystems.zombies.listener;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import tech.shadowsystems.zombies.Zombies;

/**
 * Copyright © 2016 Jordan Osterberg and Shadow Technical Systems LLC. All rights reserved. Please email jordan.osterberg@shadowsystems.tech for usage rights and other information.
 */
public class PlayerJoinListener implements Listener {

    private Zombies zombies;

    public PlayerJoinListener(Zombies zombies) {
        this.zombies = zombies;
    }

    @EventHandler
    public void onPlayerJoin(PlayerJoinEvent event) {
        Player player = event.getPlayer();

        // TODO: Set join message, etc etc
    }

}
