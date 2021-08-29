package rover;

import java.util.Arrays;
import java.util.List;

public class Rover {

    public static final List<String> CLOCKWISE = Arrays.asList("N", "E", "S", "W");
    public static final List<String> COUNTER_CLOCKWISE = Arrays.asList("N", "W", "S", "E");
    private String direction;
    private int positionX;
    private int positionY;

    public Rover(String direction, int positionX, int positionY) {

        this.direction = direction;
        this.positionX = positionX;
        this.positionY = positionY;
    }

    public String getDirection() {
        return this.direction;
    }

    public void go(String command) {
        if ("L".equals(command)) {
            turn(COUNTER_CLOCKWISE);
        } else if ("R".equals(command)){
            turn(CLOCKWISE);
        } else {
            if (this.direction.equals("N")) {
                this.positionY++;
            } else {
                this.positionX++;
            }
        }
    }

    private void turn(List<String> compass) {
        int index = compass.indexOf(this.direction);
        this.direction = compass.get((index + 1) % 4);
    }

    public int getPositionX() {
        return this.positionX;
    }

    public int getPositionY() {
        return this.positionY;
    }
}
