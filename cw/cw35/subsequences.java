package cw35;

import java.util.ArrayList;

public class subsequences {
    static ArrayList<String> getSsq(String s) {
        ArrayList<String> ans = new ArrayList<>();
        // base case
        if (s.length() == 0) {
            ans.add(" ");
            return ans;
        }
        char curr = s.charAt(0);
        ArrayList<String> smallAns = getSsq(s.substring(1)); // [bc,b,c,_]
        for (String str : smallAns) {
            ans.add(str);
            ans.add(curr + str);

        }
        return ans;
    }

    public static void main(String[] args) {
        ArrayList<String> list = getSsq("abc");
        for (String i : list) { // for each i in list print (i)
            System.out.println(i);
        }

    }

}
