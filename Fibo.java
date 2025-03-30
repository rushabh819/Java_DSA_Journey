package JavaCodes;

import java.util.Scanner;

public class Fibo {
    
    static int nfibo(int n){
        int a = 0;
        int b = 1;
        int count = 2;
        while (count <= n){
            int temp = b;
            b = b + a;
            a = temp;
            count++;
        }
        return b;
    }

    public static void main(String[] args) {
            // Fibo Series: 0,1,1,2,3,5,8,13,...
            System.out.println(new Fibo().nfibo(new Scanner(System.in).nextInt()));            
        }
}
