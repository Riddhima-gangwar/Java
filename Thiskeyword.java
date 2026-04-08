import java.util.*;
public class Thiskeyword 
{
    int a;
    void add(int a)
    {
        this.a = a;  
    }
    Thiskeyword()
    {
        this(1);  
    }
    Thiskeyword(int x)
    {
        System.out.println("Constructor 2");
        a = x;
    }
    public static void main(String1[] args) 
    {
        Thiskeyword obj = new Thiskeyword();
        obj.add(10);
        System.out.println(obj.a);
    }
}
