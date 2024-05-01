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
    TextField tf;

    Button b0, b1, b2, b3, b4, b5, b6, b7, b8, b9, bPercentage, bAddition, bSubtraction, bMultiplication, bDivision, bPlusOrMinus, bCE, bC, bEquals,
            bClear, bReciprocal, bSquare, bSquareRoot, bPoint;

    Cal() {
        Frame frame = new Frame();
        frame.addWindowListener(new Close());
        frame.setBackground(Color.yellow);
        frame.setResizable(false);
        frame.setTitle("My Calculator");
        frame.setSize(500, 800);
        frame.setLocationRelativeTo(null);

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

        Panel p1 = new Panel(); // For display
        Panel p2 = new Panel(); // For buttons

        GridLayout g1 = new GridLayout(6, 4, 4, 4);

        p2.setLayout(g1);
        p2.setBackground(Color.black);

        tf = new TextField(20);
        tf.setFont(font3);
        tf.setEditable(true);
        tf.setForeground(Color.black);
        tf.setBackground(Color.white);
        tf.setText("0");

        p1.add(tf);

        b0 = new Button("0");
        b1 = new Button("1");
        b2 = new Button("2");
        b3 = new Button("3");
        b4 = new Button("4");
        b5 = new Button("5");
        b6 = new Button("6");
        b7 = new Button("7");
        b8 = new Button("8");
        b9 = new Button("9");
        bAddition = new Button("+");
        bSubtraction = new Button("-");
        bMultiplication = new Button("*");
        bDivision = new Button("/");
        bPlusOrMinus = new Button("+/-");
        bCE = new Button("CE");
        bC = new Button("C");
        bPercentage = new Button("%");
        bEquals = new Button("=");
        bClear = new Button("Clear");
        bReciprocal = new Button("1/x");
        bSquare = new Button("x^2");
        bSquareRoot = new Button("sqrt");
        bPoint = new Button(".");

        b0.setBackground(Color.white);
        b1.setBackground(Color.white);
        b2.setBackground(Color.white);
        b3.setBackground(Color.white);
        b4.setBackground(Color.white);
        b5.setBackground(Color.white);
        b6.setBackground(Color.white);
        b7.setBackground(Color.white);
        b8.setBackground(Color.white);
        b9.setBackground(Color.white);
        bAddition.setBackground(Color.white);
        bSubtraction.setBackground(Color.white);
        bMultiplication.setBackground(Color.white);
        bDivision.setBackground(Color.white);
        bPlusOrMinus.setBackground(Color.white);
        bCE.setBackground(Color.white);
        bC.setBackground(Color.white);
        bPercentage.setBackground(Color.white);
        bEquals.setBackground(Color.white);
        bClear.setBackground(Color.white);
        bReciprocal.setBackground(Color.white);
        bSquare.setBackground(Color.white);
        bSquareRoot.setBackground(Color.white);
        bPoint.setBackground(Color.white);

        b0.setFont(font1);
        b1.setFont(font1);
        b2.setFont(font1);
        b3.setFont(font1);
        b4.setFont(font1);
        b5.setFont(font1);
        b6.setFont(font1);
        b7.setFont(font1);
        b8.setFont(font1);
        b9.setFont(font1);
        bAddition.setFont(font1);
        bSubtraction.setFont(font1);
        bMultiplication.setFont(font1);
        bDivision.setFont(font1);
        bPlusOrMinus.setFont(font1);
        bCE.setFont(font1);
        bC.setFont(font1);
        bPercentage.setFont(font1);
        bEquals.setFont(font1);
        bClear.setFont(font1);
        bReciprocal.setFont(font1);
        bSquare.setFont(font1);
        bSquareRoot.setFont(font1);
        bPoint.setFont(font1);

        p2.add(bPercentage);
        p2.add(bCE);
        p2.add(bC);
        p2.add(bClear);
        p2.add(bReciprocal);
        p2.add(bSquare);
        p2.add(bSquareRoot);
        p2.add(bDivision);
        p2.add(b7);
        p2.add(b8);
        p2.add(b9);
        p2.add(bMultiplication);
        p2.add(b4);
        p2.add(b5);
        p2.add(b6);
        p2.add(bSubtraction);
        p2.add(b1);
        p2.add(b2);
        p2.add(b3);
        p2.add(bAddition);
        p2.add(bPlusOrMinus);
        p2.add(b0);
        p2.add(bPoint);
        p2.add(bEquals);

        frame.add(p1, BorderLayout.NORTH);
        frame.add(p2, BorderLayout.SOUTH);

        frame.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }
}

public class Calculator {
    public static void main(String[] args) {
        new Cal();
    }
}
