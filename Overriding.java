import java.util.*;
 
class Animal{
    void sound()
    {
        System.out.println("animals are saying byeeeeeee!!!!!!!");
    }
}
class Dog extends Animal{
    @Override
    void sound()
    {
        System.out.println("dog is barking");
    }
}

class Overriding{
    public static void main(String[] args) {
    Dog d= new Dog();
    d.sound();        
    }
}

//different classes same parameter runtime