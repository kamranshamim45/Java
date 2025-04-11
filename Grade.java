import java.util.*;
public class Grade {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.println("Enter your Percentage");
    float Percentage= input.nextFloat();
    if(Percentage>=90){
     System.out.println("Your Grade is 'A'");
    }else if(Percentage>=75){
      System.out.println("Your Grade is 'B'");
    }else if(Percentage>=60){
      System.out.println("Your Grade is'C'");
    }else if(Percentage>=30){
      System.out.println("Your Grade is'D'");
    }else if(Percentage<=30){
      System.out.println("You Grade is 'F'");
    }
  }
}
