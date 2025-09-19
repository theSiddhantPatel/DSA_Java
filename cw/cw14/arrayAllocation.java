package cw14;

// import cw28.factorial;

public class arrayAllocation {
    public static void main(String[] args) {
        // int[] ages = new int[3];
        // float weight[] = new float[6];
        // String[] names = new String[3];
        // ages[0] = 34;
        // ages[1] = 4;
        // ages[2] = 44;
        // // ages[5] = 34;
        // System.out.println(ages[0]);
        // System.out.println(ages[1]);
        // System.out.println(ages[2]);

        // weight[0] = 34;
        // // weight[1]=4.5;
        // // weight[2]=44.1;
        // int[][] array = new int[6][6];
        // array[0][0] = 5;
        // array[0][1] = 15;
        // array[0][2] = 25;
        // array[0][3] = 35;
        // array[0][4] = 5;
        // array[1][0] = 5;
        // array[1][1] = 5;
        // array[1][2] = 5;
        // array[1][3] = 5;
        // array[1][4] = 5;
        // array[2][0] = 5;
        // array[2][1] = 5;
        // array[2][2] = 5;
        // array[2][3] = 5;
        // array[2][4] = 5;
        // array[3][0] = 5;
        // array[3][1] = 5;
        // array[03][2] = 5;
        // array[03][3] = 5;
        // array[04][4] = 5;
        // array[04][0] = 5;
        // array[04][1] = 5;
        // array[04][2] = 5;
        // array[04][3] = 110;
        // array[05][4] = 5;
        // array[05][0] = 5;
        // array[05][1] = 5;
        // array[05][2] = 5;
        // array[05][3] = 5;
        // array[05][4] = 5;
        // for (int i = 0; i < array.length; i++) {
        //     for (int j = 0; j < 6; j++) {
        //         System.out.println(array[i][j] + " ");
        //     }
        // }
    int[]arr=new int[4];
    arr[1]=1;
    arr[2]=10;
    arr[3]=11;
    arr[0]=5;
    // for (int i = 0; i < arr.length; i++) {
    //     System.out.println(arr[i]);
    // }
    // for(int index :arr){  // for each loop
    //     System.out.println(index);

    // }

int i=0;
while (i>4) {
    System.out.println(arr[i]);
    i++;
}
    }
}
