package rahulshettyacademy.core_java_brushup.date_demo;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateDemo {

    public static void main(String[] args) {

        Date date = new Date();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("MM-dd-yy");
        SimpleDateFormat simpleDateFormat2 = new SimpleDateFormat("dd-MM-yyyy");

        System.out.println(simpleDateFormat.format(date));
        System.out.println(simpleDateFormat2.format(date));






    }


}
