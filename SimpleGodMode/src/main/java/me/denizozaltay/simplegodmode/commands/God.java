package me.denizozaltay.simplegodmode.commands;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class God implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {

        if (sender instanceof Player){

            Player player = (Player) sender;

            if (player.hasPermission("simplegodmode.god")){

                if (player.isInvulnerable()){

                    player.setInvulnerable(false);
                    player.sendMessage(ChatColor.RED + "God mode disabled.");
                }else{

                    player.setInvulnerable(true);
                    player.sendMessage(ChatColor.GREEN + "God mode enabled.");
                }
            }else{
                player.sendMessage(ChatColor.RED + "You can't use this command.");
            }
        }else{

            Bukkit.getServer().getConsoleSender().sendMessage("Only players can use this command.");
        }

        return true;
    }
}
