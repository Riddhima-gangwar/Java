public class Ext1 {
    int wheelCount;
    void start(){
        System.out.println("Vehicle is starting");
    }
}
 class Car extends Ext1{
    public static void main(String[] args) {
        Car c=new Car();
        c.wheelCount=4;
        c.start();
        System.out.println("Car has " + c.wheelCount + " wheels");
    }
    }   

