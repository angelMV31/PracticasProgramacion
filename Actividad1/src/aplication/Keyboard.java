package aplication;

import java.awt.EventQueue;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Timer;
import java.util.TimerTask;

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
	int hor = 0, min = 0, seg = 0, cen = 0;
	Timer temporizador;
	boolean tempActivo = false;
	JLabel lblNewLabel;
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
		
		JPanel panel_1 = new JPanel();
		frame.getContentPane().add(panel_1, BorderLayout.CENTER);
		panel_1.setLayout(new BorderLayout(0, 0));
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(new Color(255, 255, 255));
		panel_1.add(panel_2, BorderLayout.CENTER);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(255, 0, 0));
		panel_1.add(panel, BorderLayout.NORTH);
		
		lblNewLabel = new JLabel("Time 00:00:00:00");
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 30));
		lblNewLabel.setForeground(Color.white);
		panel.add(lblNewLabel);
		
		JPanel panel_3 = new JPanel();
		panel_1.add(panel_3, BorderLayout.SOUTH);
		
		JButton btnNewButton = new JButton("Reiniciar");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				x=370;
				y=250;
				panel_4.requestFocusInWindow();
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
		
		if(e.getKeyCode() == 87 || e.getKeyCode() == 38){
			if(y>0) {
				y-=5;
			}
		}
		if(e.getKeyCode() == 83 || e.getKeyCode() == 40){
			if(y<500) {
				y+=5;
			}
		}
		if(e.getKeyCode() == 65 || e.getKeyCode() == 37){
			if(x>0) {
				x-=5;
			}
		}
		if(e.getKeyCode() == 68 || e.getKeyCode() == 39){
			if(x<755) {
				x+=5;
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
			 g2.setColor(Color.yellow);
			 g2.setStroke(new BasicStroke(3));
			 g2.fillRect(x, y, 30, 30);
		 }
	 }

}
