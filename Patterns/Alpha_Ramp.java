package JavaCodes.Patterns;

public class Alpha_Ramp {
    public static void alphaRamp(int n) {
        // Write your code here
        for (int i = 0 , ascii=65; i < n ; i++, ascii++){
            for(int j = 0 ; j <= i ; j++){
                System.out.print((char)ascii + " ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        alphaRamp(4);
    }
}
