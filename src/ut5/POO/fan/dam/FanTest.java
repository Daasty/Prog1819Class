package ut5.POO.fan.dam;

import static ut5.POO.fan.dam.Speed.HIGH;
import static ut5.POO.fan.dam.Speed.MEDIUM;

public class FanTest {
    public static void main(String[] args) {
        Fan ff1 = new Fan();
        Fan ff2 = new Fan();

        ff1.setHigh();
        ff1.setRadious(10);
        ff1.setColor("yellow");
        ff1.setOn(true);

        ff2.setMedium();
        ff2.setRadious(5);
        ff2.setColor("blue");
        ff2.setOn(false);

        System.out.println("ff1 > " + ff1);
        System.out.println("ff2 > " + ff2);
    }
}
