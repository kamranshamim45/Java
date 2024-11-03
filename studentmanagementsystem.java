import java.util.*;
public class studentmanagementsystem {
    public static void main(String[] args) {
         Scanner sc=new Scanner(System.in);
        System.out.println("Student management system");
         int n = 0;
        String[] names = null;
        String[] courses = null;
        int[] rolls = null;
        
         while (true) {
            System.out.println("\nChoose an option:");
            System.out.println("1. Enter Student Details");
            System.out.println("2. Display All Student Details");
            System.out.println("3. Exit");
            int choice = sc.nextInt();

        switch (choice) {
                case 1:
       
        //String name;
        //int roll;
        //String course;
        
        System.out.println("Enter Total no.  of student");
        n=sc.nextInt();
        sc.nextLine();
        names = new String[n];
        courses = new String[n];
        rolls = new int[n];

        for(int i=0;i<n;i++){
        System.out.println("Enter name");
        names[i]=sc.nextLine();
        System.out.println("course");
        courses[i]=sc.nextLine();
        System.out.println("Roll");
        rolls[i]=sc.nextInt();
        sc.nextLine();
       
        }
        break;

       case 2:
        System.out.println("All Student detail");
        for(int j=0;j<n;j++){
            
            System.out.println("Enter name :"+names[j]);
            System.out.println("course :"+courses[j]);
            
            System.out.println("Roll:"+rolls[j]);
            System.out.println();
            
            
            }
            break;
        case 3:
                    System.out.println("Exiting the program.");
                    sc.close(); 
                    return; 

                default:
                    System.out.println("Invalid choice! Please select a valid option.");
                    break;
            }

        
            
    }
}
     }