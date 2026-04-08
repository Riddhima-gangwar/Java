public class String1 {
    public static void main(String[] args) {
        Student s = new Student(1,"Riddhima");
        System.out.println(s);   // calls toString() automatically
    }
}

class Student {
    int id;
    String name;

    Student(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public String toString() {
        return id + " " + name;
    }
}