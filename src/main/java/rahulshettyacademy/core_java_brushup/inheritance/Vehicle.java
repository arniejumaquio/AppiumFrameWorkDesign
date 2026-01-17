package rahulshettyacademy.core_java_brushup.inheritance;

public class Vehicle {

    private String color;

    Vehicle(String color,int numberOfWheels,int numberOfDoors,boolean isElectric){
        this.color = color;
        this.numberOfWheels = numberOfWheels;
        this.numberOfDoors = numberOfDoors;
        this.isElectric = isElectric;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getNumberOfWheels() {
        return numberOfWheels;
    }

    public void setNumberOfWheels(int numberOfWheels) {
        this.numberOfWheels = numberOfWheels;
    }

    public int getNumberOfDoors() {
        return numberOfDoors;
    }

    public void setNumberOfDoors(int numberOfDoors) {
        this.numberOfDoors = numberOfDoors;
    }

    public boolean isElectric() {
        return isElectric;
    }

    public void setElectric(boolean electric) {
        isElectric = electric;
    }

    private int numberOfWheels;
    private int numberOfDoors;
    private boolean isElectric;





}
