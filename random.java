import java.util.*;
import java.util.ArrayList;
public class random {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int j,a,b,c,d,e,f,g,h,i;
        System.out.println("Enter element");
           a=sc.nextInt();
           b=sc.nextInt();
           c=sc.nextInt();
           d=sc.nextInt();
           e=sc.nextInt();
           f=sc.nextInt();
           g=sc.nextInt();
           h=sc.nextInt();
           i=sc.nextInt();
           j=sc.nextInt();



        ArrayList<Integer> l1=new ArrayList<>();
        // l1.add(23);
        // l1.add(32);
        // l1.add(876);
        // l1.add(75);
        // l1.add(948);
        // l1.add(84);
        // l1.add(455);
        // l1.add(34);
        // l1.add(87);
        // l1.add(96);
        // System.out.println("Before removing element");
        // System.out.println(l1);
        // l1.remove(9);
        // l1.remove(0);
        // System.out.println("After removing element");
        // System.out.println(l1);
        
        l1.add(a);
        l1.add(b);
        l1.add(c);
        l1.add(d);
        l1.add(e);
        l1.add(f);
        l1.add(g);
        l1.add(h);
        l1.add(i);
        l1.add(j);
        //System.out.println(l1);
        System.out.println("even element"); 
        for(int x=0;x<=9;x++)
        {
        
        if(l1.get(x)%2==0)
        { 
        
        System.out.println(l1.get(x));  
        }
    }
    System.out.println("odd element"); 
    for(int x=0;x<=9;x++)
    {
    
    if(l1.get(x)%2!=0)
    { 
    
    System.out.println(l1.get(x));  
    }
}
    }
}
