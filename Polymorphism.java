class Vechile{
    void  run(){
        System.out.println("Vehicle is running");
    }
}
class Truck extends Vechile{
    void run(){
        super.run();
        System.out.println("Truck is running");
    }
}

public class Polymorphism {
    public static void main(String[] args) {
        Vechile ob= new Truck();
        ob.run();
    }
}
