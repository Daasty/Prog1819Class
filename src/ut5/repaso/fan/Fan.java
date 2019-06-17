package ut5.repaso.fan;

public class Fan {
    //Attrib
    private final int slow = 1, medium = 2, fast = 3;
    private int speed = 1;
    private boolean on = false;
    private double radius = 5;
    private String color = "blue";

    //Constructor
    public Fan() {

    }





    //Setters and Getters
    public int getSlow() {
        return slow;
    }

    public int getMedium() {
        return medium;
    }

    public int getFast() {
        return fast;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public boolean isOn() {
        return on;
    }

    public void setOn(boolean on) {
        this.on = on;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        if (on == true) {
            return "Fan{" +
                    ", speed=" + speed +
                    ", radius=" + radius +
                    ", color='" + color + '\'' +
                    '}';
        }
        else return "Fan{" +
                ", Fan is off" +
                ", radius=" + radius +
                ", color='" + color + '\'' +
                '}';

    }
}
