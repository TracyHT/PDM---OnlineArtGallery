/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package decoration;
import java.awt.AlphaComposite;
import javax.swing.JPanel;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.Color;
/**
 *
 * @author ADMIN
 */
public class Background extends JPanel {
    public Background() {
        setOpaque(false);
    }
    
    public float getAlpha(){
        return(alpha);
    }
    public void setAlpha(float alpha){
        this.alpha = alpha;
        repaint();
    }
    
    public int getRound(){
        return(round);
    }
    public void setRound(int round){
        this.round = round;
        repaint();
    }
    private int round = 24;
    private float alpha = 1;
    @Override
    public void paint(Graphics g){
        Graphics2D g2 = (Graphics2D)g.create();
        
        AlphaComposite ac = AlphaComposite.getInstance(AlphaComposite.SRC_OVER,alpha);
        
        g2.setComposite(ac);
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING,RenderingHints.VALUE_ANTIALIAS_ON);
        g2.setColor(Color.white);
        g2.fillRoundRect(0, 0, getWidth(), getHeight(), round, round);
        g2.dispose();
        super.paint(g);
    }
}
