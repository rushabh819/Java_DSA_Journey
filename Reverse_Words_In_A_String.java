package JavaCodes;

public class Reverse_Words_In_A_String {

    public static String reverseString(String str) {
		//Write your code here
        // String newStr = new String();

        // for (int i = str.split(" ").length -1; i >= 0 ; i--){
            
            // newStr.concat(str.split(" ")[i]).concat(" ");
            // System.out.println(str.split(" ")[i] );
            // newStr = newStr.concat(str.split(" ")[i] + " ");
            // System.out.println(newStr);
            // newStr = newStr + str.split(" ")[i] + " ";
        // }
        // System.out.println(str);
        // System.out.println(str.split(" ")[0]);

        //Write your code here
        String[] strArr = str.split("\\s+");
		StringBuffer newStr = new StringBuffer();

        for (int i = strArr.length -1; i >= 0 ; i--){
            // newStr = newStr.concat(str.split(" ")[i] + " ");
			newStr.append(strArr[i] + " ");
        }
        return newStr.toString().trim();
	}


    public static void main(String[] args) {
        System.out.println(new Reverse_Words_In_A_String().reverseString("Welcome to Coding Ninjas"));
    }
}
