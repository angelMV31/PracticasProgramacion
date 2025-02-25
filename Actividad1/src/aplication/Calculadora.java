package aplication;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.border.LineBorder;

public class Calculadora extends JFrame{
	
	
	
	Font titulo = new Font("Arial", Font.BOLD, 25);
	Font etiquetas = new Font("Arial", Font.BOLD,16);
	Font et = new Font("Arial", Font.BOLD,10);

	public Calculadora(String title) {
		
		this.setTitle(title);
		this.setVisible(true);
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		//this.setSize(385,490);
		
		this.setSize(1010, 500);
		this.setResizable(false);

		this.setLocationRelativeTo(null);
		
		this.setMinimumSize(new Dimension(200,430));
		this.setMaximumSize(new Dimension(600,830));
		//this.add(this.login());
		this.add(this.calculadora());
		this.repaint();
		
	}
	
		
	public JPanel calculadora() {
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
}
