package tech.shadowsystems.zombies;

import tech.shadowsystems.zombies.task.GameCountdownTask;

/**
 * Copyright © 2016 Jordan Osterberg and Shadow Technical Systems LLC. All rights reserved. Please email jordan.osterberg@shadowsystems.tech for usage rights and other information.
 */
public class Game {

    private Zombies zombies;

    private int minPlayers;
    private int maxPlayers;
    private int startCountdown;

    private GameState gameState;
    private GameCountdownTask gameCountdownTask;

    public Game(Zombies zombies, int minPlayers, int maxPlayers, int startCountdown) {
        this.zombies = zombies;

        this.minPlayers = minPlayers;
        this.maxPlayers = maxPlayers;
        this.startCountdown = startCountdown;

        this.gameState = GameState.LOBBY;
    }

    public void startGameCountdown() {
        this.gameCountdownTask = new GameCountdownTask(this);
        this.gameCountdownTask.runTaskTimer(zombies, 0, 20);
    }

    public void setGameCountdownOver() {
        if (gameCountdownTask != null) {
            gameCountdownTask.cancel();
        }


    }

    public Zombies getZombies() {
        return zombies;
    }

    public int getMaxPlayers() {
        return maxPlayers;
    }

    public int getMinPlayers() {
        return minPlayers;
    }

    public int getStartCountdown() {
        return startCountdown;
    }

}
