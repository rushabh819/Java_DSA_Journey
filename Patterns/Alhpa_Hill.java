package JavaCodes.Patterns;

public class Alhpa_Hill {
    public static void alphaHill(int n) {
        // Write your code here
        for (int i = 0 ; i < n ; i++){
            
            for(int j = 0 ; j < n-i-1 ; j++){
                System.out.print(" ");
            }
            char ch = 'A';
            for(int k=0; k <= i ; k++){
                System.out.print(ch);
                ch++;
            }
            ch--;
            ch--;
            for(int l = n+1; l <= i+n; l++){
                System.out.print(ch);
                ch--;
            }
            for(int m = 0 ; m < n-i-1 ; m++){
                System.out.print(" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        alphaHill(3);
    }
}
