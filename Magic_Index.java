package JavaCodes;

import java.io.*;
import java.util.*;

public class Magic_Index {
    public static int magicIndex(ArrayList<Integer> a, int n) {
        // Write your code here
        int mi = -1;
        for(int i = 0 ; i < n ; i++){
            if(i == a.get(i)){
                return i;
            }
        }
        return mi;
    }
    public static void main(String[] args) {
        ArrayList<Integer> al = new ArrayList<Integer>(5);
        al.add(-1);
        al.add(-1);
        al.add(-1);
        al.add(4);
        al.add(4);

        // Object[] a = al.toArray();
        
        // System.out.println(al.contains(4));
        // System.out.println(al.indexOf(4));
        // System.out.println(al);
        // for (int k = 0 ; k < 5 ; k++){
        //     System.out.print(al.get(k)  + " ");
        //     System.out.println(al.get(k) == k);
        // }
        System.out.println(magicIndex(al, 5));
    }
}
