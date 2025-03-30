/*
 * choice 1: A of Circle
 * choice 2: A of Rectrangle
 */

package JavaCodes;

// import java.lang.reflect.Array;

public class Switch_Case_statement {
    public static double areaSwitchCase(int ch, double[] a) {
        // Write your code here
        // switch (ch) {
        //     case 1:
        //         return Math.PI * Math.pow(a[0], 2);
        
        //     case 2:
        //         return a[0] * a[1];

        //     default:
        //         return -1;
        // }


        // Enhanced switch case expression...
        switch(ch){
            case 1 -> {return Math.PI * Math.pow(a[0], 2);}
            case 2 -> {return a[0] * a[1];}
            default -> {return -1;}
        }
    }
    public static void main(String[] args) {
        System.out.println(new Switch_Case_statement().areaSwitchCase(2, new double[]{3,2}));
    }
}
