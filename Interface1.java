// import java.util.*;
// interface Animal{
//     void sound();
// }
// class Dog implements Animal{
//     @Override
//     public void sound(){
//         System.out.println("hello");
//     }
// }
// public class Interface1 {
//  public static void main(String[] args) {
//     Dog d=new Dog();
//     d.sound();
//  }   
// }



//multiple inheritance using interface
// interface A {

//     void show();
// }

// interface B {

//     void display();
// }

// class Test implements A, B {

//     public void show() {
//         System.out.println("Show method");
//     }

//     public void display() {
//         System.out.println("Display method");
//     }
// }

// public class Interface {

//     public static void main(String[] args) {

//         Test t = new Test();

//         t.show();

//         t.display();
//     }
// }




//default 
// interface Animal {

//     default void sleep() {
//         System.out.println("Animal is sleeping");
//     }
// }

// class Dog implements Animal {

// }

// public class Main {

//     public static void main(String[] args) {

//         Dog d = new Dog();

//         d.sleep();
//     }
// }





//static : Static method in interface
interface Demo {

    static void display() {
        System.out.println("Static method in interface");
    }
}

public class Interface1 {

    public static void main(String[] args) {

        Demo.display();
    }
}