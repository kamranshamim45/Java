public class Sport implements sports{
    public static void main(String[] args){
        sports s = new Sport ();
        s.display();
        mca m = new mca();
        m.pget(9,"kamran", "bihar");
        m.pshow();
        m.sget(101,1011,"MCA");
        m.sshow();
        m.mget(2,6);
        m.mshow();
    }
}
class person{
    int id;
    String name;
    String Address;
    void pget(int id1,String name1,String Address1){
        id = id1;
        name = name1;
        Address = Address1;

    }
    void pshow(){
         System.out.println("ID:"+id);
         System.out.println("Name:"+name);
         System.out.println("Address:"+id);
    }
}
class student extends person{
    int rollno;
    int enrollement;
    String Course;
    void sget(int rollno1,int enrollment1,String Course1){
       rollno = rollno1;
       enrollement = enrollment1;
       Course = Course1;

    }
    void sshow(){
        System.out.println("Roll No:"+rollno);
        System.out.println("Enrollment::"+enrollement);
        System.out.println("Course:"+Course);

    }
}
class mca extends student{
    int sec;
    int subject;
    final String class_teacher="Mamta bansal Mam";
    void mget(int sec1,int subject1){
        sec = sec1;
        subject = subject1;

    }
    void mshow(){
        System.out.println("Section:"+sec);
        System.out.println("Subject:"+subject);
        System.out.println("Class Teacher:"+class_teacher);

    }
}
interface sports {
    final int score =5;
    String game ="cricket";
    default void display(){
        System.out.println("Score:"+score);
        System.out.println("Game:"+game);
    }
}