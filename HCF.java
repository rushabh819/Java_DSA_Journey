package JavaCodes;

public class HCF {
    public static int calcGCD(int n, int m){
        // Write your code here.
        int x = ((m < n)? m:n);
        for(int i = x ; i >= 2 ; i--){
            boolean flag = false;
            if(m % i == 0) flag =true;
            if((flag == true) && (n % i ==0)) return i;
        }
        return 1;
    }
    public static void main(String[] args) {
        System.out.println(calcGCD(9, 6));
    }
}
