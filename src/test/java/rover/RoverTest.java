package rover;

import junitparams.JUnitParamsRunner;
import junitparams.Parameters;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(JUnitParamsRunner.class)
public class RoverTest {

    @Test
    @Parameters({
            "N,E",
            "E,S",
            "S,W",
            "W,N"
    })
    public void turnRight(String initialDirection, String resultDirection) {
        Rover rover = new Rover(initialDirection, 10, 10);
        rover.go("R");

        Assert.assertEquals(resultDirection, rover.getDirection());
    }

    @Test
    @Parameters({
            "N,W",
            "W,S",
            "S,E",
            "E,N"
    })
    public void turnLeft(String initialDirection, String resultDirection) {
        Rover rover = new Rover(initialDirection, 10, 10);
        rover.go("L");

        Assert.assertEquals(resultDirection, rover.getDirection());
    }

    @Test
    public void moveForwardNorth() {
        Rover rover = new Rover("N", 10, 10);
        rover.go("F");

        Assert.assertEquals(10, rover.getPositionX());
        Assert.assertEquals(11, rover.getPositionY());
    }
}
