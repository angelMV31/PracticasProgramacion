package aplication;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.BorderLayout;
import javax.swing.JPanel;
import javax.swing.border.LineBorder;
import java.awt.Color;
import java.awt.GridLayout;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JSlider;
import javax.swing.SwingConstants;
import javax.swing.ImageIcon;

public class Paint {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Paint window = new Paint();
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
	public Paint() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(0, 0, 255));
		frame.setBackground(new Color(0, 0, 255));
		frame.setBounds(100, 100, 1005, 750);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBorder(new LineBorder(new Color(0, 0, 0), 10));
		panel.setBounds(30, 199, 934, 504);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new LineBorder(new Color(0, 0, 0), 10));
		panel_1.setBounds(30, 10, 934, 179);
		frame.getContentPane().add(panel_1);
		panel_1.setLayout(new GridLayout(0, 3, 0, 0));
		
		JPanel panel_2 = new JPanel();
		panel_1.add(panel_2);
		panel_2.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Tools");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(131, 10, 45, 13);
		panel_2.add(lblNewLabel);
		
		JButton Pincel = new JButton();
		Pincel.setBackground(new Color(255, 255, 255));
		Pincel.setIcon(new ImageIcon(Paint.class.getResource("/aplication/pincel.jpg")));
		Pincel.setBounds(28, 37, 50, 50);
		panel_2.add(Pincel);
		
		JButton Borrador = new JButton();
		Borrador.setBackground(new Color(255, 255, 255));
		Borrador.setIcon(new ImageIcon(Paint.class.getResource("/aplication/borra.png")));
		Borrador.setBounds(88, 37, 50, 50);
		panel_2.add(Borrador);
		
		JButton Regresar = new JButton();
		Regresar.setBackground(new Color(255, 255, 255));
		Regresar.setIcon(new ImageIcon(Paint.class.getResource("/aplication/reg.jpg")));
		Regresar.setBounds(165, 37, 50, 50);
		panel_2.add(Regresar);
		
		JButton LimpiaPantalla = new JButton();
		LimpiaPantalla.setBackground(new Color(255, 255, 255));
		LimpiaPantalla.setIcon(new ImageIcon(Paint.class.getResource("/aplication/limpia.jpg")));
		LimpiaPantalla.setBounds(225, 37, 50, 50);
		panel_2.add(LimpiaPantalla);
		
		JSlider Grosor = new JSlider();
		Grosor.setBounds(52, 107, 200, 26);
		panel_2.add(Grosor);
		
		JPanel panel_3 = new JPanel();
		panel_1.add(panel_3);
		panel_3.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel();
		lblNewLabel_1.setText("Figures");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setBounds(134, 10, 45, 13);
		panel_3.add(lblNewLabel_1);
		
		JButton Rectangulo = new JButton();
		Rectangulo.setBackground(new Color(255, 255, 255));
		Rectangulo.setIcon(new ImageIcon(Paint.class.getResource("/aplication/rect.png")));
		Rectangulo.setBounds(58, 40, 50, 50);
		panel_3.add(Rectangulo);
		
		JButton Cuadrado = new JButton();
		Cuadrado.setBackground(new Color(255, 255, 255));
		Cuadrado.setIcon(new ImageIcon(Paint.class.getResource("/aplication/cuadrado.jpg")));
		Cuadrado.setBounds(209, 40, 50, 50);
		panel_3.add(Cuadrado);
		
		JButton Circulo = new JButton();
		Circulo.setBackground(new Color(255, 255, 255));
		Circulo.setIcon(new ImageIcon(Paint.class.getResource("/aplication/circulo.png")));
		Circulo.setBounds(58, 100, 50, 50);
		panel_3.add(Circulo);
		
		JButton Linea = new JButton();
		Linea.setBackground(new Color(255, 255, 255));
		Linea.setIcon(new ImageIcon(Paint.class.getResource("/aplication/linea.png")));
		Linea.setBounds(209, 100, 50, 50);
		panel_3.add(Linea);
		
		JButton Flecha = new JButton();
		Flecha.setBackground(new Color(255, 255, 255));
		Flecha.setIcon(new ImageIcon(Paint.class.getResource("/aplication/flecha.png")));
		Flecha.setBounds(134, 100, 50, 50);
		panel_3.add(Flecha);
		
		JButton Triangulo = new JButton();
		Triangulo.setBackground(new Color(255, 255, 255));
		Triangulo.setIcon(new ImageIcon(Paint.class.getResource("/aplication/triangulo.png")));
		Triangulo.setBounds(134, 40, 50, 50);
		panel_3.add(Triangulo);
		
		JPanel panel_4 = new JPanel();
		panel_1.add(panel_4);
		panel_4.setLayout(null);
		
		JLabel lblNewLabel_2 = new JLabel("Colors");
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2.setBounds(140, 10, 45, 13);
		panel_4.add(lblNewLabel_2);
		
		JButton ColorNegro = new JButton();
		ColorNegro.setBackground(new Color(0, 0, 0));
		ColorNegro.setBounds(42, 42, 50, 50);
		panel_4.add(ColorNegro);
		
		JButton ColorRojo = new JButton();
		ColorRojo.setBackground(new Color(255, 0, 0));
		ColorRojo.setBounds(102, 42, 50, 50);
		panel_4.add(ColorRojo);
		
		JButton ColorAzul = new JButton();
		ColorAzul.setBackground(new Color(0, 0, 255));
		ColorAzul.setBounds(164, 42, 50, 50);
		panel_4.add(ColorAzul);
		
		JButton ColorRosa = new JButton();
		ColorRosa.setBackground(new Color(255, 128, 255));
		ColorRosa.setBounds(224, 42, 50, 50);
		panel_4.add(ColorRosa);
		
		JButton ColorAmarillo = new JButton();
		ColorAmarillo.setBackground(new Color(255, 255, 0));
		ColorAmarillo.setBounds(102, 99, 50, 50);
		panel_4.add(ColorAmarillo);
		
		JButton ColorVerde = new JButton();
		ColorVerde.setBackground(new Color(0, 255, 0));
		ColorVerde.setBounds(42, 99, 50, 50);
		panel_4.add(ColorVerde);
		
		JButton ColorNaranja = new JButton();
		ColorNaranja.setBackground(new Color(255, 128, 0));
		ColorNaranja.setBounds(164, 99, 50, 50);
		panel_4.add(ColorNaranja);
		
		JButton ColorBlanco = new JButton();
		ColorBlanco.setBackground(new Color(255, 255, 255));
		ColorBlanco.setBounds(224, 99, 50, 50);
		panel_4.add(ColorBlanco);
	}
}
