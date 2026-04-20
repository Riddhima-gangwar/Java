//autoboxing:converting premitive datatype to wrapper class object
// class Wrap {
//     public static void main(String[] args) {
//         int x = 20;
//         Integer obj = Integer.valueOf(x);//manual method of doing auto boxing 
//         Integer ab = x;//automatic way of doing autoboxing

//         Integer a = 100;
//         Integer b = 200;

//         String s = "10";
//         System.out.println(Integer.parseInt(s) + 1);
//         System.out.println(a.equals(b));
//     }
// }


//unboxing: converting wrapper class object to its premitive datatype
class Wrap{
    public static void main(String[] args)
    {
        int x=20;//primitive datatype
        Integer obj = Integer.valueOf(x);
        Integer ab=x;
        int p=ab.intValue();//manual way of unboxing
        int t=ab;//automatic by java
    }
}

