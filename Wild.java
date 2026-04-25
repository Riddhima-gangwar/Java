import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Wild {
    static void printNumbers(List<? extends Number> numbers) {
        for (Number number : numbers) {
            System.out.println(number);
        }
    }

    static void addNumbers(List<? super Integer> numbers) {
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
    }

    static void printList(List<?> list) {
        for (Object item : list) {
            System.out.println(item);
        }
    }

    public static void main(String[] args) {
        List<Integer> integerList = Arrays.asList(1, 2, 3, 4, 5);
        List<Double> doubleList = Arrays.asList(1.1, 2.2, 3.3);
        List<String> stringList = Arrays.asList("Java", "Generic", "Wildcard");

        System.out.println("Upper bounded wildcard:");
        printNumbers(integerList);
        printNumbers(doubleList);

        System.out.println("Lower bounded wildcard:");
        List<Number> numberList = new ArrayList<>();
        addNumbers(numberList);
        printList(numberList);

        System.out.println("Unbounded wildcard:");
        printList(stringList);
    }
}
