package rahulshettyacademy.core_java_brushup.arrays_demo;

public class ArraysDemo {

    public static void main(String[] args) {

        int[] numbers = new int[5]; //allocate memory(heap) for the arrray
        //initialize the array
        numbers[0] = 99;
        numbers[1] = 88;
        numbers[2] = 77;
        numbers[3] = 66;
        numbers[4] = 55;
        System.out.println(numbers[2]);

        int[] numbersTwo = {56,78,34,12,10,8};
        System.out.println(numbersTwo[2]);


    }

}
