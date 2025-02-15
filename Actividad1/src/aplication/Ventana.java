package aplication;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Ventana extends JFrame {
	Font etiquetas = new Font("Andale mono", Font.BOLD,16);
	
	public Ventana(String title) {
		this.setTitle(title);
		this.setVisible(true);
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		this.setSize(500,500);
		
		this.setResizable(false);

		this.setLocationRelativeTo(null);
		
		this.setMinimumSize(new Dimension(400,400));
		this.setMaximumSize(new Dimension(800,800));
		this.add(this.login());
		this.repaint();
		
	}
	
	public JPanel login() {
		JPanel login = new JPanel();
		login.setLocation(0, 0);
		login.setSize(500, 500);
		login.setOpaque(true);
		login.setBackground(new Color(229,114,126));
		login.setVisible(true);
		login.setLayout(null);
		
		JLabel etiqueta1 = new JLabel("Bienvenidos");
		etiqueta1.setSize(160,40);
		etiqueta1.setLocation(160, 10);
		etiqueta1.setBackground(Color.gray);
		etiqueta1.setOpaque(true);
		etiqueta1.setFont(etiquetas);
		etiqueta1.setHorizontalAlignment(JLabel.CENTER);
		login.add(etiqueta1);
		
		JLabel etiqueta2 = new JLabel("Usuario");
		etiqueta2.setBounds(60, 90, 80, 30);
		//etiqueta2.setSize(80,30);
		//etiqueta2.setLocation(55, 50);
		etiqueta2.setBackground(Color.WHITE);
		etiqueta2.setOpaque(true);
		etiqueta2.setFont(etiquetas);
		etiqueta2.setHorizontalAlignment(JLabel.CENTER);
		login.add(etiqueta2);
		
		JTextField correo = new JTextField();
		correo.setBounds(60, 140, 200, 30);
		correo.setBackground(Color.WHITE);
		correo.setOpaque(true);
		correo.setFont(etiquetas);
		login.add(correo);

		JLabel etiqueta3 = new JLabel("Contraseña");
		etiqueta3.setBounds(60, 190, 120, 30);
		etiqueta3.setBackground(Color.WHITE);
		etiqueta3.setOpaque(true);
		etiqueta3.setFont(etiquetas);
		etiqueta3.setHorizontalAlignment(JLabel.CENTER);
		login.add(etiqueta3);
		
		
		JTextField pase = new JTextField();
		pase.setBounds(60, 240, 250, 30);
		pase.setBackground(Color.WHITE);
		pase.setOpaque(true);
		pase.setFont(etiquetas);
		login.add(pase);

		JButton acceso = new JButton("Ingresar");
		acceso.setBounds(180, 320, 120, 30); 
		acceso.setBackground(Color.WHITE);
		acceso.setOpaque(true);
		acceso.setFont(etiquetas);
		acceso.setHorizontalAlignment(JButton.CENTER);
		login.add(acceso);
		
		login.revalidate();
		
		return login;

	}

}
