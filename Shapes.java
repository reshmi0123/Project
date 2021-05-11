import java.awt.*;  // Importing awt package
import java.applet.*;  // Importing applet package
 
public class Shapes extends Applet
{
 public void paint(Graphics g)
 {
  g.setFont(new Font("Cambria", Font.BOLD,15));
  g.drawString("Different Shapes", 15, 15);
  g.drawLine(10,20,50,60);
  g.drawRect(10,70,40,40);
  g.setColor(Color.RED);
  g.fillOval(60,20,30,90);
  g.fillArc(60,135,80,40,180,180);
  g.fillRoundRect(20,120,60,30,5,5);
 }
}