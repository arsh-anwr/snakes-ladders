package org.example.resource.entities.board.snakes;

import java.util.HashMap;

public class Snakes {
    HashMap<Integer, Integer> snakes;

    public Snakes() {
        snakes = new HashMap<Integer, Integer>();
    }

    public void setSnake(int start, int end) {
        snakes.put(start, end);
    }

    public int checkSnake(int position) {
        if (snakes.containsKey(position)) {
            return snakes.get(position);
        }
        return position;
    }
}
