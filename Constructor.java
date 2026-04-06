public class Constructor {
    public static void main(String[] args) {
        Complex obj=new Complex(2,3);
        // obj.a=2;
        // obj.b=3;
        obj.print();
    }
}

class Complex{
    int a,b;

    // public Complex(){
    //     a=5;
    //     b=10;
    //     System.out.println("Creating a new object");
    // }
    public Complex(int real){
        a=real;
        b=12;
        System.out.println("Creating a new object");
    }

    public Complex(int real , int imag){
        a=real;
        b=imag;
        System.out.println("Creating a new object");
    }
    void print(){
        System.out.println("The complex number is " + a + " + " + b + "i");
    }
}