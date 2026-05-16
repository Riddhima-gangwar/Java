import java .util.*;

class Student{
    int id;
    String name;

    Student(int id, String name)
    {
        this.id=id;
        this.name=name;
    }

    @Override
    public String toString(){
        return "Id : " + this.id + "\n" + "Name: " + this.name;
    } 
}
public class Tostring1 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        String name = sc.nextLine();
        int id = sc.nextInt();
        Student s= new Student(id,name);
        System.out.println(s);


    }
}
