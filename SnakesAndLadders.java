package org.example.resource;

import org.example.resource.entities.board.Board;

public class SnakesAndLadders {

    public static void main(String[] args) {
        Board board = new Board();

        // Add snakes
        board.addSnake(62, 5);
        board.addSnake(33, 6);
        board.addSnake(49, 9);
        board.addSnake(88, 16);
        board.addSnake(41, 20);
        board.addSnake(56, 53);
        board.addSnake(98, 64);
        board.addSnake(93, 73);
        board.addSnake(95, 75);

        // Add ladders
        board.addLadder(2, 37);
        board.addLadder(27, 46);
        board.addLadder(10, 32);
        board.addLadder(51, 68);
        board.addLadder(61, 79);
        board.addLadder(65, 84);
        board.addLadder(71, 91);
        board.addLadder(81, 100);

        // Add players
        board.addPlayers("LUBNA");
        board.addPlayers("ARSHAD");

        // Start Game
        board.startGame();
    }
}
