import java.util.*;
public class Celsius {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to Temperature Converter:");
        System.out.println("Enter your temp in F:");
        float fah = sc.nextFloat();
        float cel = (fah-32)*5/9;
        System.out.println("Your temperature is:"+cel + "C");
    }

}
