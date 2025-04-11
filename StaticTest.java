import java.io*;
public class StaticTest {
  int add(int a,int b){
    return a+b;
  }
  static int sub(int a, int b){
    return a-b;
  }
  public class Mainclass{
    public static void main(String[] args) {
      
    }
    StaticTest st = new StaticTest();
    System.out.println("sum"+ st.add(5,6));
    System.out.println("subtraction="+StaticTest.sub(3,2));
  }
}
