package aplication;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import javax.swing.ImageIcon;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JCheckBoxMenuItem;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JRadioButton;
import javax.swing.JRadioButtonMenuItem;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.border.LineBorder;

public class Ventana extends JFrame {
	
	Font titulo = new Font("Arial", Font.BOLD, 30);
	Font etiquetas = new Font("Arial", Font.BOLD,16);
	Font et = new Font("Arial", Font.BOLD,10);
	
	public Ventana(String title) {
		this.setTitle(title);
		this.setVisible(true);
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		//this.setSize(385,490);
		
		this.setSize(615, 614);
		this.setResizable(false);

		this.setLocationRelativeTo(null);
		
		this.setResizable(isMaximumSizeSet());
		
		//this.setMinimumSize(new Dimension(200,430));
		//this.setMaximumSize(new Dimension(600,830));
		JMenuBar barra = new JMenuBar(); //barra de munus
		
		JMenu menu1 = new JMenu("Archivo");
		JMenu menu2 = new JMenu("Ayuda");
		
		JMenuItem opNew = new JMenuItem("Nuevo");
		JMenuItem opOpen = new JMenuItem("Abrir");
		JMenuItem opSave = new JMenuItem("Guardar");
		JMenuItem opClose = new JMenuItem("Cerrar");
		
		menu1.add(opNew);
		menu1.add(opOpen);
		menu1.add(opSave);
		menu1.add(opClose);
		
		JRadioButtonMenuItem opHelp = new JRadioButtonMenuItem("Manual de Usuario: ");
		JCheckBoxMenuItem opSupport = new JCheckBoxMenuItem("Soporte tecnico: ");
		
		menu2.add(opHelp);
		menu2.add(opSupport);
		
		barra.add(menu1);
		barra.add(menu2);

		this.setJMenuBar(barra);
		
		//this.add(this.registro());
		this.add(this.login());
		this.repaint();
		
	}
	
	public JPanel login() {
		/*JPanel login = new JPanel();
		login.setLocation(0, 0);
		login.setSize(630, 629);
		login.setOpaque(true);
		login.setBackground(Color.black);
		login.setVisible(true);
		login.setLayout(null);*/
		
		JPanel panel = new JPanel();
		panel.setLayout(null);
		panel.setOpaque(false);
		panel.setBounds(0, 0, 1000, 700);
		this.add(panel);
		JLabel fondo = new JLabel(new ImageIcon("fondoLogin.png"));
		fondo.setBounds(0,0,615,614);	
		this.setContentPane(fondo);
		
		JLabel etiqueta1 = new JLabel("Bienvenidos");
		etiqueta1.setSize(180,40);
		etiqueta1.setLocation(210, 30);
		//etiqueta1.setBackground(Color.decode("#fc86eb"));
		etiqueta1.setOpaque(false);
		etiqueta1.setForeground(Color.WHITE);
		etiqueta1.setFont(titulo);
		etiqueta1.setHorizontalAlignment(JLabel.CENTER);
		panel.add(etiqueta1);
		
		JLabel etiqueta2 = new JLabel("Usuario");
		etiqueta2.setBounds(200, 100, 90, 30);
		//etiqueta2.setSize(80,30);
		//etiqueta2.setLocation(55, 50);
		//etiqueta2.setBackground(Color.decode("#fc86eb"));
		etiqueta2.setOpaque(false);
		etiqueta2.setFont(etiquetas);
		etiqueta2.setHorizontalAlignment(JLabel.LEFT);
		panel.add(etiqueta2);
		
		ImageIcon icono = new ImageIcon(new ImageIcon("usuario.png").getImage().getScaledInstance(30, 30, java.awt.Image.SCALE_SMOOTH));
		JLabel usuario = new JLabel(icono);
		usuario.setBounds(160, 100, 30, 30);
		panel.add(usuario);
		
		JTextField correo = new JTextField();
		correo.setBounds(160, 150, 265, 30);
		correo.setBackground(Color.WHITE);
		correo.setOpaque(true);
		correo.setFont(etiquetas);
		panel.add(correo);
		
		ImageIcon icon = new ImageIcon(new ImageIcon("lock.jpg").getImage().getScaledInstance(30, 30, java.awt.Image.SCALE_SMOOTH));
		JLabel lock = new JLabel(icon);
		lock.setBounds(160, 200, 30, 30);
		panel.add(lock);

		JLabel etiqueta3 = new JLabel("Contraseña");
		etiqueta3.setBounds(200, 200, 90, 30);
		//etiqueta3.setBackground(Color.decode("#fc86eb"));
		etiqueta3.setOpaque(false);
		etiqueta3.setFont(etiquetas);
		etiqueta3.setHorizontalAlignment(JLabel.LEFT);
		panel.add(etiqueta3);
		
		
		JPasswordField pase = new JPasswordField();
		pase.setBounds(160, 250, 265, 30);
		pase.setBackground(Color.WHITE);
		pase.setOpaque(true);
		pase.setFont(etiquetas);
		panel.add(pase);
		
		JCheckBox check = new JCheckBox();
		check.setBounds(160, 300, 15, 15);
		check.setBackground(Color.WHITE);
		check.setOpaque(true);
		check.setFont(etiquetas);
		check.setHorizontalAlignment(JButton.CENTER);
		panel.add(check);
		
		JLabel etiqueta4 = new JLabel("Recuerdarme");
		etiqueta4.setBounds(175, 292, 80, 30);
		//etiqueta4.setBackground(Color.decode("#fc86eb"));
		etiqueta4.setOpaque(false);
		etiqueta4.setFont(et);
		etiqueta4.setHorizontalAlignment(JLabel.CENTER);
		panel.add(etiqueta4);
		
		JButton forgot = new JButton("¿Olvidaste tu contraseña?");
		forgot.setBounds(270, 300, 166, 15);
		//forgot.setBackground(Color.decode("#fc86eb"));
		forgot.setForeground(Color.RED);
		forgot.setOpaque(false);
		forgot.setFont(et);
		forgot.setHorizontalAlignment(JLabel.RIGHT);
		panel.add(forgot);

		JButton acceso = new JButton("Ingresar");
		acceso.setBounds(210, 365, 150, 30); 
		acceso.setBackground(Color.decode("#2435b1"));
		acceso.setOpaque(true);
		acceso.setForeground(Color.WHITE);
		acceso.setFont(etiquetas);
		acceso.setHorizontalAlignment(JButton.CENTER);
		panel.add(acceso);
		
		panel.revalidate();
		
		return panel;

	}
	
	/*public JPanel registro() {
		JPanel regis = new JPanel();
		regis.setLocation(510, 0);
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

		JLabel etiqueta3 = new JLabel("Biografía");
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
