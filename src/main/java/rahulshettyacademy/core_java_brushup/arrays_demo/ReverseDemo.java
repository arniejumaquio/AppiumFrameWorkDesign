package rahulshettyacademy.core_java_brushup.arrays_demo;

public class ReverseDemo {

    public static void main(String[] args) {

        String name = "ohayo";
        String reverseName ="";

        for(int i = name.length()-1; i > -1; i--){
           reverseName= reverseName.concat(String.valueOf(name.charAt(i)));

        }


        if(reverseName.equalsIgnoreCase(name)) {
            System.out.println("palindrome");
        }else {
            System.out.println("not palindrome");
        }



    }


}
