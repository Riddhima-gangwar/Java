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



abstract class A{
    abstract void display();
}
class B extends A{
    void display(){
        System.out.println("Display method in B");
    }
}
public class Abstract {
    public static void main(String[] args) {
        A obj = new B();
        obj.display();
    }
}

