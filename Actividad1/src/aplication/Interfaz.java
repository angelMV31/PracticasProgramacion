package aplication;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Interfaz extends JFrame {

	Font titulo = new Font("Time New Roman", Font.BOLD, 30);
	Font etiquetas = new Font("Time New Roman", Font.BOLD,16);
	Font et = new Font("Time New Roman", Font.BOLD,10);
	
	public Interfaz(String title) {
		this.setTitle(title);//titulo de la ventana
		this.setVisible(true);//hacer visible la ventana
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		this.setSize(500,550);
		
		this.setResizable(true);

		this.setLocationRelativeTo(null);//colocar la ventana en el medio de la pantalla
		
		//this.setMinimumSize(new Dimension(200,430));
		//this.setMaximumSize(new Dimension(600,830));
		//this.add(this.login());
		
		
		this.add(this.contenido());
		this.repaint();
	}
	
	public JPanel contenido() {
		
		
		JPanel gen = new JPanel();
		gen.setVisible(true);
		//gen.setSize(365, 120);
		gen.setBackground(Color.GRAY);
		gen.setOpaque(true);
		gen.setLayout(new BorderLayout());
		
		JLabel etiq = new JLabel("Interes");
		etiq.setSize(200,40);
		etiq.setBackground(Color.CYAN);
		etiq.setOpaque(true);
		etiq.setHorizontalAlignment(JLabel.LEFT);
		etiq.setFont(etiquetas);
		gen.add(etiq, BorderLayout.NORTH);
		
		JPanel cen = new JPanel();
		cen.setVisible(true);
		//cen.setSize(365, 120);
		cen.setBackground(Color.GRAY);
		cen.setOpaque(true);
		cen.setBorder(BorderFactory.createTitledBorder("Calcular Interes"));
		gen.add(cen, BorderLayout.CENTER);
		
		
		JPanel inf = new JPanel();
		inf.setVisible(true);
		//inf.setSize(365, 120);
		inf.setBackground(Color.CYAN);
		inf.setOpaque(true);
		inf.setBorder(BorderFactory.createTitledBorder("Montos"));
		
		gen.add(inf, BorderLayout.SOUTH);
		
		JPanel t = new JPanel();
		t.setOpaque(true);
		t.setBackground(Color.CYAN);
		t.setVisible(true);
		t.setLayout(new GridLayout(2,2,100,20));
		JLabel interes1 = new JLabel("Interes: ");
		JTextField interes2 = new JTextField("645.31");
		
		JLabel monto1 = new JLabel("Monto: ");
		JTextField monto2 = new JTextField("645.31");
		
		t.add(interes1);
		t.add(interes2);
		t.add(monto1);
		t.add(monto2);
		
		JPanel dos = new JPanel();
		dos.setOpaque(true);
		dos.setBackground(Color.GRAY);
		dos.setVisible(true);
		dos.setLayout(new GridLayout(4,2,100,20));

		JLabel cap = new JLabel("Capital: ");
		JTextField cap2 = new JTextField("100");
		
		JLabel tiemp = new JLabel("Tiempo: ");
		JTextField tiemp2 = new JTextField("6");
		
		JLabel tasa = new JLabel("Tasa de Interes: ");
		JTextField tasa2 = new JTextField("15");
		
		JButton cancelar = new JButton("Cancelar");
		JButton aceptar = new JButton("Aceptar");
		
		dos.add(cap);
		dos.add(cap2);
		dos.add(tiemp);
		dos.add(tiemp2);
		dos.add(tasa);
		dos.add(tasa2);
		dos.add(cancelar);
		dos.add(aceptar);
		
		inf.add(t);
		cen.add(dos);
		return gen;
	}
}
