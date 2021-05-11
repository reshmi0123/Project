import java.awt.*;
import java.applet.*;

public class Sample extends Applet
{
    String msg;
    public void init()
    {
        setBackground(Color.cyan);
        setForeground(Color.red);
        msg="This is an applet example";
    }
    public void start()
    {
        System.out.println("Starting of applet");
    }
    public void stop()
    {
        System.out.println("Stopping of applet");
    }
    public void destroy()
    {
        System.out.println("Exiting of applet");
    }
    public void paint(Graphics g)
    {
        g.drawString(msg,10,30);
    }
}
        