package JavaCodes;

public class Is_Prime {
    public static boolean isPrime(int num) {
        if(num == 2 || num == 3 || num == 5) return true;
        else if(num % 2 != 0) return false;
        else if(num%3 == 0) return false;
        else if(num%5 == 0) return false;
        else return true; 
	}
    public static void main(String[] args) {
        System.out.println(isPrime(146)? "YES" : "NO");
    }
}
