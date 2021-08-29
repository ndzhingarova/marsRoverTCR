package rover;

import java.util.Arrays;
import java.util.List;

public class Rover {
    private static List<String> compass = Arrays.asList("N", "E", "S", "W");

    private String direction;

    public Rover(String direction) {

        this.direction = direction;
    }

    public String getDirection() {
        return this.direction;
    }

    public void go(String command) {
        int index = compass.indexOf(this.direction);
        String newDirection = compass.get(index + 1);
        this.direction = newDirection;

    }
}
