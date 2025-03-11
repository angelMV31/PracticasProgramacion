package aplication;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFrame;

public class MarioBross2 extends JFrame{

	Font signo = new Font("Arial", Font.BOLD, 50);

	public MarioBross2(String title) {
		this.setTitle(title);//titulo de la ventana
		this.setVisible(true);//hacer visible la ventana
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		this.setSize(1100,760);
		
		this.setResizable(true);

		this.setLocationRelativeTo(null);//colocar la ventana en el medio de la pantalla
		
		ImageIcon icon = new ImageIcon("mario.png");
		this.setIconImage(icon.getImage());
		
		this.repaint();
	}
	
	public void paint (Graphics g) {
		super.paint(g);
		
		Graphics2D	 g2 = (Graphics2D) g;

		g2.setColor(Color.decode("#0665c0")); //principal de color azul
		g2.fillRect(0, 0, 1100, 760);
		
		g2.setStroke(new BasicStroke(5));
		
		g2.setColor(Color.white);
		g2.fillRect(900, 170, 120, 40);//nubes
		g2.fillArc(865, 170, 80, 40, 90, 180);
		g2.fillArc(980, 170, 80, 40, 90, -180);
		
		g2.fillRect(750, 270, 120, 40);//nubes
		g2.fillArc(715, 270, 80, 40, 90, 180);
		g2.fillArc(830, 270, 80, 40, 90, -180);
		
		g2.fillRect(450, 470, 120, 40);//nubes
		g2.fillArc(415, 470, 80, 40, 90, 180);
		g2.fillArc(530, 470, 80, 40, 90, -180);
		
		g2.fillRect(350, 390, 120, 40);//nubes
		g2.fillArc(315, 390, 80, 40, 90, 180);
		g2.fillArc(530, 390, 80, 40, 90, -180);
		
		g2.fillRect(250, 590, 120, 40);//nubes
		g2.fillArc(215, 590, 80, 40, 90, 180);
		g2.fillArc(330, 590, 80, 40, 90, -180);
		
		g2.setColor(Color.black);//primer montaña delgada
		g2.drawRect(120, 348, 160, 300);
		g2.setColor(Color.decode("#c6e3e7"));
		g2.fillRect(120, 348, 160, 300);
		g2.setColor(Color.black);
		g2.drawArc(120, 248, 160, 200, 0, 180);
		g2.setColor(Color.decode("#c6e3e7"));
		g2.fillArc(120, 248, 160, 200, 0, 180);
		
		g2.setStroke(new BasicStroke(10));
		g2.setColor(new Color(0, 0, 0, 70)); // Sombra semitransparente
		g2.fillRect(270, 348, 10, 300);
		g2.drawArc(115, 248, 160, 190, -270, -90);
		
		g2.setColor(Color.white); //bolitas blancas
		g2.fillOval(150, 300, 15, 25);
		g2.fillOval(200, 360, 15, 25);
		g2.fillOval(190, 460, 15, 25);
		g2.fillOval(250, 560, 15, 25);
		
		g2.setColor(Color.black);//segunda montaña delgada
		g2.drawRect(470, 348, 160, 300);
		g2.setColor(Color.decode("#c6e3e7"));
		g2.fillRect(470, 348, 160, 300);
		g2.setColor(Color.black);
		g2.drawArc(470, 248, 160, 200, 0, 180);
		g2.setColor(Color.decode("#c6e3e7"));
		g2.fillArc(470, 248, 160, 200, 0, 180);
		
		g2.setStroke(new BasicStroke(10));
		g2.setColor(new Color(0, 0, 0, 70)); // Sombra semitransparente
		g2.fillRect(620, 348, 10, 300);
		g2.drawArc(465, 248, 160, 190, -270, -90);
		
		g2.setColor(Color.white); //bolitas blancas
		g2.fillOval(580, 320, 15, 25);
		g2.fillOval(500, 380, 15, 25);
		
		g2.setColor(Color.black);//tercera montaña delgada
		g2.drawRect(630, 248, 160, 400);
		g2.setColor(Color.decode("#c6e3e7"));
		g2.fillRect(630, 248, 160, 400);
		g2.setColor(Color.black);
		g2.drawArc(630, 148, 160, 200, 0, 180);
		g2.setColor(Color.decode("#c6e3e7"));
		g2.fillArc(630, 148, 160, 200, 0, 180);
		
		g2.setStroke(new BasicStroke(10));
		g2.setColor(new Color(0, 0, 0, 70)); // Sombra semitransparente
		g2.fillRect(780, 248, 10, 400);
		g2.drawArc(624, 148, 160, 190, -270, -90);
		
		g2.setColor(Color.white); //bolitas blancas
		g2.fillOval(680, 220, 15, 25);
		g2.fillOval(660, 345, 15, 25);
		g2.fillOval(740, 315, 15, 25);
		
		g2.setColor(Color.white);
		g2.fillRect(0, 450, 120, 40);//nubes
		g2.fillArc(-35, 450, 80, 40, 90, 180);
		g2.fillArc(80, 450, 80, 40, 90, -180);
		
		g2.fillRect(600, 390, 120, 40);//nubes
		g2.fillArc(565, 390, 80, 40, 90, 180);
		g2.fillArc(680, 390, 80, 40, 90, -180);
		
		g2.fillRect(350, 120, 120, 40);//nubes
		g2.fillArc(315, 120, 80, 40, 90, 180);
		g2.fillArc(430, 120, 80, 40, 90, -180);
		
		g2.setColor(Color.black);//primer montaña ancho
		g2.drawRect(0, 568, 120, 80);
		g2.setColor(Color.decode("#76b2d7"));
		g2.fillRect(0, 568, 120, 80);
		g2.setColor(Color.black);
		g2.drawArc(-120, 508, 240, 120, -270, -90);
		g2.setColor(Color.decode("#76b2d7"));
		g2.fillArc(-120, 508, 240, 120, -270, -90);
		
		g2.setStroke(new BasicStroke(10));
		g2.setColor(new Color(0, 0, 0, 70)); // Sombra semitransparente
		g2.fillRect(110, 568, 10, 80);
		g2.drawArc(-110, 508, 225, 120, -270, -90);
		
		g2.setColor(Color.black);//segundo montaña ancho
		g2.drawRect(480, 568, 195, 80);
		g2.setColor(Color.decode("#76b2d7"));
		g2.fillRect(480, 568, 195, 80);
		g2.setColor(Color.black);
		g2.drawArc(480, 458, 195, 220, 0, 180);
		g2.setColor(Color.decode("#76b2d7"));
		g2.fillArc(480, 458, 195, 220, 0, 180);
		
		g2.setStroke(new BasicStroke(10));
		g2.setColor(new Color(0, 0, 0, 70)); // Sombra semitransparente
		g2.fillRect(665, 568, 10, 80);
		g2.drawArc(465, 458, 205, 220, -270, -90);
		
		g2.setColor(Color.black);//tercero montaña  ancho
		g2.drawRect(675, 478, 195, 170);
		g2.setColor(Color.decode("#76b2d7"));
		g2.fillRect(675, 478, 195, 170);
		g2.setColor(Color.black);
		g2.drawArc(675, 368, 195, 220, 0, 180);
		g2.setColor(Color.decode("#76b2d7"));
		g2.fillArc(675, 368, 195, 220, 0, 180);
		
		g2.setStroke(new BasicStroke(10));
		g2.setColor(new Color(0, 0, 0, 70)); // Sombra semitransparente
		g2.fillRect(860, 478, 10, 170);
		g2.drawArc(662, 368, 205, 250, -270, -90);
		
		g2.setColor(Color.black);
		g2.setStroke(new BasicStroke(5));
		g2.drawRect(550, 550, 100, 100);
		g2.setColor(Color.decode("#6e6bb5"));
		g2.fillRect(550, 550, 100, 100);//parte inferior del tubo
		g2.setColor(Color.black);
		g2.setStroke(new BasicStroke(5));
		g2.drawRect(545, 500, 110, 50);
		g2.setColor(Color.decode("#6e6bb5"));
		g2.fillRect(545, 500, 110, 50);//parte de superior del tubo
		g2.setColor(new Color(0, 0, 0, 70)); // Sombra semitransparente
		g2.fillRect(580, 500, 10, 150);
		g2.fillRect(605, 500, 10, 150);
		g2.fillRect(615, 500, 10, 150);
		g2.fillRect(632, 500, 15, 150);
		g2.setColor(new Color(255, 255, 255, 70)); // Sombra semitransparente blanca
		g2.fillRect(590, 500, 3, 150);
		g2.fillRect(601, 500, 4, 150);
		g2.fillRect(625, 500, 7, 150);
		
		g2.setColor(new Color(255, 255, 255));//reflejo lineas blancas
		g2.fillRect(552, 500, 8, 50);
		g2.fillRect(560, 550, 8, 100);
		
	
		g2.setColor(Color.black);
		g2.setStroke(new BasicStroke(5));
		g2.drawRect(950, 590, 100, 60);
		g2.setColor(Color.decode("#6e6bb5"));
		g2.fillRect(950, 590, 100, 60);//parte inferior del tubo
		g2.setColor(Color.black);
		g2.drawRect(945, 540, 110, 50);
		g2.setColor(Color.decode("#6e6bb5"));
		g2.fillRect(945, 540, 110, 50);//parte de superior del tubo
		g2.setColor(new Color(0, 0, 0, 70)); // Sombra semitransparente
		g2.fillRect(980, 540, 10, 120);
		g2.fillRect(1005, 540, 10, 120);
		g2.fillRect(1015, 540, 10, 120);
		g2.fillRect(1032, 540, 15, 120);
		g2.setColor(new Color(255, 255, 255, 70)); // Sombra semitransparente blanca
		g2.fillRect(990, 540, 3, 120);
		g2.fillRect(1001, 540, 4, 120);
		g2.fillRect(1025, 540, 7, 120);
		
		g2.setColor(new Color(255, 255, 255));//reflejo lineas blancas
		g2.fillRect(952, 540, 8, 50);
		g2.fillRect(960, 590, 8, 60);
		
		g2.fillRect(90, 170, 120, 40);//nubes
		g2.fillArc(55, 170, 80, 40, 90, 180);
		g2.fillArc(170, 170, 80, 40, 90, -180);
		
		g2.setColor(Color.black);//contorno del arbusto
		g2.setStroke(new BasicStroke(3));
		g2.drawArc(200, 580, 40, 60, 30, 170);
		g2.setColor(Color.decode("#05fc05"));
		g2.fillArc(200, 580, 40, 60, 0, 360);
		g2.setColor(Color.black);
		g2.drawArc(180, 618, 60, 60, 180, -80);
		g2.setColor(Color.decode("#05fc05"));
		g2.fillArc(180, 618, 60, 60, 0, 360);
		g2.setColor(Color.black);
		g2.drawArc(237, 565, 30, 80, 0, 160);
		g2.setColor(Color.decode("#05fc05"));
		g2.fillArc(237, 565, 30, 80, 0, 360);
		g2.setColor(Color.black);
		g2.drawArc(263, 570, 30, 80, 10, 140);
		g2.setColor(Color.decode("#05fc05"));
		g2.fillArc(263, 570, 30, 80, 0, 360);
		g2.setColor(Color.black);
		g2.drawArc(285, 595, 30, 80, 120, -160);
		g2.setColor(Color.decode("#05fc05"));
		g2.fillArc(285, 595, 30, 80, 0, 360);
		g2.setColor(Color.decode("#05fc05"));
		g2.fillArc(230, 587, 80, 80, 0, 360);

		g2.setColor(Color.decode("#ce9d60")); //bajo de la linea del piso
		g2.fillRect(0, 660, 1100, 760);
		
		int x1=0;//pasto en forma de picos
		int x2=10;
		int x3=30;
		for(int i = 0; i<91; i++) {
			g2.setColor(Color.black);
			int[] xs = {x1,x3,x2};
			int[] ys = {650,650,665};
			g2.drawPolygon(xs, ys, 3);
			
			g2.setColor(Color.decode("#08c601"));
			int[] xs2 = {x1,x3,x2};
			int[] ys2 = {650,650,665};
			g2.fillPolygon(xs2, ys2, 3);
			
			x1+=12;
			x2+=12;
			x3+=12;
		}
		
		g2.setColor(Color.black);//bloques del costado izquierdo
		g2.drawRoundRect(850, 605, 45, 45, 15, 15);
		g2.drawRoundRect(850, 558, 45, 45, 15, 15);
		g2.drawRoundRect(850, 511, 45, 45, 15, 15);
		g2.drawRoundRect(850, 464, 45, 45, 15, 15);
		
		//amarillos bloques superiores
		g2.drawRoundRect(897, 464, 45, 45, 15, 15);
		g2.drawRoundRect(944, 464, 45, 45, 15, 15);
		g2.drawRoundRect(991, 464, 45, 45, 15, 15);
		g2.drawRoundRect(1038, 464, 45, 45, 15, 15);
		
		g2.setColor(Color.decode("#747476"));
		g2.fillRoundRect(850, 605, 45, 45, 15, 15);
		g2.fillRoundRect(850, 558, 45, 45, 15, 15);
		g2.fillRoundRect(850, 511, 45, 45, 15, 15);
		g2.fillRoundRect(850, 464, 45, 45, 15, 15);
		
		g2.setColor(Color.decode("#f8db2e"));
		g2.fillRoundRect(897, 464, 45, 45, 15, 15);
		g2.fillRoundRect(944, 464, 45, 45, 15, 15);
		g2.fillRoundRect(991, 464, 45, 45, 15, 15);
		g2.fillRoundRect(1038, 464, 45, 45, 15, 15);
		
		g2.setStroke(new BasicStroke(8));
		g2.setColor(Color.decode("#d6a441"));
		g2.drawRoundRect(899, 468, 37, 37, 15, 15);
		g2.drawRoundRect(948, 468, 37, 37, 15, 15);
		g2.drawRoundRect(995, 468, 37, 37, 15, 15);
		g2.drawRoundRect(1042, 468, 37, 37, 15, 15);
		
		
		g2.setColor(Color.black);
		g2.setStroke(new BasicStroke(3));
		g2.drawLine(0, 650, 1100, 650);//linea superior negra
		
		BufferedImage image;
		try {
			image = ImageIO.read(new File("marito.png"));
			g2.drawImage(image, 110, 547, 100, 110, null);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		BufferedImage image2;
		try {
			image2 = ImageIO.read(new File("matita.png"));
			g2.drawImage(image2, 550, 400, 100, 100, null);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
