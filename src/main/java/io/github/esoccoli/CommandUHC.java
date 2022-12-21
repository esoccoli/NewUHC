package io.github.esoccoli;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.jetbrains.annotations.NotNull;

public class CommandUHC implements CommandExecutor
{
    @Override
    public boolean onCommand (@NotNull CommandSender sender, @NotNull Command command, @NotNull String label, @NotNull String[] args)
    {
        if (args.length == 0)
        {
            sender.sendMessage("Usage: /uhc <start|stop|join|leave|help>");
            return true;
        }
        else if (args[0].equalsIgnoreCase("start"))
        {
            sender.sendMessage("Starting UHC...");
            return true;
        }
        else if (args[0].equalsIgnoreCase("stop"))
        {
            sender.sendMessage("Stopping UHC...");
            return true;
        }
        else if (args[0].equalsIgnoreCase("join"))
        {
            if (sender instanceof Player)
            {
                sender.sendMessage("Joining UHC...");
            }
            else
            {
                sender.sendMessage("You must be a player to join a UHC!");
            }
            return true;
        }
        else if (args[0].equalsIgnoreCase("leave"))
        {
            if (sender instanceof Player){
                sender.sendMessage("Leaving UHC...");
            }
            else
            {
                sender.sendMessage("You must be a player to leave a UHC!");
            }
            return true;
        }
        else if (args[0].equalsIgnoreCase(("help")))
        {
            sender.sendMessage("Help:");
            sender.sendMessage("/uhc start - Starts the UHC");
            sender.sendMessage("/uhc stop - Stops the UHC");
            sender.sendMessage("/uhc reload - Reloads the UHC");
            sender.sendMessage("/uhc help - Shows this help message");
            return true;
        }
        else
        {
            sender.sendMessage("Usage: /uhc <start|stop|join|leave|help>");
            return true;
        }
    }
}

