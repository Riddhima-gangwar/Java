import java.util.*;
// public class hash1 {
//     public static void main(String[] args) {
//         HashMap<String, Integer> map = new HashMap<>();
//         map.put("apple", 1);
//         map.put("banana", 2);
//         map.put("orange", 3);

//         System.out.println(map.get("apple")); // Output: 1
//         System.out.println(map.get("banana")); // Output: 2
//         System.out.println(map.get("orange")); // Output: 3

//         // Check if a key exists
//         if (map.containsKey("apple")) {
//             System.out.println("Apple is in the map.");
//         }

//         // Remove a key-value pair
//         map.remove("banana");

//         // Check if the key was removed
//         if (!map.containsKey("banana")) {
//             System.out.println("Banana has been removed from the map.");
//         }

//         //find frequency of each character in a string
//         String str = "hello world";
//         HashMap<Character, Integer> freqMap = new HashMap<>();
//         for (char c : str.toCharArray()) {
//             freqMap.put(c, freqMap.getOrDefault(c, 0) + 1);
//         }
//         System.out.println("Character frequencies in '" + str + "':");
//         for (Map.Entry<Character, Integer> entry : freqMap.entrySet()) {
//             System.out.println(entry.getKey() + ": " + entry.getValue());
//         }   
//     }
     
// }


import java.util.ArrayDeque;
import java.util.Deque;

public class deque {

    public static void main(String[] args) {

        Deque<Integer> dq = new ArrayDeque<>();
        dq.addFirst(10);
        dq.addLast(20);
        dq.addFirst(5);
        System.out.println("Deque: " + dq);
        dq.removeFirst();
        System.out.println("After removing first: " + dq);
        dq.removeLast();
        System.out.println("After removing last: " + dq);
        System.out.println("Front element: " + dq.peekFirst());
        System.out.println("Back element: " + dq.peekLast());

    }
}