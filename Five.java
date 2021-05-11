import java.applet.Applet;
import java.awt.Color;
import java.awt.Graphics;

public class Five extends Applet{
    public void init()
    {
        setSize(400, 400);

        repaint();
    }

    public void paint(Graphics g)
    {
        g.setColor(Color.blue);
        g.fillRect(90, 90, 220, 220);
        try{
            Thread.sleep(300);
        }catch (Exception e){
            try {
                throw e;
            } catch (InterruptedException interruptedException) {
                interruptedException.printStackTrace();
            }
        }


        g.setColor(Color.yellow);
        g.fillRect(100, 100, 200, 200);
        try{
            Thread.sleep(600);
        }catch (Exception e){
            try {
                throw e;
            } catch (InterruptedException interruptedException) {
                interruptedException.printStackTrace();
            }
        }
        g.setColor(Color.red);
        g.fillRect(110, 110, 180, 180);
        try{
            Thread.sleep(900);
        }catch (Exception e){
            try {
                throw e;
            } catch (InterruptedException interruptedException) {
                interruptedException.printStackTrace();
            }
        }
        g.setColor(Color.pink);
        g.fillRect(120, 120, 160, 160);
        try{
            Thread.sleep(1200);
        }catch (Exception e){
            try {
                throw e;
            } catch (InterruptedException interruptedException) {
                interruptedException.printStackTrace();
            }
        }
        g.setColor(Color.green);
        g.fillRect(130, 130, 140, 140);
    }
}