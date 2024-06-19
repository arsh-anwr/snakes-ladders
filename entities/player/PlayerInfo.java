package org.example.resource.entities.player;

public class PlayerInfo {
    String playerName;
    int position;

    public PlayerInfo(String playerName) {
        this.playerName = playerName;
        this.position = 0;
    }

    public String getPlayerName() {
        return playerName;
    }

    public void setPlayerName(String playerName) {
        this.playerName = playerName;
    }

    public int getPosition() {
        return position;
    }

    public void setPosition(int position) {
        this.position = position;
    }
}
