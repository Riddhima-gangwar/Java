public class Varargs {
    public int sum(int... numbers) {
        int total = 0;
        for (int n : numbers) {
            total += n;
        }
        return total;
    }
    public static void main(String[] args) {
        Varargs v = new Varargs();
        System.out.println(v.sum(10, 20));
        System.out.println(v.sum(10, 20, 30));
        System.out.println(v.sum(10, 20, 30, 40));
        System.out.println(v.sum(1, 2, 3, 4, 5, 6));
    }
}
