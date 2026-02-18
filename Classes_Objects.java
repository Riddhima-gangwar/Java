// Program for sample Constructor usage
class Student4{
    int age;
    String name;
    int roll;
    Student4(int a, String n, int r){
        age=a;
        name=n;
        roll=r;
        System.out.println("Age: "+age+"\nName: "+name+"\nRoll No.: "+roll);
    }
}
public class Classes_Objects {
    public static void main(String[] args) {
        Student4 obj=new Student4(22,"Manik",55);
    }
}
