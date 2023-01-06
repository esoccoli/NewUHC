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
        }
        switch (args[0].toLowerCase())
        {
            case "start", "stop" -> sender.sendMessage(args[0].substring(0, 1).toUpperCase() + args[0].toLowerCase().substring(1) + "ing UHC...");

            case "join", "leave" -> sender.sendMessage(sender instanceof Player ?
                    args[0].substring(0, 1).toUpperCase() + args[0].toLowerCase().substring(1) + "ing UHC..."
                    : "You must be a player to " + args[0].toLowerCase() + " a UHC!");

            case "help" -> sender.sendMessage("Help: \n" +
                            "/uhc start - Starts the UHC\n" +
                            "/uhc stop - Stops the UHC\n" +
                            "/uhc reload - Reloads the UHC\n" +
                            "/uhc help - Shows this help message");

            default -> sender.sendMessage("Usage: /uhc <start|stop|join|leave|help>");
        }
        return true;
    }
}

