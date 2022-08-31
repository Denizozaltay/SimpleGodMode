package me.denizozaltay.simplegodmode;

import me.denizozaltay.simplegodmode.commands.God;
import org.bukkit.plugin.java.JavaPlugin;

public final class SimpleGodMode extends JavaPlugin {

    @Override
    public void onEnable() {

        getCommand("god").setExecutor(new God());
    }
}
