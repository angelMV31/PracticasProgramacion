import java.awt.EventQueue;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JFrame;
import javax.swing.JLabel;

import java.awt.BasicStroke;
import java.awt.BorderLayout;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import java.awt.Color;

public class Keyboard implements KeyListener{

	private JFrame frame;

	PaintPanel panel;
	private int x = 200, y = 200;
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
		frame.setBounds(100, 100, 700, 613);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JLabel lblNewLabel = new JLabel("Time 00:00:00");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		frame.getContentPane().add(lblNewLabel, BorderLayout.NORTH);
		
		JButton btnNewButton = new JButton("Reiniciar");
		frame.getContentPane().add(btnNewButton, BorderLayout.SOUTH);
		
		panel = new PaintPanel();
		panel.setBackground(new Color(255, 128, 255));
		frame.getContentPane().add(panel, BorderLayout.CENTER);
		
		panel.addKeyListener(this);
		panel.setFocusable(true);
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
		
		if(e.getKeyCode() == 87){
			y-=5;
		}
		if(e.getKeyCode() == 83){
			y+=5;	
		}
		if(e.getKeyCode() == 65){
			x-=5;
		}
		if(e.getKeyCode() == 68){
			x+=5;
		}
		/*
		87 w
		65 a
		83 s
		68 d
		*/
		
		panel.repaint();
		
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
			 g2.setColor(Color.black);
			 g2.setStroke(new BasicStroke(3));
			 g2.fillRect(x, y, 40, 40);
		 }
	 }

}
