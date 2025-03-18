package aplication;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;

public class Listenner extends JFrame{

public Listenner(String title) {
		
		this.setTitle(title);
		this.setVisible(true);
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		this.setSize(1000, 700);

		this.setLocationRelativeTo(null);
		
		this.setResizable(true);
		
		this.add(this.login());
		
		this.validate();
		this.revalidate();
		this.repaint();
		
	}
	
	public JPanel login() {
		JPanel login = new JPanel();
		login.setLocation(0, 0);
		login.setSize(1000, 700);
		login.setOpaque(true);
		login.setBackground(Color.black);
		login.setVisible(true);
		login.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setLayout(null);
		panel.setOpaque(false);
		panel.setBounds(0, 0, 1000, 700);
		this.add(panel);
		ImageIcon i = new ImageIcon(new ImageIcon("fondo.png").getImage().getScaledInstance(1000, 700, java.awt.Image.SCALE_SMOOTH));
		JLabel fondo = new JLabel(i);
		fondo.setBounds(0,0,1000,700);	
		this.setContentPane(fondo);
		
		JButton boton = new JButton("Click me!");
		boton.setBounds(450,600,100,30);
		boton.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				JButton button2 = new JButton("HOla");
				Random rand = new Random();
				
				int x = rand.nextInt(1000);
				int y= rand.nextInt(700);
				
				int col1 = rand.nextInt(250);
				int col2 = rand.nextInt(250);
				int col3 = rand.nextInt(250);
				
				button2.setBackground(new Color(col1,col2,col3));
				
				button2.setBounds(x,y,100,30);
				panel.add(button2);
				
				panel.repaint();
			}
			
		});
		panel.add(boton);
		return panel;
		
	}
}
