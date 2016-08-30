import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by pol on 30/08/16.
 */
public class RoverTest {

    private Rover SUT;

    @Before
    public void before() {
    }

    @Test
    public void it_should_be_initialized_at_a_position() {
        SUT = new Rover(10, 5);
        assertEquals(10, SUT.getPositionX());
        assertEquals(5, SUT.getPositionY());
    }

}