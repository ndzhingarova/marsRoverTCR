package rover;

import org.junit.Assert;
import org.junit.Test;

public class RoverTest {
    @Test
    public void turnRight() {
        Rover rover = new Rover("N");
        rover.go("R");

        Assert.assertEquals("E", rover.getDirection());
    }

    @Test
    public void turnRightEastToSouth() {
        Rover rover = new Rover("E");
        rover.go("R");

        Assert.assertEquals("S", rover.getDirection());
    }

    @Test
    public void turnRightSouthToWest() {
        Rover rover = new Rover("S");
        rover.go("R");

        Assert.assertEquals("W", rover.getDirection());
    }
}
