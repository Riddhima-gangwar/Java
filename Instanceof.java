class A{}
class B extends A{}

public class Instanceof {
    public static void main(String[] args) {
       A obj = new B();
    if(obj instanceof B)
        {
            System.out.println("obj is instance of B");
        } 
        else 
        {
            System.out.println("not instance B");
        }  
    }
   
}   
