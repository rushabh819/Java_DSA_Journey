package JavaCodes;

import java.util.Scanner;
// import java.lang.String;

public class Check_Armstrong {
    public static void main(String[] args) {
		// Write your code here
		Scanner in = new Scanner (System.in);
        int x = in.nextInt();

        System.out.println(isArmstrong(x));
	}

    static boolean isArmstrong(int n) {
        // int x = n;
        // int l = 0;
        // while (x != 0){
        //     x/=10;
        //     l++;
        // }
        // x = n;
        // int ans = 0;
        // while (x != 0){
        //     ans += power((x % 10), l);
        //     x/=10; 
        // }
        // return ans == n;


        int l = Integer.toString(n).length();
        int sumOfPowers = 0;
        int original = n;
        while (original != 0){
            sumOfPowers += Math.pow(original%10, l);
            original/=10;
        }
        return n == sumOfPowers;
    }

    // static int power(int i, int l) {
    //     if(l != 0){
    //         return i * power(i, l-1);
    //     }
    //     else return 1; 
    // }
}
