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
}