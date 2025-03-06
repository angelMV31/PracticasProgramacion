package aplication;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class Casa  extends JFrame{

	public Casa(String title) {
		this.setTitle(title);//titulo de la ventana
		this.setVisible(true);//hacer visible la ventana
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		this.setSize(1100,760);
		
		this.setResizable(true);

		this.setLocationRelativeTo(null);//colocar la ventana en el medio de la pantalla
		
		//this.setMinimumSize(new Dimension(200,430));
		//this.setMaximumSize(new Dimension(600,830));
		//this.add(this.login());
		
		;
		//this.add(casita());
		this.repaint();
	}
	
	/*public JPanel casita() {
		
		return casita();
	}*/
	
	public void paint (Graphics g) {
		super.paint(g);
		
		Graphics2D	 g2 = (Graphics2D) g;

		g2.setColor(Color.decode("#3cb2ff")); //principal de color azul
		g2.fillRect(0, 0, 1100, 760);
		
		g2.setColor(Color.decode("#3ed83e")); //rectangulo verde de cesped
		g2.fillRect(0, 600, 1100, 160);
		
		g2.setColor(Color.yellow); //circilo sol
		g2.drawOval(50, 50, 150, 150);
		g2.fillOval(50, 50, 150, 150);
		
		g2.setColor(Color.decode("#929292")); //camino de cemento
		g2.fillRect(600, 600, 100, 160);
		
		g2.setColor(Color.DARK_GRAY); //piedras
		g2.drawOval(625, 615, 15, 15);
		g2.fillOval(625, 615, 15, 15);
		
		g2.setColor(Color.DARK_GRAY);//piedras
		g2.drawOval(665, 625, 15, 15);
		g2.fillOval(665, 625, 15, 15);
		
		g2.setColor(Color.DARK_GRAY);//piedras
		g2.drawOval(625, 650, 15, 15);
		g2.fillOval(625, 650, 15, 15);
		
		g2.setColor(Color.DARK_GRAY);//piedras
		g2.drawOval(665, 660, 15, 15);
		g2.fillOval(665, 660, 15, 15);
		
		g2.setColor(Color.DARK_GRAY);//piedras
		g2.drawOval(625, 685, 15, 15);
		g2.fillOval(625, 685, 15, 15);
		
		g2.setColor(Color.DARK_GRAY);//piedras
		g2.drawOval(665, 695, 15, 15);
		g2.fillOval(665, 695, 15, 15);
		
		g2.setColor(Color.DARK_GRAY);//piedras
		g2.drawOval(625, 720, 15, 15);
		g2.fillOval(625, 720, 15, 15);
		
		g2.setColor(Color.DARK_GRAY);//piedras
		g2.drawOval(665, 730, 15, 15);
		g2.fillOval(665, 730, 15, 15);
		
		g2.setColor(Color.decode("#ffbff0")); //cuadro de la casa
		g2.fillRect(450, 300, 550, 300);
		
		g2.setColor(Color.decode("#766f50"));//pinta el contorno de la ventana
		g2.drawRect(800, 470, 80, 80);
		g2.setColor(Color.white);
		g2.fillRect(800, 470, 80, 80);
		g2.setColor(Color.decode("#766f50")); //ventana
		g2.setStroke(new BasicStroke(4));
		g2.drawLine(840, 470, 840, 550);
		g2.drawLine(800, 510, 880, 510);
		
		g2.setColor(Color.decode("#766f50"));//pinta el contorno de la ventana
		g2.drawRect(550, 350, 80, 80);
		g2.setColor(Color.white);
		g2.fillRect(550, 350, 80, 80);
		g2.setColor(Color.decode("#766f50"));//ventana
		g2.drawLine(590, 350, 590, 430);
		g2.drawLine(550, 390, 630, 390);
		
		g2.setColor(Color.decode("#766f50"));//pinta el contorno de la ventana
		g2.drawRect(800, 350, 80, 80);
		g2.setColor(Color.white);
		g2.fillRect(800, 350, 80, 80);
		g2.setColor(Color.decode("#766f50"));//ventana
		g2.drawLine(800, 390, 880, 390);
		g2.drawLine(840, 350, 840, 430);
		
		int[] xs = {400,1050,725}; //coordenadas en x para el triangulo del techo
		int[] ys = {300,300,200}; //coordenadas en y para el triangulo del techo
		g2.setColor(Color.decode("#7c7453"));
		g2.drawPolygon(xs, ys, 3);
		
		int[] xs2 = {400,1050,725};
		int[] ys2 = {300,300,200};
		g2.fillPolygon(xs2, ys2, 3);
		
		g2.setColor(Color.decode("#766f50")); //puerta
		g2.fillRect(610, 490, 80, 110);
		
		g2.setColor(Color.decode("#bdab6e"));//arco de puerta
		g2.drawArc(620, 500, 60, 20, 1, 180);
		g2.fillArc(620, 500, 60, 20, 1, 180);
		
		g2.setColor(Color.decode("#bdab6e")); //puerta parte de arriba
		g2.fillRect(620, 510, 60, 20);
		
		g2.setColor(Color.decode("#bdab6e")); //puerta parte de abajo
		g2.fillRect(620, 540, 60, 50);
		
		g2.setColor(Color.BLACK);//chapa
		g2.drawOval(670, 550, 5, 5);
		g2.fillOval(670, 550, 5, 5);
		
		g2.setColor(Color.decode("#665c30")); //tronco de arbol
		g2.fillRect(200, 400, 70, 200);
		
		g2.setColor(Color.decode("#4d4520")); //linea del arbol
		g2.setStroke(new BasicStroke(2));
		g2.drawLine(210, 460, 210, 590);
		
		g2.setColor(Color.decode("#4d4520")); //linea del arbol
		g2.setStroke(new BasicStroke(2));
		g2.drawLine(220, 465, 220, 590);
		
		g2.setColor(Color.decode("#4d4520")); //linea del arbol
		g2.setStroke(new BasicStroke(2));
		g2.drawLine(230, 470, 230, 590);
		
		g2.setColor(Color.decode("#4d4520")); //linea del arbol
		g2.setStroke(new BasicStroke(2));
		g2.drawLine(240, 475, 240, 590);
		
		g2.setColor(Color.decode("#4d4520")); //linea del arbol
		g2.setStroke(new BasicStroke(2));
		g2.drawLine(250, 475, 250, 590);
		
		g2.setColor(Color.decode("#4d4520")); //linea del arbol
		g2.setStroke(new BasicStroke(2));
		g2.drawLine(260, 470, 260, 590);
		
		g2.setColor(Color.green); //copa del arbol
		g2.drawArc(155, 370, 80, 80, 1, 360);
		g2.fillArc(155, 370, 80, 80, 1, 360);
		
		g2.setColor(Color.green);//copa del arbol
		g2.drawArc(200, 380, 80, 80, 1, 360);
		g2.fillArc(200, 380, 80, 80, 1, 360);
		
		g2.setColor(Color.green);//copa del arbol
		g2.drawArc(245, 360, 80, 80, 1, 360);
		g2.fillArc(245, 360, 80, 80, 1, 360);
		
		g2.setColor(Color.green);//copa del arbol
		g2.drawArc(150, 320, 80, 80, 1, 360);
		g2.fillArc(150, 320, 80, 80, 1, 360);
		
		g2.setColor(Color.green);//copa del arbol
		g2.drawArc(190, 290, 80, 80, 1, 360);
		g2.fillArc(190, 290, 80, 80, 1, 360);
		
		g2.setColor(Color.green);//copa del arbol
		g2.drawArc(235, 310, 80, 80, 1, 360);
		g2.fillArc(235, 310, 80, 80, 1, 360);
		
		g2.setColor(Color.green);//copa del arbol
		g2.drawArc(180, 310, 80, 80, 1, 360);
		g2.fillArc(180, 310, 80, 80, 1, 360);
		
		g2.setColor(Color.decode("#8a5a11")); //cerco
		g2.setStroke(new BasicStroke(8));
		g2.drawLine(20, 500, 20, 610);
		g2.setColor(Color.decode("#8a5a11")); //cerco
		g2.drawLine(50, 500, 50, 610);
		g2.setColor(Color.decode("#8a5a11")); //cerco
		g2.drawLine(80, 500, 80, 610);
		g2.setColor(Color.decode("#8a5a11")); //cerco
		g2.drawLine(120, 500, 120, 610);
		g2.setColor(Color.decode("#8a5a11")); //cerco
		g2.drawLine(150, 500, 150, 610);
		g2.setColor(Color.decode("#8a5a11")); //cerco
		g2.drawLine(180, 500, 180, 610);
		g2.setColor(Color.decode("#8a5a11")); //cerco
		g2.drawLine(210, 500, 210, 610);
		g2.setColor(Color.decode("#8a5a11")); //cerco
		g2.drawLine(250, 500, 250, 610);
		g2.setColor(Color.decode("#8a5a11")); //cerco
		g2.drawLine(280, 500, 280, 610);
		g2.setColor(Color.decode("#8a5a11")); //cerco
		g2.drawLine(310, 500, 310, 610);
		g2.setColor(Color.decode("#8a5a11")); //cerco
		g2.drawLine(340, 500, 340, 610);
		g2.setColor(Color.decode("#8a5a11")); //cerco
		g2.drawLine(370, 500, 370, 610);
		g2.setColor(Color.decode("#8a5a11")); //cerco
		g2.drawLine(400, 500, 400, 610);
		g2.setColor(Color.decode("#8a5a11")); //cerco
		g2.drawLine(430, 500, 430, 610);
		g2.setColor(Color.decode("#8a5a11")); //cerco
		g2.drawLine(460, 500, 460, 610);
		g2.setColor(Color.decode("#8a5a11")); //cerco
		g2.drawLine(490, 500, 490, 610);
		g2.setColor(Color.decode("#8a5a11")); //cerco
		g2.drawLine(520, 500, 520, 610);
		g2.setColor(Color.decode("#8a5a11")); //cerco
		g2.drawLine(550, 500, 550, 610);
		g2.setColor(Color.decode("#8a5a11")); //cerco
		g2.drawLine(580, 500, 580, 610);
		g2.setColor(Color.decode("#8a5a11")); //cerco
		g2.drawLine(730, 500, 730, 610);
		g2.setColor(Color.decode("#8a5a11")); //cerco
		g2.drawLine(760, 500, 760, 610);
		g2.setColor(Color.decode("#8a5a11")); //cerco
		g2.drawLine(790, 500, 790, 610);
		g2.setColor(Color.decode("#8a5a11")); //cerco
		g2.drawLine(820, 500, 820, 610);
		g2.setColor(Color.decode("#8a5a11")); //cerco
		g2.drawLine(850, 500, 850, 610);
		g2.setColor(Color.decode("#8a5a11")); //cerco
		g2.drawLine(880, 500, 880, 610);
		g2.setColor(Color.decode("#8a5a11")); //cerco
		g2.drawLine(910, 500, 910, 610);
		g2.setColor(Color.decode("#8a5a11")); //cerco
		g2.drawLine(940, 500, 940, 610);
		g2.setColor(Color.decode("#8a5a11")); //cerco
		g2.drawLine(970, 500, 970, 610);
		g2.setColor(Color.decode("#8a5a11")); //cerco
		g2.drawLine(1000, 500, 1000, 610);
		g2.setColor(Color.decode("#8a5a11")); //cerco
		g2.drawLine(1030, 500, 1030, 610);
		g2.setColor(Color.decode("#8a5a11")); //cerco
		g2.drawLine(1060, 500, 1060, 610);
		g2.setColor(Color.decode("#8a5a11")); //cerco
		g2.drawLine(1090, 500, 1090, 610);
		g2.setColor(Color.decode("#8a5a11")); //cerco
		
		g2.setStroke(new BasicStroke(15));
		g2.drawLine(0, 530, 580, 530);
		g2.setColor(Color.decode("#8a5a11")); //cerco
		
		g2.drawLine(730, 530, 1100, 530);
		g2.setColor(Color.decode("#8a5a11")); //cerco
		
	}
	
}
