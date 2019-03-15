package simpleatm;

import javax.swing.*;
import java.awt.*;

public class GUI {

    JButton w, d, p, b, n, du;
    static JLabel label;
    public static void setLabel(String S) {

        label.setText(S);
    }
    
    JFrame frame2;

    GUI() {
        frame2 = new JFrame("ATM");
        w = new JButton("Withdraw");
        w.setBounds(20, 90, 100, 30);
        WithdrawEvent withdraw = new WithdrawEvent(this);
        w.addActionListener(withdraw);
        d = new JButton("Deposit");
        d.setBounds(20, 20, 100, 30);
        DepositEvent dp = new DepositEvent(this);
        d.addActionListener(dp);
        b = new JButton("Balance Inquiry");
        b.setBounds(75, 150, 150, 30);
        BalanceInquiryEvent balance = new BalanceInquiryEvent(this);
        b.addActionListener(balance);
        History.InitialiseHistory();
        p = new JButton("Previous");
        p.setBounds(180, 90, 100, 30);
        History previous = new History(this);
        p.addActionListener(previous);
        n = new JButton("Next");
        n.setBounds(180, 20, 100, 30);
        History next = new History(this);
        n.addActionListener(next);
        du = new JButton("Dummy"); //created to cause 'next' button to be displayed
        label = new JLabel("*Welcome to my ATM*");
        Font font = new Font("Arial", Font.BOLD, 14);
        label.setFont(font);
        label.setBounds(75, 200, 300, 30);
        frame2.add(label);
        frame2.add(w);
        frame2.add(d);
        frame2.add(b);
        frame2.add(p);
        frame2.add(n);
        frame2.add(du);
        frame2.setVisible(true);
        frame2.setSize(400, 400);
        frame2.setLayout(null);
        frame2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
