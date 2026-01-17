package rahulshettyacademy.core_java_brushup;

public class CoreJavaBrushUp {

    public static void main(String[] args){

        String firstName = "FirstName";
        char letter = 'B';
        int number = 100;
        double celsius = 39.59;

        System.out.println(firstName);
        System.out.println(letter);
        System.out.println(number);
        System.out.println("celsius "+celsius);

        String[] departments = new String[5];
        departments[0] = "HR";
        departments[1] = "Accounting";
        departments[2] = "IT";
        departments[3] = "Legal";
        departments[4] = "Risk";

        for(int index = 0; index < departments.length; index++){
            System.out.println(departments[index]);
        }

        int[] favoriteNumbers = {1,2,3,4,5};
        for(int eachNumber:favoriteNumbers){
            System.out.println(eachNumber);
        }


        int[] numbers = {78,45,37,89,11,12,90,888,1000};
        for(int eachNumber:numbers){

            if(eachNumber % 2 == 0){
                System.out.println(eachNumber);
            }else {
                System.out.println(eachNumber+" is not multiple of 2");
            }

        }


    }

}
