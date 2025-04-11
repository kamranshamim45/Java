import java.util.*;
public class Pattern{
    public static void main(String[] args) {
      greet();
     int first = readNumber();
     int second = readNumber(); 
     int third = readNumber(); 
     int sum = first + second + third; 
     System.out.println("sum of the number:"+ sum); 

    }
    public static int readNumber() {
      Scanner input = new Scanner(System.in);
      System.out.println("please enter the number:");
      int number = input.nextInt();
      return number;
    }
    public static void greet(){
      System.out.println("welcome to our clculator\n");
    }
      }
       
    
