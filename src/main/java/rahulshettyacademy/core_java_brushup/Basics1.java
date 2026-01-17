package rahulshettyacademy.core_java_brushup;

public class Basics1 {

    public static void main(String[] args){


        System.out.println("I started learning Java.");

        int firstNumber = 200;
        int secondNumber = 999;
        int total;
        total = firstNumber + secondNumber;

        System.out.println(firstNumber+" + "+secondNumber+" = "+total);

        System.out.println("-----creating object ----");

        Basics2 basics2 = new Basics2();
        Status status =  basics2.validateHeader();
        System.out.println(status);


    }

}
