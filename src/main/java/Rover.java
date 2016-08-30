import java.awt.*;

/**
 * Created by pol on 30/08/16.
 */
public class Rover {
    private Point position;
    private Direction direction;

    public Rover(Point position, Direction direction) {
        this.position = position;
        this.direction = direction;
    }

    public Point getPosition() {
        return position;
    }

    public Direction getDirection() {
        return direction;
    }

    public void send(char commandChar) {
        Command command = Command.fromOrder(commandChar);

        position = command.getNewPosition(position, direction);
        direction = command.getNewDirection(direction);
    }
}
