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
        if ("L".equals(command)) {
            this.direction = "W";
        } else {
            int index = compass.indexOf(this.direction);
            this.direction = compass.get((index + 1) % 4);
        }
    }
}
