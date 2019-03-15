package simpleatm;

/**
 *
 * @author Ahmed Ehab
 */
public class ATM {

    private static double balance;
    private static final int pinNumber = 6589;

    public static String getPinNumber() {
        String pin = Integer.toString(pinNumber);
        return pin;
    }

    public ATM(Double balance) {
        this.balance = balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public static Double getBalance() {
        return balance;
    }

    public void withdraw(double amount) {

        if (amount > balance) {
            GUI.setLabel("Insufficient Balance");
        } else {
            balance = balance - amount;
            GUI.setLabel("Withdraw Successful");

        }

    }

    public void deposit(double amount) {
        balance = balance + amount;
        GUI.setLabel("Deposit Successful");
    }

}
