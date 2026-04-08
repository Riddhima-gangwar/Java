public class Equalsfunc {
    public static void main(String[] args) {
        Student s1 = new Student(1);
        Student s2 = new Student(1);
        System.out.println(s1.equals(s2)); // true
    }
}
class Student{
    int id;
    Student(int id) {
        this.id = id;
    }
    public boolean equals(Object obj){
        if (obj == null) return false;

        if (!(obj instanceof Student)) return false;
        Student s=(Student)obj;
        return this.id==s.id;
    }
}
