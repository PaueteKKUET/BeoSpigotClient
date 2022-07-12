package com.fadedbytes.beospigotclient;

import com.fadedbytes.beospigotclient.level.LevelManager;
import org.bukkit.plugin.java.JavaPlugin;

public final class BeoSpigotClient extends JavaPlugin {

    private static LevelManager levelManager;

    @Override
    public void onEnable() {
        levelManager = new LevelManager();
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }

    public static LevelManager getLevelManager() {
        return levelManager;
    }
}
