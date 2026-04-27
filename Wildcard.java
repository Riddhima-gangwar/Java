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
}
