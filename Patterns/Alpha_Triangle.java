package JavaCodes.Patterns;

public class Alpha_Triangle {
    public static void alphaTriangle(int n) {
        // Write your code here
        for(int i = 0 ; i < n ; i++){
            char ch = (char)((int)'A' + n - 1);
            for (int j = 0 ; j <= i ; j++){
                System.out.print(ch + " ");
                ch--;
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        alphaTriangle(5);
    }
}
