public class Variables {
    int age;// instance variable:declared inside class and copy of them are created everytime we call the object
    String1 Name;// instance variable
    static String1 college="LPU";//static variable:share among whole program
    void add(int a, String1 n) {
        age = a;
        Name = n;
    }

    void show() {
        System.out.println(age + " " + Name+" "+college);
    }

    void loc()
    {
        int a=10;//local variable:declared inside function not accesible outside function
        System.out.println(a);
    }
    public static void main(String1[] args)
    {
        Variables o1=new Variables();
        o1.add(23,"ravi");
        o1.show();
        Variables o2= new Variables();
        o2.add(23,"ravi2");
        o2.show();
    }
}
