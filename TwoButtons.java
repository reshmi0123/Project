import java.awt.*;
import java.awt.event.*;//necessary for buttons
import java.applet.*;

public class TwoButtons extends Applet implements ActionListener 
{
	//Declare a new string, and make a new "empty" mailbox
	String sMessage = new String("");
	
	//Declare two new buttons
	Button Button1;
	Button Button2;
	
	public void init() 
        {
		setBackground(Color.white);

		//Turn Layout manager off
		setLayout(null);
		
		//Initialize the buttons and give them names
		Button1 = new Button("First");
		Button2 = new Button("Second");
		
		//add the buttons to the applet
		add(Button1);
		add(Button2);

		//Position Buttons(X, Y, Width, Height);
		Button1.setBounds(10,20,50,20);
		Button2.setBounds(10,60,50,20);
		
		//Change color of Buttons
		Button1.setBackground(Color.red);
		Button2.setBackground(Color.blue);
		
		//Change color of text on Buttons
		Button1.setForeground(Color.blue);
		Button2.setForeground(Color.white);
		
		//Make a new method that "listens" for the button press
		Button1.addActionListener(this);
		Button2.addActionListener(this);
	}
	
	public void actionPerformed(ActionEvent ae) 
        {
		//store the name of the button pressed in sString
		String sString = ae.getActionCommand();
		if (sString.equals("First"))
			sMessage = "you have passed RED";
		else if (sString.equals("Second"))
			sMessage = "you have pressed BLUE";
		repaint();
	}
	
	public void paint (Graphics g) 
        {
		g.drawString(sMessage,10,100);
	}
}