package tech.shadowsystems.zombies.task;

import org.bukkit.scheduler.BukkitRunnable;
import tech.shadowsystems.zombies.Game;

/**
 * Copyright © 2016 Jordan Osterberg and Shadow Technical Systems LLC. All rights reserved. Please email jordan.osterberg@shadowsystems.tech for usage rights and other information.
 */
public class GameCountdownTask extends BukkitRunnable {

    private Game game;
    private int countdown;

    public GameCountdownTask(Game game) {
        this.game = game;
        this.countdown = game.getStartCountdown();
    }

    @Override
    public void run() {
        if (countdown <= 0) {
            this.game.setGameCountdownOver();
            cancel();
            return;
        }

        countdown--;
    }

}
