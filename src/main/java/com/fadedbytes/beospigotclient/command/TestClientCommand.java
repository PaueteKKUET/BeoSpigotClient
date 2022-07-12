package com.fadedbytes.beospigotclient.command;

import com.fadedbytes.beospigotclient.BeoSpigotClient;
import org.bukkit.Location;
import org.bukkit.World;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.command.TabCompleter;
import org.bukkit.entity.Player;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.List;

public class TestClientCommand implements CommandExecutor, TabCompleter {
    @Override
    public boolean onCommand(@NotNull CommandSender sender, @NotNull Command command, @NotNull String label, @NotNull String[] args) {

        if (sender instanceof Player player) {

            switch (args.length) {
                case 0 -> player.sendMessage("It works :D");
                case 1 -> {
                    switch (args[0].toLowerCase()) {
                        case "start" -> startLevelAt(player.getLocation());
                    }
                }
            }
        } else {
            sender.sendMessage("Only players can use this command");
        }

        return true;
    }

    @Nullable
    @Override
    public List<String> onTabComplete(@NotNull CommandSender sender, @NotNull Command command, @NotNull String label, @NotNull String[] args) {
        return List.of();
    }

    private void startLevelAt(@NotNull Location loc) {
        closeLevelsAtWorld(loc.getWorld());
    }

    private void closeLevelsAtWorld(World world) {
        BeoSpigotClient.getLevelManager().closeLevelAt(world);
    }

}
