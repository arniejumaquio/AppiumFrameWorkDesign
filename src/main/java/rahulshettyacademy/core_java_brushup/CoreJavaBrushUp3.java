package rahulshettyacademy.core_java_brushup;

public class CoreJavaBrushUp3 {

    public static void main(String[] args) {

        String academyName = "Rahul Shetty Academy";
        String[] splittedStr = academyName.split("Shetty");
        for(String str:splittedStr){
            str = str.trim();
            System.out.println(str);
        }

        //loop the string
        for(int index = academyName.length()-1 ; index > -1 ; index--){
           char eachCharacter = academyName.charAt(index);
           System.out.println(eachCharacter);

        }

    }


}
