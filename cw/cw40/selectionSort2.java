package cw40;

public class selectionSort2 {
    public static void ss2(String[] fruits) {
        int n = fruits.length;
        for (int i = 0; i < n - 1; i++) {
            int minIdx = i;
            for (int k = i + 1; k < fruits.length; k++) {
                if (fruits[k].compareTo(fruits[minIdx]) < 0) {
                    minIdx = k;
                }
            }
            String temp = fruits[minIdx];
            fruits[minIdx] = fruits[i];
            fruits[i] = temp;

        }
    }

    public static void main(String[] args) {
        String fruits[] = { "apple", "banana", "fig", "date" };
        ss2(fruits);
        for (String string : fruits) {
            System.out.print(string + " ");
        }
    }
}
