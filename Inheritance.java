class Animal{
    void show(){
        System.out.println("I am an animal");
    }
}
class Hen extends Animal {
    void  cock(){
        System.out.println("I am a hen");
    }
}

public class Inheritance {
    public static void main(String1[] args) {
        Hen ob = new Hen();
        ob.show();
        ob.cock(); // This would cause a compile-time error since cock() is not defined in the Animal class
    }
}
