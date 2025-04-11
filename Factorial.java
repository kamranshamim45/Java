import java.util.*;
public class Factorial {
    public static void main(String[] args) {
        System.out.println("enter no. to find the factorial");
        Scanner Sc = new Scanner(System.in);
        int n = Sc.nextInt();
        int f=1;
        for(int i = 2;i<=n;i++ )
        {
            f=f*i;
        }
       System.out.println("factorial is:" + f);
    }
}
