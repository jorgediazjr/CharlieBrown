/*
 * Jorge Diaz
 * Project #3 October 10, 2016
 * Professor Hong
 */
package charliebrown;

import javax.swing.JFrame;

/**
 *
 * @author jdiaz
 */
public class CharlieBrown extends JFrame {

    public static void main(String[] args) {
        CharlieBrown cb = new CharlieBrown();
        cb.drawWindow();
    } 
    
    public void drawWindow(){
        setLayout(null);
        setBounds(7, 7, 190, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
        add(new DrawCharlieBrown());
    }
}
