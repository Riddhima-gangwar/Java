class Parent {
    String name = "Parent";

    void help() {
        System.out.println("Help in parent class");
    }
}

// super == direct connection with parent
class Child extends Parent {

    String name = "Child";

    void help() {
        System.out.println("Help in child class");
    }  

    void super_fu() {
        super.help();   // calls parent help()
    }

    void show() {
        System.out.println("Child class variable: " + name);
        System.out.println("Parent class variable: " + super.name);
    }
}

public class Super {
    public static void main(String[] args) {

        Child c = new Child();

        c.show();
        c.super_fu();
    }
}