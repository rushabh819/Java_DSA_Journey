package JavaCodes;

import java.util.Scanner;


public class Beautiful_String {
    
    public static int makeBeautiful(String str) {
        char[] ch=str.toCharArray();
        char[] required0=str.toCharArray(); // possibility no 1
        char[] required1=str.toCharArray();//possibility no 2
        required0[0]='0';
        required1[0]='1';

        for(int i=1;i<ch.length;i++){ 
            if(required0[i-1]=='0'){
                required0[i]='1';
            }else{
                required0[i]='0';
            }
            if(required1[i-1]=='1'){
                required1[i]='0';
            }else{
                required1[i]='1';
            }
        }

        int count1=0,count2=0;

        for(int i=0;i<ch.length;i++){ // compare whether required string is equal to the original string
            if(required0[i]!=ch[i]){
                count1++;
            }
            if(required1[i]!=ch[i]){
                count2++;
            }
        }
        return Math.min(count1,count2); 

    }


    public static void main(String[] args){
        System.out.println(makeBeautiful(new Scanner(System.in).nextLine()));

        // Scanner input = new Scanner(System.in);

        // int n = input.nextInt();
        
    }
}