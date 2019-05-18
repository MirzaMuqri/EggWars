package xyz.mukri.eggwars.arena;

import org.bukkit.Location;

import java.util.List;

public class Arena {

    private String arenaName;

    private int maxPlayers;
    private int minPlayers;
    private int winningScore;

    private List<Location> spawnPoints;
    private Location lobbyLocation;
    private Location hubLocation;

    public Arena(String arenaName, int maxPlayers, int minPlayers, int winningScore, List<Location> spawnPoints, Location lobbyLocation, Location hubLocation) {

        this.arenaName = arenaName;

        this.maxPlayers = maxPlayers;
        this.minPlayers = minPlayers;
        this.winningScore = winningScore;

        this.spawnPoints = spawnPoints;
        this.lobbyLocation = lobbyLocation;
        this.hubLocation = hubLocation;

    }

    // SETTER
    public void setArenaName(String arenaName) {
        this.arenaName = arenaName;
    }

    public void setMaxPlayers(int maxPlayers) {
        this.maxPlayers = maxPlayers;
    }

    public void setMinPlayers(int minPlayers) {
        this.minPlayers = minPlayers;
    }

    public void setWinningScore(int winningScore) {
        this.winningScore = winningScore;
    }

    public void setSpawnPoints(List<Location> spawnPoints) {
        this.spawnPoints = spawnPoints;
    }

    public void setLobbyLocation(Location lobbyLocation) {
        this.lobbyLocation = lobbyLocation;
    }

    public void setHubLocation(Location hubLocation) {
        this.hubLocation = hubLocation;
    }


    // GETTER
    public String getArenaName() {
        return arenaName;
    }

    public int getMaxPlayers() {
        return maxPlayers;
    }

    public int getMinPlayers() {
        return minPlayers;
    }

    public int getWinningScore() {
        return winningScore;
    }

    public List<Location> getSpawnPoints() {
        return spawnPoints;
    }

    public Location getLobbyLocation() {
        return lobbyLocation;
    }

    public Location getHubLocation() {
        return hubLocation;
    }
}
