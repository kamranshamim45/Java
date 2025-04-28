import java.awt.*;
import java.awt.event.*;
public class TextAreaExample2 extends Frame implements ActionListener{
  Label l1,l2;
  TextArea area;
  Button b;
  TextAreaExample2(){
    l1 = new Label();
    l1.setBounds(50,50,100,30);
    l2 = new Label();
    l2.setBounds(50,100,100,30);
    b = new Button("Count Words");
    b.setBounds(50,150,100,30);
    b.addActionListener(this);
    add(l1);
    add(l2);
    add(area);
    add(b);
    setSize(400,400);
    setLayout(null);
    setVisible(true);
  }
      public void actionperformed(ActionEvent e){
        String text = area.getText();
        String words[] = text.split("\\s");
        l1.setText("Words: " + words.length);
        l2.setText("Characters: " + text.length());

      }
      public static void main(String args[]){
        new TextAreaExample2();
      }
    

  }
