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

    String finalValue, storedValue, operation;
    Double finalDoubleValue, storedDoubleValue, result;

    Cal() {
        Frame frame = new Frame();
        frame.addWindowListener(new Close());
        frame.setBackground(Color.yellow);
        frame.setResizable(false);
        frame.setTitle("My Calculator");
        frame.setSize(500, 800);
        frame.setLocationRelativeTo(null);

        Font font1 = new Font("Poppins", Font.BOLD, 30);
        Font font2 = new Font("Quicksand", Font.BOLD, 40);

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
        tf.setFont(font2);
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

        bPercentage.addActionListener(this);
        bCE.addActionListener(this);
        bC.addActionListener(this);
        bClear.addActionListener(this);
        bReciprocal.addActionListener(this);
        bSquare.addActionListener(this);
        bSquareRoot.addActionListener(this);
        bDivision.addActionListener(this);
        b7.addActionListener(this);
        b8.addActionListener(this);
        b9.addActionListener(this);
        bMultiplication.addActionListener(this);
        b4.addActionListener(this);
        b5.addActionListener(this);
        b6.addActionListener(this);
        bSubtraction.addActionListener(this);
        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        bAddition.addActionListener(this);
        bPlusOrMinus.addActionListener(this);
        b0.addActionListener(this);
        bPoint.addActionListener(this);
        bEquals.addActionListener(this);

        frame.add(p1, BorderLayout.NORTH);
        frame.add(p2, BorderLayout.SOUTH);

        frame.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (tf.getText().equals("0")) {
            tf.setText("");
        }

        Object source = e.getSource();

        if (source.equals(b0)) {
            tf.setText(tf.getText() + b0.getLabel());
        } else if (source.equals(b1)) {
            tf.setText(tf.getText() + b1.getLabel());
        } else if (source.equals(b2)) {
            tf.setText(tf.getText() + b2.getLabel());
        } else if (source.equals(b3)) {
            tf.setText(tf.getText() + b3.getLabel());
        } else if (source.equals(b4)) {
            tf.setText(tf.getText() + b4.getLabel());
        } else if (source.equals(b5)) {
            tf.setText(tf.getText() + b5.getLabel());
        } else if (source.equals(b6)) {
            tf.setText(tf.getText() + b6.getLabel());
        } else if (source.equals(b7)) {
            tf.setText(tf.getText() + b7.getLabel());
        } else if (source.equals(b8)) {
            tf.setText(tf.getText() + b8.getLabel());
        } else if (source.equals(b9)) {
            tf.setText(tf.getText() + b9.getLabel());
        } else if (source.equals(bAddition)) {
            finalValue = tf.getText();
            operation = bAddition.getLabel();
            tf.setText("");
        } else if (source.equals(bSubtraction)) {
            finalValue = tf.getText();
            operation = bSubtraction.getLabel();
            tf.setText("");
        } else if (source.equals(bEquals)) {
            storedValue = tf.getText();
            finalDoubleValue = Double.parseDouble(finalValue);
            storedDoubleValue = Double.parseDouble(storedValue);
            if (operation.equals(bAddition.getLabel())) {
                result = finalDoubleValue + storedDoubleValue;
                tf.setText(String.valueOf(result));
            } else if (operation.equals(bSubtraction.getLabel())) {
                result = finalDoubleValue - storedDoubleValue;
                tf.setText(String.valueOf(result));
            }
        }
    }
}

public class Calculator {
    public static void main(String[] args) {
        new Cal();
    }
}
