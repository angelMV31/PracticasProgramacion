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
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.border.LineBorder;

public class Ventana extends JFrame {
	
	Object[][] data = {
			{"Mary", "Campione", "Esquiar", new Integer(5), new Boolean(false)},
			{"Lhucas", "Huml", "Patinar", new Integer(3), new Boolean(true)},
			{"Kathya", "Walrath", "Escalar", new Integer(2), new Boolean(false)},
			{"Marcus", "Andrews", "Correr", new Integer(7), new Boolean(true)},
			{"Angela", "Lalth", "Nadar", new Integer(4), new Boolean(false)}
			};

	//Array de ‘String’ con los titulos de las columnas
	String[] columnNames = {"Nombre", "Apellido", "Pasatiempo", "Años de Practica", "Soltero(a)"};
	
	
	Font titulo = new Font("Arial", Font.BOLD, 25);
	Font etiquetas = new Font("Arial", Font.BOLD,16);
	Font et = new Font("Arial", Font.BOLD,10);
	
	public Ventana(String title) {
		this.setTitle(title);
		this.setVisible(true);
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		//this.setSize(385,490);
		
		this.setSize(1000, 500);
		this.setResizable(false);

		this.setLocationRelativeTo(null);
		
		this.setMinimumSize(new Dimension(200,430));
		this.setMaximumSize(new Dimension(600,830));
		//this.add(this.login());
		this.add(this.tabla());
		this.repaint();
		
	}
	
	public JPanel tabla() {
		JPanel tabla = new JPanel();
		tabla.setLocation(0, 0);
		tabla.setSize(1000, 500);
		tabla.setOpaque(true);
		tabla.setBackground(Color.WHITE);
		tabla.setVisible(true);
		tabla.setLayout(null);
		
		JLabel etiqueta1 = new JLabel("Usuarios");
		etiqueta1.setSize(160,40);
		etiqueta1.setLocation(430, 20);
		etiqueta1.setBackground(Color.decode("#71ff6f"));
		etiqueta1.setOpaque(true);
		etiqueta1.setFont(titulo);
		etiqueta1.setHorizontalAlignment(JLabel.CENTER);
		tabla.add(etiqueta1);

		JLabel etiqueta3 = new JLabel("Total de usuarios: ");
		etiqueta3.setSize(150,40);
		etiqueta3.setLocation(115, 85);
		etiqueta3.setBackground(Color.decode("#71ff6f"));
		etiqueta3.setOpaque(true);
		etiqueta3.setFont(etiquetas);
		etiqueta3.setHorizontalAlignment(JLabel.CENTER);
		tabla.add(etiqueta3);
		
		JLabel widget = new JLabel();
		widget.setSize(200,50);
		widget.setLocation(100, 80);
		widget.setBackground(Color.decode("#71ff6f"));
		widget.setOpaque(true);
		widget.setFont(titulo);
		widget.setHorizontalAlignment(JLabel.CENTER);
		tabla.add(widget);
		
		JButton export = new JButton("Exportar");
		export.setBounds(700, 100, 100, 40);
		export.setBackground(Color.WHITE);
		export.setBorder(new LineBorder(Color.decode("#71ff6f")));
		export.setVisible(true);
		tabla.add(export);
		
		JButton importar = new JButton("Importar");
		importar.setBounds(810, 100, 100, 40);
		importar.setBackground(Color.WHITE);
		importar.setBorder(new LineBorder(Color.decode("#71ff6f")));
		importar.setVisible(true);
		tabla.add(importar);
		
		JTable tablaDatos = new JTable(data, columnNames);
		JScrollPane scrollPane = new JScrollPane(tablaDatos);
		scrollPane.setSize(930,200);
		scrollPane.setLocation(30,200);
		tabla.add(scrollPane);
		
		return tabla;
		
	}
	
	/*public JPanel calculadora() {
		//aqui cree el Panel donde se colocaran todos los botones y cuandros de textos
		JPanel calculadora = new JPanel();
		calculadora.setLocation(0, 0);
		calculadora.setSize(500, 500);
		calculadora.setOpaque(true);
		calculadora.setBackground(Color.decode("#000000"));
		calculadora.setVisible(true);
		calculadora.setLayout(null);
		
		//cree la pantalla
		JLabel pantalla = new JLabel();
		pantalla.setBounds(10, 10, 350, 95);
		pantalla.setBackground(Color.WHITE);
		pantalla.setOpaque(true);
		pantalla.setFont(etiquetas);
		calculadora.add(pantalla);
		
		//Cree botones de c ce porcentaje y de borrar un numero
		JButton porcentaje = new JButton("%");
		porcentaje.setBounds(10, 115, 80, 45);
		porcentaje.setBackground(Color.decode("#b2b2b2"));
		porcentaje.setOpaque(true);
		porcentaje.setFont(etiquetas);
		porcentaje.setHorizontalAlignment(JButton.CENTER);
		calculadora.add(porcentaje);

		JButton ce = new JButton("CE");
		ce.setBounds(100, 115, 80, 45);
		ce.setBackground(Color.decode("#b2b2b2"));
		ce.setOpaque(true);
		ce.setFont(etiquetas);
		ce.setHorizontalAlignment(JButton.CENTER);
		calculadora.add(ce);

		JButton c = new JButton("C");
		c.setBounds(190, 115, 80, 45);
		c.setBackground(Color.decode("#b2b2b2"));
		c.setOpaque(true);
		c.setFont(etiquetas);
		c.setHorizontalAlignment(JButton.CENTER);
		calculadora.add(c);
		
		JButton delete = new JButton("\u2190");
		delete.setBounds(280, 115, 80, 45);
		delete.setBackground(Color.RED);
		delete.setOpaque(true);
		delete.setFont(etiquetas);
		delete.setHorizontalAlignment(JButton.CENTER);
		calculadora.add(delete);
				
		//estos son los botones de los numeros uno por uno
		JButton one = new JButton("1");
		one.setBounds(10, 170, 80, 60);
		one.setBackground(Color.decode("#ff62cb"));
		one.setOpaque(true);
		one.setFont(etiquetas);
		one.setHorizontalAlignment(JButton.CENTER);
		calculadora.add(one);

		JButton two = new JButton("2");
		two.setBounds(100, 170, 80, 60);
		two.setBackground(Color.decode("#ff62cb"));
		two.setOpaque(true);
		two.setFont(etiquetas);
		two.setHorizontalAlignment(JButton.CENTER);
		calculadora.add(two);

		JButton three = new JButton("3");
		three.setBounds(190, 170, 80, 60);
		three.setBackground(Color.decode("#ff62cb"));
		three.setOpaque(true);
		three.setFont(etiquetas);
		three.setHorizontalAlignment(JButton.CENTER);
		calculadora.add(three);

		JButton four = new JButton("4");
		four.setBounds(10, 240, 80, 60);
		four.setBackground(Color.decode("#ff62cb"));
		four.setOpaque(true);
		four.setFont(etiquetas);
		four.setHorizontalAlignment(JButton.CENTER);
		calculadora.add(four);

		JButton five = new JButton("5");
		five.setBounds(100, 240, 80, 60);
		five.setBackground(Color.decode("#ff62cb"));
		five.setOpaque(true);
		five.setFont(etiquetas);
		five.setHorizontalAlignment(JButton.CENTER);
		calculadora.add(five);

		JButton six = new JButton("6");
		six.setBounds(190, 240, 80, 60);
		six.setBackground(Color.decode("#ff62cb"));
		six.setOpaque(true);
		six.setFont(etiquetas);
		six.setHorizontalAlignment(JButton.CENTER);
		calculadora.add(six);

		JButton seven = new JButton("7");
		seven.setBounds(10, 310, 80, 60);
		seven.setBackground(Color.decode("#ff62cb"));
		seven.setOpaque(true);
		seven.setFont(etiquetas);
		seven.setHorizontalAlignment(JButton.CENTER);
		calculadora.add(seven);

		JButton eight = new JButton("8");
		eight.setBounds(100, 310, 80, 60);
		eight.setBackground(Color.decode("#ff62cb"));
		eight.setOpaque(true);
		eight.setFont(etiquetas);
		eight.setHorizontalAlignment(JButton.CENTER);
		calculadora.add(eight);

		JButton nine = new JButton("9");
		nine.setBounds(190, 310, 80, 60);
		nine.setBackground(Color.decode("#ff62cb"));
		nine.setOpaque(true);
		nine.setFont(etiquetas);
		nine.setHorizontalAlignment(JButton.CENTER);
		calculadora.add(nine);

		JButton zero = new JButton("0");
		zero.setBounds(100, 380, 80, 60);
		zero.setBackground(Color.decode("#ff62cb"));
		zero.setOpaque(true);
		zero.setFont(etiquetas);
		zero.setHorizontalAlignment(JButton.CENTER);
		calculadora.add(zero);
		
		//Botones de operaciones * / - + y  punto e igual
		JButton sum = new JButton("+");
		sum.setBounds(280, 170, 80, 60);
		sum.setBackground(Color.decode("#b2b2b2"));
		sum.setOpaque(true);
		sum.setFont(etiquetas);
		sum.setHorizontalAlignment(JButton.CENTER);
		calculadora.add(sum);
		
		JButton rest = new JButton("-");
		rest.setBounds(280, 240, 80, 60);
		rest.setBackground(Color.decode("#b2b2b2"));
		rest.setOpaque(true);
		rest.setFont(etiquetas);
		rest.setHorizontalAlignment(JButton.CENTER);
		calculadora.add(rest);
		
		JButton mult = new JButton("*");
		mult.setBounds(280, 310, 80, 60);
		mult.setBackground(Color.decode("#b2b2b2"));
		mult.setOpaque(true);
		mult.setFont(etiquetas);
		mult.setHorizontalAlignment(JButton.CENTER);
		calculadora.add(mult);
		
		JButton div = new JButton("/");
		div.setBounds(280, 380, 80, 60);
		div.setBackground(Color.decode("#b2b2b2"));
		div.setOpaque(true);
		div.setFont(etiquetas);
		div.setHorizontalAlignment(JButton.CENTER);
		calculadora.add(div);
		
		JButton point = new JButton(".");
		point.setBounds(10, 380, 80, 60);
		point.setBackground(Color.decode("#b2b2b2"));
		point.setOpaque(true);
		point.setFont(etiquetas);
		point.setHorizontalAlignment(JButton.CENTER);
		calculadora.add(point);
		
		JButton equal = new JButton("=");
		equal.setBounds(190, 380, 80, 60);
		equal.setBackground(Color.decode("#30d130"));
		equal.setOpaque(true);
		equal.setFont(etiquetas);
		equal.setHorizontalAlignment(JButton.CENTER);
		calculadora.add(equal);
		
		calculadora.revalidate();
		return calculadora;
	}
	
	public JPanel login() {
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

	}
	
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
	}*/
	
	

}
