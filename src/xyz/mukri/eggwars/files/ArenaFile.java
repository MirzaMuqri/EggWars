package xyz.mukri.eggwars.files;

import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.configuration.file.YamlConfiguration;
import xyz.mukri.eggwars.Core;

import java.io.File;
import java.io.IOException;

public class ArenaFile {

    File file;
    FileConfiguration config;

    public ArenaFile() {
        file = new File(Core.getInstance().getDataFolder(), "arena.yml");
        config = YamlConfiguration.loadConfiguration(file);
    }

    public boolean isFileExists() {
        return file.exists();
    }

    public void save() {
        try {
            config.save(file);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void createNewFile() {

    }

    public void addNewArena() {

    }

}
