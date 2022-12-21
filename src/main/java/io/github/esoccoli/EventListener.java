package io.github.esoccoli;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.event.server.PluginEnableEvent;
import org.bukkit.event.server.ServerCommandEvent;

public class EventListener implements Listener
{
    @EventHandler
    public void onEnableEvent(PluginEnableEvent event)
    {
        // Plugin startup logic
        event.getPlugin().getLogger().info("NewUHC has been enabled!");
        event.getPlugin().getLogger().info("Use /help to see all commands! (NYI)");
    }
}
