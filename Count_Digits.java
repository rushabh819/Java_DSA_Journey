package JavaCodes;

public class Count_Digits {
    public static int countDigits(int n){
        // Write your code here.
        int m = n;
        int ans = 0;
        while (m > 0){
            int rem = m%10;
            if(rem != 0 && n % rem == 0 ){
                ans++;
            }
            m /= 10;
        }
        return ans;
    }
    public static void main(String[] args) {
        System.out.println(countDigits(660));
    }
}
