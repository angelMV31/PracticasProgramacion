package ids;

import java.awt.BasicStroke;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.BasicStroke;
import java.awt.Color;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JFrame;

public class Mickey extends JFrame{
	
	public Mickey(String title) {
		
		this.setTitle(title);//titulo de la ventana
		
		this.setVisible(true);//hacer visible la ventana
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		this.setSize(600,600);
		
		this.setResizable(true);

		this.setLocationRelativeTo(null);//colocar la ventana en el medio de la pantalla
		
		this.repaint();
	}
	
	public void paint (Graphics g) {
	super.paint(g);
	
	Graphics2D	 g2 = (Graphics2D) g;
	
	g2.setStroke(new BasicStroke(4));
	
	g2.setColor(Color.black);
	g2.drawOval(200, 430, 40, 30);
	g2.drawOval(340, 430, 40, 30);
	g2.setColor(Color.WHITE);
    g2.fillOval(200, 430, 40, 30);
    g2.fillOval(340, 430, 40, 30);
	
	g2.setColor(Color.black);
	g2.drawOval(130, 150, 330, 300);
	g2.fillOval(130, 150, 330, 300);
	
	g2.drawOval(70, 130, 110, 110);
	g2.fillOval(70, 130, 110, 110);
	
	g2.drawOval(410, 130, 110, 110);
	g2.fillOval(410, 130, 110, 110);
	
    g2.setColor(new Color(255, 219, 172));
    g2.fillOval(150, 252, 290, 185);
    
    g2.fillOval(165, 195, 150, 180);
    g2.fillOval(275, 195, 150, 180);

    g2.setColor(Color.BLACK);
    g2.fillOval(230, 280, 30, 45);
    g2.fillOval(330, 280, 30, 45);

    g2.fillOval(275, 325, 45, 30);

	}

	public static void main(String[] args) {
		Mickey mickey = new Mickey("Mickey");
	}
}

