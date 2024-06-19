package org.example.resource.entities.dice;

import java.util.Random;

public class Dice {
    Random random;

    public Dice() {
        random = new Random();
    }
    public int generateRandomDiceNumber() {
        return random.nextInt(6-1) + 1;
    }
}
