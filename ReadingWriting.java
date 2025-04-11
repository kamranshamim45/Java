import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
class ReadingWriting{
  public static void main(String[] args) throws IOException {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter your name");
    String name = sc.nextLine();
    System.out.println("Enter your Roll no:");
    String roll = sc.nextLine();
    System.out.println("Enter your Email id");
    String email = sc.nextLine();

    String str =   "name" + "roll" + "email";
    FileWriter fw = new FileWriter("output.txt");
    for (int i =0; i < str.length(); i++){
      fw.write(str.charAt(i));
      System.out.println("writing Successffully");
     
    }
      fw.close();
   
  }
}