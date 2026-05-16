// import java.util.*;

// public class Final1 {
//         public static void main(String[] args) {
//          final int x = 10;

//         System.out.println(x);

//         // x = 20;  // Error
//         }
// }


class A {

    final void show() {

        System.out.println("Hello");
    }
}

class B extends A {

    // Error
    /*
    void show() {
        System.out.println("Hi");
    }
    */
}

public class Final1 {

    public static void main(String[] args) {

        B obj = new B();

        obj.show();
    }
}