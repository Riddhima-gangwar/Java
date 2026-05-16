// class Animal{
//     void show(){
//         System.out.println("I am an animal");
//     }
// }
// class Hen extends Animal {
//     void  cock(){
//         System.out.println("I am a hen");
//     }
// }

// public class Inheritance {
//     public static void main(String1[] args) {
//         Hen ob = new Hen();
//         ob.show();
//         ob.cock(); // This would cause a compile-time error since cock() is not defined in the Animal class
//     }
// }


//single inheritance
// import java.util.*;

// class LPU{
//     void animal(){
//         System.out.println("Animal is eating");
//     }
// }

// class Hate extends LPU{
//     void UMS(){
//         System.out.println("UMS is eating");
//     }
// }


// public class Inheritance1 {
//     public static void main(String args[]){
//         Hate h= new Hate();
//         h.animal();
//         h.UMS();
//     }
// }




// multilevel inheritance
import java.util.*;

class Animal{
    void eat()
    {
        System.out.println("lpu is eating");
    }
}
class Dog extends Animal{
    void bark()
    {
        System.out.println("dog is barking");
    }
}
class Puppy extends Dog{
    void weep()
    {
        System.out.println("puppy is saying hello");
    }
}
class Inheritance1{
    public static void main(String[] args) {
       Puppy p=new Puppy();
       p.bark();
       p.eat();
       p.weep(); 
    }
}
