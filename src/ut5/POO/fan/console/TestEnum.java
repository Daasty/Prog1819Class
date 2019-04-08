package ut5.POO.fan.console;

import ut5.POO.fan.dam.Speed;

public class TestEnum {
    public static void main(String[] args) {

        System.out.println("Velocidades:");

        for(Speed vel: Speed.values()) {
            System.out.println("Speed: "+vel);
            System.out.println("Position: "+vel.ordinal());
            System.out.println("prueba");
        }
    }
}
