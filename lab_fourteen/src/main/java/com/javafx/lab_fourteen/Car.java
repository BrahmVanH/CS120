// Name: Brahm Van Houzen
// Resources: Na

public class Car {
    private double speed;
    private int wheelPosition;

    public void accelerate(double amount) {
        speed += amount;
        if (speed > 0) {
            return;
        } else {
            speed = 0;
        }
    }

    public double getSpeed() {
        return speed;
    }

    public int getWheelPosition() {
        return wheelPosition;
    }

    public void turnMoreLeft() {
        wheelPosition -= 1;
        if (wheelPosition < -10) {
            wheelPosition = -10;
        } else {
            return;
        }
    }

    public void turnMoreRight() {
        wheelPosition += 1;
        if (wheelPosition > 10) {
            wheelPosition = 10;
        } else {
            return;
        }
    }


}