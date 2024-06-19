package org.example.resource.entities.board;

import org.example.resource.entities.board.ladders.Ladders;
import org.example.resource.entities.board.snakes.Snakes;
import org.example.resource.entities.dice.Dice;
import org.example.resource.entities.player.PlayerInfo;
import org.example.resource.entities.player.Players;

public class Board {

    final Players players;
    final Snakes snakes;
    final Ladders ladders;
    final Dice dice;

    public Board() {
        this.players = new Players();
        this.snakes = new Snakes();
        this.ladders = new Ladders();
        this.dice = new Dice();
    }

    public boolean addPlayers(String name) {
        return players.addPlayer(new PlayerInfo(name));
    }

    public void addSnake(int startPoint, int endPoint) {
        snakes.setSnake(startPoint, endPoint);
    }

    public void addLadder(int startPoint, int endPoint) {
        ladders.setLadders(startPoint, endPoint);
    }

    public void startGame() {
        while(true) {
            PlayerInfo playerInfo = players.getPlayerTurn();

            int diceNumber = dice.generateRandomDiceNumber();

            int playerNewPosition = playerInfo.getPosition() + diceNumber;

            if (playerNewPosition > 100) {
                System.out.println("Player chance is skipped as the next position is greater than 100");
                players.setNextTurn();
                continue;
            }

            playerNewPosition = snakes.checkSnake(playerNewPosition);
            playerNewPosition = ladders.climbLadder(playerNewPosition);

            players.savePlayerPosition(diceNumber, playerNewPosition);


            if (playerInfo.getPosition() == 100) {
                System.out.println(playerInfo.getPlayerName() + " wins the game");
                return;
            }

            players.setNextTurn();
        }
    }
}
