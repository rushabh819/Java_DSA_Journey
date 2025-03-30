package JavaCodes;

public class Reverse {
    static int reverse(int x) {
        int rev = 0;
        int ori = x;
        int sign = 1;

        if(x < 0){
            sign = -1;
            ori = -x;
        }

        while (ori > 0){
            int rem = ori % 10;

            if(rev > Integer.MAX_VALUE/10 || (rem == Integer.MAX_VALUE/10 && rem > 7)) return 0;
            if(rev < Integer.MIN_VALUE/10 || (rem == Integer.MIN_VALUE/10 && rem < -8)) return 0;


            rev = rev *10 +  rem;
            ori /= 10;
        }

        return sign * rev;
    }
    public static void main(String[] args) {
        System.out.println(reverse(1534236469));
        System.out.println(reverse(-123));
    }
}
