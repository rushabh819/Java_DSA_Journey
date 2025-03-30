package JavaCodes;

import java.util.Scanner;

public class DataType {

    public static int dataTypes(String str) {
        // Write your code here
        if (str.equalsIgnoreCase("integer")){
            return 4;
        }else if (str.equalsIgnoreCase("long")){
            return 8;
        }else if (str.equalsIgnoreCase("float")){
            return 4;
        }else if (str.equalsIgnoreCase("double")){
            return 8;
        }else if (str.equalsIgnoreCase("character")){
            return 1;
        }else return -1;
    }
    
    public static void main(String[] args) {
        System.out.println(dataTypes(new Scanner(System.in).nextLine()));
        // System.out.println("float".equalsIgnoreCase("Float"));
    }
}
