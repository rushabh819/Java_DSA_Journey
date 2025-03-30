package JavaCodes;

import java.util.Scanner;

public class Sum_of_even_odd {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        int even = 0, odd = 0;
        while(n>0){
            int last = n % 10;

            if (last % 2 == 0) even += last;
            if (last % 2 != 0) odd += last;
            
            n = n / 10;
        }

        System.out.println(even + " " + odd);
    }
}
