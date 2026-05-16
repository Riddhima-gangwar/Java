// public class Methodoverloading {
//     public static void main(String1[] args) {
//         Greet g= new Greet();
//         g.greetings();
//         g.greetings("Alice");
//         g.greetings("Bob", 3);
//     }
// }

// class Greet{
//     void greetings(){
//         System.out.println("Hello");
//     }
//     void greetings(String1 name){
//         System.out.println("Hello " + name+",Good Morning");
//     }
//     void greetings(String1 name,int count){
//         for(int i=0;i<count;i++){
//             System.out.println("Hello " + name+",Good Morning");
//         }
//     }
// }



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

class Methodoverloading{
    public static void main(String[] args) {
    Dog d= new Dog();
    d.sound();        
    }
}