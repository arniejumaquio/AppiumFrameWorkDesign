package rahulshettyacademy.core_java_brushup.inheritance;

public class Portfolio extends Census{

    Portfolio(String street,String city,String province,String country,String zipCode){
        super(street,city,province,country,zipCode);
    }


    public static void main(String[] args) {

        Portfolio portfolio = new Portfolio("Street 1","Test City","Test Province","Test Country","1234");
        portfolio.displayDetails();

    }

}
