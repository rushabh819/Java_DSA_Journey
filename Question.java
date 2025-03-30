package JavaCodes;
/*
 * How many 4 digit numbers can be formed using 0 1 2 3 4 5 which are divisible by 4;
 */
public class Question {
    static int count;
    public static void main(String[] args) {

        for (int i = 1000 ; i <= 5555 ; i++){
            if(number(i)){
                System.out.println(i);
                count++;
            }
        }
        System.out.println(count);
    }

    static boolean number(int i) {
        int n = i;
        while (n> 0){
            int rem = n % 10;
            if(rem > 5) return false;
            n = n/10;
        }
        return i % 4 == 0;
    }
}
