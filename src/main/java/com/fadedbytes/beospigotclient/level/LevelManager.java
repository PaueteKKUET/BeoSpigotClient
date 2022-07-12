package com.fadedbytes.beospigotclient.level;

import org.bukkit.World;
import org.jetbrains.annotations.Nullable;

import java.util.HashMap;

public class LevelManager {

    private final HashMap<World, BeoLevel> levels = new HashMap<>();

    /**
     * Checks if the given world is running a level.
     * @param world The world to check.
     * @return True if the world is running a level, false otherwise.
     */
    public boolean worldHasLevel(World world) {
        return levels.containsKey(world);
    }

    /**
     * Gets the level for the given world.
     * @param world The world to get the level for.
     * @return The level for the given world.
     */
    @Nullable
    public BeoLevel getLevelAt(World world) {
        return levels.get(world);
    }

    public BeoLevel getLevel(String name) {
        return levels.values().stream().filter(level -> level.getName().equals(name)).findFirst().orElse(null);
    }

    public void closeLevelAt(World world) {
        levels.remove(world);
    }

}
