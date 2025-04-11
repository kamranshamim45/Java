import java.util.Scanner;

public class PrimeNo {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Welcome to your check prime number");
    System.out.println("Please enter your number");
    int num = sc.nextInt();
    boolean isprime = isprime(num);
    if (isprime){
      System.out.println("your number is prime");
    }else{
      System.out.println("YOur number is not prime");
    }
    
  }
  public static boolean isprime(int num){
    int i = 2;
    while (i < num){
      if (num % i == 0){
        return false;
      }
      i++;
    }
  return true;
  }
}
