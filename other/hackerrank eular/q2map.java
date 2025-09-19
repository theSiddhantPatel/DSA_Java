
import java.util.HashMap; // or import java.util.*;

public class q2map {
    public static void main(String[] args) {
        // country population
        HashMap<String, Integer> populationMap = new HashMap<>();
        populationMap.put("India", 1380004385);
        populationMap.put("China", 1439323776);
        populationMap.put("United States", 331002651);
        populationMap.put("Indonesia", 273523615);
        populationMap.put("Pakistan", 225666791);

        System.out.println(populationMap.size());
        if (populationMap.containsKey("China")) {
            System.out.println("china present");
        } else {
            System.out.println("china not present");
        }
        System.out.println(populationMap.get("China"));

        System.out.println(populationMap.remove("China"));
        System.out.println(populationMap.get("China"));

        System.out.println(populationMap.get("Australia"));
        // iteration in hashmap in java

        // for (populationMap.Entry<String, Integer> entry : populationMap.entrySet()) {
        //     System.out.println(entry.getKey());
        // }
        //or 
        for (String key : populationMap.keySet()) {
            System.out.println(key + " " + populationMap.get(key));
        }
        
        int[] arr = { 1, 2, 3, 4 };
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        for (int val : arr) {
            System.out.print(val + " ");
            
        }
        System.out.println();
        System.out.println(populationMap.keySet());
        System.out.println(populationMap.containsKey("China"));
        System.out.println(populationMap.containsKey("India"));

    }


}
