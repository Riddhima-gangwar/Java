class Multiple_t<K, V> {
    K roll;
    V name;

    // Setter
    void setVal(K roll, V name) {
        this.roll = roll;
        this.name = name;
    }

    // Getter for roll
    K getRoll() {
        return roll;
    }

    // Getter for name
    V getName() {
        return name;
    }
}

class Single_t<P> {
    P val;

    // Setter
    void setVal(P v) {
        this.val = v;
    }

    // Getter
    P getVal() {
        return val;
    }
}

public class Generic2 {
    public static void main(String[] args) {

        Single_t<Integer> ob = new Single_t<>();
        ob.setVal(121);
        System.out.println(ob.getVal());

        Single_t<String> oj = new Single_t<>();
        oj.setVal("gjit");
        System.out.println(oj.getVal());

        Multiple_t<Integer, String> ob1 = new Multiple_t<>();
        ob1.setVal(121, "gjit");
        System.out.println(ob1.getRoll() + " " + ob1.getName());
    }
}