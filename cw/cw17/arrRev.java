package cw17;

public class arrRev {

public static void main(String[] args) {
    // Initialize an integer array with values from 1 to 6
    int[] arr = { 1, 2, 3, 4, 5, 6 };
    
    // Create a new array to store the reversed elements
    int[] reversedArr = new int[arr.length];
    
    // Initialize a variable j to keep track of the index for the reversed array
    int j = 0;
    
    // Loop through the array in reverse order
    for (int i = arr.length - 1; i >= 0; i--) {
        // Assign the value from the end of the original array to the beginning of the new array
        reversedArr[j] = arr[i];
        
        // Print the current element of the reversed array
        System.out.print(reversedArr[j] + " ");
        
        // Increment the index for the reversed array
        j++;
    }
}}