package JavaCodes.Array_ArrayLists;

import java.util.ArrayList;
import java.util.Scanner;
/**
 * MultiDimentionalArrayList
 */
public class MultiDimentionalArrayList {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        ArrayList< ArrayList<Integer> > mdarraylist= new ArrayList<>();
        
        // System.out.println(mdarraylist.toString());
        
        
        // Initializing
        for (int i = 0 ; i < 3 ; i++){
            mdarraylist.add( new ArrayList<>() ); // here we initialized every elements in the arrayList as an ArrayList obj.
        }
       

        //add elements
        for (int i = 0; i < 3 ; i++){
            for (int j = 0 ; j < 3 ; j++){
                mdarraylist.get(i).add(input.nextInt());
                 // if we have not initi the inner elements of arrays list. then here at mdarraylist.get(i) would have thrown error 
                 // as the list would be empty initially so that's why we have previously initialized the inner elements of the mdArrayList
            }
        }

        //print elements
        System.out.println(mdarraylist);
    }
}