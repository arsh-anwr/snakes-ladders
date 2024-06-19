package org.example.resource.entities.board.ladders;

import java.util.HashMap;

public class Ladders {
    HashMap<Integer, Integer> ladders;

    public Ladders() {
        ladders = new HashMap<Integer, Integer>();
    }

    public void setLadders(int start, int end) {
        ladders.put(start, end);
    }

    public int climbLadder(int position) {
        if (ladders.containsKey(position)) {
            return ladders.get(position);
        }

        return position;
    }
}
