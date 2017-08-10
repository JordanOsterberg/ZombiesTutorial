package tech.shadowsystems.zombies.world;

import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.World;
import tech.shadowsystems.zombies.Game;

import java.util.List;

/**
 * Copyright © 2016 Jordan Osterberg and Shadow Technical Systems LLC. All rights reserved. Please email jordan.osterberg@shadowsystems.tech for usage rights and other information.
 */
public class Map {

    private Game game;

    private String configPathName;

    private String displayName;
    private Material displayMaterial;
    private String worldName;
    private World world;
    private boolean enabled;

    private Location playerSpawn;
    private List<Location> zombieSpawnLocations;
    private List<Location> supplyCrateLocations;
    private List<Location> tourLocations;

    public Map(Game game, String configPathName, boolean enabled) {
        this.configPathName = configPathName;
        this.enabled = enabled;

        if (!this.enabled) {
            return;
        }

        // TODO: Setup
    }

    public void loadSpawns() {
        SpawnHandler spawnHandler = new SpawnHandler(game, this);
        playerSpawn = spawnHandler.loadSpawn("player", "0"); // Insert a value of 0 because it's the player spawn and it doesn't have multiple locations. The id won't be read
        zombieSpawnLocations = spawnHandler.loadSpawns("zombies");
        supplyCrateLocations = spawnHandler.loadSpawns("supplyCrates");
        tourLocations = spawnHandler.loadSpawns("tour");
    }

    public String getConfigPathName() {
        return configPathName;
    }

    public Material getDisplayMaterial() {
        return displayMaterial;
    }

    public String getDisplayName() {
        return displayName;
    }

    public String getWorldName() {
        return worldName;
    }

    public World getWorld() {
        return world;
    }

}
