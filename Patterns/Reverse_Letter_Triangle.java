package JavaCodes.Patterns;

public class Reverse_Letter_Triangle{
    public static void nLetterTriangle(int n) {
        // Write your code here
        for(int i = 0 ; i < n ; i++){
            for(int j = n-i-1 , ascii = 65 ; j >= 0 ; j--, ascii++){
                System.out.print((char)ascii + " ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        nLetterTriangle(7);
    }
}