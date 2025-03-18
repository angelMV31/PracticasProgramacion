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
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.border.LineBorder;
import javax.swing.border.TitledBorder;

public class Table extends JFrame{

	Object[][] data = {
			{"Juguete", "2", "150.00","300.00"},
			{"Comptadora", "5", "10000.00","50000.00"},
			{"Bicicleta", "1", "1500","1500.00"},
			{"Lapiz", "6", "2.00","12.00"},
			{"Jugo", "1", "15.00","15.00"}
			};

	//Array de ‘String’ con los titulos de las columnas
	String[] columnNames = {"Producto", "Cantidad", "Valor", "SubTotal"};
	
	Font titulo = new Font("Arial", Font.BOLD, 25);
	Font etiquetas = new Font("Arial", Font.BOLD,16);
	Font et = new Font("Arial", Font.BOLD,10);
	
	public Table(String title) {
		
		this.setTitle(title);
		this.setVisible(true);
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		//this.setSize(385,490);
		
		this.setSize(500, 700);
		this.setResizable(true);

		this.setLocationRelativeTo(null);
		
		this.add(this.tabla());
		this.repaint();
		
	}

	public JPanel tabla() {
		JPanel tabla = new JPanel();
		tabla.setLocation(0, 0);
		tabla.setSize(500, 700);
		tabla.setOpaque(true);
		tabla.setBackground(Color.WHITE);
		tabla.setVisible(true);
		tabla.setLayout(null);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(Color.YELLOW);
		panel_1.setBorder(BorderFactory.createTitledBorder("Datos Opcionales"));
		tabla.add(panel_1, BorderLayout.CENTER);
		panel_1.setLayout(null);
		
		JTable tablaDatos = new JTable(data, columnNames);
		JScrollPane scrollPane = new JScrollPane(tablaDatos);
		scrollPane.setSize(400,80);
		scrollPane.setLocation(50,400);
		panel_1.add(scrollPane);
		tabla.add(scrollPane);
		
		JPanel panelInferior = new JPanel(new GridLayout(5, 2));
        panelInferior.setBorder(new TitledBorder("Resumen"));

        panelInferior.add(new JLabel("Subtotal:"));
        panelInferior.add(new JLabel("6600.0"));

        panelInferior.add(new JLabel("% Descuento:"));
        panelInferior.add(new JTextField("5"));

        panelInferior.add(new JLabel("Valor Descontado:"));
        panelInferior.add(new JLabel("330.0"));

        panelInferior.add(new JLabel("IVA 19%:"));
        panelInferior.add(new JLabel("1254.0"));

        panelInferior.add(new JLabel("Total Factura:"));
        panelInferior.add(new JLabel("7524.0"));

        JButton btnFinalizar = new JButton("Finalizar factura");
        panelInferior.add(btnFinalizar);
        
        tabla.add(panelInferior);
		return tabla;
		
	}
	
}