package array;

import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

//https://www.codechef.com/practice/course/1-star-difficulty-problems/DIFF1200/problems/REMOVEBAD
public class RemoveBadElements {

    public static int removeMostRepeatedElement(int[] array) {
        if (array == null || array.length == 0) {
            return 0;
        }

        // Step 1: Count the frequency of each element using a HashMap
        Map<Integer, Integer> freqMap = new HashMap<>();
        for (int num : array) {
            freqMap.put(num, freqMap.getOrDefault(num, 0) + 1);
        }

        // Step 2: Use a PriorityQueue to find the element with the highest frequency
        PriorityQueue<Map.Entry<Integer, Integer>> maxHeap = new PriorityQueue<>(
                (a, b) -> b.getValue() - a.getValue());
        maxHeap.addAll(freqMap.entrySet());

        // Step 3: Get the most repeated element
        int mostRepeatedElement = maxHeap.poll().getKey();

        // Step 4: Calculate the new size of the array after removing the most repeated
        // element
        int newSize = array.length - freqMap.get(mostRepeatedElement);

        return newSize;
    }

    public static void main(String[] args) {
        int[] array = { 1, 2, 3, 2, 4, 3, 3, 5, 6, 3 }; // Example array
        int newSize = removeMostRepeatedElement(array);
        System.out.println("New size of array after deletion of most repeated element is : " + newSize);
    }
}

/*
 * Why Use Map<Integer, Integer> Instead?
 * Using Map<Integer, Integer> for initialization is generally preferred
 * because:
 *
 * Flexibility: You can easily switch to another Map implementation (e.g.,
 * TreeMap, LinkedHashMap) without changing the rest of the code.
 *
 * Abstraction: It adheres to the principle of programming to an interface,
 * making your code more modular and maintainable.
 *
 * Best Practice: It is a widely accepted best practice in Java to use interface
 * references wherever possible.
 */