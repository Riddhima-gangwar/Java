class Rabbit<t extends Number>{
    t val;
    void setVal(t val){
        this.val = val;
    }

    t get_val(){
        return val;
    }
}


//create a generic contructor in non generic class and generic in generic class
class Cat{
    public <T> Cat(T val){
        System.out.println("Gneric constructor");
    }
}

class Dog<T>{
    T val;
    public <E> Dog(E val){
        System.out.println("Generic constructor in generic class");
    }
}
public class Generic3 {
    public static void main(String[] args) {
        Rabbit<Integer> ob = new Rabbit<>();
        ob.setVal(123);
        System.out.println(ob.get_val());
        Cat ob2 = new Cat(123);
        Dog<Integer> ob3 = new Dog<>(123);
    }
}

