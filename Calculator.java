import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;


public class Calculator implements ActionListener {

    boolean isOperatorClicked=false;
    JFrame jf;
    JLabel displayLabel;
    JButton sevenButton,eightButton,nineButton,fourButton,fiveButton,sixButton,oneButton,twoButton,threeButton,dotButton,zeroButton,plusButton,minusButton,divButton,multiButton,percentButton,clearButton,equalButton,doublezeroButton;
    String labelText,oldValue,newValue;
    float oldValueFloat,newValueFloat,result;
    char operator;

    Calculator() {

        jf = new JFrame("Calculator");
        jf.setLayout(null);
        jf.setSize(440, 680);
        jf.setLocation(300, 150);
        
        displayLabel = new JLabel();
        displayLabel.setBounds(30, 50, 385, 40);
        displayLabel.setBackground(Color.gray);
        displayLabel.setFont(new Font("Ariel", Font.PLAIN, 24));
        displayLabel.setHorizontalAlignment(SwingConstants.HORIZONTAL);
        displayLabel.setForeground(Color.WHITE);;
        displayLabel.setOpaque(true);


        clearButton = new JButton("C");
        clearButton.setBounds(30, 130, 80, 80);
        clearButton.setFont(new Font("Ariel", Font.PLAIN, 36));
        clearButton.addActionListener(this);

        divButton = new JButton("/");
        divButton.setBounds(130, 130, 80, 80);
        divButton.setFont(new Font("Ariel", Font.PLAIN, 40));
        divButton.addActionListener(this);

        multiButton = new JButton("*");
        multiButton.setBounds(230, 130, 80, 80);
        multiButton.setFont(new Font("Ariel", Font.PLAIN, 40));
        multiButton.addActionListener(this);

        sevenButton = new JButton("7");
        sevenButton.setBounds(30, 230, 80, 80);
        sevenButton.setFont(new Font("Ariel", Font.PLAIN, 40));
        sevenButton.addActionListener(this);

        eightButton = new JButton("8");
        eightButton.setBounds(130, 230, 80, 80);
        eightButton.setFont(new Font("Ariel", Font.PLAIN, 40));
        eightButton.addActionListener(this);

        nineButton = new JButton("9");
        nineButton.setBounds(230, 230, 80, 80);
        nineButton.setFont(new Font("Ariel", Font.PLAIN, 40));
        nineButton.addActionListener(this);

        fourButton = new JButton("4");
        fourButton.setBounds(30, 330, 80, 80);
        fourButton.setFont(new Font("Ariel", Font.PLAIN, 40));
        fourButton.addActionListener(this);

        fiveButton = new JButton("5");
        fiveButton.setBounds(130, 330, 80, 80);
        fiveButton.setFont(new Font("Ariel", Font.PLAIN, 40));
        fiveButton.addActionListener(this);

        sixButton = new JButton("6");
        sixButton.setBounds(230, 330, 80, 80);
        sixButton.setFont(new Font("Ariel", Font.PLAIN, 40));
        sixButton.addActionListener(this);

        oneButton = new JButton("1");
        oneButton.setBounds(30, 430, 80, 80);
        oneButton.setFont(new Font("Ariel", Font.PLAIN, 40));
        oneButton.addActionListener(this);

        twoButton = new JButton("2");
        twoButton.setBounds(130, 430, 80, 80);
        twoButton.setFont(new Font("Ariel", Font.PLAIN, 40));
        twoButton.addActionListener(this);

        threeButton = new JButton("3");
        threeButton.setBounds(230, 430, 80, 80);
        threeButton.setFont(new Font("Ariel", Font.PLAIN, 40));
        threeButton.addActionListener(this);

        zeroButton = new JButton("0");
        zeroButton.setBounds(130, 530, 80, 80);
        zeroButton.setFont(new Font("Ariel", Font.PLAIN, 40));
        zeroButton.addActionListener(this);

        percentButton = new JButton("%");
        percentButton.setBounds(30, 530, 80, 80);
        percentButton.setFont(new Font("Ariel", Font.PLAIN, 40));
        percentButton.addActionListener(this);

        dotButton = new JButton(".");
        dotButton.setBounds(230, 530, 80, 80);
        dotButton.setFont(new Font("Ariel", Font.PLAIN, 40));
        dotButton.addActionListener(this);

        minusButton = new JButton("-");
        minusButton.setBounds(330, 130, 80, 80);
        minusButton.setFont(new Font("Ariel", Font.PLAIN, 40));
        minusButton.addActionListener(this);

        plusButton = new JButton("+");
        plusButton.setBounds(330, 230, 80, 80);
        plusButton.setFont(new Font("Ariel", Font.PLAIN, 40));
        plusButton.addActionListener(this);

        equalButton = new JButton("=");
        equalButton.setBounds(330, 330, 80, 180);
        equalButton.setFont(new Font("Ariel", Font.PLAIN, 40));
        equalButton.addActionListener(this);

        doublezeroButton = new JButton("00");
        doublezeroButton.setBounds(330, 530, 80, 80);
        doublezeroButton.setFont(new Font("Ariel", Font.PLAIN, 36));
        doublezeroButton.addActionListener(this);

        jf.add(displayLabel);
        jf.add(clearButton);
        jf.add(divButton);
        jf.add(multiButton);
        jf.add(sevenButton);
        jf.add(eightButton);
        jf.add(nineButton);
        jf.add(fourButton);
        jf.add(fiveButton);
        jf.add(sixButton);
        jf.add(oneButton);
        jf.add(twoButton);
        jf.add(threeButton);
        jf.add(dotButton);
        jf.add(zeroButton);
        jf.add(percentButton);
        jf.add(minusButton);
        jf.add(plusButton);
        jf.add(equalButton);
        jf.add(doublezeroButton);

        jf.setVisible(true);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }
    public static void main(String[] args) {
        new Calculator();
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == sevenButton) {
            appendDigit("7");
        } else if (e.getSource() == eightButton) {
            appendDigit("8");
        } else if (e.getSource() == nineButton) {
            appendDigit("9");
        } else if (e.getSource() == fourButton) {
            appendDigit("4");
        } else if (e.getSource() == fiveButton) {
            appendDigit("5");
        } else if (e.getSource() == sixButton) {
            appendDigit("6");
        } else if (e.getSource() == oneButton) {
            appendDigit("1");
        } else if (e.getSource() == twoButton) {
            appendDigit("2");
        } else if (e.getSource() == threeButton) {
            appendDigit("3");
        } else if (e.getSource() == zeroButton) {
            appendDigit("0");
        } else if (e.getSource() == dotButton) {
            if (!displayLabel.getText().contains(".")) {
                displayLabel.setText(displayLabel.getText() + ".");
            }
        } else if (e.getSource() == clearButton) {
            displayLabel.setText("");
            oldValue = "";
            newValue = "";
            isOperatorClicked = false;
        } else if (e.getSource() == plusButton) {
            performOperation('+');
        } else if (e.getSource() == minusButton) {
            performOperation('-');
        } else if (e.getSource() == multiButton) {
            performOperation('*');
        } else if (e.getSource() == divButton) {
            performOperation('/');
        } else if (e.getSource() == percentButton) {
            calculatePercentage();
        } else if (e.getSource() == equalButton) {
            calculateResult();
        } else if (e.getSource() == doublezeroButton) {
            appendDigit("00");
        }
    }

    private void appendDigit(String digit) {
        if (isOperatorClicked) {
            displayLabel.setText("");
            isOperatorClicked = false;
        }
        displayLabel.setText(displayLabel.getText() + digit);
    }

    private void performOperation(char op) {
        if (!isOperatorClicked) {
            isOperatorClicked = true;
            oldValue = displayLabel.getText();
            operator = op;
        }
    }

    private void calculatePercentage() {
        if (!isOperatorClicked) {
            oldValueFloat = Float.parseFloat(displayLabel.getText());
            result = oldValueFloat / 100;
            displayLabel.setText(String.valueOf(result));
        }
    }

    private void calculateResult() {
        newValue = displayLabel.getText();
        oldValueFloat = Float.parseFloat(oldValue);
        newValueFloat = Float.parseFloat(newValue);

        switch (operator) {
            case '+':
                result = oldValueFloat + newValueFloat;
                break;
            case '-':
                result = oldValueFloat - newValueFloat;
                break;
            case '*':
                result = oldValueFloat * newValueFloat;
                break;
            case '/':
                if (newValueFloat != 0) {
                    result = oldValueFloat / newValueFloat;
                } else {
                    displayLabel.setText("Error");
                    return;
                }
                break;
        }

        displayLabel.setText(String.valueOf(result));
        isOperatorClicked = true;
    }
}