package rahulshettyacademy.core_java_brushup;

public class MethodsDemo {

    public static void main(String[] args) {

        MethodsDemo methodsDemo = new MethodsDemo();
        methodsDemo.displayGreeting();
        System.out.println(MethodsDemo.displayGreeting("Arvin"));

    }

    public void displayGreeting(){
        System.out.println("Hello World!");
    }

    public static String displayGreeting(String name){
       String greeting = "Hello! "+name;
       return greeting;
    }


}
