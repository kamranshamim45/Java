import java.util.*;
public class Reverse {
   public static void main(String[] args) {
    Scanner Sc = new Scanner(System.in);
    int num=Sc.nextInt();
    int result = 0;
    while (num>0){
        num = ((num%10)+(result*10));
        result = num/10;
        
    }
    System.out.println(result);
   } 
}
