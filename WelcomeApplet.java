
import java.awt.Graphics; // program uses class Graphics
 import javax.swing.JApplet; // program uses class JApplet 
 
 public class WelcomeApplet extends JApplet
 {
 // draw text on applet's background 
  public void paint( Graphics g ) 
{
  super.paint( g ); 
 g.drawString( "Running JAVA Applets!", 50, 50 );
 } // end method paint 
} // end class WelcomeApplet