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

public class MarioBross1 extends JFrame{
	
	Font signo = new Font("Arial", Font.BOLD, 50);

	public MarioBross1(String title) {
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

		g2.setColor(Color.decode("#a2f0ff")); //principal de color azul
		g2.fillRect(0, 0, 1100, 760);
		
		g2.setColor(Color.black);//contorno del arbusto
		g2.setStroke(new BasicStroke(3));
		g2.drawArc(70, 580, 40, 60, 30, 170);
		g2.setColor(Color.decode("#3fb954"));
		g2.fillArc(70, 580, 40, 60, 0, 360);
		g2.setColor(Color.black);
		g2.drawArc(50, 618, 60, 60, 180, -80);
		g2.setColor(Color.decode("#3fb954"));
		g2.fillArc(50, 618, 60, 60, 0, 360);
		g2.setColor(Color.black);
		g2.drawArc(70, 597, 80, 80, 100, -120);
		g2.setColor(Color.decode("#3fb954"));
		g2.fillArc(70, 597, 80, 80, 0, 360);
		
		g2.setColor(Color.decode("#fbe7c2")); //linea del piso
		g2.fillRect(0, 650, 1100, 670);
		
		g2.setColor(Color.decode("#9e7427")); //bajo de la linea del piso
		g2.fillRect(0, 670, 1100, 760);
		g2.setColor(Color.decode("#5a3f0d"));//cuadros para el piso
		g2.drawRect(0, 670, 40, 40);
		g2.fillRect(0, 670, 40, 40);
		g2.drawRect(40, 710, 40, 40);
		g2.fillRect(40, 710, 40, 40);
		g2.drawRect(80, 670, 40, 40);
		g2.fillRect(80, 670, 40, 40);
		g2.drawRect(120, 710, 40, 40);
		g2.fillRect(120, 710, 40, 40);
		g2.drawRect(160, 670, 40, 40);
		g2.fillRect(160, 670, 40, 40);
		g2.drawRect(200, 710, 40, 40);
		g2.fillRect(200, 710, 40, 40);
		g2.drawRect(240, 670, 40, 40);
		g2.fillRect(240, 670, 40, 40);
		g2.drawRect(280, 710, 40, 40);
		g2.fillRect(280, 710, 40, 40);
		g2.drawRect(320, 670, 40, 40);
		g2.fillRect(320, 670, 40, 40);
		g2.drawRect(360, 710, 40, 40);
		g2.fillRect(360, 710, 40, 40);
		g2.drawRect(400, 670, 40, 40);
		g2.fillRect(400, 670, 40, 40);
		g2.drawRect(440, 710, 40, 40);
		g2.fillRect(440, 710, 40, 40);
		g2.drawRect(480, 670, 40, 40);
		g2.fillRect(480, 670, 40, 40);
		g2.drawRect(520, 710, 40, 40);
		g2.fillRect(520, 710, 40, 40);
		g2.drawRect(560, 670, 40, 40);
		g2.fillRect(560, 670, 40, 40);
		g2.drawRect(600, 710, 40, 40);
		g2.fillRect(600, 710, 40, 40);
		g2.drawRect(640, 670, 40, 40);
		g2.fillRect(640, 670, 40, 40);
		g2.drawRect(680, 710, 40, 40);
		g2.fillRect(680, 710, 40, 40);
		g2.drawRect(720, 670, 40, 40);
		g2.fillRect(720, 670, 40, 40);
		g2.drawRect(760, 710, 40, 40);
		g2.fillRect(760, 710, 40, 40);
		g2.drawRect(800, 670, 40, 40);
		g2.fillRect(800, 670, 40, 40);
		g2.drawRect(840, 710, 40, 40);
		g2.fillRect(840, 710, 40, 40);
		g2.drawRect(880, 670, 40, 40);
		g2.fillRect(880, 670, 40, 40);
		g2.drawRect(920, 710, 40, 40);
		g2.fillRect(920, 710, 40, 40);
		g2.drawRect(960, 670, 40, 40);
		g2.fillRect(960, 670, 40, 40);
		g2.drawRect(1000, 710, 40, 40);
		g2.fillRect(1000, 710, 40, 40);
		g2.drawRect(1040, 670, 40, 40);
		g2.fillRect(1040, 670, 40, 40);
		g2.drawRect(1080, 710, 40, 40);
		g2.fillRect(1080, 710, 40, 40);
		
		g2.setColor(Color.black);
		g2.setStroke(new BasicStroke(3));
		g2.drawLine(0, 650, 1100, 650);//linea superior negra
		g2.drawLine(0, 670, 1100, 670);//linea superior negra
		
		g2.setColor(Color.black); //sombra de obstaculo azul
		g2.drawRoundRect(500, 400, 120, 250,30,30); 
		g2.fillRoundRect(500, 400, 120, 250, 30, 30);
		g2.setColor(Color.black);//obstaculo azul
		g2.drawRoundRect(375, 350, 200, 300,30,30);
		g2.setColor(Color.decode("#71c2ff"));
		g2.fillRoundRect(375, 350, 200, 300, 30, 30);
		g2.setColor(new Color(0, 0, 0, 70)); // Sombra semitransparente
		g2.fillRoundRect(565, 350, 10, 300, 10, 10);
		g2.fillRoundRect(375, 640, 200, 10, 10, 10);
		g2.setColor(Color.black); //tornillo
		g2.drawOval(383, 358, 10, 10);
		g2.setColor(Color.gray);
		g2.fillOval(383, 358, 10, 10);
		g2.setColor(Color.black); //tornillo
		g2.drawOval(557, 358, 10, 10);
		g2.setColor(Color.gray);
		g2.fillOval(557, 358, 10, 10);
		g2.setColor(Color.black); //tornillo
		g2.drawOval(557, 633, 10, 10);
		g2.setColor(Color.gray);
		g2.fillOval(557, 633, 10, 10);
		
		g2.setColor(Color.black);//sombra obstaculo chico
		g2.drawRoundRect(350, 525, 90, 125,30,30);
		g2.fillRoundRect(350, 525, 90, 125, 30, 30);
		
		g2.drawRoundRect(250, 500, 150, 150,30,30);//obstaculo chico
		g2.setColor(Color.decode("#ffc0b5"));
		g2.fillRoundRect(250, 500, 150, 150, 30, 30);
		g2.setColor(new Color(0, 0, 0, 70)); // Sombra semitransparente
		g2.fillRoundRect(390, 500, 10, 150, 10, 10);
		g2.fillRoundRect(250, 640, 150, 10, 10, 10);
		g2.setColor(Color.black); //tornillo
		g2.drawOval(258, 508, 10, 10);
		g2.setColor(Color.gray);
		g2.fillOval(258, 508, 10, 10);
		g2.setColor(Color.black); //tornillo
		g2.drawOval(383, 508, 10, 10);
		g2.setColor(Color.gray);
		g2.fillOval(383, 508, 10, 10);
		g2.setColor(Color.black); //tornillo
		g2.drawOval(258, 633, 10, 10);
		g2.setColor(Color.gray);
		g2.fillOval(258, 633, 10, 10);
		g2.setColor(Color.black); //tornillo
		g2.drawOval(383, 633, 10, 10);
		g2.setColor(Color.gray);
		g2.fillOval(383, 633, 10, 10);
		
		g2.setColor(Color.black);
		g2.setStroke(new BasicStroke(5));
		g2.drawRect(750, 550, 75, 100);
		g2.setColor(Color.decode("#008800"));
		g2.fillRect(750, 550, 75, 100);//parte superior del tubo
		g2.setColor(Color.black);
		g2.setStroke(new BasicStroke(5));
		g2.drawRect(745, 500, 85, 50);
		g2.setColor(Color.decode("#008800"));
		g2.fillRect(745, 500, 85, 50);//parte de abajo del tubo
		g2.setColor(new Color(0, 0, 0, 70)); // Sombra semitransparente
		g2.fillRect(750, 500, 10, 150);
		g2.fillRect(780, 500, 10, 150);
		g2.fillRect(800, 500, 10, 150);
		g2.setColor(new Color(255, 255, 255, 70)); // Sombra semitransparente blanca
		g2.fillRect(760, 500, 5, 150);
		g2.fillRect(790, 500, 3, 150);
		g2.fillRect(810, 500, 4, 150);
		
		g2.setColor(Color.black);
		g2.drawRect(780, 395, 10, 100);
		g2.setColor(Color.decode("#008800"));//estructura de la matita tallo
		g2.fillRect(780, 395, 10, 100);
		
		g2.setColor(Color.black);
		g2.drawArc(785, 450, 30, 30, -135, 135 );//hojas del lado derecho
		g2.setColor(Color.decode("#008800"));
		g2.fillArc(785, 450, 30, 30, -135, 135);
		g2.setColor(Color.black);
		g2.drawArc(785, 420, 30, 30, -135, 135 );
		g2.setColor(Color.decode("#008800"));
		g2.fillArc(785, 420, 30, 30, -135, 135);
		
		g2.setColor(Color.black);
		g2.drawArc(745, 420, 30, 30, 135, -135 ); //hojas del lado izquierdo
		g2.setColor(Color.decode("#008800"));
		g2.fillArc(745, 420, 30, 30, 135, -135);
		g2.setColor(Color.black);
		g2.drawArc(745, 450, 30, 30, 135, -135 );
		g2.setColor(Color.decode("#008800"));
		g2.fillArc(745, 450, 30, 30, 135, -135);
		
		g2.setColor(Color.black);//orilla flor
		g2.drawArc(760, 350, 50, 50, 205, -335);
		g2.setColor(Color.red);//relleno de flor
		g2.fillArc(760, 350, 50, 50, 205, -335);
		g2.setColor(Color.black);
		g2.fillOval(773, 363, 5, 5); // Punto
		g2.fillOval(790, 355, 5, 5); // Punto
		g2.fillOval(790, 373, 5, 5); // Punto
		g2.fillOval(780, 385, 5, 5); // Punto
		g2.fillOval(795, 385, 5, 5); // Punto
		g2.setStroke(new BasicStroke(5));
		g2.setColor(Color.white);
		g2.drawLine(762, 388, 785, 375);//linea superior negra
		g2.drawLine(768, 395, 785, 375);//linea superior negra
		
		
		g2.setColor(Color.black);
		g2.drawOval(761, 363, 5, 5);
		g2.fillOval(761, 363, 5, 5);
		
		g2.setColor(Color.black);//estos son los blockes flotantes
		g2.drawRect(90, 450, 50, 50);
		g2.setColor(Color.decode("#ff8a4e"));
		g2.fillRect(90, 450, 50, 50);
		g2.setColor(Color.black); //tornillo
		g2.drawOval(93, 453, 4, 4);
		g2.setColor(Color.gray);
		g2.fillOval(93, 453, 4, 4);
		g2.setColor(Color.black); //tornillo
		g2.drawOval(133, 453, 4, 4);
		g2.setColor(Color.gray);
		g2.fillOval(133, 453, 4, 4);
		g2.setColor(Color.black); //tornillo
		g2.drawOval(93, 493, 4, 4);
		g2.setColor(Color.gray);
		g2.fillOval(93, 493, 4, 4);
		g2.setColor(Color.black); //tornillo
		g2.drawOval(133, 493, 4, 4);
		g2.setColor(Color.gray);
		g2.fillOval(133, 493, 4, 4);
		g2.setColor(Color.orange);
		g2.drawOval(95, 480, 15, 8); // diseño
		g2.drawOval(120, 460, 15, 8); // diseño
		g2.setColor(Color.yellow);
		g2.fillOval(95, 480, 15, 8); 
		g2.fillOval(120, 460, 15, 8); 
		g2.setColor(Color.white);
		g2.setFont(signo);
		g2.drawString("?", 100, 495);
		g2.setColor(new Color(255, 255, 255, 80));// Sombra semitransparente blanca para la orilla
		g2.drawRect(90, 450, 50, 50);
		g2.setColor(new Color(255, 236, 0, 80)); // Sombra semitransparente amarilla para todo el cuadro
		g2.fillRect(90, 450, 50, 50);
		
		
		g2.setColor(Color.black);
		g2.drawRect(200, 300, 50, 50);
		g2.setColor(Color.decode("#ff8a4e"));
		g2.fillRect(200, 300, 50, 50);
		g2.setColor(Color.black); //tornillo
		g2.drawOval(203, 303, 4, 4);
		g2.setColor(Color.gray);
		g2.fillOval(203, 303, 4, 4);
		g2.setColor(Color.black); //tornillo
		g2.drawOval(240, 303, 4, 4);
		g2.setColor(Color.gray);
		g2.fillOval(240, 303, 4, 4);
		g2.setColor(Color.black); //tornillo
		g2.drawOval(203, 342, 4, 4);
		g2.setColor(Color.gray);
		g2.fillOval(203, 342, 4, 4);
		g2.setColor(Color.black); //tornillo
		g2.drawOval(240, 342, 4, 4);
		g2.setColor(Color.gray);
		g2.fillOval(240, 342, 4, 4);
		
		
		g2.setColor(Color.black);
		g2.drawRect(250, 300, 50, 50);
		g2.setColor(Color.decode("#ff8a4e"));
		g2.fillRect(250, 300, 50, 50);
		g2.setColor(Color.black); //tornillo
		g2.drawOval(254, 303, 4, 4);
		g2.setColor(Color.gray);
		g2.fillOval(254, 303, 4, 4);
		g2.setColor(Color.black); //tornillo
		g2.drawOval(291, 303, 4, 4);
		g2.setColor(Color.gray);
		g2.fillOval(291, 303, 4, 4);
		g2.setColor(Color.black); //tornillo
		g2.drawOval(254, 342, 4, 4);
		g2.setColor(Color.gray);
		g2.fillOval(254, 342, 4, 4);
		g2.setColor(Color.black); //tornillo
		g2.drawOval(291, 342, 4, 4);
		g2.setColor(Color.gray);
		g2.fillOval(291, 342, 4, 4);
		
		g2.setColor(Color.black);
		g2.drawRect(1000, 350, 50, 50);
		g2.setColor(Color.decode("#ff8a4e"));
		g2.fillRect(1000, 350, 50, 50);
		g2.setColor(Color.black); //tornillo
		g2.drawOval(1003, 353, 4, 4);
		g2.setColor(Color.gray);
		g2.fillOval(1003, 353, 4, 4);
		g2.setColor(Color.black); //tornillo
		g2.drawOval(1041, 353, 4, 4);
		g2.setColor(Color.gray);
		g2.fillOval(1041, 353, 4, 4);
		g2.setColor(Color.black); //tornillo
		g2.drawOval(1003, 390, 4, 4);
		g2.setColor(Color.gray);
		g2.fillOval(1003, 390, 4, 4);
		g2.setColor(Color.black); //tornillo
		g2.drawOval(1041, 390, 4, 4);
		g2.setColor(Color.gray);
		g2.fillOval(1041, 390, 4, 4);
		g2.setColor(Color.orange);
		g2.drawOval(1005, 360, 15, 8); // diseño
		g2.drawOval(1030, 375, 15, 8); // diseño
		g2.setColor(Color.yellow);
		g2.fillOval(1005, 360, 15, 8); 
		g2.fillOval(1030, 375, 15, 8); 
		g2.setColor(Color.white);
		g2.setFont(signo);
		g2.drawString("?", 1010, 395);
		g2.setColor(new Color(255, 255, 255, 80)); // Sombra semitransparente blanca
		g2.drawRect(1000, 350, 50, 50);
		g2.setColor(new Color(255, 236, 0, 80));
		g2.fillRect(1000, 350, 50, 50);
		
		g2.setColor(Color.black);//ultimo obstaculo que hay
		g2.drawRoundRect(950, 500, 200, 150,30,30);
		g2.setColor(Color.decode("#00dd5b"));
		g2.fillRoundRect(950, 500, 200, 150, 30, 30);
		g2.setColor(Color.black); //tornillo
		g2.drawOval(958, 508, 10, 10);
		g2.setColor(Color.gray);
		g2.fillOval(958, 508, 10, 10);
		g2.setColor(Color.black); //tornillo
		g2.drawOval(958, 633, 10, 10);
		g2.setColor(Color.gray);
		g2.fillOval(958, 633, 10, 10);
		g2.setColor(new Color(0, 0, 0, 70)); // Sombra semitransparente
		g2.fillRoundRect(950, 640, 150, 10, 10, 10);
		
		BufferedImage image;
		try {
			image = ImageIO.read(new File("mario.png"));
			g2.drawImage(image, 650, 547, 100, 110, null);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		BufferedImage image2;
		try {
			image2 = ImageIO.read(new File("moneda.png"));
			g2.drawImage(image2, 200, 200, 50, 50, null);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		BufferedImage image3;
		try {
			image3 = ImageIO.read(new File("honguito.png"));
			g2.drawImage(image3, 250, 250, 50, 50, null);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		BufferedImage image4;
		try {
			image4 = ImageIO.read(new File("bola.png"));
			g2.drawImage(image4, 520, 520, 25, 25, null);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
