package aplication;

import java.awt.EventQueue;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.ArrayList;

import javax.swing.Timer;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.BasicStroke;
import java.awt.BorderLayout;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import java.awt.Color;
import java.awt.Font;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Keyboard implements KeyListener{

	private JFrame frame;
	PaintPanel panel_4;
	JLabel lblNewLabel_1;
	Timer timer, timer2;
	String tiempo;
	int contador = 0;
	int x = 20, y = 5;
	int h =20, w = 20;
	
	ArrayList<Player> obstaculo = new ArrayList<Player>();
	
	int hor = 0, min = 0, seg = 0, cen = 0, botonPress = 0;
	Timer temporizador;
	boolean tempActivo = false;
	JLabel lblNewLabel;
	
	Player player, shadow, meta;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Keyboard window = new Keyboard();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
		
		
	}

	/**
	 * Create the application.
	 */
	public Keyboard() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 1200, 750);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setResizable(false);
		
		player = new Player(x,y,h,w,Color.yellow);
		shadow = new Player(x,y,h,w,Color.yellow);
		meta = new Player(1150, 595, 35, 35, Color.green);//meta)
		
		
		obstaculo.add(new Player(50, 0, 1185, 6, Color.cyan));//arriba
		obstaculo.add(new Player(0, 0, 9, 622, Color.cyan));//izquierda
		obstaculo.add(new Player(9, 616, 1145, 6, Color.cyan));//abajo
		obstaculo.add(new Player(1178, 6, 9, 580, Color.cyan));//derecha
		
		//columnas verticales
		obstaculo.add(new Player(50, 6, 9, 150, Color.cyan));
		obstaculo.add(new Player(50, 300, 9, 100, Color.cyan));
		obstaculo.add(new Player(50, 450, 9, 116, Color.cyan));
		
		obstaculo.add(new Player(109, 225, 9, 100, Color.cyan));
		obstaculo.add(new Player(109, 375, 9, 100, Color.cyan));
		obstaculo.add(new Player(109, 525, 9, 41, Color.cyan));
		
		obstaculo.add(new Player(168, 215, 9, 140, Color.cyan));
		obstaculo.add(new Player(168, 425, 9, 141, Color.cyan));
		
		obstaculo.add(new Player(227, 225, 9, 100, Color.cyan));
		obstaculo.add(new Player(227, 375, 9, 100, Color.cyan));
		obstaculo.add(new Player(227, 525, 9, 41, Color.cyan));
		
		obstaculo.add(new Player(286, 6, 9, 69, Color.cyan));
		obstaculo.add(new Player(286, 125, 9, 100, Color.cyan));
		obstaculo.add(new Player(286, 275, 9, 100, Color.cyan));
		obstaculo.add(new Player(286, 425, 9, 191, Color.cyan));
		
		obstaculo.add(new Player(345, 56, 9, 119, Color.cyan));
		obstaculo.add(new Player(345, 225, 9, 100, Color.cyan));
		obstaculo.add(new Player(345, 375, 9, 100, Color.cyan));
		obstaculo.add(new Player(345, 525, 9, 41, Color.cyan));
		
		obstaculo.add(new Player(404, 6, 9, 69, Color.cyan));
		obstaculo.add(new Player(404, 125, 9, 100, Color.cyan));
		obstaculo.add(new Player(404, 275, 9, 100, Color.cyan));
		obstaculo.add(new Player(404, 425, 9, 141, Color.cyan));
		
		obstaculo.add(new Player(463, 56, 9, 119, Color.cyan));
		obstaculo.add(new Player(463, 225, 9, 100, Color.cyan));
		obstaculo.add(new Player(463, 375, 9, 192, Color.cyan));
		
		obstaculo.add(new Player(522, 6, 9, 169, Color.cyan));
		obstaculo.add(new Player(522, 225, 9, 100, Color.cyan));
		obstaculo.add(new Player(522, 375, 9, 242, Color.cyan));
		
		obstaculo.add(new Player(581, 56, 9, 119, Color.cyan));
		obstaculo.add(new Player(581, 225, 9, 200, Color.cyan));
		obstaculo.add(new Player(581, 475, 9, 91, Color.cyan));
		
		obstaculo.add(new Player(640, 6, 9, 69, Color.cyan));
		obstaculo.add(new Player(640, 125, 9, 250, Color.cyan));
		obstaculo.add(new Player(640, 425, 9, 141, Color.cyan));
		
		obstaculo.add(new Player(699, 56, 9, 169, Color.cyan));
		obstaculo.add(new Player(699, 275, 9, 150, Color.cyan));
		obstaculo.add(new Player(699, 475, 9, 91, Color.cyan));
		
		obstaculo.add(new Player(758, 6, 9, 119, Color.cyan));
		obstaculo.add(new Player(758, 175, 9, 200, Color.cyan));
		obstaculo.add(new Player(758, 425, 9, 141, Color.cyan));
		
		obstaculo.add(new Player(817, 56, 9, 269, Color.cyan));
		obstaculo.add(new Player(817, 375, 9, 191, Color.cyan));
		
		obstaculo.add(new Player(876, 6, 9, 169, Color.cyan));
		obstaculo.add(new Player(876, 225, 9, 150, Color.cyan));
		obstaculo.add(new Player(876, 425, 9, 141, Color.cyan));
		
		obstaculo.add(new Player(935, 56, 9, 119, Color.cyan));
		obstaculo.add(new Player(935, 225, 9, 100, Color.cyan));
		obstaculo.add(new Player(935, 375, 9, 100, Color.cyan));
		obstaculo.add(new Player(935, 510, 9, 105, Color.cyan));
		
		obstaculo.add(new Player(994, 6, 9, 219, Color.cyan)); 
		obstaculo.add(new Player(994, 275, 9, 231, Color.cyan));
		
		obstaculo.add(new Player(1053, 56, 9, 169, Color.cyan));
		obstaculo.add(new Player(1053, 275, 9, 100, Color.cyan));
		obstaculo.add(new Player(1053, 425, 9, 81, Color.cyan));
		
		obstaculo.add(new Player(1112, 6, 9, 119, Color.cyan));
		obstaculo.add(new Player(1112, 175, 9, 150, Color.cyan)); 
		obstaculo.add(new Player(1112, 375, 9, 137, Color.cyan));
		
		//columnas horizontales
		obstaculo.add(new Player(50, 56, 118, 9, Color.cyan));
		obstaculo.add(new Player(109, 106, 59, 9, Color.cyan));
		obstaculo.add(new Player(50, 156, 118, 9, Color.cyan));
		obstaculo.add(new Player(50, 356, 59, 9, Color.cyan));
		obstaculo.add(new Player(50, 456, 59, 9, Color.cyan));
		obstaculo.add(new Player(50, 506, 59, 9, Color.cyan));
		obstaculo.add(new Player(50, 556, 59, 9, Color.cyan));

		obstaculo.add(new Player(108, 56, 59, 9, Color.cyan));
		obstaculo.add(new Player(108, 206, 59, 9, Color.cyan));
		obstaculo.add(new Player(108, 406, 59, 9, Color.cyan));
		obstaculo.add(new Player(108, 456, 59, 9, Color.cyan));
		obstaculo.add(new Player(108, 506, 59, 9, Color.cyan));
		
		obstaculo.add(new Player(168, 56, 59, 9, Color.cyan));
		obstaculo.add(new Player(168, 206, 59, 9, Color.cyan));
		obstaculo.add(new Player(168, 256, 59, 9, Color.cyan));
		obstaculo.add(new Player(168, 406, 59, 9, Color.cyan));
		obstaculo.add(new Player(168, 556, 59, 9, Color.cyan));
		
		obstaculo.add(new Player(227, 106, 59, 9, Color.cyan));
		obstaculo.add(new Player(227, 356, 59, 9, Color.cyan));
		obstaculo.add(new Player(227, 556, 59, 9, Color.cyan));
		
		obstaculo.add(new Player(286, 56, 59, 9, Color.cyan));
		obstaculo.add(new Player(286, 106, 59, 9, Color.cyan));
		obstaculo.add(new Player(286, 156, 59, 9, Color.cyan));
		obstaculo.add(new Player(286, 506, 59, 9, Color.cyan));
		obstaculo.add(new Player(286, 556, 59, 9, Color.cyan));
		
		obstaculo.add(new Player(345, 56, 59, 9, Color.cyan));
		obstaculo.add(new Player(345, 106, 59, 9, Color.cyan));
		obstaculo.add(new Player(345, 206, 59, 9, Color.cyan));
		obstaculo.add(new Player(345, 506, 59, 9, Color.cyan));
		
		obstaculo.add(new Player(404, 56, 59, 9, Color.cyan));
		obstaculo.add(new Player(404, 156, 59, 9, Color.cyan));
		obstaculo.add(new Player(404, 456, 59, 9, Color.cyan));
		obstaculo.add(new Player(404, 556, 59, 9, Color.cyan));
		
		obstaculo.add(new Player(463, 106, 59, 9, Color.cyan));
		obstaculo.add(new Player(463, 156, 59, 9, Color.cyan));
		obstaculo.add(new Player(463, 206, 59, 9, Color.cyan));
		obstaculo.add(new Player(463, 306, 59, 9, Color.cyan));
		obstaculo.add(new Player(463, 556, 59, 9, Color.cyan));
		
		obstaculo.add(new Player(522, 56, 59, 9, Color.cyan));
		obstaculo.add(new Player(522, 356, 59, 9, Color.cyan));
		obstaculo.add(new Player(522, 456, 59, 9, Color.cyan));
		obstaculo.add(new Player(522, 506, 59, 9, Color.cyan));
		obstaculo.add(new Player(522, 556, 59, 9, Color.cyan));
		
		obstaculo.add(new Player(581, 56, 59, 9, Color.cyan));
		obstaculo.add(new Player(581, 506, 59, 9, Color.cyan));
		
		obstaculo.add(new Player(640, 56, 59, 9, Color.cyan));
		obstaculo.add(new Player(640, 156, 59, 9, Color.cyan));
		obstaculo.add(new Player(640, 206, 59, 9, Color.cyan));
		obstaculo.add(new Player(640, 556, 59, 9, Color.cyan));
		
		obstaculo.add(new Player(699, 106, 59, 9, Color.cyan));
		obstaculo.add(new Player(699, 406, 59, 9, Color.cyan));
		obstaculo.add(new Player(699, 506, 59, 9, Color.cyan));
		obstaculo.add(new Player(699, 556, 59, 9, Color.cyan));
		
		obstaculo.add(new Player(758, 56, 59, 9, Color.cyan));
		obstaculo.add(new Player(758, 106, 59, 9, Color.cyan));
		obstaculo.add(new Player(758, 356, 59, 9, Color.cyan));
		obstaculo.add(new Player(758, 466, 59, 9, Color.cyan));
		obstaculo.add(new Player(758, 556, 59, 9, Color.cyan));
		
		obstaculo.add(new Player(817, 56, 59, 9, Color.cyan));
		obstaculo.add(new Player(817, 124, 59, 9, Color.cyan));
		obstaculo.add(new Player(817, 465, 59, 9, Color.cyan));
		obstaculo.add(new Player(817, 506, 59, 9, Color.cyan));
		
		obstaculo.add(new Player(876, 56, 59, 9, Color.cyan));
		obstaculo.add(new Player(876, 256, 59, 9, Color.cyan));
		obstaculo.add(new Player(876, 366, 59, 9, Color.cyan));
		obstaculo.add(new Player(876, 465, 59, 9, Color.cyan));
		
		obstaculo.add(new Player(994, 557, 184, 9, Color.cyan));
		
		obstaculo.add(new Player(935, 106, 59, 9, Color.cyan));
		obstaculo.add(new Player(935, 170, 59, 9, Color.cyan));
		obstaculo.add(new Player(935, 416, 59, 9, Color.cyan));
		obstaculo.add(new Player(935, 506, 59, 9, Color.cyan));
		
		obstaculo.add(new Player(994, 56, 59, 9, Color.cyan));
		obstaculo.add(new Player(994, 156, 59, 9, Color.cyan));
		obstaculo.add(new Player(994, 275, 59, 9, Color.cyan));
		obstaculo.add(new Player(994, 336, 59, 9, Color.cyan));
		obstaculo.add(new Player(994, 506, 59, 9, Color.cyan));
		
		obstaculo.add(new Player(1053, 56, 59, 9, Color.cyan));
		obstaculo.add(new Player(1053, 106, 59, 9, Color.cyan));
		obstaculo.add(new Player(1053, 275, 59, 9, Color.cyan));
		obstaculo.add(new Player(1053, 406, 59, 9, Color.cyan));
		obstaculo.add(new Player(1053, 506, 59, 9, Color.cyan));
		
		
		//panel 4 dimensiones
		//x de 1185
		//y de 622
		
		JPanel panel_1 = new JPanel();
		frame.getContentPane().add(panel_1, BorderLayout.CENTER);
		panel_1.setLayout(new BorderLayout(0, 0));
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(new Color(255, 255, 255));
		panel_1.add(panel_2, BorderLayout.CENTER);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(255, 0, 0));
		panel_1.add(panel, BorderLayout.NORTH);
		
		JLabel lblNewLabel_2 = new JLabel("Time: ");
		lblNewLabel_2.setFont(new Font("Times New Roman", Font.BOLD, 30));
		lblNewLabel_2.setForeground(Color.white);
		panel.add(lblNewLabel_2);
		
		lblNewLabel = new JLabel("00:00:00:00");
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 30));
		lblNewLabel.setForeground(Color.white);
		panel.add(lblNewLabel);
		
		JPanel panel_3 = new JPanel();
		panel_1.add(panel_3, BorderLayout.SOUTH);
		
		JButton btnNewButton = new JButton("Jugar de Nuevo");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {		
				player.x=20;
				player.y=5;
				
				shadow.x=20;
				shadow.y=5;
				
				panel_4.requestFocusInWindow();
				
				reiniciarTemp();
				
				contador=0;
				
				panel_4.repaint();
			}
		});
		btnNewButton.setBackground(new Color(255, 255, 0));
		btnNewButton.setFont(new Font("Times New Roman", Font.BOLD, 22));
		panel_3.add(btnNewButton);
		
		panel_4 = new PaintPanel();
		panel_4.setBackground(new Color(0, 0, 0));
		panel_1.add(panel_4, BorderLayout.CENTER);
		panel_4.setLayout(null);
		
		lblNewLabel_1 = new JLabel();
		lblNewLabel_1.setIcon(new ImageIcon(Keyboard.class.getResource("/aplication/pika.png")));
		lblNewLabel_1.setBounds(1700, 595, 35, 35);
		panel_4.add(lblNewLabel_1);
		
		panel_4.addKeyListener(this);
		panel_4.setFocusable(true);
		
		ActionListener mover = new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				update();
			}
		};
		
		timer2 = new Timer(3,mover);
		
	}
	 
	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		//System.out.println(e.getKeyCode());
	}

	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		//System.out.println(e.getKeyCode());
		if(contador == 0) {
			temporizador();
			timer2.start();	
			contador=1;
		}
		
		botonPress = e.getKeyCode();
		update();
	}
	
	public void update() {
		Boolean m = true;
		for(Player pared : obstaculo) {
			if(player.colision(pared))
				m=false;
		}
		
		if(m) {
			shadow.x = player.x;
			shadow.y = player.y;
		}
		
		if(botonPress == 87 || botonPress == 38){
			if (!tempActivo) {
		        
		    }
			if(m) {
				if(player.y>0) {
					player.y-=3;
				}
			}
			else {
				player.x = shadow.x;
				player.y = shadow.y;
			}
		}
		if(botonPress == 83 || botonPress == 40){
			if (!tempActivo) {
		    }
			if(m) {
				if(player.y<600) {
					player.y+=3;
				}
			}
			else {
				player.x = shadow.x;
				player.y = shadow.y;
			}
		}
		if(botonPress == 65 || botonPress == 37){
			if (!tempActivo) {
		    }
			if(m) {
				if(player.x>0) {
					player.x-=3;
				}
			}
			else {
				player.x = shadow.x;
				player.y = shadow.y;
			}
		}
		if(botonPress == 68 || botonPress == 39){
			if (!tempActivo) {
		    }
			if(m) {
				if(player.x<1165) {
					player.x+=3;
				}
			}
			else {
				player.x = shadow.x;
				player.y = shadow.y;
			}
		}
		
		
		/*
		87 w 38 tecla arriba
		65 a 40 tecla abajo
		83 s 37 tecla izquierda
		68 d 39 tecla derecha
		*/
		
		panel_4.repaint();
		
		validarGanar();
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		//System.out.println(e.getKeyCode());
	}
	
	class PaintPanel extends JPanel{
		 public PaintPanel() {
			 this.setBackground(Color.white);
		 }
		 public void paintComponent(Graphics g) {
			 super.paintComponent(g);
			 Graphics2D g2 = (Graphics2D) g;
			 g2.setColor(player.color);
			 g2.setStroke(new BasicStroke(3));
			 g2.fillRect(player.x, player.y, player.ancho, player.alto);
		
			 for (Player obs : obstaculo) {
				    g2.setColor(obs.color);
				    g2.fillRect(obs.x, obs.y, obs.ancho, obs.alto);
			 }
			
		 }
	 }

	public void actualizarEtiqueta() {
		String tiempo = (hor<=9?"0":"")+hor+":" + (min<=9?"0":"")+min+":" + (seg<=9?"0":"")+seg+":" + (cen<=9?"0":"")+cen;
		lblNewLabel.setText(tiempo);
		
	}
	
	
	public void temporizador() {
		tempActivo = true;
		
		temporizador = new Timer(10, new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				cen++;
    			if(cen==100) {
    				cen = 0;
    				++seg;
    			}
    			if(seg==60) {
    				seg = 0;
    				++min;
    			}
    			if(min==60) {
    				min = 0;
    				++hor;
    			}
    			actualizarEtiqueta();
			}
			
		});    
		
		temporizador.start();
		
	}
	
	
	public void reanudarTemp() {
		if(!tempActivo) {
			temporizador();
		}
	}
	
	
	public void detenerTemp() {
		tempActivo = false;
		if(temporizador!=null) {
			temporizador.stop();
		}
	}
	
	
	public void reiniciarTemp() {
		tempActivo = false;
		if(temporizador!=null) {
			temporizador.stop();
		}
		
		lblNewLabel.setText("00:00:00:00");
		hor = 0; min = 0; seg = 0; cen = 0;
	}
	
	
	class Player extends JPanel {
		int x, y, ancho, alto;
		Color color;
		
		public Player(int x, int y, int ancho, int alto, Color color) {
			this.x=x;
			this.y=y;
			this.ancho=ancho;
			this.alto=alto;
			this.color=color;
		}
		
		public boolean colision(Player target) {
			
			if(this.x - 1 < target.x + target.ancho &&
		             this.x + 1 + this.ancho > target.x &&
		             this.y - 1 < target.y + target.alto &&
		             this.y + 1 + this.alto > target.y)
				return true;
			
			return false;
			
		}
	}
	
	public void validarGanar() {
		boolean gana = false;
		if(player.colision(meta)) {
			gana = true;
			
			temporizador.stop();
			
			detenerTemp();
			
			tiempo = lblNewLabel.getText();
			
			timer2.stop();
			
			JOptionPane.showMessageDialog(null, tiempo, "Ganaste", JOptionPane.INFORMATION_MESSAGE);
			
		}
		
	}
}
