public class MethodOverloading {
    public static void main(String[] args) {

        sayHello();
        sayHello("Syifa");
        sayHello("Nursifa", "Septiani");
    }

    static void sayHello(){
        System.out.println("Hello");
    }

    static void sayHello(String name){
        System.out.println("Helo " + name);
    }

    static void sayHello(String firstname, String lastname){
        System.out.println("Hello " + firstname + " " + lastname);
    }
}
