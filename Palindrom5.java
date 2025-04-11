import java.util.*;
public class Palindrom5 {
        public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to your Palindrome number");
        System.out.println("Enter your number");
        int num = sc.nextInt();
        boolean isPalindrome = isPalindrome(num); 
        if (isPalindrome) {
            System.out.println("Your number is a Palindrome");
        } else { 
            
            System.out.println("Your number is not Palindrome");
        }
        
    }

    public static boolean isPalindrome(int num){
        int reverse = reverse(num);
        return num == reverse;
    }

    public static int reverse(int num){
        int newNum = 0;
        while (num> 0){
            int digit = num % 10;
            newNum = newNum * 10 + digit;
            num /= 10;
        }
        return  newNum;
        
        }

        }
    

