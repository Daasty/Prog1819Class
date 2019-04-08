package ut5.POO.elevator;

public class Elevator { //Class > tipo

    //Fields : The object state > dato
    private int topFloor = 10; //Maximun floor number
    private int botFloor = -1; //Minimun floor number
    private int currentFloor = 0;
    private int capacity = 6; //Maximun riders capacity
    private int numRiders = 0;

    //Metodos > operacion
    //Constructor > operacion de sobrecarga
    public Elevator(int topFloor, int botFloor, int capacity) {
        this.topFloor = topFloor;
        this.botFloor = botFloor;
        this.capacity = capacity;
    }


    public Elevator(int topFloor, int botFloor) {
        this(topFloor, botFloor, 6);
    }


    //Sobrecarga
    public Elevator(int numberOfFloors) {
        this.topFloor = numberOfFloors;
        this.currentFloor = 0; //Starting Floor
        this.capacity = 6; //Standart Capacity
        this.numRiders = 0; //Initial Empty
    }

    //Mutators
    public void addRiders(int num) {
        if (this.numRiders + num <= this.capacity) {
            this.numRiders += num;
        } else {
            numRiders = capacity;
        }
    }

    public void removeRiders(int num) { //Comprueba la capacidad para que no se puedan sacar 30
        num = Math.abs(num);
        if (numRiders - num >= 0) {
            this.numRiders -= num;
        } else {
            this.numRiders = 0;
        }
    }

    public void removeAll() {
        this.numRiders = 0;
    }

    public void goUpOneFloor() {
        if (this.currentFloor < this.topFloor) {
            this.currentFloor++;
        }
    }

    public void goDownOneFloor() {
        if (this.currentFloor > this.botFloor) {
            this.currentFloor--;
        }
    }

    public boolean equals(Elevator other) {
        return this.topFloor == other.topFloor &&
                this.currentFloor == other.currentFloor &&
                this.capacity == other.capacity &&
                this.numRiders == other.numRiders;
    }

    //Getters

    public int getTopFloor() {
        return topFloor;
    }

    public int getBotFloor() {
        return botFloor;
    }

    public int getCapacity() {
        return capacity;
    }

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
        return "Current floor = " + currentFloor + ", Top floor = " + topFloor + ", Bot floor = " + botFloor + ", Number of riders = " + numRiders +
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



