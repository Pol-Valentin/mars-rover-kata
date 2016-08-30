/**
 * Created by pol on 30/08/16.
 */
public class Rover {
    private final int positionY;
    private final int positionX;

    public Rover(int positionX, int positionY) {
        this.positionX = positionX;
        this.positionY = positionY;
    }

    public int getPositionY() {
        return positionY;
    }

    public int getPositionX() {
        return positionX;
    }
}
