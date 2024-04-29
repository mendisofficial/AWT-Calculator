package GUI;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

// Used to close the window when press the close button
class Close extends WindowAdapter {
    public void windowClosing(WindowEvent we) {
        System.exit(0);
    }
}

class Cal implements ActionListener {
    @Override
    public void actionPerformed(ActionEvent e) {

    }

    Cal() {
        Frame frame = new Frame();
        frame.addWindowListener(new Close());
        frame.setBackground(Color.yellow);
        frame.setResizable(false);
        frame.setTitle("My Calculator");
        frame.setSize(500, 800);

        Font font1 = new Font("Poppins", Font.BOLD, 30);
        Font font2 = new Font("Quicksand", Font.BOLD, 30);
        Font font3 = new Font("Quicksand", Font.BOLD, 40);

        MenuBar mb = new MenuBar();

        Menu m1 = new Menu("View");
        MenuItem mi1 = new MenuItem("Standard");
        m1.add(mi1);

        Menu m2 = new Menu("Edit");
        MenuItem mi2 = new MenuItem("Copy");
        MenuItem mi3 = new MenuItem("Cut");
        m2.add(mi2);
        m2.add(mi3);

        mb.add(m1);
        mb.add(m2);

        frame.setMenuBar(mb);
        frame.setVisible(true);
    }
}

public class Calculator {
    public static void main(String[] args) {
        new Cal();
    }
}
