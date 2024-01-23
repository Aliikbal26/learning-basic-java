public class MethodOverloading {
    public static void main(String[] args) {
        sayHello();
        sayHello("Ali");
        sayHello("Ali", " Ikbal");

    }

    static void sayHello() {

    }

    static void sayHello(String firstName) {
        System.out.println("Hello " + firstName);
    }

    static void sayHello(String firstName, String lastName) {
        System.out.println("Hello " + firstName + " " + lastName);
    }
}
