import java.applet.Applet;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.*;
import java.awt.event.*;
public class NewApplet extends Applet implements ActionListener {
 Label l1,l2;
 TextField t1;
 Button btn;
 public void init() {
 // TODO start asynchronous download of heavy resources
 l1=new Label("Enter Number");
 l2=new Label("Result");
 t1=new TextField();
 btn=new Button("Check");
 add(l1);
 add(t1);
 add(btn);
 add(l2);
 btn.addActionListener(this);
 }
 public void actionPerformed(ActionEvent e){
 if(e.getSource() == btn){
 if(Integer.parseInt(t1.getText())%2==0){
 l2.setText(t1.getText()+" is even");
 }
 else
 {
 l2.setText(t1.getText()+" is Odd");
 }
 }
 }
}