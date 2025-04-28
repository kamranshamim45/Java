import java.awt.*;
import java.awt.event.*;

public class Frame extends java.awt.Frame{
  public static void main(String[] args){
    Frame f = new Frame();
    f.setSize(400,400);
    f.setBackground(Color.pink);
    Label l = new Label("Kamran Shamim", Label.CENTER);
    l.setBounds(100,90,200,30);
    Label l2 = new Label("Roll MRT20240210049",Label.CENTER);
    l2.setBounds(100,110,200,30);
    Label l3  = new Label("kamranshamim45@gmail.com", Label.CENTER);
    l3.setBounds(100,130,200,30);
    Label l4 = new Label("Munger,Bihar",Label.CENTER);
    l4.setBounds(100,150,200,30);
    f.add(l);
    f.add(l2);
    f.add(l3);
    f.add(l4);
    f.setLayout(null);
    f.setVisible(true);
    f.addWindowListener(new WindowAdapter(){
      public void windowClosing(WindowEvent we){
        System.exit(0);
      }
    });
      
    


  }
}

