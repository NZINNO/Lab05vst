// Lab05vst.java
// This is the student, starting version of the Lab05 assignment.


import java.awt.*;
import java.applet.*;


public class Lab05vst extends Applet
{
	public void paint(Graphics g)
	{
		int width = 980;
		int height = 630;
		int x1 = 10;
		int y1 = 640;
		int x2 = 990;
		int y2 = 640;
		g.drawRect(10,10,980,630);
		for(int k=1; k<640; k+=10)
		{
			g.drawLine(x1,y1,x2,y2);
			y2 -=10;
			x1 +=15;
		}
		for(int k=1; k<640; k+=10)
		{
			g.drawLine(x2,y1,x1,y2);
			y2 +=5;
			x1 -=15;
		}
	}

}
