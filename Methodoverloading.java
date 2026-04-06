public class Methodoverloading {
    public static void main(String[] args) {
        Greet g= new Greet();
        g.greetings();
        g.greetings("Alice");
    }
}

class Greet{
    void greetings(){
        System.out.println("Hello");
    }
    void greetings(String name){
        System.out.println("Hello " + name+",Good Morning");
    }
}