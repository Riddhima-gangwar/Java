import java.util.*;

public class Superkeyword {
    int age = 18; 

    public static void main(String1[] args) {
        Superkeyword obj = new Superkeyword();
        Child c = obj.new Child(); 
        c.show();
    }
    class Child extends Superkeyword {
        int age = 21;

        void show() {
            System.out.println("Child class age: " + age);
            System.out.println("Parent class age: " + super.age);
        }
    }
}