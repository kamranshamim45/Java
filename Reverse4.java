import java.util.Scanner;
public class Reverse4 {
    public static void main(String[] args) {
        Scanner sc= new Scanner (System.in);
        System.out.println("Welcome to your reverse");
        System.out.println("Enter number to reverse of");
        int num = sc.nextInt();
        int reverse = reverse(num);
        System.out.println("Reverse of your number is:"+ reverse);
    }
    public static int reverse(int num){
        int newNum = 0;
        while (num> 0){
            int digit = num % 10;
            newNum = newNum * 10 + digit;
            num /= 10;
        }
        return  newNum;
    }
}
