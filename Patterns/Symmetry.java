package JavaCodes.Patterns;

public class Symmetry {
    public static void symmetry(int n) {
        // Write your code here
        for (int i = 0 ; i < 2 * n -1; i++){
            
            if(i < n){
                for (int j = 0 ; j <= i ; j++){
                    System.out.print("* ");
                }
                for(int k = 0 ; k < n- i -1 ; k++){
                    System.out.print("  ");
                }

                for(int k = 0 ; k < n- i -1 ; k++){
                    System.out.print("  ");
                }
                for (int j = 0 ; j <= i ; j++){
                    System.out.print("* ");
                }

                
            }
            else{
                for(int j = i ; j < 2 * n - 1; j++){
                    System.out.print("* ");
                }
                for(int k = n ; k <= i ; k++){
                    System.out.print("  ");
                }
                for(int k = n ; k <= i ; k++){
                    System.out.print("  ");
                }
                for(int j = i ; j < 2 * n - 1; j++){
                    System.out.print("* ");
                }
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        symmetry(3);
    }
}
