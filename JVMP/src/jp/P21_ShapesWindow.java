//21. Program to draw several shapes in the created window 

package jp;

import java.awt.Frame;
import java.awt.Graphics;
import java.awt.event.*;


@SuppressWarnings("serial")
public class P21_ShapesWindow extends Frame{
	
	 P21_ShapesWindow(){
		 
		 this.setSize(350,300);
		 this.setLayout(null);
		 this.setVisible(true);
		 
		 addWindowListener(new WindowAdapter() {
	            public void windowClosing(WindowEvent e) {
	                dispose(); 
	            }
	        });
	 }
	 
	public void paint(Graphics g) {
		g.drawLine(0,50,100,150);
		g.drawRect(110, 50, 100, 100);
		g.drawOval(230, 50, 100, 100);
	}
	 
    public static void main(String[] args) {
       new P21_ShapesWindow();
    }
}
