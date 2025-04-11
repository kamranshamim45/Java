import java.util.*;
public class Findindexarray6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number to find:-");
        int n=sc.nextInt();
        int[] arr={10,50,15,25,30,45};
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]==n)
            {
                System.out.println("Index of number is"+i);
            }
        }

    }
    
}
