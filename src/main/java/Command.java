import java.awt.*;

import static java.util.Arrays.stream;

/**
 * Created by pol on 30/08/16.
 */
public enum Command {
    FORWARD('f') {
        @Override
        public Point getNewPosition(final Point point, final Direction direction) {
            return direction.moveForward(point);
        }

        @Override
        public Direction getNewDirection(final Direction direction) {
            return direction;
        }
    },
    BACKWARD('b') {
        @Override
        public Point getNewPosition(final Point point, final Direction direction) {
            return direction.moveBackward(point);
        }

        @Override
        public Direction getNewDirection(final Direction direction) {
            return direction;
        }
    },
    RIGHT('r') {
        @Override
        public Point getNewPosition(final Point point, final Direction direction) {
            return point;
        }

        @Override
        public Direction getNewDirection(final Direction direction) {
            return direction.turnRight();
        }
    },
    LEFT('l') {
        @Override
        public Point getNewPosition(final Point point, final Direction direction) {
            return point;
        }

        @Override
        public Direction getNewDirection(final Direction direction) {
            return direction.turnLeft();
        }
    };

    public final char order;

    Command(char order) {
        this.order = order;
    }

    public static Command fromOrder(char order) {
        try {
            return stream(Command.values()).filter(x -> x.order == order).findFirst().get();
        } catch (RuntimeException exception) {
            throw new IllegalArgumentException("Unkown order '" + order + "'");
        }
    }

    public abstract Point getNewPosition(Point point, Direction direction);

    public abstract Direction getNewDirection(Direction direction);

}
