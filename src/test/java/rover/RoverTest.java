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
            "S,W"
    })
    public void turnRight(String initialDirection, String resultDirection) {
        Rover rover = new Rover(initialDirection);
        rover.go("R");

        Assert.assertEquals(resultDirection, rover.getDirection());
    }
}
