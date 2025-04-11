public class Array{
  public static void main(String[] args) {
    // int[] myArr = new int[5];
    // myArr[0] = 98;
    // myArr[1] = 65;
    // myArr[2] = 55;
    // myArr[3] = 78;
    // myArr[4] = 86;
    int[] myArr = {98,65,55,78,86};
    // int index = 2;
    // System.out.println(myArr[0]);
    // System.out.println(myArr[1]);
    // System.out.println(myArr[index]);
    // System.out.println(myArr[3]);
    // System.out.println(myArr[4]);
    int index = 0;
    while (index < myArr.length){
      System.out.println(myArr[index]);
      index++;

    }
  
  String[] strArr = new String[4];
  strArr[0] = "My String";
  String[] newStrArr = {"first","second","third","fourth"};
  System.out.println(newStrArr.length);
}

}