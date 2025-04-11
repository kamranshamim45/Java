// // import java.util.*;

// // public class Solution {

// //     public static void main(String[] args) {
// //         Scanner scan = new Scanner(System.in);
// //         int a = scan.nextInt();
// //         int b=scan.nextInt();
// //         int c=scan.nextInt();
// //         System.out.println("myInt: "+a);
// //         System.out.println("myInt: "+b);
// //         System.out.println("myInt: "+c);
// //         scan.close();
    
// //         // Complete this line
// //         // Complete this line
// //         // Complete this line
// //     }
// // }
// import java.util.Scanner;

// public class Solution {

//     public static void main(String[] args) {
//         Scanner scanner = new Scanner(System.in);
//         int i = scanner.nextInt();
//         System.out.print(" Enter an integer:");
//         int integerInput = scanner.nextInt();
//         System.out.println(42);
        
//         // Read a double from the second line
//         System.out.print("Enter a double: ");
//         double doubleInput = scanner.nextDouble();
//         System.out.println(3.1415);
        
//         // Consume the newline character left after nextDouble
//         scanner.nextLine();
        
//         // Read a string from the third line
//         System.out.print("Enter a string: ");
//         String StringInput = scanner.nextLine();
//         System.out.println("Welcome to HackerRank's Java tutorials!");
        
//         // Write your code here.

//         System.out.println("String:" + StringInput  );
//         System.out.println("Double: " + doubleInput );
//         System.out.println("Int: " +  integerInput );
        
//         scanner.close();
//     }
// }
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("================================");
        for(int i=0;i<3;i++){
            String s1=sc.next();
            sc.nextInt();
            int x=sc.nextInt();
            //Complete this line
            System.out.println(s1+" " +x );
        }
        
        System.out.println("================================");
        
        
        
    }
}