package aplication;

import java.awt.EventQueue;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.ArrayList;

import javax.swing.Timer;

import javax.swing.JFrame;
import javax.swing.JLabel;

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
	Timer timer;
	int x = 370, y = 250;
	int h =30, w = 30;
	
	ArrayList<Player> obstaculo = new ArrayList<Player>();
	
	int hor = 0, min = 0, seg = 0, cen = 0;
	Timer temporizador;
	boolean tempActivo = false;
	JLabel lblNewLabel;
	
	Player player;
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
		frame.setBounds(100, 100, 800, 660);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setResizable(false);
		
		player = new Player(x-5,y-5,h,w,Color.yellow);
		
		obstaculo.add(new Player(270, 50, 250, 20, Color.cyan));
		obstaculo.add(new Player(270, 450, 250, 20, Color.cyan));
		
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
		
		JButton btnNewButton = new JButton("Reiniciar");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				player.x=370;
				player.y=250;
				panel_4.requestFocusInWindow();
				reiniciarTemp();
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
		
		/*lblNewLabel_1 = new JLabel();
		lblNewLabel_1.setIcon(new ImageIcon(Keyboard.class.getResource("/aplication/pika.png")));
		lblNewLabel_1.setBounds(x, y, 35, 35);
		panel_4.add(lblNewLabel_1);*/
		
		panel_4.addKeyListener(this);
		panel_4.setFocusable(true);
		
		
	}
	 
	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		System.out.println(e.getKeyCode());
	}

	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		System.out.println(e.getKeyCode());
		
		Boolean m = true;
		for(Player pared : obstaculo) {
			if(player.colision(pared))
				m=false;
		}
		
		if(e.getKeyCode() == 87 || e.getKeyCode() == 38){
			if (!tempActivo) {
		        temporizador();
		    }
			if(m) {
				if(player.y>0) {
					player.y-=5;
				}
			}
			else {
				player.y+=7;
			}
		}
		if(e.getKeyCode() == 83 || e.getKeyCode() == 40){
			if (!tempActivo) {
		        temporizador();
		    }
			if(m) {
				if(player.y<500) {
					player.y+=5;
				}
			}
			else {
				player.y-=7;
			}
		}
		if(e.getKeyCode() == 65 || e.getKeyCode() == 37){
			if (!tempActivo) {
		        temporizador();
		    }
			if(m) {
				if(player.x>0) {
					player.x-=5;
				}
			}
			else {
				player.x+=7;
			}
		}
		if(e.getKeyCode() == 68 || e.getKeyCode() == 39){
			if (!tempActivo) {
		        temporizador();
		    }
			if(m) {
				if(player.x<755) {
					player.x+=5;
				}
			}
			else {
				player.x-=7;
			}
		}
		
		
		/*
		87 w 38 tecla arriba
		65 a 40 tecla abajo
		83 s 37 tecla izquierda
		68 d 39 tecla derecha
		*/
		
		panel_4.repaint();
		
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		System.out.println(e.getKeyCode());
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
			
			if(this.x + 5 < target.x + target.ancho &&
		             this.x + 5 + this.ancho > target.x &&
		             this.y + 5 < target.y + target.alto &&
		             this.y + 5 + this.alto > target.y)
				return true;
			
			return false;
			
		}
	}
}
