import java.util.*;
public class Relational {
   public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.println("Welcome to Driving license portal:");
    System.out.println("Enter your Age");
    int age = input.nextInt();
    if(age>=18){
        System.out.println("You are Eligible to Driving License");
    }else {
        System.out.println("You are not Eligible for Driving License");
    }
   } 
}
