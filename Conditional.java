// import java.util.*;
// public class Conditional {
//     public static void main(String[]args)
//     {
//         Scanner sc = new Scanner(System.in);
//         int a=sc.nextInt();
//         int b=sc.nextInt();
//         int c=sc.nextInt();
//         int d=Math.max(a,Math.max(b,c));
//         System.out.println("Largest no: "+d);
//     }
// }

// import java.util.*;
// public class Conditional{
//     public static void main(String[] args)
//     {
//         Scanner sc = new Scanner(System.in);
//         int n=sc.nextInt();
//         if(n>9)
//         {
//             System.out.println("Grade: O");
//         }
//         else if(n>=7 && n<=8)
//         {
//             System.out.println("Grade: A");
//         }
//         else if(n>=5 && n<=6)
//         {
//             System.out.println("Grade: B");
//         }
//         else if(n<5)
//         {
//             System.out.println("Grade: C");
//         }
//         else
//         {
//             System.out.println("Grade: D");
//         }
//     }
// }

// import java.util.*;
// public class Conditional{
//     public static void main(String[] args)
//     {
//         Scanner sc = new Scanner(System.in);
//         int n=sc.nextInt();
//         int sum=0;
//         while(n!=0)
//         {
//             sum=sum+(n%10);
//             n=n/10;
//         }
//         if(sum%2==0)
//         {
//             System.out.println("EVEN: "+sum);
//         }
//         else{
//             System.out.println("ODD: "+sum);
//         }
//     }
// }

// import java.util.*;
// public class Conditional{
//     public static void main(String[] args)
//     {
//         Scanner sc = new Scanner(System.in);
//         int n=sc.nextInt();
//         switch(n)
//         {
//             case 1:
//                 System.out.println("Gulab jamun");
//                 break;
//             case 2:
//                 System.out.println("jalebi");
//                 break;
//             case 3:
//                 System.out.println("kaju katli");
//                 break;
//             default:
//                 System.out.println("nothing");
//                 break;
//         }

//     }
// }

// import java.util.*;
// public class Conditional{
//     public static void main(String[] args)
//     {
//         Scanner sc = new Scanner(System.in);
//         double n=sc.nextInt();
//         // double x=y*2;
//         double y=n/0.6;
//         double x=y*2;
//         double z=n/2;
//         System.out.println("Lubricant X:"+x);
//         System.out.println("Lubricant Y:"+y);
//         System.out.println("Lubricant Z:"+z);

//     }
// }



// import java.util.*;

// public class Conditional {
//     public static void main(String[] args) {

//         Scanner sc = new Scanner(System.in);

//         float n = sc.nextFloat();
//         float a = sc.nextFloat();
//         float t = sc.nextFloat();

//         float m = n * a;
//         float p = (m / t) * 100;

//         System.out.println("Total Production Hours/Week: " + m);
//       System.out.printf("Percentage: %.2f%%", p);

//     }
// }



import java.util.*;

public class Conditional {
    public static void main(String1[] args) {

        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        double avg = (a + b + c) / 3.0;
        int fs, ss;   
        if (a <= b && a <= c) {
            fs = a;
            ss = Math.min(b, c);
        } 
        else if (b <= a && b <= c) {
            fs = b;
            ss = Math.min(a, c);
        } 
        else {
            fs = c;
            ss = Math.min(a, b);
        }

        System.out.printf("Average: %.2f\n", avg);

    if (avg > fs && avg > ss) {
        System.out.println("Average is greater than both smallest numbers");
    } else {
        System.out.println("Average is not greater than both smallest numbers");
    }
 }
}
