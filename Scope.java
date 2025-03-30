package JavaCodes;

public class Scope {
    public static void main(String[] args) {
        int a = 9;

        System.out.println("before the Scope");;
        System.out.println("a = " + a);

        {
            a = 100;
        }

        System.out.println("after the Scope");;
        System.out.println("a = " + a);

        changeValue(a);

        System.out.println("after the function Scope");;
        System.out.println("a = " + a);

        Integer[] b = new Integer[]{a};

        System.out.println("after the makeing a new Integer Obj, then using the calling the function Scope");
        System.out.println("b = " + b[0]);
        changeValue(b[0]);
        
        System.out.println("after the makeing a new Integer Obj, then using the calling the function Scope");;
        System.out.println("b = " + b[0]);
        
    }

    static void changeValue(int a) {
        a = 99;
    }
    
}
