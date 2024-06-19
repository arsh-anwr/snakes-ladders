package org.example.resource.entities.player;

import java.util.ArrayList;
import java.util.List;

public class Players {
    List<PlayerInfo> playerInfoList;
    int turn;

    public Players() {
        playerInfoList = new ArrayList<PlayerInfo>();
        turn = 0;
    }

    public boolean addPlayer(PlayerInfo playerInfo) {
        if (playerInfo.getPlayerName() == null || playerInfo.getPlayerName().isEmpty()) {
            return false;
        }

        if (playerInfo.getPosition() != 0) {
            return false;
        }

        playerInfoList.add(playerInfo);
        return true;
    }

    public PlayerInfo getPlayerTurn() {
        return playerInfoList.get(turn % playerInfoList.size());
    }

    public void setNextTurn() {
        if (turn + 1 == playerInfoList.size()) {
            turn = 0;
            return;
        }
        turn+=1;
    }

    public int savePlayerPosition(int diceNumber, int playerNewPosition) {

        PlayerInfo playerInfo = playerInfoList.get(turn);

        System.out.println(playerInfo.getPlayerName() + " rolled a "+ diceNumber + " and moved from "+  playerInfo.getPosition() + " to "+ playerNewPosition);

        playerInfo.setPosition(playerNewPosition);

        return playerInfo.getPosition();
    }


}
