/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab.pkg7_felipelin;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JLabel;
import javax.swing.JProgressBar;

/**
 *
 * @author felipelinzhao
 */
public class hilolink extends Thread {

    private JProgressBar link;
    private String text;

    public hilolink() {
    }

    public hilolink(JProgressBar link, String text) {
        this.link = link;
        this.text = text;
    }

    @Override
    public void run() {

        link.setString(text);

        try {
            Thread.sleep(1000);
        } catch (InterruptedException ex) {
            Logger.getLogger(hilolink.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

}
