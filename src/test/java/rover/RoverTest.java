package rover;

import junitparams.JUnitParamsRunner;
import junitparams.Parameters;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(JUnitParamsRunner.class)
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

    @Test
    @Parameters({
            "N,E",
            "E,S",
            "S,W"
    })
    public void turnRightP(String initialDirection, String resultDirection) {
        Rover rover = new Rover(initialDirection);
        rover.go("R");

        Assert.assertEquals(resultDirection, rover.getDirection());
    }
}
