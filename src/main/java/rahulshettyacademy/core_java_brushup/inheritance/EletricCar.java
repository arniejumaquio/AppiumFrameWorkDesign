package rahulshettyacademy.core_java_brushup.inheritance;

public class EletricCar extends Vehicle{


    EletricCar(String color,int numberOfWheels,int numberOfDoors,boolean isElectric){
        super(color, numberOfWheels, numberOfDoors, isElectric);
    }


    public void sensorActivated(){
        System.out.println("Sensor activated");
    }


    public static void main(String[] args) {


        EletricCar eletricCar = new EletricCar("Red",4,4,true);
        System.out.println(eletricCar.getColor());
        System.out.println(eletricCar.getNumberOfDoors());
        System.out.println(eletricCar.getNumberOfWheels());
        System.out.println(eletricCar.isElectric());

        eletricCar.sensorActivated();

        Vehicle traditionalCar = new EletricCar("Blue",4,4,false);
        System.out.println(traditionalCar.getColor());
        System.out.println(traditionalCar.getNumberOfDoors());
        System.out.println(traditionalCar.getNumberOfWheels());
        System.out.println(traditionalCar.isElectric());



    }

}
