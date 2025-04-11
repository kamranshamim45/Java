import java.util.Scanner;

public class Add {
    public static void main(String[] args) {
        System.out.println("enter any number");
        Scanner Sc= new Scanner(System.in);
        int a=Sc.nextInt();
        int b=Sc.nextInt();
        int c=a+b;
        System.out.println("sum "+c);

    }
}
