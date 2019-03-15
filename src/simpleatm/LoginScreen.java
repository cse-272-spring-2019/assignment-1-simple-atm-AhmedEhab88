/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package simpleatm;

/**
 *
 * @author Ahmed Ehab
 */
import javax.swing.*;
import java.awt.event.*;

public class LoginScreen{
    private JFrame frame1;
    private JButton enter,decoy;
    private JPasswordField pwField;
    private JLabel pwLabel,pwLabel2;
   
    public LoginScreen() {
        
        frame1 = new JFrame("Login");
        pwLabel = new JLabel("PIN Number");
        pwLabel2 = new JLabel();
        enter = new JButton("Enter");
         enter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                enterActionPerformed(evt);
            }
        });
        decoy = new JButton();
        pwField = new JPasswordField();
        pwLabel.setBounds(20,20,80,30);
        pwField.setBounds(100,20,100,30);
        enter.setBounds(100, 75, 100, 30);
        pwLabel2.setBounds(100,120,80,30);
        frame1.add(pwField);frame1.add(pwLabel);frame1.add(pwLabel2);frame1.add(enter);
        frame1.add(decoy); //decoy to cause 'enter' button to be displayed
        frame1.setVisible(true);
        frame1.setLayout(null);
        frame1.setSize(300,300);
        frame1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    
    }
    
    
    private void enterActionPerformed(java.awt.event.ActionEvent evt) {
        String validate = pwField.getText();
       if(validate.equals(ATM.getPinNumber()))
       {
           frame1.setVisible(false);
           GUI gui = new GUI();
       }
       else 
           pwLabel2.setText("Invalid PIN");
    }    
    
                       
    
                   
}
