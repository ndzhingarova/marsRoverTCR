package rover;

import java.util.Arrays;
import java.util.List;

public class Rover {

    public static final List<String> CLOCKWISE = Arrays.asList("N", "E", "S", "W");
    private String direction;

    public Rover(String direction) {

        this.direction = direction;
    }

    public String getDirection() {
        return this.direction;
    }

    public void go(String command) {
        if ("L".equals(command)) {
            turn(Arrays.asList("N","W","S","E"));
        } else {
            turn(CLOCKWISE);
        }
    }

    private void turn(List<String> compass) {
        int index = compass.indexOf(this.direction);
        this.direction = compass.get((index + 1) % 4);
    }
}
