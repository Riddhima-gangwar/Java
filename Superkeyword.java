// import java.util.*;

// public class Superkeyword {
//     int age = 18; 

//     public static void main(String1[] args) {
//         Superkeyword obj = new Superkeyword();
//         Child c = obj.new Child(); 
//         c.show();
//     }
//     class Child extends Superkeyword {
//         int age = 21;

//         void show() {
//             System.out.println("Child class age: " + age);
//             System.out.println("Parent class age: " + super.age);
//         }
//     }
// }/





import java.util.*;
class Animal{
    void sound()
    {
        System.out.println("hello");
    }
}
class Dog extends Animal{
    void sound()
    {
        System.out.println("byee");
        super.sound();
    }
}
class Superkeyword
{
    public static void main(String[] args) {
        Dog d= new Dog();
        d.sound();
    }
}