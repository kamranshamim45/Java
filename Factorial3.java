import java.util.Scanner;
public class Factorial3 {
    public static void main(String[] args) {
        Scanner Sc = new Scanner (System.in);
        System.out.println("Enter number to find the factorial");
        int n= Sc.nextInt();
        int f= 1;
        for(int i=1; i<=n; i++)
        {
            f= f*i;
            
        }
        System.out.println("Factorial is "+f);
      
    }
 
}
