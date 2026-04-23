interface greet<y>{
    void greeting(y name);
}

class Loin<t> implements greet<t>{
    @Override
    public void greeting(t name) {
        System.out.println("Hello "+name);
    }
}

interface rabbit{
    void show();
}
class lil_rabbit implements rabbit{
    @Override
    public void show() {
        System.out.println("I am a rabbit");
    }   
}
public class Genericmethod {
    public static void main(String[] args) {
        System.out.println(printnumber(123));
        System.out.println(printnumber("gjit"));
    }
    public static <T> T printnumber(T val){
        return val;
    }
}
