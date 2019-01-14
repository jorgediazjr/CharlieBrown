package charliebrown;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Polygon;
import javax.swing.JPanel;

/**
 *
 * @author jdiaz
 */

public class DrawCharlieBrown extends JPanel {
    Color yellow = new Color(255, 255, 0);
    Color skin = new Color(255, 220, 178);
    Color brown = new Color(149, 92, 62);
    private int X = -350, Y = -120; 
    
    public DrawCharlieBrown(){
        setLayout(null);
        setBackground(Color.WHITE);
        setBounds(0, 0, 700, 433);
        setVisible(true);

        repaint();
    }
    
    @Override
    public void paintComponent(Graphics g){
        drawCharlieBrown(g);
    }
    
    public void drawCharlieBrown(Graphics g){
        g.setColor(skin);
        //left leg
        g.fillRect(X + 418, Y + 320, 22, 20);
        g.setColor(Color.BLACK);
        g.drawRect(X + 418, Y + 320, 22, 20);
        g.setColor(skin);
        //right leg
        g.fillRect(X + 435, Y + 320, 22, 20);
        g.setColor(Color.BLACK);
        g.drawRect(X + 435, Y + 320, 22, 20);
        g.setColor(yellow);
        //left sock
        g.fillRect(X + 418, Y + 340, 22, 20);
        g.setColor(Color.BLACK);
        //outline for left sock
        g.drawRect(X + 418, Y + 340, 22, 20);
        g.setColor(yellow);
        //right sock
        g.fillRect(X + 435, Y + 340, 22, 20);
        g.setColor(Color.BLACK);
        //outline for right sock
        g.drawRect(X + 435, Y + 340, 22, 20);

        g.setColor(Color.BLACK);
        //charlie's pants
        g.fillRect(X + 400, Y + 320, 65, 14);

        //charlie's neck
        g.setColor(skin);
        Polygon n = new Polygon();
        n.addPoint(X + 420, Y + 255); //bottom left
        n.addPoint(X + 422, Y + 245); //top left
        n.addPoint(X + 450, Y + 245); //top right
        n.addPoint(X + 450, Y + 255); //bottom right
        g.fillPolygon(n);
        g.setColor(Color.BLACK);
        //charlie's neck outline
        g.drawLine(X + 420, Y + 255, X + 422, Y + 245);
        g.drawLine(X + 422, Y + 245, X + 450, Y + 245);
        g.drawLine(X + 450, Y + 245, X + 450, Y + 255);


        g.setColor(Color.BLACK);
         //charlie's right ear outline
        g.drawOval(X + 465, Y + 210, 15, 17);
        //charlie's left ear outline
        g.drawOval(X + 391, Y + 210, 15, 17);

        g.setColor(skin);
        //charlie's head
        g.fillOval(X + 394, Y + 173, 80, 79);
        
        //charlie's ear on the left
        g.fillOval(X + 391, Y + 210, 15, 17);
        
        g.setColor(Color.BLACK);
        //charlie's head outline
        g.drawOval(X + 394, Y + 173, 80, 79);

        g.setColor(skin);
        //charlie's ear on the right
        g.fillOval(X + 465, Y + 210, 15, 17);

        g.setColor(Color.BLACK);
        //charlie's smile
        g.fillOval(X + 402, Y + 185, 60, 57);

        g.setColor(skin);
        //goes on top of charlie's smile
        g.fillOval(X + 401, Y + 183, 62, 57);

        g.setColor(Color.BLACK);
        //charlie's nose outline
        g.drawOval(X + 420, Y + 205, 15, 16);

        g.setColor(skin);
        //charlie's nose
        g.fillOval(X + 421, Y + 205, 15, 16);

        g.setColor(Color.BLACK);
        //charlie's hair
        g.drawOval(X + 421, Y + 184, 18, 13);
        g.drawOval(X + 425, Y + 192, 11, 5);

        //charlie's right eye
        g.fillOval(X + 435, Y + 205, 6, 9);
        
        //charlie's left eye
        g.fillOval(X + 413, Y + 205, 6, 9);
        
        g.setColor(skin);
        //charlie's hair cont.
        g.fillOval(X + 427, Y + 183, 23, 9);

        //charlie's arm on the left
        Polygon a1 = new Polygon();
        a1.addPoint(X + 400, Y + 290); //top left
        a1.addPoint(X + 395, Y + 310); //middle left
        a1.addPoint(X + 395, Y + 315); //bottom left
        a1.addPoint(X + 420, Y + 320); //bottom right
        a1.addPoint(X + 450, Y + 290); //top right
        g.fillPolygon(a1);
        g.setColor(yellow);
        //charlie's arm sleeve on the left
        Polygon s1 = new Polygon();
        s1.addPoint(X + 420, Y + 255); //top right
        s1.addPoint(X + 420, Y + 290); //bottom right
        s1.addPoint(X + 400, Y + 290); //bottom left
        s1.addPoint(X + 409, Y + 270); //top left
        g.fillPolygon(s1);
        //outline for whole arm on left
        g.setColor(Color.BLACK);
        g.drawLine(X + 400, Y + 290, X + 409, Y + 270);
        g.drawLine(X + 409, Y + 270, X + 420, Y + 255);
        g.drawLine(X + 420, Y + 255, X + 420, Y + 290);
        g.drawLine(X + 400, Y + 290, X + 395, Y + 310);
        g.drawLine(X + 395, Y + 310, X + 395, Y + 315);
        g.drawLine(X + 395, Y + 315, X + 420, Y + 320);
        g.drawLine(X + 420, Y + 320, X + 450, Y + 290);
        g.drawLine(X + 398, Y + 310, X + 414, Y + 317);
        g.setColor(yellow);
        //charlie's shirt
        Polygon s = new Polygon();
        s.addPoint(X + 400, Y + 320); //bottom left
        s.addPoint(X + 405, Y + 290); //first left
        s.addPoint(X + 407, Y + 285); //middle left
        s.addPoint(X + 411, Y + 270); //third left
        s.addPoint(X + 420, Y + 255); //top left
        s.addPoint(X + 450, Y + 255); //top right
        s.addPoint(X + 455, Y + 264); //first right 
        s.addPoint(X + 460, Y + 280); //middle right
        s.addPoint(X + 465, Y + 320); //bottom right
        g.fillPolygon(s);
        //outline for shirt
        g.setColor(Color.BLACK);
        g.drawLine(X + 400, Y + 320, X + 405, Y + 290);
        g.drawLine(X + 405, Y + 290, X + 407, Y + 285);
        g.drawLine(X + 407, Y + 285, X + 411, Y + 270);
        g.drawLine(X + 411, Y + 270, X + 419, Y + 259);
        g.drawLine(X + 420, Y + 255, X + 450, Y + 255);
        g.drawLine(X + 450, Y + 255, X + 455, Y + 264);
        g.drawLine(X + 455, Y + 264, X + 460, Y + 280);
        g.drawLine(X + 460, Y + 280, X + 465, Y + 320);
        //charlie's shirt design : clockwise direction
        Polygon d = new Polygon();
        d.addPoint(X + 407, Y + 280);//1st
        d.addPoint(X + 410, Y + 293);//2nd
        d.addPoint(X + 420, Y + 280);//3rd
        d.addPoint(X + 430, Y + 293);//4th
        d.addPoint(X + 440, Y + 280);//5th
        d.addPoint(X + 450, Y + 293);//6th
        d.addPoint(X + 460, Y + 280);//7th
        d.addPoint(X + 463, Y + 306);//8th
        d.addPoint(X + 460, Y + 293);//9th
        d.addPoint(X + 450, Y + 306);//10th
        d.addPoint(X + 440, Y + 293);//11th
        d.addPoint(X + 430, Y + 306);//12th
        d.addPoint(X + 420, Y + 293);//13th
        d.addPoint(X + 410, Y + 306);//14th
        d.addPoint(X + 405, Y + 294);//15th
        g.fillPolygon(d);

        g.setColor(skin);
        //charlie's arm on the right
        Polygon a2 = new Polygon();
        a2.addPoint(X + 437, Y + 290); //top left
        a2.addPoint(X + 436, Y + 305); //middle left
        a2.addPoint(X + 437, Y + 308); //after middle left
        a2.addPoint(X + 439, Y + 316); //bottom left
        a2.addPoint(X + 441, Y + 317); //left center
        a2.addPoint(X + 449, Y + 318); //center at bottom
        a2.addPoint(X + 457, Y + 317); //right center
        a2.addPoint(X + 459, Y + 316); // bottom right
        a2.addPoint(X + 461, Y + 308); //before middle right
        a2.addPoint(X + 462, Y + 305); //middle right
        a2.addPoint(X + 461, Y + 290); //top right
        g.fillPolygon(a2);
        g.setColor(yellow);
        //charlie's sleeve on the right arm
        Polygon s2 = new Polygon();
        s2.addPoint(X + 440, Y + 255); //top left
        s2.addPoint(X + 450, Y + 255);//top right
        s2.addPoint(X + 460, Y + 275);//middle right
        s2.addPoint(X + 463, Y + 290); //bottom right
        s2.addPoint(X + 435, Y + 290); //bottom left
        s2.addPoint(X + 440, Y + 270); //middle left
        g.fillPolygon(s2);
        g.setColor(Color.BLACK);
        //charlie right arm outline
        g.drawLine(X + 437, Y + 290, X + 436, Y + 305);
        g.drawLine(X + 436, Y + 305, X + 439, Y + 316);
        g.drawLine(X + 439, Y + 316, X + 441, Y + 317);
        g.drawLine(X + 441, Y + 317, X + 449, Y + 318);
        g.drawLine(X + 449, Y + 318, X + 457, Y + 317);
        g.drawLine(X + 457, Y + 317, X + 459, Y + 316);
        g.drawLine(X + 459, Y + 316, X + 461, Y + 308);
        g.drawLine(X + 461, Y + 308, X + 462, Y + 305);
        g.drawLine(X + 462, Y + 305, X + 461, Y + 290);
        //charlie right sleeve outline
        g.drawLine(X + 440, Y + 255, X + 450, Y + 255);
        g.drawLine(X + 450, Y + 255, X + 460, Y + 275);
        g.drawLine(X + 460, Y + 275, X + 463, Y + 290);
        g.drawLine(X + 463, Y + 290, X + 435, Y + 290);
        g.drawLine(X + 435, Y + 290, X + 440, Y + 270);
        //outline of knuckles
        g.drawLine(X + 442, Y + 316, X + 442, Y + 311);//left 
        g.drawLine(X + 448, Y + 317, X + 448, Y + 312);//middle
        g.drawLine(X + 454, Y + 316, X + 454, Y + 311);//right
        //outline for left shoe
        g.drawOval(X + 400, Y + 347, 30, 18); //tip of shoe

        g.setColor(brown);
        //left shoe
        g.fillRect(X + 405, Y + 350, 40, 15); //base
        g.fillOval(X + 400, Y + 347, 30, 18); //tip of shoe
         //outline right shoe
        g.setColor(Color.BLACK);
        g.drawLine(X + 408, Y + 365, X + 452, Y + 365); //outline sole
        g.drawOval(X + 415, Y + 347, 30, 18); //outline tip
        g.drawOval(X + 450, Y + 348, 12, 17); //outline heel
        g.setColor(brown);
        //right shoe
        g.fillRect(X + 420, Y + 350, 40, 15); //base
        g.fillOval(X + 415, Y + 347, 30, 18); //tip of shoe
        g.fillOval(X + 450, Y + 348, 12, 17); //heel of shoe
    }
}
