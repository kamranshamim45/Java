import java.util.*;
class Bitwise{
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Shoowcasing bitwise And operator \n");
    System.out.println("Please enter yourr first number");
    int first = sc.nextInt();
    System.out.println("Now, enter the other number");
    int second = sc.nextInt();

    int result = first & second;
    System.out.println("resullt is:"+ result);

  }
}