package com.fadedbytes.beospigotclient.level;

import com.fadedbytes.beospigotclient.level.area.LevelArea;
import org.bukkit.World;
import org.jetbrains.annotations.NotNull;

public class BeoLevel {

    private final World world;
    private final LevelArea area;
    private final String name;

    public BeoLevel(@NotNull String name, @NotNull World world, @NotNull LevelArea area) {
        this.world = world;
        this.area = area;
        this.name = name;
    }

    public @NotNull World getWorld() {
        return this.world;
    }

    public @NotNull LevelArea getArea() {
        return this.area;
    }

    public @NotNull String getName() {
        return this.name;
    }

}
