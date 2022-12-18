package io.github.esoccoli;

import org.bukkit.plugin.java.JavaPlugin;

public class NewUHC extends JavaPlugin
{
    @Override
    public void onEnable() {
        // Plugin startup logic
        getLogger().info("NewUHC has been enabled!");
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
        getLogger().info("NewUHC has been disabled!");
    }
}
