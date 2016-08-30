import org.junit.Before;
import org.junit.Test;


import java.awt.*;

import static org.junit.Assert.*;

/**
 * Created by pol on 30/08/16.
 */
public class RoverTest {

    private Rover SUT;
    private Point position;
    private Direction direction;
    private Point expectedPosition;

    @Before
    public void before() {
    }

    @Test
    public void it_should_be_initialized_at_a_position_and_a_direction() {
        given_a_grid(50, 50);
        given_a_rover_at(10, 5, Direction.SOUTH);
        when_we_do_nothing();
        then_position_should_be(position);
        then_direction_should_be(direction);
    }

    private void given_a_grid(int maxX, int maxY) {
    }

    private void then_direction_should_be(Direction direction) {
        assertEquals(direction, SUT.getDirection());
    }

    private void then_position_should_be(Point position) {
        assertEquals(position, SUT.getPosition());
    }

    private void when_we_do_nothing() {

    }

    private void given_a_rover_at(int x, int y, Direction direction) {
        position = new Point(x, y);
        this.direction = direction;
        SUT = new Rover(position, this.direction);
    }

    @Test
    public void it_should_move_forward() {
        given_a_rover_at(10, 5, Direction.NORTH);
        when_we_send('f');
        given_expected_position(10, 6);
        then_position_should_be(expectedPosition);
    }

    @Test
    public void it_should_move_backward() {
        given_a_rover_at(10, 5, Direction.NORTH);
        when_we_send('b');
        given_expected_position(10, 4);
        then_position_should_be(expectedPosition);
    }

    @Test
    public void it_should_move_left() {
        given_a_rover_at(10, 5, Direction.NORTH);
        when_we_send('l', 'f');
        given_expected_position(9, 5);
        then_position_should_be(expectedPosition);
    }
    private void given_expected_position(int x, int y) {
        this.expectedPosition = new Point(x, y);
    }

    private void when_we_send(char... commandChars) {
        for (char commandChar : commandChars) {
            SUT.send(commandChar);
        }
    }
}