//26. Program to move different shapes according to the arrow key pressed.

package jp;

import java.awt.*;
import java.awt.event.*;

@SuppressWarnings("serial")
public class P26_KeyboardEvents extends Frame implements KeyListener {
    int x = 150;
    int y = 150;
    final int shapeWidth = 50;
    final int shapeHeight = 50;

    public P26_KeyboardEvents() {
        setTitle("Shape Movement with Arrow Keys");
        setSize(400, 400);
        setVisible(true);
        addKeyListener(this);
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                dispose();
            }
        });
    }

    public void paint(Graphics g) {
      

        g.setColor(Color.RED);
        g.fillRect(x, y, shapeWidth, shapeHeight);

        g.setColor(Color.BLUE);
        g.fillOval(x + 100, y + 100, shapeWidth, shapeHeight);
    }

    public void keyPressed(KeyEvent e) {
        int keyCode = e.getKeyCode();
        switch (keyCode) {
            case KeyEvent.VK_UP:
                y -= 10;
                break;
            case KeyEvent.VK_DOWN:
                y += 10;
                break;
            case KeyEvent.VK_LEFT:
                x -= 10;
                break;
            case KeyEvent.VK_RIGHT:
                x += 10;
                break;
        }
        repaint();
    }

    public void keyReleased(KeyEvent e) {
    }

    public void keyTyped(KeyEvent e) {
    }

    public static void main(String[] args) {
        new P26_KeyboardEvents();
    }
}



