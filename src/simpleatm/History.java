package simpleatm;

/**
 *
 * @author Ahmed Ehab
 */
import java.awt.event.*;

public class History implements ActionListener {

    private GUI gui;
    private ATM atm;
    private static String[] history = new String[5];
    private static int counter = 0;

    History(GUI gui) {
        this.gui = gui;
    }

    static void InitialiseHistory() {
        for (int i = 0; i < 5; i++) {
            history[i] = null;
        }
    }

    static void addHistory(String entry) //most recent entry is the 5th element, oldest is the 1st
    {
        if (counter == 0) {
            history[0] = entry;
            ++counter;
        } else if (counter == 4) {
            for (counter = 4; counter < 0; counter--) {
                history[counter] = history[counter - 1];
            }
            history[4] = entry;
            counter = 4;
        } else {
            history[counter++] = entry;
        }
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == gui.p) {
            if (counter < 0) {
                GUI.setLabel("No Previous History");
                counter = 0;
            } else if (history[counter++] == null) {
                GUI.setLabel("N/A");
            } else {
                GUI.setLabel(history[counter--]);
            }
        } else if (e.getSource() == gui.n) {
            if (counter > 4) {
                GUI.setLabel("No more History entries");
                counter = 4;
            } else if (history[counter++] == null) {
                GUI.setLabel("N/A");
            } else {
                GUI.setLabel(history[counter++]);
            }
        }
    }
}
