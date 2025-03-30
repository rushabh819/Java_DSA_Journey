package JavaCodes.Patterns;

public class Binary_Number_Triangle {
    public static void nBinaryTriangle(int n) {
        // Write your code here.

        for (int i = 1 ; i <= n ; i++){
            int k = 0;
            for(int j = n ; j > n - i ; j--){
                // System.out.print("*");
                // System.out.print(i + j - 1);

                // System.out.print(i + k);
                if((i + k) % 2 != 0){
                    System.out.print("1 ");
                }
                else{
                    System.out.print("0 ");
                }
                k++;
                    
            }
            System.out.println();
        }

    }

    public static void main(String[] args) {
        nBinaryTriangle(1);
    }
}
