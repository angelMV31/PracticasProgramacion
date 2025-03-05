package aplication;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.border.LineBorder;
import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JInternalFrame;
import javax.swing.JTextField;
import javax.swing.JRadioButton;
import javax.swing.JComboBox;
import javax.swing.JTextPane;
import javax.swing.JTable;
import javax.swing.JScrollBar;
import javax.swing.JScrollPane;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import javax.swing.JTextArea;
import javax.swing.JList;

public class Window {

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Window window = new Window();
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
	public Window() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		
		frame = new JFrame();
		frame.setBounds(100, 100, 900, 550);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel panel = new JPanel();
		panel.setForeground(Color.LIGHT_GRAY);
		panel.setBorder(new LineBorder(Color.LIGHT_GRAY, 10));
		panel.setBackground(Color.LIGHT_GRAY);
		frame.getContentPane().add(panel, BorderLayout.CENTER);
		panel.setLayout(new GridLayout(0, 2, 10, 10));
		
		JPanel panel_3 = new JPanel();
		panel_3.setBackground(Color.MAGENTA);
		panel_3.setBorder(BorderFactory.createTitledBorder("Datos Generales"));
		panel.add(panel_3, BorderLayout.CENTER);
		panel_3.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Nombre:    ");
		lblNewLabel.setBounds(130, 17, 84, 24);
		lblNewLabel.setHorizontalAlignment(SwingConstants.RIGHT);
		panel_3.add(lblNewLabel);
		
		textField = new JTextField();
		textField.setBounds(214, 17, 131, 24);
		panel_3.add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("Apellido Paterno:     ");
		lblNewLabel_2.setBounds(95, 48, 119, 24);
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.RIGHT);
		panel_3.add(lblNewLabel_2);
		
		textField_1 = new JTextField();
		textField_1.setBounds(214, 48, 131, 24);
		panel_3.add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblNewLabel_5 = new JLabel("Apellido Materno:     ");
		lblNewLabel_5.setBounds(95, 79, 119, 24);
		lblNewLabel_5.setHorizontalAlignment(SwingConstants.RIGHT);
		panel_3.add(lblNewLabel_5);
		
		textField_2 = new JTextField();
		textField_2.setBounds(214, 79, 131, 24);
		panel_3.add(textField_2);
		textField_2.setColumns(10);
		
		JLabel lblNewLabel_8 = new JLabel("Sexo:     ");
		lblNewLabel_8.setBounds(154, 110, 60, 24);
		lblNewLabel_8.setHorizontalAlignment(SwingConstants.RIGHT);
		panel_3.add(lblNewLabel_8);
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("Femenino");
		rdbtnNewRadioButton.setBounds(214, 110, 71, 24);
		panel_3.add(rdbtnNewRadioButton);
		
		JLabel lblNewLabel_10 = new JLabel("");
		lblNewLabel_10.setBounds(6, 141, 208, 24);
		panel_3.add(lblNewLabel_10);
		
		JRadioButton rdbtnNewRadioButton_1 = new JRadioButton("Masculino");
		rdbtnNewRadioButton_1.setBounds(214, 141, 71, 24);
		panel_3.add(rdbtnNewRadioButton_1);
		
		JLabel lblNewLabel_4 = new JLabel("Nacionalidad:     ");
		lblNewLabel_4.setBounds(95, 172, 119, 24);
		lblNewLabel_4.setHorizontalAlignment(SwingConstants.RIGHT);
		panel_3.add(lblNewLabel_4);
		
		String[] nacion = {"Arabia Saudita", "Brasil", "Canadá", "Dinamarca", "Eslovenia", "Francia", "Haití", "Islandia", "Jamaica", "Kenia", "Lituania", "Mexico", "Nicaragua"};
		JComboBox comboBox = new JComboBox(nacion);
		comboBox.setSize(119, 28);
		comboBox.setLocation(214, 170);
		panel_3.add(comboBox);
		
		JLabel lblNewLabel_3 = new JLabel("Fecha de Nacimiento:     ");
		lblNewLabel_3.setBounds(64, 203, 150, 24);
		lblNewLabel_3.setHorizontalAlignment(SwingConstants.RIGHT);
		panel_3.add(lblNewLabel_3);
		
		JTextPane textPane = new JTextPane();
		textPane.setBounds(214, 203, 106, 24);
		panel_3.add(textPane);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(Color.PINK);
		panel_2.setBorder(BorderFactory.createTitledBorder("Perfil del Usuario"));
		panel.add(panel_2, BorderLayout.CENTER);
		
		//JLabel lblNewLabel_6 = new JLabel();
		ImageIcon i = new ImageIcon(new ImageIcon("Capi.png").getImage().getScaledInstance(88, 88, java.awt.Image.SCALE_SMOOTH));
		panel_2.setLayout(null);
		JLabel lblNewLabel_6 = new JLabel(i);
		lblNewLabel_6.setBounds(6, 15, 416, 172);
		panel_2.add(lblNewLabel_6);
		
		JPanel panel_5 = new JPanel();
		panel_5.setBounds(6, 187, 416, 42);
		panel_2.add(panel_5);
		panel_5.setLayout(new GridLayout(2, 1, 0, 0));
		
		ButtonGroup opc = new ButtonGroup();
		ButtonGroup opc2 = new ButtonGroup();
		
		JRadioButton rdbtnNewRadioButton_3 = new JRadioButton("Mostrar Foto de Perfil");
		rdbtnNewRadioButton_3.setBackground(Color.PINK);
		rdbtnNewRadioButton_3.setHorizontalAlignment(SwingConstants.CENTER);
		panel_5.add(rdbtnNewRadioButton_3);
		
		JRadioButton rdbtnNewRadioButton_2 = new JRadioButton("Mostrar Fecha de Nacimiento");
		rdbtnNewRadioButton_2.setBackground(Color.PINK);
		rdbtnNewRadioButton_2.setHorizontalAlignment(SwingConstants.CENTER);
		panel_5.add(rdbtnNewRadioButton_2);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(Color.YELLOW);
		panel_1.setBorder(BorderFactory.createTitledBorder("Datos Opcionales"));
		panel.add(panel_1, BorderLayout.CENTER);
		panel_1.setLayout(null);
		
		JLabel lblNewLabel_7 = new JLabel("Descripción");
		lblNewLabel_7.setBounds(21, 15, 198, 99);
		lblNewLabel_7.setHorizontalAlignment(SwingConstants.CENTER);
		panel_1.add(lblNewLabel_7);
		
		String[] preferences = {"Patinar", "Cantar", "Surfear", "Deportes", "Programar", "Estudiar", "Pintar", "Dibujar"};
		JLabel lblNewLabel_9 = new JLabel("Preferencias");
		lblNewLabel_9.setBounds(200, 15, 198, 99);
		lblNewLabel_9.setHorizontalAlignment(SwingConstants.CENTER);
		panel_1.add(lblNewLabel_9);
		JScrollPane scrollPaneDescripcion = new JScrollPane();
		scrollPaneDescripcion.setBounds(42, 93, 150, 100);
		panel_1.add(scrollPaneDescripcion);
		
		JTextArea textAreaDescripcion = new JTextArea();
		scrollPaneDescripcion.setViewportView(textAreaDescripcion);
		JScrollPane scrollPanePreferencias = new JScrollPane();
		scrollPanePreferencias.setBounds(229, 93, 150, 100);
		panel_1.add(scrollPanePreferencias);
		
		JTextArea textAreaPreferencias = new JTextArea();
		scrollPanePreferencias.setViewportView(textAreaPreferencias);
		
		JPanel panel_4 = new JPanel();
		panel_4.setBackground(Color.CYAN);
		panel_4.setBorder(BorderFactory.createTitledBorder("Opciones"));
		panel.add(panel_4, BorderLayout.CENTER);
		panel_4.setLayout(null);
		
		JButton btnNewButton = new JButton("Nuevo");
		btnNewButton.setLocation(117, 36);
		btnNewButton.setBackground(Color.ORANGE);
		btnNewButton.setSize(189,40);
		panel_4.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Guardar");
		btnNewButton_1.setBounds(117, 102, 189, 40);
		btnNewButton_1.setBackground(Color.GREEN);
		panel_4.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Salir");
		btnNewButton_2.setBounds(117, 167, 189, 40);
		btnNewButton_2.setBackground(Color.RED);
		panel_4.add(btnNewButton_2);
		
		JLabel lblNewLabel_1 = new JLabel("Registro de usuarios");
		lblNewLabel_1.setBackground(Color.LIGHT_GRAY);
		lblNewLabel_1.setVerticalAlignment(SwingConstants.TOP);
		frame.getContentPane().add(lblNewLabel_1, BorderLayout.NORTH);
		
		opc.add(rdbtnNewRadioButton_3);
		opc.add(rdbtnNewRadioButton_2);
		opc2.add(rdbtnNewRadioButton);
		opc2.add(rdbtnNewRadioButton_1);
	}
}
