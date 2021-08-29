package rover;

public class Rover {
    private String direction;

    public Rover(String direction) {

        this.direction = direction;
    }

    public String getDirection() {
        return this.direction;
    }

    public void go(String command) {
        if (this.direction.equals("N")) {
            this.direction = "E";
        } else if (this.direction.equals("E")){
            this.direction = "S";
        } else {
            this.direction = "W";
        }
    }
}
