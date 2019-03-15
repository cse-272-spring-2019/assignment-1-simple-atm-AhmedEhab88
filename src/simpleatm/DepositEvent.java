package simpleatm;

/**
 *
 * @author Ahmed Ehab
 */
import java.awt.event.*;
import javax.swing.*;
import java.awt.*;

public class DepositEvent implements ActionListener {

    private double amount = 0.0;
    GUI bp;
    ATM atm = new ATM(ATM.getBalance());

    public DepositEvent(ATM atm) {
        this.atm = atm;
    }

    public DepositEvent(GUI bp) {
        this.bp = bp;
    }

    private JButton back, dep;
    private JLabel l1, l2;
    private JTextField entry;
    private JFrame dFrame;

    @Override
    public void actionPerformed(ActionEvent e) {

        dFrame = new JFrame("Deposit Window");

        //setting frame layout
        dFrame.setLayout(null);

        //showing the frame and setting size
        dFrame.setVisible(true);
        bp.frame2.setVisible(false);
        dFrame.setSize(400, 400);

        //creating new font
        Font font = new Font("Arial", Font.BOLD, 12);

        l1 = new JLabel("Enter Amount");
        l1.setBounds(20, 20, 100, 30);
        dFrame.add(l1);
        l2 = new JLabel();
        l2.setBounds(150, 150, 100, 30);
        dFrame.add(l2);

        //Creating textfield
        entry = new JTextField();
        entry.setBounds(150, 20, 100, 30);
        dFrame.add(entry);
        entry.setFont(font);

        back = new JButton("Back");
        back.setBounds(20, 300, 80, 30);
        back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backActionPerformed(evt);
            }
        });

        //creating the buttons
        dep = new JButton("Deposit");
        dep.setBounds(150, 90, 80, 30);
        dep.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                depActionPerformed(evt);
            }
        });
        dFrame.add(dep);
        dFrame.add(back);
        dFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }

    //Handling the events of the buttons
    private void depActionPerformed(java.awt.event.ActionEvent evt) {

        String s1 = entry.getText();
        if (s1.matches("[0-9]+")) {
            History.addHistory("Deposited " + s1);
            amount = Double.parseDouble(s1);
            atm.deposit(amount);
            dFrame.setVisible(false);
            bp.frame2.setVisible(true);
        } else {
            l2.setText("Invalid Amount");
        }

    }

    private void backActionPerformed(java.awt.event.ActionEvent evt) {
        dFrame.setVisible(false);
        bp.frame2.setVisible(true);
        GUI.setLabel("*Welcome to my ATM*");

    }

}
