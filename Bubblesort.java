
import java.util.*;
public class Bubblesort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int size=sc.nextInt();
        int[] A = new int[size];
        for (int i = 0; i < size; i++) {
            A[i] = sc.nextInt();
        }

       // int[] A={5,4,7,2,1};
        int temp=0;
        for (int i=0;i<size-1;i++)
        {
            
            for (int j=0;j<size-1-i;j++)
         {
           if(A[j]>A[j+1])
           {
            temp=A[j];
            A[j]=A[j+1];
            A[j+1]=temp;
           }
         }
        }
        for (int i=0;i<size;i++)
        {
            System.out.print(" "+A[i]);
        }
        
    }
}
