import java.awt.*;

/**
 * Created by pol on 30/08/16.
 */
public class Rover {
    private RoverState roverState;

    public Rover(Point position, Direction direction) {
        this.roverState = new RoverState(position, direction);
    }

    public Point getPosition() {
        return roverState.getPoint();
    }

    public Direction getDirection() {
        return roverState.getDirection();
    }

    public void send(char order) {
        Command command = Command.valueOf(String.valueOf(order));

        roverState = command.getNewState(roverState);
    }
}
