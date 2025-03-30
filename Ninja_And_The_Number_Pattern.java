package JavaCodes;

public class Ninja_And_The_Number_Pattern {
    static int min(int a, int b) {
        return (a<b) ? a : b;
    }
    
    public static void getNumberPattern(int n) {
        // Write your code here.
        for(int i =0 ; i < 2*n-1 ; i++){
            for(int j =  0 ; j < 2*n-1 ; j++){
                int top = i;
                int left = j;
                int right = (2*n - 2) - j;
                int bottom = (2*n - 2) - i;

                System.out.print(n - min(min(top,bottom),min(left,right)));
            }
            System.out.println();
        }
    }
    
    public static void main(String[] args) {
        getNumberPattern(4);
    }
}