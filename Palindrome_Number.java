package JavaCodes;

public class Palindrome_Number {
    // static public boolean isPalindrome(int x) {
    //     if(x < 0){
    //         return false;            
    //     }
    //     else{
    //         int num = x;
    //         int rev_num = 0;
    //         while (num>0){
    //             rev_num = (rev_num * 10) + (num%10);
    //             num/=10;
    //         }
    //         return rev_num == x;
    //     }
    // }

   static public boolean isPalindrome(int x) {
        if (x < 0) return false;
        else{
            String x_str = ""+x;
            String ans = "";
            for(int i = x_str.length()-1 ; i >= 0; i--){
                ans += x_str.charAt(i);
            }
            return x_str.equals(ans);
        }
    }
    


    public static void main(String[] args) {
        System.out.println(isPalindrome(121));
        System.out.println(isPalindrome(-121));
        System.out.println(isPalindrome(10));
    }
}
