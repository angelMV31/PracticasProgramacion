package aplication;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.BorderFactory;
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
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JRadioButton;
import javax.swing.JRadioButtonMenuItem;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.border.Border;
import javax.swing.border.LineBorder;

public class Ventana extends JFrame {
	
	Font titulo = new Font("Arial", Font.BOLD, 31);
	Font etiquetas = new Font("Arial", Font.BOLD,17);
	Font et = new Font("Arial", Font.BOLD,13);
	boolean flag =false;
	String cod;
	Object[][] data = {
			{"Faby", "Camacho", "Cocinar", new Integer(5), new Boolean(false)},
			{"Angel", "Mendoza", "Beisbol", new Integer(5), new Boolean(false)},
			{"Lhucas", "Huml", "Patinar", new Integer(3), new Boolean(true)},
			{"Kathya", "Walrath", "Escalar", new Integer(2), new Boolean(false)},
			{"Marcus", "Andrews", "Correr", new Integer(7), new Boolean(true)},
			{"Arath", "Lalth", "Nadar", new Integer(4), new Boolean(false)},
			{"Sergio", "Olachea", "Basquetbol", new Integer(3), new Boolean(true)},
			{"Joel", "Zazueta", "Gym", new Integer(2), new Boolean(false)},
			{"Luis", "Lucatero", "Tejer", new Integer(7), new Boolean(true)},
			{"Yonathan", "Aguirre", "Golf", new Integer(4), new Boolean(false)},
			{"David", "Camacho", "Futbol", new Integer(5), new Boolean(false)},
			{"Diego", "Huml", "Tocho", new Integer(3), new Boolean(true)},
			{"Sebastian", "Walrath", "Americano", new Integer(2), new Boolean(false)},
			{"Kevin", "Arrieta", "Voleybol", new Integer(7), new Boolean(true)},
			{"Daniel", "Lalth", "Bolos", new Integer(4), new Boolean(false)}
			};

	//Array de ‘String’ con los titulos de las columnas
	String[] columnNames = {"Nombre", "Apellido", "Pasatiempo", "Años de Practica", "Soltero(a)"};
	
	public Ventana(String title) {
		
		this.setTitle(title);
		this.setVisible(true);
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		this.setSize(1000, 700);

		this.setLocationRelativeTo(null);
		
		this.setResizable(true);
		
		this.add(this.login());
		
		//this.setMinimumSize(new Dimension(200,430));
		//this.setMaximumSize(new Dimension(600,830));
		JMenuBar barra = new JMenuBar(); //barra de munus
		
		JMenu menu1 = new JMenu("Usuarios");
		JMenuItem opNew = new JMenuItem("Alta");
		JMenuItem opOpen = new JMenuItem("Baja");
		JMenuItem opSave = new JMenuItem("Consultar");
		menu1.add(opNew);
		menu1.add(opOpen);
		menu1.add(opSave);
		
		opSave.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				manager("tabla");
			}
		});
		opOpen.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				manager("baja");
			}
			
		});
		opNew.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				manager("alta");
			}
			
		});
		
		JMenu menu2 = new JMenu("Ayuda");
		JMenuItem comoCrear = new JMenuItem("¿Cómo crear un usuario?");
		JMenuItem comoAcceder = new JMenuItem("¿Cómo acceder al sistema?");
		JMenuItem quePasa = new JMenuItem("¿Qué pasa si olvidé mi contraseña?");
		menu2.add(comoCrear);
		menu2.add(comoAcceder);
		menu2.add(quePasa);
		comoCrear.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				manager("crear");
			}
			
		});
		comoAcceder.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				manager("acceder");
			}
			
		});
		quePasa.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				manager("contra");
			}
			
		});
		
		JMenu menu3 = new JMenu("Cuenta");
		JMenuItem lg = new JMenuItem("Login");
		JMenuItem rg = new JMenuItem("Registro");
		JMenuItem rc = new JMenuItem("Recuperación de cuenta");
		menu3.add(lg);
		menu3.add(rg);
		menu3.add(rc);
		lg.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				manager("login");
			}
			
		});
		rg.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				manager("registro");
			}
			
		});
		rc.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				manager("recuperar");
			}
			
		});
		
		barra.add(menu3);
		barra.add(menu1);
		barra.add(menu2);
		
		this.setJMenuBar(barra);
		this.validate();
		this.revalidate();
		this.repaint();
		
	}
	
	public JPanel login() {
		JPanel login = new JPanel();
		login.setLocation(0, 0);
		login.setSize(1000, 700);
		login.setOpaque(true);
		login.setBackground(Color.black);
		login.setVisible(true);
		login.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setLayout(null);
		panel.setOpaque(false);
		panel.setBounds(0, 0, 1000, 700);
		this.add(panel);
		ImageIcon i = new ImageIcon(new ImageIcon("fondo.png").getImage().getScaledInstance(1000, 700, java.awt.Image.SCALE_SMOOTH));
		JLabel fondo = new JLabel(i);
		fondo.setBounds(0,0,1000,700);	
		this.setContentPane(fondo);
		
		ImageIcon capiIcon = new ImageIcon("capi.png");
		this.setIconImage(capiIcon.getImage());
		
		JLabel etiqueta1 = new JLabel("Bienvenidos");
		etiqueta1.setSize(190,40);
		etiqueta1.setLocation(400, 30);
		//etiqueta1.setBackground(Color.decode("#fc86eb"));
		etiqueta1.setOpaque(false);
		etiqueta1.setForeground(Color.decode("#FFFFFF"));
		etiqueta1.setFont(titulo);
		etiqueta1.setHorizontalAlignment(JLabel.CENTER);
		panel.add(etiqueta1);
		
		ImageIcon ic = new ImageIcon(new ImageIcon("capi.png").getImage().getScaledInstance(100, 100, java.awt.Image.SCALE_SMOOTH));
		JLabel capi = new JLabel(ic);
		capi.setBounds(445, 88, 100, 100);
		panel.add(capi);
		
		JLabel etiqueta2 = new JLabel("Usuario");
		etiqueta2.setBounds(390, 200, 90, 30);
		//etiqueta2.setSize(80,30);
		//etiqueta2.setLocation(55, 50);
		//etiqueta2.setBackground(Color.decode("#fc86eb"));
		etiqueta2.setOpaque(false);
		etiqueta2.setFont(etiquetas);
		etiqueta2.setHorizontalAlignment(JLabel.LEFT);
		panel.add(etiqueta2);
		
		ImageIcon icono = new ImageIcon(new ImageIcon("usuario.png").getImage().getScaledInstance(30, 30, java.awt.Image.SCALE_SMOOTH));
		JLabel usuario = new JLabel(icono);
		usuario.setBounds(350, 200, 30, 30);
		panel.add(usuario);
		
		JTextField correo = new JTextField();
		correo.setBounds(372, 250, 247, 30);
		correo.setBackground(Color.WHITE);
		correo.setOpaque(true);
		correo.setFont(etiquetas);
		panel.add(correo);
		
		ImageIcon icon = new ImageIcon(new ImageIcon("lok.png").getImage().getScaledInstance(38, 38, java.awt.Image.SCALE_SMOOTH));
		JLabel lock = new JLabel(icon);
		lock.setBounds(350, 300, 38, 38);
		panel.add(lock);

		JLabel etiqueta3 = new JLabel("Contraseña");
		etiqueta3.setBounds(390, 305, 95, 30);
		//etiqueta3.setBackground(Color.decode("#fc86eb"));
		etiqueta3.setOpaque(false);
		etiqueta3.setFont(etiquetas);
		etiqueta3.setHorizontalAlignment(JLabel.LEFT);
		panel.add(etiqueta3);
		
		JPasswordField pase = new JPasswordField();
		pase.setBounds(372, 350, 247, 30);
		pase.setBackground(Color.WHITE);
		pase.setFont(etiquetas);
		panel.add(pase);
		
		ImageIcon icon2 = new ImageIcon(new ImageIcon("see.png").getImage().getScaledInstance(25, 25, java.awt.Image.SCALE_SMOOTH));
		JLabel see = new JLabel(icon2);
		see.setBounds(627, 352, 25, 25);
		see.setVisible(true);
		panel.add(see);
		
		JCheckBox check = new JCheckBox();
		check.setBounds(340, 400, 15, 15);
		check.setBackground(Color.WHITE);
		check.setOpaque(true);
		check.setFont(etiquetas);
		check.setHorizontalAlignment(JButton.CENTER);
		panel.add(check);
		
		JLabel etiqueta4 = new JLabel("Recuerdarme");
		etiqueta4.setBounds(362, 392, 90, 30);
		//etiqueta4.setBackground(Color.decode("#fc86eb"));
		etiqueta4.setOpaque(false);
		etiqueta4.setFont(et);
		etiqueta4.setHorizontalAlignment(JLabel.CENTER);
		panel.add(etiqueta4);
		
		JButton forgot = new JButton("¿Olvidaste tu contraseña?");
		forgot.setBounds(465, 400, 195, 15);
		forgot.setContentAreaFilled(false); // Quita el fondo del botón
		forgot.setForeground(Color.RED);
		forgot.setOpaque(false);
		forgot.setFont(et);
		forgot.setHorizontalAlignment(JLabel.RIGHT);
		forgot.setBorderPainted(false);
		panel.add(forgot);

		JButton acceso = new JButton("Ingresar");
		acceso.setBounds(418, 465, 150, 30); 
		acceso.setBackground(Color.decode("#2435b1"));
		acceso.setOpaque(true);
		acceso.setForeground(Color.WHITE);
		acceso.setFont(etiquetas);
		acceso.setHorizontalAlignment(JButton.CENTER);
		acceso.addActionListener(new ActionListener() {

		boolean band1=false;
		boolean band2=false;
			
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("Datos");
				System.out.println(correo.getText());
				System.out.println(pase.getText());
				
				String message = "Datos Correctos, Bienvenido";
				String message2 = "Datos Incorrectos";
				
				if(correo.getText().equals("fabycamacho@gmail.com")) {
					correo.setBorder(BorderFactory.createLineBorder(Color.green));
					band1=true;
				}
				else {
					correo.setBorder(BorderFactory.createLineBorder(Color.red));
				}
				
				if(pase.getText().equals("100224")) {
					pase.setBorder(BorderFactory.createLineBorder(Color.green));
					band2=true;
				}
				else {
					pase.setBorder(BorderFactory.createLineBorder(Color.red));	
				}
					
				if(band1 && band2) {		
					JOptionPane.showMessageDialog(null, message, "Estatus", JOptionPane.INFORMATION_MESSAGE);
					
				}
				else {
					JOptionPane.showMessageDialog(null, message2, "Estatus", JOptionPane.ERROR_MESSAGE);
				}
				
				
					
				
			}
			
		});
		
		panel.add(acceso);

		JButton irRegistro = new JButton("Aun no tienes una cuenta");
		irRegistro.setBounds(388, 525, 200,30);
		irRegistro.setFont(et);
		irRegistro.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				manager("registro");
			}
			
		});
		
		panel.add(irRegistro);
		
		panel.revalidate();
		
		return panel;
		

	}
	
	public JPanel registro() {
		JPanel regis = new JPanel();
		regis.setLayout(null);
		regis.setOpaque(false);
		regis.setBounds(0, 0, 1000, 700);
		this.add(regis);
		ImageIcon i = new ImageIcon(new ImageIcon("fondo.png").getImage().getScaledInstance(1000, 700, java.awt.Image.SCALE_SMOOTH));
		JLabel fondo = new JLabel(i);
		fondo.setBounds(0,0,1000, 700);	
		this.setContentPane(fondo);
		
		JLabel etiqueta1 = new JLabel("Registro");
		etiqueta1.setSize(180,40);
		etiqueta1.setLocation(407, 15);
		etiqueta1.setOpaque(false);
		etiqueta1.setFont(titulo);
		etiqueta1.setHorizontalAlignment(JLabel.CENTER);
		etiqueta1.setForeground(Color.white);
		regis.add(etiqueta1);
		
		JLabel etiqueta2 = new JLabel("Usuario");
		etiqueta2.setBounds(367, 60, 90, 30);
		//etiqueta2.setSize(80,30);
		//etiqueta2.setLocation(55, 50);
		//etiqueta2.setBackground(new Color(0, 0, 0, 0));
		etiqueta2.setOpaque(false);
		etiqueta2.setFont(etiquetas);
		etiqueta2.setHorizontalAlignment(JLabel.LEFT);
		regis.add(etiqueta2);
		
		JTextField correo = new JTextField();
		correo.setBounds(357, 100, 265, 30);
		correo.setBackground(Color.WHITE);
		correo.setOpaque(true);
		correo.setFont(etiquetas);
		regis.add(correo);

		JLabel etiqueta3 = new JLabel("Biografía");
		etiqueta3.setBounds(367, 140, 90, 30);
		//etiqueta3.setBackground(new Color(0, 0, 0, 0));
		etiqueta3.setOpaque(false);
		etiqueta3.setFont(etiquetas);
		etiqueta3.setHorizontalAlignment(JLabel.LEFT);
		regis.add(etiqueta3);
		
		JTextField bio = new JTextField();
		bio.setBounds(357, 170, 265, 50);
		bio.setBackground(Color.WHITE);
		bio.setOpaque(true);
		bio.setFont(etiquetas);
		regis.add(bio);
		
		ButtonGroup opc = new ButtonGroup();
		
		JLabel etiqueta4 = new JLabel("Preferiencias");
		etiqueta4.setBounds(427, 225, 110, 50);
		//etiqueta4.setBackground(new Color(0, 0, 0, 0));
		etiqueta4.setOpaque(false);
		etiqueta4.setFont(etiquetas);
		etiqueta4.setHorizontalAlignment(JLabel.LEFT);
		regis.add(etiqueta4);
		
		JRadioButton check = new JRadioButton("Dulce");
		check.setBounds(354, 280, 75, 15);
		check.setOpaque(false);
		check.setFont(etiquetas);
		check.setHorizontalAlignment(JButton.CENTER);
		regis.add(check);
		
		JRadioButton check2 = new JRadioButton("Salado");
		check2.setBounds(432, 280, 80, 15);
		check2.setOpaque(false);
		check2.setFont(etiquetas);
		check2.setHorizontalAlignment(JButton.CENTER);
		regis.add(check2);
		
		JRadioButton check3 = new JRadioButton("Saludable");
		check3.setBounds(522, 280, 110, 15);
		check3.setOpaque(false);
		check3.setFont(etiquetas);
		check3.setHorizontalAlignment(JButton.CENTER);
		regis.add(check3);
		
		opc.add(check);
		opc.add(check2);
		opc.add(check3);
		
		String[] colonias = {"Centro", "Villas del Encanto", "Miramar", "Camino Real", "Indeco"};
		
		JComboBox col = new JComboBox(colonias);
		col.setBounds(407, 320, 150, 30);
		regis.add(col);
		
		ButtonGroup terminos = new ButtonGroup();
		
		JRadioButton term1 = new JRadioButton("Acepto los términos");
		term1.setBounds(332, 370, 150, 20);
		term1.setOpaque(false);
		regis.add(term1);
		
		JRadioButton term2 = new JRadioButton("No acepto los términos");
		term2.setBounds(492, 370, 160, 20);
		term2.setOpaque(false);
		regis.add(term2);
		
		terminos.add(term1);
		terminos.add(term2);
		
		JButton acceso = new JButton("Crear cuenta");
		acceso.setBounds(407, 435, 150, 30); 
		acceso.setBackground(Color.decode("#2435b1"));
		acceso.setOpaque(true);
		acceso.setFont(etiquetas);
		acceso.setHorizontalAlignment(JButton.CENTER);
		acceso.setForeground(Color.white);
		acceso.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("Hola");
				
				if(correo.getText().equals("")) {
					correo.setBorder(BorderFactory.createLineBorder(Color.red));
				}
				else
					correo.setBorder(BorderFactory.createLineBorder(Color.green));
				
				if(bio.getText().equals("")) {
					bio.setBorder(BorderFactory.createLineBorder(Color.red));	
				}
				else
					bio.setBorder(BorderFactory.createLineBorder(Color.green));
				
				if(!term1.isSelected() && !term2.isSelected()) {
					term1.setForeground(Color.red);
					term2.setForeground(Color.red);				}
				else {
					term1.setForeground(Color.green);
					term2.setForeground(Color.green);
				}
					
			}
			
		});
		regis.add(acceso);
		
		JButton irLogin = new JButton("Volver al inicio");
		irLogin.setBounds(388, 510, 200,30);
		irLogin.setFont(et);
		irLogin.setVisible(true);
		irLogin.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				manager("login");
			}
			
		});
		
		this.add(irLogin);
		
		return regis;
	}
	
	public JPanel recuperar() {
		JPanel recuperar = new JPanel();
		recuperar.setLayout(null);
		recuperar.setOpaque(false);
		recuperar.setBounds(0, 0, 1000, 700);
		this.add(recuperar);
		ImageIcon i = new ImageIcon(new ImageIcon("fondo.png").getImage().getScaledInstance(1000, 700, java.awt.Image.SCALE_SMOOTH));
		JLabel fondo = new JLabel(i);
		fondo.setBounds(0,0,1000, 700);	
		this.setContentPane(fondo);
		
		JLabel recuperar1 = new JLabel("Recuperar mi cuenta");
		recuperar1.setSize(360,40);
		recuperar1.setLocation(320, 100);
		recuperar1.setOpaque(false);
		recuperar1.setFont(titulo);
		recuperar1.setForeground(Color.red);
		recuperar1.setHorizontalAlignment(JLabel.CENTER);
		recuperar.add(recuperar1);
		
		JLabel opcionDeRecuperacion = new JLabel("Recibir codigo de verificacion");
		opcionDeRecuperacion.setBounds(350,150,300,30);
		opcionDeRecuperacion.setOpaque(false);
		opcionDeRecuperacion.setFont(etiquetas);
		opcionDeRecuperacion.setHorizontalAlignment(JLabel.CENTER);
		recuperar.add(opcionDeRecuperacion);
		
		JButton sms = new JButton("Por mensaje de texto");
		sms.setBounds(440,200,180,30);
		sms.setBackground(Color.white);
		sms.setOpaque(true);
		sms.setFont(et);
		sms.setHorizontalAlignment(JLabel.CENTER);
		sms.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				JOptionPane.showMessageDialog(null, "Código: 1002", "Verificacion", JOptionPane.INFORMATION_MESSAGE);
				flag=true;
				if(flag)
					cod = JOptionPane.showInputDialog(null,"Ingrese el código","Verificación",JOptionPane.QUESTION_MESSAGE);
			}
		});
		recuperar.add(sms);

		ImageIcon ic = new ImageIcon(new ImageIcon("sms.png").getImage().getScaledInstance(55, 35, java.awt.Image.SCALE_SMOOTH));
		JLabel sms2 = new JLabel(ic);
		sms2.setBounds(380, 198, 55, 35);
		recuperar.add(sms2);
		
		JButton email = new JButton("Por correo electronico");
		email.setBounds(430,250,200,30);
		email.setBackground(Color.white);
		email.setOpaque(true);
		email.setFont(et);
		email.setHorizontalAlignment(JLabel.CENTER);
		email.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				JOptionPane.showMessageDialog(null, "Se ha enviado el código a tu correo", "Verificación", JOptionPane.INFORMATION_MESSAGE);
				flag = true;
				if(flag)
					cod = JOptionPane.showInputDialog(null,"Ingrese el código","Verificación",JOptionPane.QUESTION_MESSAGE);
			}
		});
		recuperar.add(email);
		ImageIcon ic2 = new ImageIcon(new ImageIcon("email.jpg").getImage().getScaledInstance(45, 40, java.awt.Image.SCALE_SMOOTH));
		JLabel email2 = new JLabel(ic2);
		email2.setBounds(378, 245, 45, 40);
		recuperar.add(email2);
		
		JButton irLogin = new JButton("Volver al inicio");
		irLogin.setBounds(390, 510, 200,30);
		irLogin.setFont(et);
		irLogin.setVisible(true);
		irLogin.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				manager("login");
			}
			
		});
		
		recuperar.add(irLogin);
		
		return recuperar;
	}
	
	public JPanel tabla() {
		JPanel tabla = new JPanel();
		tabla.setLayout(null);
		tabla.setOpaque(false);
		tabla.setBounds(0, 0, 1000, 700);
		this.add(tabla);
		
		ImageIcon i = new ImageIcon(new ImageIcon("fondo.png").getImage().getScaledInstance(1000, 700, java.awt.Image.SCALE_SMOOTH));
		JLabel fondo = new JLabel(i);
		fondo.setBounds(0,0,1000, 700);	
		this.setContentPane(fondo);
		
		JLabel etiqueta1 = new JLabel("Usuarios");
		etiqueta1.setSize(220,40);
		etiqueta1.setLocation(380, 20);
		etiqueta1.setOpaque(false);
		etiqueta1.setFont(titulo);
		etiqueta1.setForeground(Color.white);
		etiqueta1.setHorizontalAlignment(JLabel.CENTER);
		tabla.add(etiqueta1);
	
		
		JLabel etiqueta3 = new JLabel("Total de usuarios: 15");
		etiqueta3.setSize(200,40);
		etiqueta3.setLocation(700, 120);
		etiqueta3.setBackground(Color.decode("#2435b1"));
		etiqueta3.setOpaque(true);
		etiqueta3.setFont(etiquetas);
		etiqueta3.setHorizontalAlignment(JLabel.CENTER);
		etiqueta3.setForeground(Color.white);
		tabla.add(etiqueta3);
		
		JLabel widget = new JLabel();
		widget.setSize(240,50);
		widget.setLocation(680, 115);
		widget.setBackground(Color.decode("#2435b1"));
		widget.setOpaque(true);
		widget.setBorder(new LineBorder(Color.white));
		widget.setFont(titulo);
		widget.setHorizontalAlignment(JLabel.CENTER);
		tabla.add(widget);
		
		JButton export = new JButton("Exportar");
		export.setBounds(350, 450, 100, 40);
		export.setBackground(Color.WHITE);
		export.setBorder(new LineBorder(Color.decode("#2435b1")));
		export.setVisible(true);
		export.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "Usuarios exportados con éxito!", "Exportar", JOptionPane.INFORMATION_MESSAGE);
			}
			
		});
		tabla.add(export);
		
		JButton importar = new JButton("Importar");
		importar.setBounds(520, 450, 100, 40);
		importar.setBackground(Color.WHITE);
		importar.setBorder(new LineBorder(Color.decode("#2435b1")));
		importar.setVisible(true);
		importar.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "Usuarios importados con éxito!", "Importar", JOptionPane.INFORMATION_MESSAGE);
			}
			
		});
		tabla.add(importar);
		
		JTable tablaDatos = new JTable(data, columnNames);
		JScrollPane scrollPane = new JScrollPane(tablaDatos);
		scrollPane.setSize(930,200);
		scrollPane.setLocation(30,200);
		tabla.add(scrollPane);
		
		JButton irLogin = new JButton("Volver al inicio");
		irLogin.setBounds(390, 530, 200,30);
		irLogin.setFont(et);
		irLogin.setVisible(true);
		irLogin.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				manager("login");
			}
			
		});
		tabla.add(irLogin);
		
		return tabla;
		
	}
	
	public JPanel alta() {
		JPanel alta = new JPanel();
		alta.setLayout(null);
		alta.setOpaque(false);
		alta.setBounds(0, 0, 1000, 700);
		this.add(alta);
		ImageIcon i = new ImageIcon(new ImageIcon("fondo.png").getImage().getScaledInstance(1000, 700, java.awt.Image.SCALE_SMOOTH));
		JLabel fondo = new JLabel(i);
		fondo.setBounds(0,0,1000, 700);	
		this.setContentPane(fondo);
		
		ImageIcon ic = new ImageIcon(new ImageIcon("capi.png").getImage().getScaledInstance(300, 300, java.awt.Image.SCALE_SMOOTH));
		JLabel capi = new JLabel(ic);
		capi.setBounds(550, 130, 300, 300);
		alta.add(capi);
		
		JLabel alta1 = new JLabel("Alta de cuenta");
		alta1.setSize(220,30);
		alta1.setLocation(140, 60);
		alta1.setOpaque(false);
		alta1.setForeground(Color.white);
		alta1.setFont(titulo);
		alta1.setHorizontalAlignment(JLabel.CENTER);
		alta.add(alta1);
		
		JLabel newUsu = new JLabel("Ingrese un nuevo correo");
		newUsu.setSize(220,30);
		newUsu.setLocation(180, 150);
		newUsu.setOpaque(false);
		newUsu.setForeground(Color.black);
		newUsu.setFont(etiquetas);
		newUsu.setHorizontalAlignment(JLabel.CENTER);
		alta.add(newUsu);
		
		JTextField newUsua = new JTextField();
		newUsua.setLayout(null);
		newUsua.setBackground(Color.white);
		newUsua.setOpaque(true);
		newUsua.setBounds(180,190, 220, 30);
		alta.add(newUsua);
		
		JLabel newContra = new JLabel("Ingrese su contraseña");
		newContra.setSize(220,30);
		newContra.setLocation(180, 250);
		newContra.setOpaque(false);
		newContra.setForeground(Color.black);
		newContra.setFont(etiquetas);
		newContra.setHorizontalAlignment(JLabel.CENTER);
		alta.add(newContra);
		
		JPasswordField newContras = new JPasswordField();
		newContras.setLayout(null);
		newContras.setBackground(Color.white);
		newContras.setOpaque(true);
		newContras.setBounds(180,290, 220, 30);
		alta.add(newContras);
		
		JLabel newContras2 = new JLabel("Confirme su contraseña");
		newContras2.setSize(220,30);
		newContras2.setLocation(180, 350);
		newContras2.setOpaque(false);
		newContras2.setForeground(Color.black);
		newContras2.setFont(etiquetas);
		newContras2.setHorizontalAlignment(JLabel.CENTER);
		alta.add(newContras2);
		
		JPasswordField newC = new JPasswordField();
		newC.setLayout(null);
		newC.setBackground(Color.white);
		newC.setOpaque(true);
		newC.setBounds(180,390, 220, 30);
		alta.add(newC);
		
		JButton crea = new JButton("Crear usuario");
		crea.setBounds(378, 480, 200,30);
		crea.setOpaque(true);
		crea.setBackground(Color.decode("#2435b1"));
		crea.setForeground(Color.white);
		crea.setFont(etiquetas);
		crea.setHorizontalAlignment(JButton.CENTER);
		crea.addActionListener(new ActionListener() {

			boolean band1=false;
			boolean band2=false;
				
				@Override
				public void actionPerformed(ActionEvent e) {
					System.out.println("Datos");
					System.out.println(newUsua.getText());
					System.out.println(newContras.getText());
					System.out.println(newC.getText());
					
					if(newUsua.getText().equals("")) {
						newUsua.setBorder(BorderFactory.createLineBorder(Color.red));
					}
					else {
						newUsua.setBorder(BorderFactory.createLineBorder(Color.green));
					}
					
					if(newContras.getText().equals("")) {
						newContras.setBorder(BorderFactory.createLineBorder(Color.red));
					}
					else {
						newContras.setBorder(BorderFactory.createLineBorder(Color.green));	
					}
					
					if(newC.getText().equals("")) {
						newC.setBorder(BorderFactory.createLineBorder(Color.red));
					}
					else {
						newC.setBorder(BorderFactory.createLineBorder(Color.green));	
					}
						
					if(!newContras.getText().equals(newC.getText())) {
						JOptionPane.showMessageDialog(null, "Las Contraseñas no coinciden!", "Error", JOptionPane.INFORMATION_MESSAGE);
					}	
					else {
						JOptionPane.showMessageDialog(null, "Las Contraseñas coinciden!", "Aceptadas", JOptionPane.INFORMATION_MESSAGE);
					}
					
				}
		});
		alta.add(crea);
		
		JButton irLogin = new JButton("Volver al inicio");
		irLogin.setBounds(378, 530, 200,30);
		irLogin.setFont(et);
		irLogin.setVisible(true);
		irLogin.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				manager("login");
			}
			
		});
		
		alta.add(irLogin);
		
		return alta;
	}
	
	public JPanel baja() {
		JPanel baja = new JPanel();
		baja.setLayout(null);
		baja.setOpaque(false);
		baja.setBounds(0, 0, 1000, 700);
		this.add(baja);
		ImageIcon i = new ImageIcon(new ImageIcon("fondo.png").getImage().getScaledInstance(1000, 700, java.awt.Image.SCALE_SMOOTH));
		JLabel fondo = new JLabel(i);
		fondo.setBounds(0,0,1000, 700);	
		this.setContentPane(fondo);
		
		ImageIcon ic = new ImageIcon(new ImageIcon("capi.png").getImage().getScaledInstance(300, 300, java.awt.Image.SCALE_SMOOTH));
		JLabel capi = new JLabel(ic);
		capi.setBounds(180, 130, 300, 300);
		baja.add(capi);
		
		JLabel baja1 = new JLabel("Baja de cuenta");
		baja1.setSize(250,30);
		baja1.setLocation(140, 60);
		baja1.setOpaque(false);
		baja1.setForeground(Color.white);
		baja1.setFont(titulo);
		baja1.setHorizontalAlignment(JLabel.CENTER);
		baja.add(baja1);
		
		JLabel bajaUsuario = new JLabel("Ingrese su correo");
		bajaUsuario.setSize(220,30);
		bajaUsuario.setLocation(550, 150);
		bajaUsuario.setOpaque(false);
		bajaUsuario.setForeground(Color.black);
		bajaUsuario.setFont(etiquetas);
		bajaUsuario.setHorizontalAlignment(JLabel.CENTER);
		baja.add(bajaUsuario);
		
		JTextField bajaUsuario2 = new JTextField();
		bajaUsuario2.setLayout(null);
		bajaUsuario2.setBackground(Color.white);
		bajaUsuario2.setOpaque(true);
		bajaUsuario2.setBounds(550,190, 220, 30);
		baja.add(bajaUsuario2);
		
		JLabel contra = new JLabel("Ingrese su contraseña");
		contra.setSize(220,30);
		contra.setLocation(550, 250);
		contra.setOpaque(false);
		contra.setForeground(Color.black);
		contra.setFont(etiquetas);
		contra.setHorizontalAlignment(JLabel.CENTER);
		baja.add(contra);
		
		JPasswordField contra2 = new JPasswordField();
		contra2.setLayout(null);
		contra2.setBackground(Color.white);
		contra2.setOpaque(true);
		contra2.setBounds(550,290, 220, 30);
		baja.add(contra2);
		
		JButton elimina = new JButton("Eliminar usuario");
		elimina.setBounds(378, 490, 200,30);
		elimina.setOpaque(true);
		elimina.setBackground(Color.decode("#2435b1"));
		elimina.setForeground(Color.white);
		elimina.setFont(etiquetas);
		elimina.setHorizontalAlignment(JButton.CENTER);
		elimina.addActionListener(new ActionListener() {
				
		@Override
		public void actionPerformed(ActionEvent e) {
			System.out.println("Datos");
			System.out.println(bajaUsuario2.getText());
			System.out.println(contra2.getText());
			
			if(bajaUsuario2.getText().equals("")) {
				bajaUsuario2.setBorder(BorderFactory.createLineBorder(Color.red));
			}
			else {
				bajaUsuario2.setBorder(BorderFactory.createLineBorder(Color.green));
			}
			
			if(contra2.getText().equals("")) {
				contra2.setBorder(BorderFactory.createLineBorder(Color.red));
			}
			else {
				contra2.setBorder(BorderFactory.createLineBorder(Color.green));	
			}
			
			
			if(bajaUsuario2.getText().equals("fabycamacho@gmail.com")) {
				if(contra2.getText().equals("100224")) {
					JOptionPane.showMessageDialog(null, "Usuario eliminado!", "Usuario encontrado", JOptionPane.INFORMATION_MESSAGE);
				}
				else {
					JOptionPane.showMessageDialog(null, "Contraseña incorrecta!", "Error", JOptionPane.INFORMATION_MESSAGE);
				}
			}	
			else {
				JOptionPane.showMessageDialog(null, "Dator erroneos!", "Usuario no encontrado", JOptionPane.INFORMATION_MESSAGE);
			}
			
		}
		});
		baja.add(elimina);
		
		JButton irLogin = new JButton("Volver al inicio");
		irLogin.setBounds(378, 550, 200,30);
		irLogin.setFont(et);
		irLogin.setVisible(true);
		irLogin.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				manager("login");
			}
			
		});
		
		baja.add(irLogin);
		
		return baja;
	}
	
	public JPanel crear() {
		JPanel crear = new JPanel();
		crear.setLayout(null);
		crear.setOpaque(false);
		crear.setBounds(0, 0, 1000, 700);
		this.add(crear);
		
		ImageIcon i = new ImageIcon(new ImageIcon("fondo.png").getImage().getScaledInstance(1000, 700, java.awt.Image.SCALE_SMOOTH));
		JLabel fondo = new JLabel(i);
		fondo.setBounds(0,0,1000, 700);	
		this.setContentPane(fondo);
		
		ImageIcon ic = new ImageIcon(new ImageIcon("capi.png").getImage().getScaledInstance(100, 100, java.awt.Image.SCALE_SMOOTH));
		JLabel capi = new JLabel(ic);
		capi.setBounds(445, 88, 100, 100);
		crear.add(capi);
		
		JLabel crear1 = new JLabel("¿Cómo crear un usuario?");
		crear1.setSize(400,40);
		crear1.setLocation(300, 200);
		crear1.setOpaque(false);
		crear1.setForeground(Color.white);
		crear1.setFont(titulo);
		crear1.setHorizontalAlignment(JLabel.CENTER);
		crear.add(crear1);
		
		JButton irLogin = new JButton("Volver al inicio");
		irLogin.setBounds(378, 510, 200,30);
		irLogin.setFont(et);
		irLogin.setVisible(true);
		irLogin.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				manager("login");
			}
			
		});
		
		crear.add(irLogin);
		
		return crear;
	}
	
	public JPanel acceder() {
		JPanel acceder = new JPanel();
		acceder.setLayout(null);
		acceder.setOpaque(false);
		acceder.setBounds(0, 0, 1000, 700);
		this.add(acceder);
		ImageIcon i = new ImageIcon(new ImageIcon("fondo.png").getImage().getScaledInstance(1000, 700, java.awt.Image.SCALE_SMOOTH));
		JLabel fondo = new JLabel(i);
		fondo.setBounds(0,0,1000, 700);	
		this.setContentPane(fondo);
		
		ImageIcon ic = new ImageIcon(new ImageIcon("capi.png").getImage().getScaledInstance(100, 100, java.awt.Image.SCALE_SMOOTH));
		JLabel capi = new JLabel(ic);
		capi.setBounds(445, 88, 100, 100);
		acceder.add(capi);
		
		JLabel acceder1 = new JLabel("¿Cómo acceder al sistema?");
		acceder1.setSize(450,40);
		acceder1.setLocation(280, 200);
		acceder1.setOpaque(false);
		acceder1.setForeground(Color.white);
		acceder1.setFont(titulo);
		acceder1.setHorizontalAlignment(JLabel.CENTER);
		acceder.add(acceder1);
		
		JButton irLogin = new JButton("Volver al inicio");
		irLogin.setBounds(378, 510, 200,30);
		irLogin.setFont(et);
		irLogin.setVisible(true);
		irLogin.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				manager("login");
			}
			
		});
		acceder.add(irLogin);
		
		return acceder;
	}
	
	public JPanel contra() {
		JPanel contra = new JPanel();
		contra.setLayout(null);
		contra.setOpaque(false);
		contra.setBounds(0, 0, 1000, 700);
		this.add(contra);
		
		ImageIcon i = new ImageIcon(new ImageIcon("fondo.png").getImage().getScaledInstance(1000, 700, java.awt.Image.SCALE_SMOOTH));
		JLabel fondo = new JLabel(i);
		fondo.setBounds(0,0,1000, 700);	
		this.setContentPane(fondo);
		
		ImageIcon ic = new ImageIcon(new ImageIcon("capi.png").getImage().getScaledInstance(100, 100, java.awt.Image.SCALE_SMOOTH));
		JLabel capi = new JLabel(ic);
		capi.setBounds(445, 88, 100, 100);
		contra.add(capi);
		
		JLabel acceder1 = new JLabel("¿Qué pasa si olvidé mi contraseña?");
		acceder1.setSize(550,40);
		acceder1.setLocation(230, 200);
		acceder1.setForeground(Color.white);
		acceder1.setOpaque(false);
		acceder1.setFont(titulo);
		acceder1.setHorizontalAlignment(JLabel.CENTER);
		contra.add(acceder1);
		
		JButton irLogin = new JButton("Volver al inicio");
		irLogin.setBounds(378, 510, 200,30);
		irLogin.setFont(et);
		irLogin.setVisible(true);
		irLogin.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				manager("login");
			}
			
		});
		contra.add(irLogin);
		
		return contra;
	}
	
	
	public void manager(String target) {
		
		this.getContentPane().removeAll();
		
		if(target.equals("registro")) {
			this.add(registro());			
		}
		if(target.equals("login")) {
			this.add(login());			
		}
		if(target.equals("recuperar")) {
			this.add(recuperar());			
		}
		if(target.equals("tabla")) {
			this.add(tabla());			
		}
		if(target.equals("alta")) {
			this.add(alta());			
		}
		if(target.equals("baja")) {
			this.add(baja());			
		}
		if(target.equals("crear")) {
			this.add(crear());			
		}
		if(target.equals("acceder")) {
			this.add(acceder());			
		}
		if(target.equals("contra")) {
			this.add(contra());			
		}
		
		this.repaint();
		this.revalidate();
		
		System.out.println("Hola");
	}
	
	
	/*public void paint (Graphics g) {
		super.paint(g);
		
		Graphics2D	 g2 = (Graphics2D) g;
		
		g2.setColor(Color.red);
		g2.drawRect(210, 210, 200, 200);//pinta el contorno de un cuadrado
		g2.fillRect(270, 270, 80, 80); //
		g2.clearRect(285, 285, 40, 40);
		
		g2.setColor(Color.cyan);
		g2.fillRoundRect(270, 450, 100, 100, 30, 30);
		
		g2.setColor(Color.pink);
		g2.setStroke(new BasicStroke(10));
		g2.drawLine(50, 50, 550, 550);
		
		g2.setColor(Color.gray);
		g2.drawOval(260, 80, 120, 100);
		g2.fillOval(270, 90, 100, 80);
		
		g2.setColor(Color.magenta);
		g2.drawArc(50, 500, 70, 70, 1, -180);
		g2.fillArc(50, 500, 70, 70, 1, 180);
		
		g2.setColor(Color.black);
		g2.setFont(titulo);
		g2.drawString("Hola Crayola", 400, 60);
		
		
		int[] xs = {100,100,400};
		int[] ys = {100,200,400};
		g2.setColor(Color.blue);
		g2.drawPolygon(xs, ys, 3);
		
		int[] xs2 = {100,100,400};
		int[] ys2 = {100,200,400};
		g2.fillPolygon(xs2, ys2, 3);
		
	}*/
	
	

}
