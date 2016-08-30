import java.awt.*;

/**
 * Created by pol on 30/08/16.
 */
public enum Command {
    f("forward") {
        @Override
        public RoverState getNewState(final RoverState roverState) {
            Direction direction = roverState.getDirection();
            return new RoverState(direction.moveForward(roverState.getPoint()), direction);
        }
    },
    b("backward") {
        @Override
        public RoverState getNewState(final RoverState roverState) {
            Direction direction = roverState.getDirection();
            return new RoverState(direction.moveBackward(roverState.getPoint()), direction);
        }
    },
    r("right") {
        @Override
        public RoverState getNewState(final RoverState roverState) {
            return new RoverState(roverState.getPoint(), roverState.getDirection().turnRight());
        }
    },
    l("left") {
        @Override
        public RoverState getNewState(final RoverState roverState) {
            return new RoverState(roverState.getPoint(), roverState.getDirection().turnLeft());
        }
    };

    Command(String name) {
    }

    public abstract RoverState getNewState(final RoverState roverState);
}
