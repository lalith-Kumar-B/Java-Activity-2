//23. Program which creates a frame with two buttons father and mother. When we click the father button the name of the father, his age and designation must appear. When we click mother similar details of mother also appear. 

package jp;

import java.awt.*;
import java.awt.event.*;

@SuppressWarnings("serial")
public class P23_OnclickEventWindow extends Frame implements ActionListener {
    Label lName, lAge, lDesg;

    P23_OnclickEventWindow() {
        lName = new Label("Name : ");
        lName.setBounds(60, 50, 170, 20);
        lAge = new Label("Age : ");
        lAge.setBounds(60, 80, 170, 20);
        lDesg = new Label("Designation : ");
        lDesg.setBounds(60, 110,180,20);

        Button b1 = new Button("Father");
        b1.setBounds(50, 140, 80, 30);
        b1.addActionListener(this); 

        Button b2 = new Button("Mother");
        b2.setBounds(150, 140, 80, 30);
        b2.addActionListener(this); 

        this.add(b1);
        this.add(b2);
        this.add(lName);
        this.add(lAge);
        this.add(lDesg);
        this.setSize(300, 300);
        this.setLayout(null);
        this.setVisible(true);
        
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                dispose(); 
            }
        });
    }

    public static void main(String args[]) {
        new P23_OnclickEventWindow();
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getActionCommand().equals("Father")) {
            lName.setText("Name : Mr.xyz");
            lAge.setText("Age: 45");
            lDesg.setText("Designation : Businessman");
        } else if (e.getActionCommand().equals("Mother")) {
            lName.setText("Name : Mrs.xyz");
            lAge.setText("Age: 44");
            lDesg.setText("Designation : Housewife");
        }
    }
}
