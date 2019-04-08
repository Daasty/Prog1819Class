package ut5.POO.fan.dam;

import ut5.POO.fan.dam.Speed;

public class Fan {
    private Speed speed = Speed.MEDIUM;
    private boolean on = false;
    private double radious = 5;
    private String color = "blue";

    public Fan(){ }


    //Getters

    public Speed getSpeed() {
        return speed;
    }

    public boolean isOn() {
        return on;
    }

    public double getRadious() {
        return radious;
    }

    public String getColor() {
        return color;
    }

    //Setters


    public void setSlow() {
        this.speed = Speed.SLOW;
    }

    public void setMedium() {
        this.speed = Speed.MEDIUM;
    }

    public void setHigh() {
        this.speed = Speed.HIGH;
    }

    public void setOn(boolean on) {
        this.on = on;
    }

    public void setRadious(double radious) {
        this.radious = radious;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "\nSPEED: "+speed+"\nPOWER: "+on+"\nRADIOUS: "+radious+"\nCOLOR: "+color;
    }
}