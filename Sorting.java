import java.util.*;

 public class Sorting {
     public static void printArray(int arr[]) {
         for(int i=0; i<arr.length; i++){
             System.out.print(arr[i]+" ");
        }
       // System.out.println();
    }
    public static void main(String[] args) {
        int arr[] = {7,8,3,1,2,17,13};
        int temp=0;
        //bubble sort
        for(int i=0; i<arr.length-1; i++){
            for(int j=0; j<arr.length-i-1; j++){
                if(arr[j] >arr[j+1]) {

                     temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
                
            }
        }
        // for (int i=0;i<arr.length;i++)
        // {
        //     System.out.print(" "+arr[i]);
        // }
        printArray(arr);
    }
    
 }
