import java.awt.*;

public enum Direction {
    NORTH {
        @Override
        public Point moveForward(final Point point) {
            return new Point(point.x, point.y + 1);
        }

        @Override
        public Point moveBackward(Point point) {
            return new Point(point.x, point.y - 1);
        }

        @Override
        public Direction turnLeft() {
            return Direction.WEST;
        }

        @Override
        public Direction turnRight() {
            return Direction.EAST;
        }
    },
    SOUTH {
        @Override
        public Point moveForward(final Point point) {
            return new Point(point.x, point.y - 1);
        }

        @Override
        public Point moveBackward(Point point) {
            return new Point(point.x, point.y + 1);
        }

        @Override
        public Direction turnLeft() {
            return Direction.EAST;
        }

        @Override
        public Direction turnRight() {
            return Direction.WEST;
        }
    },
    EAST {
        @Override
        public Point moveForward(final Point point) {
            return new Point(point.x + 1, point.y);
        }

        @Override
        public Point moveBackward(Point point) {
            return new Point(point.x - 1, point.y);
        }

        @Override
        public Direction turnLeft() {
            return Direction.NORTH;
        }

        @Override
        public Direction turnRight() {
            return Direction.SOUTH;
        }
    },
    WEST {
        @Override
        public Point moveForward(final Point point) {
            return new Point(point.x - 1, point.y);
        }

        @Override
        public Point moveBackward(Point point) {
            return new Point(point.x + 1, point.y);
        }

        @Override
        public Direction turnLeft() {
            return Direction.SOUTH;
        }

        @Override
        public Direction turnRight() {
            return Direction.NORTH;
        }
    };

    public abstract Point moveForward(final Point point);

    public abstract Point moveBackward(final Point point);

    public abstract Direction turnLeft();

    public abstract Direction turnRight();
}
