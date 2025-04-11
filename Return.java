import java.util.*;
public class Return {
  public static void main(String[] args) {
    greet();
    int first = readNumber();
    int second = readNumber();
    int sum = first + second;
    System.out.println("sum of total number is:" + sum);
    
  }
 
  public static int readNumber() {
    Scanner input = new Scanner(System.in);
    System.out.println("enter your number");
    int number = input.nextInt();
    return number;

  }
  public static void greet(){
    System.out.println("welcome to our calculator\n");
  }
}
