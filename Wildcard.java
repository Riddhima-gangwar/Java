//unbounded wildcard
//upper bounded wildcard
//lower bounded wildcard

import java.util.*;

public class Wildcard {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(Arrays.asList(1, 2, 3));
        PrintList(list);
    }

    public void unboundedWildcard(List<?> l) {
        l.get(0);
        // we can read but not write to the list because we don't know the type of the
        // list
        // l.add(1); //compile time error
        l.get(1);
        l.get(2);
    }

    public static void PrintList(List<?> l) {
        for (Object ele : l) {
            System.out.println(ele);
        }
    }

    // array list
    List<Integer> list = new ArrayList<>(Arrays.asList(1, 2, 3));
    public void upperBoundedWildcard(List<? extends Number> l) {
        // we can read but not write to the list because we don't know the type of the
        // list
        // l.add(1); //compile time error
        Number num = l.get(0);
        System.out.println(num);
    }

    //sum of the list of numbers
    public static int printsum(List<? extends Number> l) {
        int sum = 0;
        for (Number num : l) {
            sum += num.intValue();
        }
        return sum;
    }

    //lowerbound <? super Integer> or <? super Number>
    //we can read also and write also because we know the type of the list is super of Integer or Number
    public static void printList(List<? super Integer> l) {
        for (Object ele : l) {
            System.out.println(ele);
        }
    }
}
