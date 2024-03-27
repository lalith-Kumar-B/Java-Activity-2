//20. Program which create and displays a message on the window 

package jp;
import java.awt.Frame;
import java.awt.Label;
import java.awt.event.*;

@SuppressWarnings("serial")
class MsgFrame extends Frame{
	
	MsgFrame(){
		Label m = new Label("My first Program using Awt package in Java.");
		m.setBounds(20,50,300,20);
		this.add(m);
		this.setSize(350,200);
		this.setTitle("Message Window");
		this.setLayout(null);
		this.setVisible(true);
		
		addWindowListener(new WindowAdapter() {
	            public void windowClosing(WindowEvent e) {
	                dispose(); 
	            }
	        });
	}
}

public class P20_MsgWindow {
    public static void main(String[] args) {
    	@SuppressWarnings("unused")
		MsgFrame a = new MsgFrame();
    }
}