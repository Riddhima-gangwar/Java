public class Methodoverloading {
    public static void main(String[] args) {
        Greet g= new Greet();
        g.greetings();
        g.greetings("Alice");
        g.greetings("Bob", 3);
    }
}

class Greet{
    void greetings(){
        System.out.println("Hello");
    }
    void greetings(String name){
        System.out.println("Hello " + name+",Good Morning");
    }
    void greetings(String name,int count){
        for(int i=0;i<count;i++){
            System.out.println("Hello " + name+",Good Morning");
        }
    }
}