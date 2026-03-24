//abstracrt class cannot contain constructors
//abstract class cannot be instantiated
//abstract class can have abstract and non-abstract methods
//if a class contains at least one abstract method then the class must be declared as abstract
//it cannot have static methods
//method can only b einside an abstract class



abstract class Test {
    public Test() {
        System.out.println("Constructor of Test");
    }
    public abstract void display();
    void hello() {
        System.out.println("Hello from Test");
    }   
    class abc extends Test {
        public void display() {
            System.out.println("Display method in abc");
        }
    }
}
public class Abstract {

    public static void main(String[] args) {
       
    }
}


//interface as a blueprint of a class
//every func in an interface is public and abstract by default
//in this each variable is treated as a constant/final by default
//final  method cannot override
//a final class cannot be inherited in child class


