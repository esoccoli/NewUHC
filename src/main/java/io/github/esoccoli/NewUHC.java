package io.github.esoccoli;

import io.github.esoccoli.Items.ApprenticeHelmet;
import org.bukkit.command.PluginCommand;
import org.bukkit.plugin.java.JavaPlugin;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public class NewUHC extends JavaPlugin
{
    @Override
    public void onEnable() {
        // Plugin startup logic
        getLogger().info("NewUHC has been enabled!");
        getServer().getPluginManager().registerEvents(new EventListener(), this);
        this.getCommand("uhc").setExecutor(new UHCCommand());

        // Register all items
        ApprenticeHelmet.init();

    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
        getLogger().info("NewUHC has been disabled!");
    }

    public void onReload() {
        // Plugin reload logic
        getLogger().info("NewUHC has been reloaded!");
    }


}
