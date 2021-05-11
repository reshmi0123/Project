import java.awt.*;
import java.applet.*;

public class Sample1 extends Applet
{
    String msg;
    public void init()
    {
        setBackground(Color.cyan);
        setForeground(Color.red);
        msg="Inside init()";
    }
    public void start()
    {
        msg+="Inside start()...";
    }
    public void paint(Graphics g)
    {
        msg+="Inside paint()...";
        g.drawString(msg,10,30);
    }
}
        