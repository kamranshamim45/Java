import java.io.*;
class ReadingBytes{
    public static void main(String[] args) {
    FileInputStream infile = null;
    int b;
    try{
      infile = new FileInputStream("cities_list.txt");
      while ((b = infile.read())!= -1){
        System.out.println((char)b);
      }
      infile.close();
    }
    catch (IOException e){
      System.out.println(e);
      
    }
  }
}