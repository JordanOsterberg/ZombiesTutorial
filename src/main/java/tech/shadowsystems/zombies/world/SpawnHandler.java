package tech.shadowsystems.zombies.world;

import org.bukkit.Location;
import org.bukkit.configuration.file.FileConfiguration;
import tech.shadowsystems.zombies.Game;

import java.util.ArrayList;
import java.util.List;

/**
 * Copyright © 2016 Jordan Osterberg and Shadow Technical Systems LLC. All rights reserved. Please email jordan.osterberg@shadowsystems.tech for usage rights and other information.
 */
public class SpawnHandler {

    private Game game;
    private Map map;

    public SpawnHandler(Game game, Map map) {
        this.game = game;
        this.map = map;
    }

    public Location loadSpawn(String spawnName, String id) {
        FileConfiguration configuration = this.game.getZombies().getConfig();

        String path = this.map.getConfigPathName() + ".spawnpoints." + spawnName;
        if (!spawnName.equalsIgnoreCase("player")) {
            // Part of a list
            path += "." + id;
        }

        int x = configuration.getInt(path + ".x");
        int y = configuration.getInt(path + ".y");
        int z = configuration.getInt(path + ".z");

        Location location = new Location(map.getWorld(), x, y, z);

        if (configuration.get(path + ".yaw") != null) {
            int yaw = configuration.getInt(path + ".yaw");
            location.setYaw(yaw);
        }

        return location;
    }

    public List<Location> loadSpawns(String spawnName) {
        FileConfiguration configuration = this.game.getZombies().getConfig();

        String path = this.map.getConfigPathName() + ".spawnpoints." + spawnName;

        List<Location> locations = new ArrayList<>();
        for (String spawn : configuration.getConfigurationSection(path).getKeys(false)) {
            loadSpawn(spawnName, spawn); // In theory this should work
        }

        return locations;
    }

}

