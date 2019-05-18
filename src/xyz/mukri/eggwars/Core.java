package xyz.mukri.eggwars;

import org.bukkit.plugin.java.JavaPlugin;

public class Core extends JavaPlugin {

    public static Core instance;

    @Override
    public void onEnable() {
        instance = this;

        registerListerners();
        registerCmd();

        getLogger().info("[EggWars] Successfully loaded the plugins.");
    }

    @Override
    public void onDisable() {

        getLogger().info("[EggWars] Successfully un-loaded the plugins.");
    }

    public void registerCmd() {

    }

    public void registerListerners() {

    }

    public static Core getInstance() {
        return instance;
    }
}
