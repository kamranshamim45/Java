import java.util.*;
public class OddSum {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.println("Welcome to odd sum");
    System.out.print("please enter your number: ");
    int num = input.nextInt();
    int sum = oddSum(num);
    System.out.println("oddSum till:" + num + "is:" + sum);
  }
  public static int oddSum(int num){
    int sum = 0;
    int i = 1;
    while (i <= num) {
      sum += i;
      i += 2;
    }
    return sum;
  }
}
