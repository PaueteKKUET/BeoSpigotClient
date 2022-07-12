package com.fadedbytes.beospigotclient.level.area;

import org.bukkit.Location;

public interface LevelArea {

    /**
     * Checks if the given location is within the level area.
     * @param loc The location to check.
     * @return True if the location is within the level area, false otherwise.
     */
    boolean isValidLocation(Location loc);

    /**
     * Gets the center location of the level area.
     * @return The center location of the level area.
     */
    Location getCenter();

    /**
     * Gets the radius of the level area.
     * @return The radius of the level area.
     */
    int getAreaRadius();

}
