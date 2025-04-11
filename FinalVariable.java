import java.io.*;
public class FinalVariable {
  public static void main(String[] args) {
    final int age = 30;
    System.out.println("Age="+age);
     age = 40;
    System.out.println("Age="+age);
  }
}
class FinalDemo{
  public final void display(){
    System.out.println("john is find method");
  }
}
class Test extends FinalDemo{
  public final void display(){
    System.out.println("the final method is overrider");
  }
  public static void main(String[] args) {
    Test t = new Test();
    t.display();
  }
}

