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
import javax.swing.border.EtchedBorder;

public class Examen2 extends JFrame{

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
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	
	public Examen2(String title) {
		
        this.setSize(600, 700);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);
        getContentPane().setLayout(null);

        this.getContentPane().add(crearPanelSuperior());
        this.getContentPane().add(crearPanelSuperior2());
        this.getContentPane().add(crearPanelSuperior3());
        this.getContentPane().add(crearTabla());
        this.getContentPane().add(crearPanelInferior());

        this.setVisible(true);
    }

    private JPanel crearPanelSuperior() {
        JPanel panelSuperior = new JPanel();
        panelSuperior.setBounds(0, 0, 586, 44);
        panelSuperior.setBackground(Color.BLUE);
        panelSuperior.setLayout(null);

        JLabel lblTitulo = new JLabel("Factura en Java - NetBeans - ArrayList y POO", JLabel.CENTER);
        lblTitulo.setBounds(0, 0, 586, 22);
        lblTitulo.setForeground(Color.WHITE);
        lblTitulo.setFont(new Font("Arial", Font.BOLD, 18));
        panelSuperior.add(lblTitulo);

        JLabel lblSubtitulo = new JLabel("[Sin Base de datos]", JLabel.CENTER);
        lblSubtitulo.setBounds(0, 22, 586, 22);
        lblSubtitulo.setForeground(Color.WHITE);
        panelSuperior.add(lblSubtitulo);

        return panelSuperior;
    }
    
    private JPanel crearPanelSuperior2() {
        JPanel panelSuperior2 = new JPanel();
        panelSuperior2.setBounds(0, 64, 586, 127);
        panelSuperior2.setBorder(new TitledBorder("Datos del Cliente"));
        panelSuperior2.setLayout(null);

        JLabel label = new JLabel("Documento:");
        label.setBounds(6, 40, 119, 21);
        panelSuperior2.add(label);
        JLabel label_1 = new JLabel("Nombres");
        label_1.setBounds(335, 40, 89, 21);
        panelSuperior2.add(label_1);

        JLabel label_2 = new JLabel("Direccion:");
        label_2.setBounds(6, 71, 111, 21);
        panelSuperior2.add(label_2);
        JTextField textField = new JTextField("6151093321");
        textField.setBounds(457, 71, 89, 21);
        panelSuperior2.add(textField);
        JLabel label_4 = new JLabel("Telefono");
        label_4.setBounds(335, 71, 89, 21);
        panelSuperior2.add(label_4);
        
        textField_2 = new JTextField("Angel Mendoza");
        textField_2.setBounds(457, 40, 89, 21);
        panelSuperior2.add(textField_2);
        
        textField_3 = new JTextField("100224");
        textField_3.setBounds(135, 40, 89, 21);
        panelSuperior2.add(textField_3);
        
        textField_4 = new JTextField("Calle Santa Rita");
        textField_4.setBounds(135, 73, 89, 21);
        panelSuperior2.add(textField_4);

        return panelSuperior2;
    }
    
    private JPanel crearPanelSuperior3() {
        JPanel panelSuperior3 = new JPanel();
        panelSuperior3.setBounds(0, 201, 586, 117);
        panelSuperior3.setBorder(new TitledBorder("Datos de Factura"));
        panelSuperior3.setLayout(null);

        JLabel label = new JLabel("Num. de Factura:");
        label.setBounds(6, 40, 119, 21);
        panelSuperior3.add(label);
        JLabel label_1 = new JLabel("Facha");
        label_1.setBounds(297, 40, 89, 21);
        panelSuperior3.add(label_1);
        
        textField_2 = new JTextField("10/02/2024");
        textField_2.setBounds(416, 40, 89, 21);
        panelSuperior3.add(textField_2);
        
        textField_3 = new JTextField("1");
        textField_3.setBounds(135, 40, 89, 21);
        panelSuperior3.add(textField_3);

        return panelSuperior3;
    }

    private JPanel crearTabla() {
        JPanel panelTabla = new JPanel();
        panelTabla.setSize(586, 154);
        panelTabla.setLayout(null);
        JTable tablaDatos = new JTable(data, columnNames);
        JScrollPane scrollPane = new JScrollPane(tablaDatos);
        scrollPane.setBounds(0, 10, 586, 105);
        panelTabla.add(scrollPane);

        JPanel panelBotones = new JPanel();
        panelBotones.setBounds(0, 118, 586, 31);
        panelBotones.add(new JButton("Añadir"));
        panelBotones.add(new JButton("Eliminar"));
        panelTabla.add(panelBotones);

        panelTabla.setLocation(0,345);

        return panelTabla;
    }

    private JPanel crearPanelInferior() {
        JPanel panelInferior = new JPanel();
        panelInferior.setBounds(0, 509, 586, 154);
        panelInferior.setBorder(new TitledBorder("Total"));
        panelInferior.setLayout(null);

        JLabel label = new JLabel("Subtotal:");
        label.setBounds(6, 15, 154, 21);
        panelInferior.add(label);
        JLabel label_1 = new JLabel("6600.0");
        label_1.setBounds(209, 15, 179, 21);
        panelInferior.add(label_1);

        JLabel label_2 = new JLabel("% Descuento:");
        label_2.setBounds(6, 36, 173, 21);
        panelInferior.add(label_2);
        JTextField textField = new JTextField("5");
        textField.setBounds(209, 36, 154, 21);
        panelInferior.add(textField);

        JLabel label_3 = new JLabel("Valor Descontado:");
        label_3.setBounds(6, 57, 179, 21);
        panelInferior.add(label_3);
        JLabel label_4 = new JLabel("330.0");
        label_4.setBounds(209, 57, 173, 21);
        panelInferior.add(label_4);

        JLabel label_5 = new JLabel("IVA 19%:");
        label_5.setBounds(6, 78, 154, 21);
        panelInferior.add(label_5);
        JLabel label_6 = new JLabel("1254.0");
        label_6.setBounds(209, 78, 181, 21);
        panelInferior.add(label_6);

        JLabel label_7 = new JLabel("Total Factura:");
        label_7.setBounds(6, 98, 173, 21);
        panelInferior.add(label_7);
        JLabel label_8 = new JLabel("7524.0");
        label_8.setBounds(209, 98, 154, 21);
        panelInferior.add(label_8);

        JButton btnFinalizar = new JButton("Finalizar factura");
        btnFinalizar.setForeground(new Color(255, 255, 255));
        btnFinalizar.setBackground(new Color(0, 0, 255));
        btnFinalizar.setBounds(418, 46, 147, 42);
        panelInferior.add(btnFinalizar);

        return panelInferior;
    }
}