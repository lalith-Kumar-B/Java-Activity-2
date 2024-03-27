//24. Create a frame which displays your personal details with respect to a button click 

package jp;


import java.awt.*;
import java.awt.event.*;

@SuppressWarnings("serial")
public class P24_PersonalDetailFrame extends Frame implements ActionListener{
	
	Label lName,lAge,lPhone,lState;
	Button b;
	
	P24_PersonalDetailFrame(){
		
		lName = new Label();
		lName.setBounds(60,50,170,20);
		this.add(lName);
		
		lAge = new Label();
		lAge.setBounds(60,80,170,20);
		this.add(lAge);
		
		lPhone = new Label();
		lPhone.setBounds(60,110,170,20);
		this.add(lPhone);
		
		lState = new Label();
		lState.setBounds(60,140,180,20);;
		this.add(lState);
		
		b = new Button("View Details");
		b.setBounds(60, 170, 110, 30);
		b.addActionListener(this);
		this.add(b);
		
		this.setTitle("Personal Details");
		this.setSize(300, 300);
        this.setLayout(null);
        this.setVisible(true);
        
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                dispose(); 
            }
        });
		
	}
	
	
	public void actionPerformed(ActionEvent e) {
		if(e.getActionCommand().equals("View Details")) {
			lName.setText("Name : Lalith");
			lAge.setText("Age : 19");
			lPhone.setText("Phone : +91830202*9**");
			lState.setText("State : Rajasthan");
			b.setLabel("Hide Details");
		}
		if(e.getActionCommand().equals("Hide Details")) {
			lName.setText(null);
			lAge.setText(null);
			lPhone.setText(null);
			lState.setText(null);
			b.setLabel("View Details");
		}
		
		
	}
	public static void main(String[] args) {
		new P24_PersonalDetailFrame();
	}

}
