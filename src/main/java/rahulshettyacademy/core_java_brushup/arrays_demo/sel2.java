package rahulshettyacademy.core_java_brushup.arrays_demo;

public class sel2 {

    public static void main(String[] args) {

        int[] a = {2,5,8,7,4};
        int desiredNumber = 7;
        int sum = 0;

        for(int i = 0; i < a.length; i++){

            if(desiredNumber == a[i]){
                System.out.println("Index of "+desiredNumber+" is "+i);
            }

            sum += a[i];
        }

        System.out.println("sum = "+sum);


    }

}
