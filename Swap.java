import java.util.*;
public class Swap {
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        System.out.println("enter value of A:");
        int a = input.nextInt();
        System.out.println("enter value of B:");
        int b = input.nextInt();
        
        int c = a;
        a = b;
        b = c;
        System.out.println("value of A is:"+a);
        System.out.println("value of B is:"+b);
        
    }
}
