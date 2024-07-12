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

    Button b0, b1, b2, b3, b4, b5, b6, b7, b8, b9,
            bPercentage, bAddition, bSubtraction, bMultiplication, bDivision, bPlusOrMinus, bClear, bEquals,
            bBackSpace, bReciprocal, bSquare, bSquareRoot, bPoint, bExponent, bFactorial,
            bMemoryClear, bMemoryRecall, bMemoryStore, bMemoryPlus, bMemoryMinus;

    String finalValue, storedValue, operation;
    Double finalDoubleValue, storedDoubleValue, result;

    String memoryStoredValue;
    Double memoryStoredDoubleValue;

    Cal() {
        Frame frame = new Frame();
        frame.addWindowListener(new Close());
        frame.setBackground(Color.pink);
        frame.setResizable(false);
        frame.setTitle("My Calculator");
        frame.setSize(800, 600);
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
        bClear = new Button("Clear");
        bPercentage = new Button("%");
        bEquals = new Button("=");
        bBackSpace = new Button("BackSpace");
        bReciprocal = new Button("1/x");
        bSquare = new Button("x^2");
        bSquareRoot = new Button("sqrt");
        bExponent = new Button("x^y");
        bPoint = new Button(".");
        bMemoryClear = new Button("MC");
        bMemoryRecall = new Button("MR");
        bMemoryStore = new Button("MS");
        bMemoryPlus = new Button("M+");
        bMemoryMinus = new Button("M-");
        bFactorial = new Button("!");

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
        bClear.setBackground(Color.white);
        bPercentage.setBackground(Color.white);
        bEquals.setBackground(Color.white);
        bBackSpace.setBackground(Color.white);
        bReciprocal.setBackground(Color.white);
        bSquare.setBackground(Color.white);
        bSquareRoot.setBackground(Color.white);
        bExponent.setBackground(Color.white);
        bPoint.setBackground(Color.white);
        bMemoryClear.setBackground(Color.white);
        bMemoryRecall.setBackground(Color.white);
        bMemoryStore.setBackground(Color.white);
        bMemoryPlus.setBackground(Color.white);
        bMemoryMinus.setBackground(Color.white);
        bFactorial.setBackground(Color.white);

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
        bClear.setFont(font1);
        bPercentage.setFont(font1);
        bExponent.setFont(font1);
        bEquals.setFont(font1);
        bBackSpace.setFont(font1);
        bReciprocal.setFont(font1);
        bSquare.setFont(font1);
        bSquareRoot.setFont(font1);
        bPoint.setFont(font1);
        bMemoryClear.setFont(font1);
        bMemoryRecall.setFont(font1);
        bMemoryStore.setFont(font1);
        bMemoryPlus.setFont(font1);
        bMemoryMinus.setFont(font1);
        bFactorial.setFont(font1);

        // first row
        p2.add(bMemoryClear);
        p2.add(bMemoryRecall);
        p2.add(bMemoryStore);
        p2.add(bMemoryPlus);
        p2.add(bMemoryMinus);
        // second row
        p2.add(bClear);
        p2.add(bPercentage);
        p2.add(bExponent);
        p2.add(bDivision);
        p2.add(bReciprocal);
        // third row
        p2.add(b7);
        p2.add(b8);
        p2.add(b9);
        p2.add(bMultiplication);
        p2.add(bSubtraction);
        // fourth row
        p2.add(b4);
        p2.add(b5);
        p2.add(b6);
        p2.add(bAddition);
        p2.add(bEquals);
        // fifth row
        p2.add(b1);
        p2.add(b2);
        p2.add(b3);
        p2.add(bPlusOrMinus);
        p2.add(bBackSpace);
        // sixth row
        p2.add(b0);
        p2.add(bPoint);
        p2.add(bSquareRoot);
        p2.add(bSquare);
        p2.add(bFactorial);

        bPercentage.addActionListener(this);
        bClear.addActionListener(this);
        bBackSpace.addActionListener(this);
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
        bExponent.addActionListener(this);
        bFactorial.addActionListener(this);
        bMemoryClear.addActionListener(this);
        bMemoryRecall.addActionListener(this);
        bMemoryStore.addActionListener(this);
        bMemoryPlus.addActionListener(this);
        bMemoryMinus.addActionListener(this);


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
            tf.setText("0");
        } else if (source.equals(bSubtraction)) {
            finalValue = tf.getText();
            operation = bSubtraction.getLabel();
            tf.setText("0");
        } else if (source.equals(bMultiplication)) {
            finalValue = tf.getText();
            operation = bMultiplication.getLabel();
            tf.setText("0");
        } else if (source.equals(bDivision)) {
            finalValue = tf.getText();
            operation = bDivision.getLabel();
            tf.setText("0");
        } else if (source.equals(bExponent)) {
            finalValue = tf.getText();
            operation = bExponent.getLabel();
            tf.setText("0");
        } else if (source.equals(bReciprocal)) {
            finalValue = tf.getText();
            finalDoubleValue = Double.parseDouble(finalValue);
            result = 1 / finalDoubleValue;
            tf.setText(String.valueOf(result));
        } else if (source.equals(bSquare)) {
            finalValue = tf.getText();
            finalDoubleValue = Double.parseDouble(finalValue);
            result = Math.pow(finalDoubleValue, 2);
            tf.setText(String.valueOf(result));
        } else if (source.equals(bPlusOrMinus)) {
            finalValue = tf.getText();
            finalDoubleValue = Double.parseDouble(finalValue);
            result = -finalDoubleValue;
            tf.setText(String.valueOf(result));
        } else if (source.equals(bFactorial)) {
            finalValue = tf.getText();
            finalDoubleValue = Double.parseDouble(finalValue);
            double result = 1;
            for (int i = 1; i <= finalDoubleValue; i++) {
                result *= i;
            }
            tf.setText(String.valueOf(result));
        } else if (source.equals(bClear)) {
            tf.setText("0");
        } else if (source.equals(bPoint)) {
            tf.setText(tf.getText() + bPoint.getLabel());
        } else if (source.equals(bBackSpace)) {
            String s = tf.getText();
            tf.setText("");
            for (int i = 0; i < s.length() - 1; i++) {
                tf.setText(tf.getText() + s.charAt(i));
            }
        } else if (source.equals(bSquareRoot)) {
            finalValue = tf.getText();
            finalDoubleValue = Double.parseDouble(finalValue);
            result = Math.sqrt(finalDoubleValue);
            tf.setText(String.valueOf(result));
        } else if (source.equals(bPercentage)) {
            finalValue = tf.getText();
            finalDoubleValue = Double.parseDouble(finalValue);
            result = finalDoubleValue / 100;
            tf.setText(String.valueOf(result));
        } else if (source.equals(bMemoryClear)) {
            memoryStoredValue = "";
            memoryStoredDoubleValue = 0.0;
        } else if (source.equals(bMemoryStore)) {
            memoryStoredValue = tf.getText();
            memoryStoredDoubleValue = Double.parseDouble(memoryStoredValue);
        } else if (source.equals(bMemoryRecall)) {
            tf.setText(String.valueOf(memoryStoredDoubleValue));
        } else if (source.equals(bMemoryPlus)) {
            storedValue = tf.getText();
            storedDoubleValue = Double.parseDouble(storedValue);
            memoryStoredDoubleValue += storedDoubleValue;
        } else if (source.equals(bMemoryMinus)) {
            storedValue = tf.getText();
            storedDoubleValue = Double.parseDouble(storedValue);
            memoryStoredDoubleValue -= storedDoubleValue;
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
            } else if (operation.equals(bMultiplication.getLabel())) {
                result = finalDoubleValue * storedDoubleValue;
                tf.setText(String.valueOf(result));
            } else if (operation.equals(bDivision.getLabel())) {
                result = finalDoubleValue / storedDoubleValue;
                tf.setText(String.valueOf(result));
            } else if (operation.equals(bExponent.getLabel())) {
                result = Math.pow(finalDoubleValue, storedDoubleValue);
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
