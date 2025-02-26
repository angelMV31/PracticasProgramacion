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

public class Table extends JFrame{

	Object[][] data = {
			{"Faby", "Camacho", "Pintar", new Integer(5), new Boolean(false)},
			{"Lhucas", "Huml", "Patinar", new Integer(3), new Boolean(true)},
			{"Kathya", "Walrath", "Escalar", new Integer(2), new Boolean(false)},
			{"Marcus", "Andrews", "Correr", new Integer(7), new Boolean(true)},
			{"Angela", "Lalth", "Nadar", new Integer(4), new Boolean(false)},
			{"Angel", "Mendoza", "Beisbol", new Integer(5), new Boolean(false)},
			{"Sergio", "Olachea", "Basquetbol", new Integer(3), new Boolean(true)},
			{"Joel", "Zazueta", "Gym", new Integer(2), new Boolean(false)},
			{"Luis", "Lucatero", "Tejer", new Integer(7), new Boolean(true)},
			{"Yonathan", "Aguirre", "Golf", new Integer(4), new Boolean(false)},
			{"David", "Camacho", "Futbol", new Integer(5), new Boolean(false)},
			{"Diego", "Huml", "Tocho", new Integer(3), new Boolean(true)},
			{"Sebastian", "Walrath", "Americano", new Integer(2), new Boolean(false)},
			{"Kevin", "Andrews", "Voleybol", new Integer(7), new Boolean(true)},
			{"Daniel", "Lalth", "Bolos", new Integer(4), new Boolean(false)}
			};

	//Array de ‘String’ con los titulos de las columnas
	String[] columnNames = {"Nombre", "Apellido", "Pasatiempo", "Años de Practica", "Soltero(a)"};
	
	Font titulo = new Font("Arial", Font.BOLD, 25);
	Font etiquetas = new Font("Arial", Font.BOLD,16);
	Font et = new Font("Arial", Font.BOLD,10);
	
	public Table(String title) {
		
		this.setTitle(title);
		this.setVisible(true);
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		//this.setSize(385,490);
		
		this.setSize(1010, 500);
		this.setResizable(true);

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
	
		JLabel etiqueta3 = new JLabel("Total de usuarios: 15");
		etiqueta3.setSize(170,40);
		etiqueta3.setLocation(115, 85);
		etiqueta3.setBackground(Color.decode("#71ff6f"));
		etiqueta3.setOpaque(true);
		etiqueta3.setFont(etiquetas);
		etiqueta3.setHorizontalAlignment(JLabel.CENTER);
		tabla.add(etiqueta3);
		
		JLabel widget = new JLabel();
		widget.setSize(210,50);
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

}
