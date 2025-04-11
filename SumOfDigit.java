import java.util.Scanner;

class SumOfDigit{
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Welcome to the sum of Digits");
    System.out.println("Please enter your number: ");
    int num = sc.nextInt();
    int sum = sumOfDigit(num);
    System.out.println("Sum of Digits is:"+ sum);
  }
  public static int sumOfDigit(int num){
    int sum = 0;
    while(num>0){
      sum = sum + num % 10;
      num = num /10;
    }
    return sum;
   
  }
}