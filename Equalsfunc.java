// public class Equalsfunc {
//     public static void main(String[] args) {
//         Student s1 = new Student(1);
//         Student s2 = new Student(1);
//         System.out.println(s1.equals(s2)); // true
//     }
// }
// class Student{
//     int id;
//     Student(int id) {
//         this.id = id;
//     }
//     public boolean equals(Object obj){
//         if (obj == null) return false;

//         if (!(obj instanceof Student)) return false;
//         Student s=(Student)obj;
//         return this.id==s.id;
//     }
// }


import java.util.*;

class Student{
    int id;
    String name;
   
    Student(int id,String name)
    {
        this.id=id;
        this.name = name;
    }

    
    public boolean equals(Student other)
    {
        if(this.id == other.id){
            return true;
        }

        return false;
    }

}
public class Equalsfunc {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Student s1 = new Student(1,"Mishti");
        Student s2 = new Student(1,"Himanshu");

        if(s1.equals(s2)){
            System.out.println("Equal");
        }else{
            System.out.println("Not equal");
        }
    }
}