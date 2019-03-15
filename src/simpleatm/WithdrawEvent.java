package simpleatm;

/**
 *
 * @author Ahmed Ehab
 */
import java.awt.event.*;
import javax.swing.*;
import java.awt.*;

public class WithdrawEvent implements ActionListener {

    GUI wb;
    ATM atm = new ATM(ATM.getBalance());
    private JFrame wFrame;
    private JButton w50, w100, w200, w500, w1000, w2000, w3000, w5000, back, dummy, dummy2;
    private JLabel wLabel1;
    private static JLabel wLabel2;

    public WithdrawEvent(ATM atm) {
        this.atm = atm;
    }

    public static void setwLabel2(String S) {
        wLabel2.setText(S);
    }

    public WithdrawEvent(GUI wb) {
        this.wb = wb;
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        wFrame = new JFrame("Withdraw Window");
        w50 = new JButton("50");
        w50.setBounds(50, 50, 100, 50);
        w50.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                w50ActionPerformed(evt);
            }
        });
        wFrame.add(w50);
        w100 = new JButton("100");
        w100.setBounds(50, 150, 100, 50);
        wFrame.add(w100);
        w100.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                w100ActionPerformed(evt);
            }
        });
        w200 = new JButton("200");
        w200.setBounds(50, 250, 100, 50);
        w200.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                w200ActionPerformed(evt);
            }
        });
        wFrame.add(w200);
        w500 = new JButton("500");
        w500.setBounds(50, 350, 100, 50);
        w500.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                w500ActionPerformed(evt);
            }
        });
        wFrame.add(w500);
        w1000 = new JButton("1000");
        w1000.setBounds(300, 50, 100, 50);
        w1000.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                w1000ActionPerformed(evt);
            }
        });
        wFrame.add(w1000);
        w2000 = new JButton("2000");
        w2000.setBounds(300, 150, 100, 50);
        w2000.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                w2000ActionPerformed(evt);
            }
        });
        wFrame.add(w2000);
        w3000 = new JButton("3000");
        w3000.setBounds(300, 250, 100, 50);
        w3000.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                w3000ActionPerformed(evt);
            }
        });
        wFrame.add(w3000);
        w5000 = new JButton("5000");
        w5000.setBounds(300, 350, 100, 50);
        w5000.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                w5000ActionPerformed(evt);
            }
        });
        wFrame.add(w5000);
        wLabel1 = new JLabel("Withdraw Amount:");
        Font font = new Font("Verdana", Font.BOLD, 12);
        wLabel1.setBounds(10, 10, 200, 50);
        wFrame.add(wLabel1);
        dummy = new JButton("Dummy"); //added to cause wLabel1 to be displayed
        wFrame.add(dummy);
        back = new JButton("Back");
        back.setBounds(50, 450, 100, 50);
        back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backActionPerformed(evt);
            }
        });
        wFrame.add(back);
        dummy2 = new JButton("Dummy"); //added to cause back button to be displayed
        wFrame.add(dummy2);
        wLabel2 = new JLabel("");
        wLabel2.setBounds(300, 450, 100, 50);
        wFrame.add(wLabel2);
        wFrame.setVisible(true);
        wb.frame2.setVisible(false);
        wFrame.setSize(500, 600);
        wFrame.setLayout(null);
        wFrame.setDefaultCloseOperation(wFrame.EXIT_ON_CLOSE);

    }

    private void backActionPerformed(java.awt.event.ActionEvent evt) {
        wFrame.setVisible(false);
        wb.frame2.setVisible(true);
        GUI.setLabel("*Welcome to my ATM*");

    }

    private void w50ActionPerformed(java.awt.event.ActionEvent evt) {
        atm.withdraw(50);
        wFrame.setVisible(false);
        wb.frame2.setVisible(true);
        History.addHistory("Withdrawn 50");
    }

    private void w100ActionPerformed(java.awt.event.ActionEvent evt) {
        atm.withdraw(100);
        wFrame.setVisible(false);
        wb.frame2.setVisible(true);
        History.addHistory("Withdrawn 100");
    }

    private void w200ActionPerformed(java.awt.event.ActionEvent evt) {
        atm.withdraw(200);
        wFrame.setVisible(false);
        wb.frame2.setVisible(true);
        History.addHistory("Withdrawn 200");

    }

    private void w500ActionPerformed(java.awt.event.ActionEvent evt) {
        atm.withdraw(500);
        wFrame.setVisible(false);
        wb.frame2.setVisible(true);
        History.addHistory("Withdrawn 500");
    }

    private void w1000ActionPerformed(java.awt.event.ActionEvent evt) {
        atm.withdraw(1000);
        wFrame.setVisible(false);
        wb.frame2.setVisible(true);
        History.addHistory("Withdrawn 1000");
    }

    private void w2000ActionPerformed(java.awt.event.ActionEvent evt) {
        atm.withdraw(2000);
        wFrame.setVisible(false);
        wb.frame2.setVisible(true);
        History.addHistory("Withdrawn 2000");
    }

    private void w3000ActionPerformed(java.awt.event.ActionEvent evt) {
        atm.withdraw(3000);
        wFrame.setVisible(false);
        wb.frame2.setVisible(true);
        History.addHistory("Withdrawn 3000");
    }

    private void w5000ActionPerformed(java.awt.event.ActionEvent evt) {
        atm.withdraw(5000);
        wFrame.setVisible(false);
        wb.frame2.setVisible(true);
        History.addHistory("Withdrawn 5000");
    }

}
