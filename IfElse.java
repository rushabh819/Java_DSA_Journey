package JavaCodes;

import java.util.Scanner;

public class IfElse {
    
    public static String compareIfElse(int a, int b) {
        // Write your code here
        if (a > b) return "greater";
        else if (b > a) return "smaller";
        else return "equal";
    }

    public static void main(String[] vals){
        System.out.println(compareIfElse(new Scanner(System.in).nextInt(), new Scanner(System.in).nextInt()));
    }

}
