package rahulshettyacademy.core_java_brushup.inheritance;

public class Census extends Address{

    Census(String street,String city,String province,String country,String zipCode){
        super(street,city,province,country,zipCode);
    }

    public void displayDetails(){
        System.out.println("Street :"+getStreet());
        System.out.println("City :"+getCity());
        System.out.println("Province :"+getProvince());
        System.out.println("Country :"+getCountry());
        System.out.println("Zip Code :"+getZipCode());
    }

    public static void main(String[] args) {

      Census address = new Census("123 Main","Paombong","Bulacan","Philippines","12345");
        System.out.println(address.getCity());
        System.out.println(address.getProvince());
        System.out.println(address.getCountry());
        System.out.println(address.getStreet());
        System.out.println(address.getZipCode());

        address.displayDetails();

    }


}
