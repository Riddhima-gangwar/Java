//constructor is private and all the methods are static, so we can not create object of class St,
//  but we can call the static methods directly by class name.
// class St{
//     private St(){

//     }
//     static int add(int a, int b)
//     {
//         return a+b;
//     }
//     static int mul(int a, int b)
//     {
//         return a*b;
//     }
//     static int Square(int a)
//     {
//         return a*a;
//     }
//     static int Cube(int a)
//     {
//         return a*a*a;
//     }
// }

// public class Utility {
//     public static void main(String[] args) {
//         System.out.println(St.add(5, 3));
//         System.out.println(St.mul(5, 3));
//         System.out.println(St.Square(5));
//         System.out.println(St.Cube(5));
//     }
// }


// import java.time.LocalDateTime;
// public class Utility{
//     public static void main(String[] args)
//     {
//         LocalDateTime current = LocalDateTime.now();
//         System.out.println("Current date and time: " + current+"");
//     }
// }


//  import java.time.LocalDate;
// public class Utility{
//      public static void main(String[] args)
//      {
//          LocalDate today = LocalDate.now();
//           System.out.println("Today's: " + today);
//      }
// }



import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
public class Utility{
     public static void main(String[] args)
     {
        LocalDateTime now = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
        String formattedDateTime = now.format(formatter);
        System.out.println("Formatted date and time: " + formattedDateTime);    
     }
}