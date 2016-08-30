import java.awt.*;

/**
 * Created by pol on 30/08/16.
 */
public class RoverState {
    private final Point point;
    private final Direction direction;

    public RoverState(Point point, Direction direction) {
        this.point = point;
        this.direction = direction;
    }

    public Point getPoint() {
        return point;
    }

    public Direction getDirection() {
        return direction;
    }
}
