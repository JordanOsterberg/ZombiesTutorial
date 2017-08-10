package tech.shadowsystems.zombies;

import org.bukkit.plugin.java.JavaPlugin;

public class Zombies extends JavaPlugin {

    private Game game;

    @Override
    public void onEnable() {
        this.game = new Game(this, 3, 48, 30);
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }

    public Game getGame() {
        return game;
    }

}
