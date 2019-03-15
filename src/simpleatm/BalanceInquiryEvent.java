package simpleatm;

/**
 *
 * @author Ahmed Ehab
 */
import java.awt.event.*;

public class BalanceInquiryEvent implements ActionListener {

    GUI bp;
    ATM bi;

    public BalanceInquiryEvent(ATM bi) {
        this.bi = bi;
    }

    public BalanceInquiryEvent(GUI bp) {
        this.bp = bp;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        bp.label.setText("Balance is: " + ATM.getBalance());
        History.addHistory("Balance Inquiry " +ATM.getBalance() );
    }

}
