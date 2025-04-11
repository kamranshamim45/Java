public class SortedArray {
  public static void main(String[] args) {
    System.out.println("Welcome to Array Sorting CheckPost");
    int[] numArr = ArrayUtility.inputArray();
    boolean isDecreasing = isDecreasing(numArr);
    boolean isIncreasing = isIncreasing(numArr);
    if (isDecreasing || isIncreasing){
      System.out.println("Your Array is sorted ");
    } else {
      System.out.println("Your Array i not Sorted");
    }
  }

    public static boolean isDecreasing(int[] numArr){
      int i = 1;
      while (i < numArr.length){
      if (numArr[i] > numArr[i-1]){
        return false;
      }
      i++;
      }
      return true;
      
    }
    public static boolean isIncreasing(int[] numArr){
      int i = 1;
      while(i < numArr.length){
        if (numArr[i] < numArr[i-1]){
          return false;
        }
        
        i++;
      }
     return true;
  
    
  }
    
  
  }
 