package xyz.mukri.eggwars.arena;

import xyz.mukri.eggwars.Core;

import java.util.ArrayList;
import java.util.List;

public class ArenaManager {

    public static ArenaManager arenaManager;
    public Core plugin;

    public List<Arena> arenas = new ArrayList<Arena>();

    public ArenaManager(Core plugin) {
        this.plugin = plugin;
    }

    public List<Arena> getAllArenas() {
        return this.arenas;
    }

}
