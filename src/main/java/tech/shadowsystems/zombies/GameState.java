package tech.shadowsystems.zombies;

/**
 * Copyright © 2016 Jordan Osterberg and Shadow Technical Systems LLC. All rights reserved. Please email jordan.osterberg@shadowsystems.tech for usage rights and other information.
 */
public enum GameState {

    LOBBY("Lobby"), TOUR("Tour"), INGAME("In-Game"), END("Shutdown");

    private String title;

    GameState(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

}
