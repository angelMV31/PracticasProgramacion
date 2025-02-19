package aplication;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

public class Ventana extends JFrame {
	Font titulo = new Font("Arial", Font.BOLD, 25);
	Font etiquetas = new Font("Arial", Font.BOLD,16);
	Font et = new Font("Arial", Font.BOLD,10);
	
	public Ventana(String title) {
		this.setTitle(title);
		this.setVisible(true);
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		this.setSize(500,500);
		
		this.setResizable(false);

		this.setLocationRelativeTo(null);
		
		this.setMinimumSize(new Dimension(400,400));
		this.setMaximumSize(new Dimension(800,800));
		//this.add(this.login());
		this.add(this.registro());
		this.repaint();
		
	}
	
	/*public JPanel login() {
		JPanel login = new JPanel();
		login.setLocation(0, 0);
		login.setSize(500, 500);
		login.setOpaque(true);
		login.setBackground(Color.decode("#fc86eb"));
		login.setVisible(true);
		login.setLayout(null);
		
		JLabel etiqueta1 = new JLabel("Bienvenidos");
		etiqueta1.setSize(160,40);
		etiqueta1.setLocation(160, 20);
		etiqueta1.setBackground(Color.decode("#fc86eb"));
		etiqueta1.setOpaque(true);
		etiqueta1.setFont(titulo);
		etiqueta1.setHorizontalAlignment(JLabel.CENTER);
		login.add(etiqueta1);
		
		JLabel etiqueta2 = new JLabel("Usuario");
		etiqueta2.setBounds(120, 90, 90, 30);
		//etiqueta2.setSize(80,30);
		//etiqueta2.setLocation(55, 50);
		etiqueta2.setBackground(Color.decode("#fc86eb"));
		etiqueta2.setOpaque(true);
		etiqueta2.setFont(etiquetas);
		etiqueta2.setHorizontalAlignment(JLabel.LEFT);
		login.add(etiqueta2);
		
		JTextField correo = new JTextField();
		correo.setBounds(110, 140, 265, 30);
		correo.setBackground(Color.WHITE);
		correo.setOpaque(true);
		correo.setFont(etiquetas);
		login.add(correo);

		JLabel etiqueta3 = new JLabel("Contraseña");
		etiqueta3.setBounds(120, 190, 90, 30);
		etiqueta3.setBackground(Color.decode("#fc86eb"));
		etiqueta3.setOpaque(true);
		etiqueta3.setFont(etiquetas);
		etiqueta3.setHorizontalAlignment(JLabel.LEFT);
		login.add(etiqueta3);
		
		
		JPasswordField pase = new JPasswordField();
		pase.setBounds(110, 240, 265, 30);
		pase.setBackground(Color.WHITE);
		pase.setOpaque(true);
		pase.setFont(etiquetas);
		login.add(pase);
		
		JCheckBox check = new JCheckBox();
		check.setBounds(110, 290, 15, 15);
		check.setBackground(Color.WHITE);
		check.setOpaque(true);
		check.setFont(etiquetas);
		check.setHorizontalAlignment(JButton.CENTER);
		login.add(check);
		
		JLabel etiqueta4 = new JLabel("Recuerdarme");
		etiqueta4.setBounds(125, 282, 80, 30);
		etiqueta4.setBackground(Color.decode("#fc86eb"));
		etiqueta4.setOpaque(true);
		etiqueta4.setFont(et);
		etiqueta4.setHorizontalAlignment(JLabel.CENTER);
		login.add(etiqueta4);
		
		JButton forgot = new JButton("¿Olvidaste tu contraseña?");
		forgot.setBounds(220, 290, 166, 15);
		forgot.setBackground(Color.decode("#fc86eb"));
		forgot.setForeground(Color.RED);
		forgot.setOpaque(true);
		forgot.setFont(et);
		forgot.setHorizontalAlignment(JLabel.RIGHT);
		login.add(forgot);

		JButton acceso = new JButton("Ingresar");
		acceso.setBounds(160, 355, 150, 30); 
		acceso.setBackground(Color.decode("#30d130"));
		acceso.setOpaque(true);
		acceso.setFont(etiquetas);
		acceso.setHorizontalAlignment(JButton.CENTER);
		login.add(acceso);
		
		login.revalidate();
		
		return login;

	}*/
	
	public JPanel registro() {
		JPanel regis = new JPanel();
		regis.setLocation(0, 0);
		regis.setSize(500, 500);
		regis.setOpaque(true);
		regis.setBackground(Color.decode("#fc86eb"));
		regis.setVisible(true);
		regis.setLayout(null);
		
		JLabel etiqueta1 = new JLabel("Registro");
		etiqueta1.setSize(160,40);
		etiqueta1.setLocation(160, 15);
		etiqueta1.setBackground(Color.decode("#fc86eb"));
		etiqueta1.setOpaque(true);
		etiqueta1.setFont(titulo);
		etiqueta1.setHorizontalAlignment(JLabel.CENTER);
		regis.add(etiqueta1);
		
		JLabel etiqueta2 = new JLabel("Usuario");
		etiqueta2.setBounds(120, 60, 90, 30);
		//etiqueta2.setSize(80,30);
		//etiqueta2.setLocation(55, 50);
		etiqueta2.setBackground(Color.decode("#fc86eb"));
		etiqueta2.setOpaque(true);
		etiqueta2.setFont(etiquetas);
		etiqueta2.setHorizontalAlignment(JLabel.LEFT);
		regis.add(etiqueta2);
		
		JTextField correo = new JTextField();
		correo.setBounds(110, 100, 265, 30);
		correo.setBackground(Color.WHITE);
		correo.setOpaque(true);
		correo.setFont(etiquetas);
		regis.add(correo);

		JLabel etiqueta3 = new JLabel("Bio");
		etiqueta3.setBounds(120, 140, 90, 30);
		etiqueta3.setBackground(Color.decode("#fc86eb"));
		etiqueta3.setOpaque(true);
		etiqueta3.setFont(etiquetas);
		etiqueta3.setHorizontalAlignment(JLabel.LEFT);
		regis.add(etiqueta3);
		
		JTextField bio = new JTextField();
		bio.setBounds(110, 170, 265, 50);
		bio.setBackground(Color.WHITE);
		bio.setOpaque(true);
		bio.setFont(etiquetas);
		regis.add(bio);
		
		ButtonGroup opc = new ButtonGroup();
		
		JLabel etiqueta4 = new JLabel("Preferiencias");
		etiqueta4.setBounds(180, 225, 110, 50);
		etiqueta4.setBackground(Color.decode("#fc86eb"));
		etiqueta4.setOpaque(true);
		etiqueta4.setFont(etiquetas);
		etiqueta4.setHorizontalAlignment(JLabel.LEFT);
		regis.add(etiqueta4);
		
		JCheckBox check = new JCheckBox();
		check.setBounds(97, 280, 15, 15);
		check.setBackground(Color.WHITE);
		check.setOpaque(true);
		check.setFont(etiquetas);
		check.setHorizontalAlignment(JButton.CENTER);
		regis.add(check);

		JLabel r1 = new JLabel("Dulces");
		r1.setBounds(115, 274, 70, 30);
		r1.setBackground(Color.decode("#fc86eb"));
		r1.setOpaque(true);
		r1.setFont(etiquetas);
		r1.setHorizontalAlignment(JLabel.LEFT);
		regis.add(r1);
		
		JCheckBox check2 = new JCheckBox();
		check2.setBounds(185, 280, 15, 15);
		check2.setBackground(Color.WHITE);
		check2.setOpaque(true);
		check2.setFont(etiquetas);
		check2.setHorizontalAlignment(JButton.CENTER);
		regis.add(check2);
		
		JLabel r2 = new JLabel("Salado");
		r2.setBounds(203, 274, 70, 30);
		r2.setBackground(Color.decode("#fc86eb"));
		r2.setOpaque(true);
		r2.setFont(etiquetas);
		r2.setHorizontalAlignment(JLabel.LEFT);
		regis.add(r2);
		
		JCheckBox check3 = new JCheckBox();
		check3.setBounds(275, 280, 15, 15);
		check3.setBackground(Color.WHITE);
		check3.setOpaque(true);
		check3.setFont(etiquetas);
		check3.setHorizontalAlignment(JButton.CENTER);
		regis.add(check3);
		
		JLabel r3 = new JLabel("Saludable");
		r3.setBounds(293, 274, 75, 30);
		r3.setBackground(Color.decode("#fc86eb"));
		r3.setOpaque(true);
		r3.setFont(etiquetas);
		r3.setHorizontalAlignment(JLabel.LEFT);
		regis.add(r3);
		
		opc.add(check);
		opc.add(check2);
		opc.add(check3);
		
		String[] colonias = {"Centro", "Villas del Encanto", "Miramar", "Camino Real", "Indeco"};
		
		JComboBox col = new JComboBox(colonias);
		col.setBounds(160, 320, 150, 30);
		regis.add(col);
		
		ButtonGroup terminos = new ButtonGroup();
		
		JRadioButton term1 = new JRadioButton("Acepto los términos");
		term1.setBounds(85, 370, 150, 20);
		term1.setBackground(Color.decode("#fc86eb"));
		regis.add(term1);
		
		JRadioButton term2 = new JRadioButton("No acepto los términos");
		term2.setBounds(245, 370, 160, 20);
		term2.setBackground(Color.decode("#fc86eb"));
		regis.add(term2);
		
		terminos.add(term1);
		terminos.add(term2);
		
		JButton acceso = new JButton("Crear cuenta");
		acceso.setBounds(160, 400, 150, 30); 
		acceso.setBackground(Color.decode("#30d130"));
		acceso.setOpaque(true);
		acceso.setFont(etiquetas);
		acceso.setHorizontalAlignment(JButton.CENTER);
		regis.add(acceso);
		
		regis.revalidate();
		
		return regis;
	}

}
