import java.util.*;
public class Myfirstprogram1{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("student management system");
        int n = 0;
        String[] names = null;
        String[] course = null;
        String[] section = null;
        int[] roll = null;

        while (true) {
            System.out.println("/Choose an option");
            System.out.println("1.Enter student details");
            System.out.println("2.Display all student");
            System.out.println("3.Exit");
            int choice = sc.nextInt();

            switch (choice) {
                     case 1:

                    // String name;
                     //string course;
                     //string section;
                     //int roll;

                     System.out.println("Enter total no. of student");
                     n=sc.nextInt();
                     sc.nextLine();
                     names = new String[n];
                     course = new String[n];
                     section = new String[n];
                     roll = new int[n];

                     for(int i=0;i<n;i++){
                        System.out.println("Enter name");
                        names [i]=sc.nextLine();
                        System.out.println("course");
                        course [i]=sc.nextLine();
                        System.out.println("section");
                        section [i]=sc.nextLine();
                        System.out.println("Roll");
                        roll [i]=sc.nextInt();
                        sc.nextLine();
                    
                     }
                     break;

                     case 2:
                     System.out.println("All student details");
                     for(int j=0;j<=n;j++){
                        System.out.println("Enter name:"+names[j]);
                        System.out.println("course :"+course);
                        System.out.println("Section:"+names[j]);

                        System.out.println("Roll:"+roll[j]);
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
