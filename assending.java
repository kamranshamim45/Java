import java.util.Scanner;
public class assending {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the number of elements in the array:");
    int n = sc.nextInt();
    int arr[] = new int[n];
    System.out.println("Enter the elements of the array:");
    for(int i = 0; i < n;i++){
      arr[i] = sc.nextInt();

    }
    System.out.println("The elements of the array in ascending order are:");
    for(int i = 0; i< n; i++){
      for(int j=i+1;j<n;j++){
      if (arr[i] > arr[j]){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;

      }
      }
    }
    for (int i = 0;i<n;i++){
      System.out.println(arr[i]+" ");
    }
    System.out.println();
  }
}