package rahulshettyacademy.core_java_brushup;

import java.util.ArrayList;

public class CoreJavaBrushUp2 {

    public static void main(String[] args) {

        ArrayList<String> departments = new ArrayList<String>();
        departments.add("Agriculture");
        departments.add("Transportation");
        departments.add("Foreign Affairs");

        for(int i = 0 ; i < departments.size(); i++){
            System.out.println(departments.get(i));
        }

        departments.remove(0);

        System.out.println(departments.get(0));
        System.out.println(departments.get(1));

    }

}
