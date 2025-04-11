import java.net.*;
import java.io.*;
public class FindIPAddress{
  public static void main(String[] args) throws IOException {
    InetAddress a = InetAddress.getLocalHost();
    System.out.println("Host and Address" +a);
    System.out.println("Host name:"+ a.getHostName());
    String s = a.toString();
    System.out.println("IPAddress"+ s.substring(s.indexOf("/")+1));
  }
}