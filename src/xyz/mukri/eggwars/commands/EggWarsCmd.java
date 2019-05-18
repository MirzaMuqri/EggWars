package xyz.mukri.eggwars.commands;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class EggWarsCmd implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {

        if (!(sender instanceof Player)) {
            sender.sendMessage("You must be a player to perform this commands.");
            return false;
        }

        Player p = (Player) sender;

        if (cmd.getName().equalsIgnoreCase("eggwars")) {

            // /EGGWARS
            if (args.length == 0) {

            }

            // /EGGWARS [ARGS]
            else if (args.length == 1) {

            }

            // /EGGWARS [ARGS] [ARGS]
            else if (args.length == 2) {

            }

            // /EGGWARS
            else  {
                p.performCommand("eggwars");
            }

        }

        return false;
    }
}
