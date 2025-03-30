// https://leetcode.com/problems/find-numbers-with-even-number-of-digits/description/

package JavaCodes.LeetCodes;

public class EvenDigits {
    public static void main(String[] args) {
        // System.out.println(findNumbers(new int[]{12,345,2,6,7896,34, -32}));

        // System.out.println(digits(-23));
        System.out.println(digits2(-233145));

    }

    static int findNumbers(int[] nums) {
        int ans = 0;
        for (int i : nums){
            if(isEven(i)){
                ans++;
            }
        }
        return ans;
    }
    static boolean isEven(int n){
        // int nDigits = digits(n);
        int nDigits = digits2(n);
        return nDigits % 2 == 0;
    }

    static int digits(int n) {
        if(n < 0){
            n = n * -1;
        }

        if(n ==0){
            return 1;
        }

        int count = 0;

        while (n > 0){
            n /= 10;
            count++;
        }

        return count;
    }

    static int digits2(int n){
        if(n < 0){
            n = n * -1;
        }
        if(n == 0){
            return 1;
        }
        return (int)(Math.log10(n)) + 1;
    }
}
