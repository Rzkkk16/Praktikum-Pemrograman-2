package module3.problem1;

import java.util.Random;

public class Dice {
    private int number;

    public Dice() {
        number = rollNumber();
    }

    private int rollNumber() {
        Random r = new Random();
        int random = r.nextInt(6) + 1;
        return random;
    }

    public int getNumber() {
        return number;
    }
}
