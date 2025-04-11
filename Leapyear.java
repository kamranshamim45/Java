import java.util.*;
public class Leapyear {
 public static void main(String[] args) {
  Scanner input = new Scanner(System.in);
  System.out.println("Enter your Year:");
  int year = input.nextInt();
  if (year % 4 == 0 && year % 100 !=0){
    System.out.println(year + "is a leap year.");
  }else if(year % 400 ==0){ 
  }else{
    System.out.println(year + "is not a leap year");
  }
 }

}
