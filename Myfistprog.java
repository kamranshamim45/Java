import java.util.*;
public class Myfistprog {
    public static void main(String[] args) {
        System.out.println("Student management system");
        Scanner sc=new Scanner(System.in);
        //String name;
        //int roll;
        //String course;
        int n;
        System.out.println("Enter Total no.  of student");
        n=sc.nextInt();
        sc.nextLine();
        String[] names = new String[n];
        String[] courses = new String[n];
        int[] rolls = new int[n];

        for(int i=0;i<n;i++){
        System.out.println("Enter name");
        names[i]=sc.nextLine();
        System.out.println("course");
        courses[i]=sc.nextLine();
        System.out.println("Roll");
        rolls[i]=sc.nextInt();
        sc.nextLine();
       
        }
        System.out.println("/nAll Student detail");
        for(int j=0;j<n;j++){
            
            System.out.println("Enter name :"+names[j]);
            System.out.println("course :"+courses[j]);
            
            System.out.println("Roll:"+rolls[j]);
            System.out.println();
            
            
            }

        
            
    }
    
}
