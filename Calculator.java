package academy.Bentilzone;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Calculator {
    private double total1 = 0.0;
    private double total2 = 0.0;
    private char operator;
    private JPanel rootPanel;
    private JTextField screen;
    private JButton btnEqual;
    private JButton btnTwo;
    private JButton btnMultiply;
    private JButton btnThree;
    private JButton btnFive;
    private JButton btnEight;
    private JButton btnZero;
    private JButton btnPlus;
    private JButton btnSix;
    private JButton btnNine;
    private JButton btnClear;
    private JButton btnMinus;
    private JButton btnDivide;
    private JButton btnOne;
    private JButton btnFour;
    private JButton btnSeven;
    private JButton btnPnt;

    private void getOperator(String btnText) {
        operator = btnText.charAt(0);
        total1 = total1 + Double.parseDouble(screen.getText());
        screen.setText("");
    }
    public Calculator() {
//        screen.setEnabled(false);
        btnOne.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String btnOneText = screen.getText() + btnOne.getText();
                screen.setText(btnOneText);
            }
        });
        btnTwo.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String btnTwoText = screen.getText() + btnTwo.getText();
                screen.setText(btnTwoText);
            }
        });
        btnThree.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String btnTwoText = screen.getText() + btnThree.getText();
                screen.setText(btnTwoText);
            }
        });
        btnFour.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String btnTwoText = screen.getText() + btnFour.getText();
                screen.setText(btnTwoText);
            }
        });
        btnFive.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String btnTwoText = screen.getText() + btnFive.getText();
                screen.setText(btnTwoText);
            }
        });
        btnSix.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String btnTwoText = screen.getText() + btnSix.getText();
                screen.setText(btnTwoText);
            }
        });
        btnSeven.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String btnTwoText = screen.getText() + btnSeven.getText();
                screen.setText(btnTwoText);
            }
        });
        btnEight.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String btnTwoText = screen.getText() + btnEight.getText();
                screen.setText(btnTwoText);
            }
        });
        btnNine.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String btnTwoText = screen.getText() + btnNine.getText();
                screen.setText(btnTwoText);
            }
        });
        btnZero.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String btnTwoText = screen.getText() + btnZero.getText();
                screen.setText(btnTwoText);
            }
        });
        btnPnt.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(screen.getText().equals("")){
                    screen.setText("0.");
                }
                else if(screen.getText().contains(".")){
                    btnPnt.setEnabled(false);
                }
                else {
                    String btnPointText = screen.getText() + btnPnt.getText();
                    screen.setText(btnPointText);
                }
                btnPnt.setEnabled(true);
            }
        });
        btnClear.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //String btnTwoText = screen.getText() + btnClear.getText();
                total2 = 0;
                screen.setText("");
            }
        });
        btnEqual.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                switch (operator){
                    case'+':
                        total2 = total1 + Double.parseDouble(screen.getText());
                        break;
                    case '-':
                        total2 = total1 - Double.parseDouble(screen.getText());
                        break;
                    case 'x':
                        total2 = total1 * Double.parseDouble(screen.getText());
                        break;
                    case '÷':
                        total2 = total1 / Double.parseDouble(screen.getText());
                        break;
                }
                screen.setText(Double.toString(total2));
                total1 = 0;
            }
        });
        btnPlus.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String btnText = btnPlus.getText();
                getOperator(btnText);
            }
        });
        btnMinus.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String btnText = btnMinus.getText();
                getOperator(btnText);
            }
        });
        btnDivide.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String btnText = btnDivide.getText();
                getOperator(btnText);
            }
        });
        btnMultiply.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String btnText = btnMultiply.getText();
                getOperator(btnText);
            }
        });
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Day 7- Java Calculator");
        frame.setContentPane(new Calculator().rootPanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setSize(300, 350);
        frame.setResizable(false);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}
