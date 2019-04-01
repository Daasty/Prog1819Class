package ut5.POO.pdfClaseAle;

import com.sun.glass.ui.View;

public class Elevator {

    //Fields : The object state
    private int topFloor; //Maximun floor number
    private int currentFloor;
    private int capacity; //Maximun riders capacity
    private int numRiders;

    //Constructor
    public Elevator(int numberOfFloors, int maxRiders) {
        this.topFloor = numberOfFloors;
        this.currentFloor = 1; //Starting Floor
        this.capacity = maxRiders;
        this.numRiders = 0; //Initial empty
    }

    //Sobrecarga
    public Elevator(int numberOfFloors) {
        this.topFloor = numberOfFloors;
        this.currentFloor = 1; //Starting Floor
        this.capacity = 12; //Standart Capacity
        this.numRiders = 0; //Initial Empty
    }

    //Mutators
    public void addRiders(int numEntering) {
        if (numRiders + numEntering <= capacity) {
            numRiders += numEntering;
        }
        else {
            numRiders = capacity;
        }
    }

    public void goUpOneFloor() {
        if (currentFloor < topFloor) {
            currentFloor++;
        }
    }

    public boolean equals(Elevator other) {
        return this.topFloor == other.topFloor &&
                this.currentFloor == other.currentFloor &&
                this.capacity == other.capacity &&
                this.numRiders == other.numRiders;
    }

    //Getters

    public int getNumRiders() {
        return numRiders;
    }

    public int getCurrentFloor() {
        return currentFloor;
    }

    public int isFull() {
        return numRiders = capacity;
    }


    @Override
    public String toString() {
        return "Current floor = " + currentFloor + ", Top floor = " + topFloor + ", Number of riders = " + numRiders +
                ", Capacity = " + capacity;
    }

    public boolean equals(Object obj) {
        //Is null?
        if (obj == null) return false;
        //Are the same class?
        if (this.getClass() != obj.getClass()) return false;
        //Are they equals? Do they have the same values?
        Elevator other = (Elevator) obj;
        return this.topFloor == other.topFloor &&
                this.currentFloor == other.currentFloor &&
                this.capacity == other.capacity &&
                this.numRiders == other.numRiders;
    }
}



