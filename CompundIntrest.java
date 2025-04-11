
import java.util.*;
public class CompundIntrest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your number amount");
        double principal = input.nextDouble();
        System.out.println("Enter your rate of intrest");
        double rate = input.nextDouble();
        System.out.println("Enter your time taken");
        int time = input.nextInt();
        double amount =  principal * Math.pow((1 + rate / 100), time);
        System.out.println(amount);
    }
}