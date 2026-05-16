//abstracrt class cannot contain constructors
//abstract class cannot be instantiated
//abstract class can have abstract and non-abstract methods
//if a class contains at least one abstract method then the class must be declared as abstract
//it cannot have static methods
//method can only b einside an abstract class



// abstract class Test {
//     public Test() {
//         System.out.println("Constructor of Test");
//     }

//     public abstract void display();

//     void hello() {
//         System.out.println("Hello from Test");
//     }

//     static class abc extends Test {
//         public void display() {
//             System.out.println("Display method in abc");
//         }
//     }
// }

// public class Abstract {
//     public static void main(String[] args) {
//         Test.abc obj = new Test.abc();  
//         obj.display();
//         obj.hello();
//     }
// }



// abstract class A{
//     abstract void display();
// }
// class B extends A{
//     void display(){
//         System.out.println("Display method in B");
//     }
// }
// public class Abstract {
//     public static void main(String[] args) {
//         A obj = new B();
//         obj.display();
//     }
// }

// interface A {
//     void show();
// }

// interface B {
//     void display();
// }

// class Test implements A, B {

//     public void show() {
//         System.out.println("Show");
//     }

//     public void display() {
//         System.out.println("Display");
//     }
// }

// import java.util.*;

// abstract class Animal{
//     abstract void sound();
// } 

// class Dog extends Animal{
//     @Override
//     void sound(){
//         System.out.println("himanshu is a strict teacher");
//     }
// }
// public class  Abstract1{
//     public static void main(String[] args) {
//         Dog d= new Dog();
//         d.sound();
//     }
// }

import java.util.*;
abstract class Vehicle {

    abstract void start();

    void fuel() {
        System.out.println("Vehicle needs fuel");
    }
}

class Car extends Vehicle {

    @Override
    void start() {
        System.out.println("Car starts with key");
    }
}

public class Main {

    public static void main(String[] args) {

        Car c = new Car();
        c.fuel();
        c.start();

        
    }
}






