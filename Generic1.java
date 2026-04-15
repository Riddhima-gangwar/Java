class Abc<praful extends Number>
{
    praful val;
    void setval(praful val)
    {
        this.val=val;
    }
    praful get_val()
    {
        return val;
    }
} 

// class Abc<praful>
// {
    // praful val;
    // void setval(praful val)
    // {
        // this.val=val;
    // }
    // praful get_val()
    // {
        // return val
    // }
// }

public class Generic1{
    public static void main(String[] args)
    {
        // Abc<Integer> ob=new Abc<Integer>(); //old way of using diamond operator
        Abc<Integer> ob =new Abc<>();
        ob.setval( 121);
        System.out.println(ob.get_val());
        
        Abc<String> oj=new Abc<>();
        oj.setval("jagjit");
        System.out.println(oj.get_val());
    }
}