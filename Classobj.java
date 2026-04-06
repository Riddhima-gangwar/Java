public class Classobj {
    public static void main(String[] args) {
        Dog d1=new Dog();
        d1.name="Tommy";
        d1.age=5;

        Dog d2=new Dog();
        d2.name="Rex";
        d2.age=3;

        d1.walk();
        d1.bark();

        d2.walk();
        d2.bark();

        Complex c1=new Complex();
        c1.a=2;
        c1.b=3;
        c1.print();

    }
}
class Dog{
    String name;
    int age;
    String color;

    void walk(){
        System.out.println(name + " is walking");
    }
    void bark(){
        System.out.println(name + " is barking");
    }
}

class Complex{
    int a,b;
    void print(){
        System.out.println("The complex number is " + a + " + " + b + "i");
    }
}