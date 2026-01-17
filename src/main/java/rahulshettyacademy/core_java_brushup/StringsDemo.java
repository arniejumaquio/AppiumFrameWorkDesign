package rahulshettyacademy.core_java_brushup;

public class StringsDemo {

    public static void main(String[] args) {


        String sampleMsg = "This is a string";
        char sixtPosChar = sampleMsg.charAt(6);
        System.out.println(sixtPosChar);

       int indexOfA = sampleMsg.indexOf("a");
        System.out.println(indexOfA);

       String subOfSampleMsg = sampleMsg.substring(8);
        System.out.println(subOfSampleMsg);

    }

}
