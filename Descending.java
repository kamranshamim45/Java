import java.io.*;
import java.lang.Runnable;
//import java.util.Scanner;
class Test implements Runnable{
  public void run(){
    for(int i =8; i>=0;i--){
      System.out.println("Thread"+i);
    }
    System.out.println("End of thread T");

  }
  public static void main(String[] args) {
    {
      //  Scanner sc=new Scanner(System.in);
      //  System.out.println("Enter the value of no");
      // int no=sc.nextInt();
      Test y=new Test();
       y.start();
      System.out.println("end of the main thread");
    }
  }
}