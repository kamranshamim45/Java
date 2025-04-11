import java.util.*;
public class MultiplicationTable {
  public static void main(String[] args) {
    
    System.out.println("welcome to multiplication world\n");
    System.out.println("please enter your number");
    
    printMultiplicationTable();

  }
  public static void printMultiplicationTable(){
    Scanner input = new Scanner(System.in);
    int num = input.nextInt();
  int i = 1;
  while(i<=10){
    System.out.println(num +"X"+ i + "=" + (num*i));
    i++;
  }
  }
}
