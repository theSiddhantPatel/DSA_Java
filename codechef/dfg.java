// public class dfg {
    
// }
import java.util.*;
import java.lang.*;
import java.io.*;

class dfg
{
    public static void main(String[] args) throws java.lang.Exception
    {
        // your code goes here
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        while (t--> 0) {
            int n = s.nextInt();
            String bsS;
            bsS = s.next();
            String bsT;
            bsT = s.next();
            int bstOnes = 0;
            int  bssOnes = 0;
            // if (bsT.matches("[01]+") && bsS.matches("[01]+"))

            for (int i = 0; i < bsS.length(); i++) {
                if (bsS.charAt(i) == '1')
                    bssOnes++;
            }
            // System.out.println(bssOnes);
            for (int i = 0; i < bsT.length(); i++) {
                if (bsT.charAt(i) == '1')
                    bstOnes++;
            }
            // System.out.println(bstOnes);

            if (Math.abs((bssOnes-bstOnes) % 2 )== 0)
                System.out.println("yes");

            else System.out.println("no");

        }




    }

}