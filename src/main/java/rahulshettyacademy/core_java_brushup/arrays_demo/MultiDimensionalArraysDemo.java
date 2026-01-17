package rahulshettyacademy.core_java_brushup.arrays_demo;

public class MultiDimensionalArraysDemo {

    public static void main(String[] args) {

        int[][] numbers = new int[2][3];


        //initialize the array
        numbers[0][0] = 2;
        numbers[0][1] = 1;
        numbers[0][2] = 100;
        numbers[1][0] = 3;
        numbers[1][1] = 4;
        numbers[1][2] = 7;

        int maximumNumber = numbers[0][0];
        for(int row = 0; row < 2; row++){

            for(int column = 0; column < 3; column++){

               if(numbers[row][column] > maximumNumber){
                   maximumNumber = numbers[row][column];
               }


            }


        }


        System.out.println("Maximum number "+maximumNumber);

        int[][] numbersTwo ={{2,4,5},{3,4,7}};
        for(int i =0; i < 2; i++){

            for(int j =0; j < 3; j++){
                System.out.print(numbersTwo[i][j]+"\t");
            }

            System.out.println();
        }

    }

}
