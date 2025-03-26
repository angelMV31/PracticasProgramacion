package aplication;

import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import java.awt.Color;
import javax.swing.border.LineBorder;
import javax.swing.border.MatteBorder;
import java.awt.event.ActionListener;
import java.util.Random;
import java.util.Timer;
import java.util.TimerTask;
import java.awt.event.ActionEvent;
import java.awt.Label;

public class Rompecabezas {

	Font etiq = new Font("Time new Roman", Font.BOLD, 30);
	
	private JFrame frame;
	
	int seg=0;
	
	Timer tiempo;
	
	TimerTask tiempoDeJuego;
	
    JButton btnNewButton_1,btnNewButton_2,btnNewButton_4,btnNewButton_3,
    btnNewButton,btnNewButton_6,btnNewButton_5,btnNewButton_10,
    btnNewButton_9,btnNewButton_8,btnNewButton_12,btnNewButton_7,
    btnNewButton_11,btnNewButton_13,btnNewButton_14,btnNewButton_15;

	JButton[][] botones;
	private JLabel lblTiempo;
	private JButton btnNewButton_16_3;
	private JButton btnNewButton_16_2;
	
	JLabel lblNewLabel_1;
	
	int cont=0;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Rompecabezas window = new Rompecabezas();
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
	public Rompecabezas() {
		initialize();
		pausar();
	    
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(214,178,126));
		frame.setBounds(100, 100, 1101, 688);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(10, 68, 663, 498);
		panel.setForeground(new Color(164,90,53));
		panel.setBackground(new Color(164, 90, 53));
		panel.setBorder(new MatteBorder(30, 30, 30, 30, (Color) new Color(164, 90, 53)));
		frame.getContentPane().add(panel);
		panel.setLayout(new GridLayout(4, 4, 20, 20));
		
		btnNewButton_1 = new JButton("1");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				intercambiar(btnNewButton_1);
				ganar();
			}
		});
		btnNewButton_1.setBackground(new Color(214,178,126));
		btnNewButton_1.setForeground(Color.white);
		btnNewButton_1.setFont(etiq);
		panel.add(btnNewButton_1);
		
		btnNewButton_2 = new JButton("2");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				intercambiar(btnNewButton_2);
				ganar();
			}
		});
		btnNewButton_2.setBackground(new Color(214,178,126));
		btnNewButton_2.setForeground(Color.white);
		btnNewButton_2.setFont(etiq);
		panel.add(btnNewButton_2);
		
		btnNewButton_4 = new JButton("3");
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				intercambiar(btnNewButton_4);
				ganar();
			}
		});
		btnNewButton_4.setBackground(new Color(214,178,126));
		btnNewButton_4.setForeground(Color.white);
		btnNewButton_4.setFont(etiq);
		panel.add(btnNewButton_4);
		
		btnNewButton_3 = new JButton("4");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				intercambiar(btnNewButton_3);
				ganar();
			}
		});
		btnNewButton_3.setBackground(new Color(214,178,126));
		btnNewButton_3.setForeground(Color.white);
		btnNewButton_3.setFont(etiq);
		panel.add(btnNewButton_3);
		
		btnNewButton = new JButton("5");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				intercambiar(btnNewButton);
				ganar();
			}
		});
		btnNewButton.setBackground(new Color(214,178,126));
		btnNewButton.setForeground(Color.white);
		btnNewButton.setFont(etiq);
		panel.add(btnNewButton);
		
		btnNewButton_6 = new JButton("6");
		btnNewButton_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				intercambiar(btnNewButton_6);
				ganar();
			}
		});
		btnNewButton_6.setBackground(new Color(214,178,126));
		btnNewButton_6.setForeground(Color.white);
		btnNewButton_6.setFont(etiq);
		panel.add(btnNewButton_6);
		
		btnNewButton_5 = new JButton("7");
		btnNewButton_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				intercambiar(btnNewButton_5);
				ganar();
			}
		});
		btnNewButton_5.setBackground(new Color(214,178,126));
		btnNewButton_5.setForeground(Color.white);
		btnNewButton_5.setFont(etiq);
		panel.add(btnNewButton_5);
		
		btnNewButton_10 = new JButton("8");
		btnNewButton_10.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				intercambiar(btnNewButton_10);
				ganar();
			}
		});
		btnNewButton_10.setBackground(new Color(214,178,126));
		btnNewButton_10.setForeground(Color.white);
		btnNewButton_10.setFont(etiq);
		panel.add(btnNewButton_10);
		
		btnNewButton_9 = new JButton("9");
		btnNewButton_9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				intercambiar(btnNewButton_9);
				ganar();
			}
		});
		btnNewButton_9.setBackground(new Color(214,178,126));
		btnNewButton_9.setForeground(Color.white);
		btnNewButton_9.setFont(etiq);
		panel.add(btnNewButton_9);
		
		btnNewButton_8 = new JButton("10");
		btnNewButton_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				intercambiar(btnNewButton_8);
				ganar();
			}
		});
		btnNewButton_8.setBackground(new Color(214,178,126));
		btnNewButton_8.setForeground(Color.white);
		btnNewButton_8.setFont(etiq);
		panel.add(btnNewButton_8);
		
		btnNewButton_12 = new JButton("11");
		btnNewButton_12.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				intercambiar(btnNewButton_12);
				ganar();
			}
		});
		btnNewButton_12.setBackground(new Color(214,178,126));
		btnNewButton_12.setForeground(Color.white);
		btnNewButton_12.setFont(etiq);
		panel.add(btnNewButton_12);
		
		btnNewButton_7 = new JButton("12");
		btnNewButton_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				intercambiar(btnNewButton_7);
				ganar();
			}
		});
		btnNewButton_7.setBackground(new Color(214,178,126));
		btnNewButton_7.setForeground(Color.white);
		btnNewButton_7.setFont(etiq);
		panel.add(btnNewButton_7);
		
		btnNewButton_11 = new JButton("13");
		btnNewButton_11.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				intercambiar(btnNewButton_11);
				ganar();
			}
		});
		btnNewButton_11.setBackground(new Color(214,178,126));
		btnNewButton_11.setForeground(Color.white);
		btnNewButton_11.setFont(etiq);
		panel.add(btnNewButton_11);
		
		btnNewButton_13 = new JButton("14");
		btnNewButton_13.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				intercambiar(btnNewButton_13);
				ganar();
			}
		});
		btnNewButton_13.setBackground(new Color(214,178,126));
		btnNewButton_13.setForeground(Color.white);
		btnNewButton_13.setFont(etiq);
		panel.add(btnNewButton_13);
		
		btnNewButton_14 = new JButton("15");
		btnNewButton_14.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				intercambiar(btnNewButton_14);
				ganar();
			}
		});
		btnNewButton_14.setBackground(new Color(214,178,126));
		btnNewButton_14.setForeground(Color.white);
		btnNewButton_14.setFont(etiq);
		panel.add(btnNewButton_14);
		
		
		btnNewButton_15 = new JButton("");
		btnNewButton_15.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				intercambiar(btnNewButton_15);
				ganar();
			}
		});
		btnNewButton_15.setBackground(new Color(214,178,126));
		btnNewButton_15.setForeground(Color.white);
		btnNewButton_15.setFont(etiq);
		panel.add(btnNewButton_15);
		
		botones = new JButton[][] {{btnNewButton_1,btnNewButton_2,btnNewButton_4,btnNewButton_3},
				{btnNewButton,btnNewButton_6,btnNewButton_5,btnNewButton_10},
				{btnNewButton_9,btnNewButton_8,btnNewButton_12,btnNewButton_7},
				{btnNewButton_11,btnNewButton_13,btnNewButton_14,btnNewButton_15}};
		
		JLabel lblNewLabel = new JLabel("Juego de Rompecabezas");
		lblNewLabel.setBounds(115, 0, 938, 58);
		lblNewLabel.setBackground(new Color(214,178,126));
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 30));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		frame.getContentPane().add(lblNewLabel);
		
		JButton btnNewButton_16 = new JButton("Jugar nuevamente");
		btnNewButton_16.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				revolver();
				pausar();
				seg=0;
			}
		});
		btnNewButton_16.setBounds(415, 583, 317, 47);
		btnNewButton_16.setBackground(new Color(164, 90, 53));
		btnNewButton_16.setFont(new Font("Times New Roman", Font.BOLD, 25));
		btnNewButton_16.setForeground(Color.white);
		frame.getContentPane().add(btnNewButton_16);
		
		lblTiempo = new JLabel("Tiempo");
		lblTiempo.setHorizontalAlignment(SwingConstants.CENTER);
		lblTiempo.setFont(new Font("Times New Roman", Font.BOLD, 24));
		lblTiempo.setBackground(new Color(214, 178, 126));
		lblTiempo.setBounds(683, 130, 394, 58);
		frame.getContentPane().add(lblTiempo);
		
		JButton btnNewButton_16_1 = new JButton("Iniciar");
		btnNewButton_16_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				seguir();
				
			}
		});
		btnNewButton_16_1.setForeground(Color.WHITE);
		btnNewButton_16_1.setFont(new Font("Times New Roman", Font.BOLD, 22));
		btnNewButton_16_1.setBackground(new Color(164, 90, 53));
		btnNewButton_16_1.setBounds(742, 328, 280, 47);
		frame.getContentPane().add(btnNewButton_16_1);
		
		btnNewButton_16_3 = new JButton("Reanudar");
		btnNewButton_16_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				seguir();
			}
		});
		btnNewButton_16_3.setForeground(Color.WHITE);
		btnNewButton_16_3.setFont(new Font("Times New Roman", Font.BOLD, 22));
		btnNewButton_16_3.setBackground(new Color(164, 90, 53));
		btnNewButton_16_3.setBounds(742, 476, 280, 47);
		frame.getContentPane().add(btnNewButton_16_3);
		
		btnNewButton_16_2 = new JButton("Pausar");
	    btnNewButton_16_2.addActionListener(new ActionListener() {
	    	public void actionPerformed(ActionEvent e) {
	    		pausar();
	    	}
	    });
	    btnNewButton_16_2.setForeground(Color.WHITE);
	    btnNewButton_16_2.setFont(new Font("Times New Roman", Font.BOLD, 22));
	    btnNewButton_16_2.setBackground(new Color(164, 90, 53));
	    btnNewButton_16_2.setBounds(742, 402, 280, 47);
	    frame.getContentPane().add(btnNewButton_16_2);
	    
	    lblNewLabel_1 = new JLabel("0");
	    lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
	    lblNewLabel_1.setFont(new Font("Tempus Sans ITC", Font.BOLD, 22));
	    lblNewLabel_1.setBounds(735, 189, 287, 58);
	    frame.getContentPane().add(lblNewLabel_1);
		revolver();
	}
	
	public void revolver() {
		JButton aux = new JButton("");
		Random rand = new Random();
		
		int x;
		int y;
		int x2;
		int y2;
		for(int i = 0; i<16; i++) {
			x = rand.nextInt(4);
			y = rand.nextInt(4);
			x2 = rand.nextInt(4);
			y2 = rand.nextInt(4);
			
	        aux.setText(botones[x][y].getText());
	        botones[x][y].setText(botones[x2][y2].getText());
	        botones[x2][y2].setText(aux.getText());
			
		}
		
	}
	
	public void intercambiar(JButton boton) {
		JButton aux = new JButton("");
		
		int filaBtnVacio = 0, rengBtnVacio = 0, filaBtnPrecionado = 0, rengBtnPrecionado = 0;
		
		
		for(int y = 0; y<=3; y++) {
			for(int x = 0; x<=3; x++) {
				if(botones[y][x].getText().equals("")) {
					rengBtnVacio = y;
					filaBtnVacio = x;
					
				}
				if(botones[y][x].getText().equals(boton.getText())) {
					rengBtnPrecionado = y;
					filaBtnPrecionado = x;
				}
			}
		}
		
		if ((filaBtnPrecionado == filaBtnVacio && (rengBtnPrecionado == rengBtnVacio - 1 || rengBtnPrecionado == rengBtnVacio + 1)) || 
		        (rengBtnPrecionado == rengBtnVacio && (filaBtnPrecionado == filaBtnVacio - 1 || filaBtnPrecionado == filaBtnVacio + 1)))  {
			
			aux.setText(boton.getText());
			boton.setText("");
			botones[rengBtnVacio][filaBtnVacio].setText(aux.getText());
		}
		
	}	
	
	public void pausar() {
		btnNewButton_1.setEnabled(false);
		btnNewButton_2.setEnabled(false);
		btnNewButton_4.setEnabled(false);
		btnNewButton_3.setEnabled(false);
	    btnNewButton.setEnabled(false);
	    btnNewButton_6.setEnabled(false);
	    btnNewButton_5.setEnabled(false);
	    btnNewButton_10.setEnabled(false);
	    btnNewButton_9.setEnabled(false);
	    btnNewButton_8.setEnabled(false);
	    btnNewButton_12.setEnabled(false);
	    btnNewButton_7.setEnabled(false);
	    btnNewButton_11.setEnabled(false);
	    btnNewButton_13.setEnabled(false);
	    btnNewButton_14.setEnabled(false);
	    btnNewButton_15.setEnabled(false);
	    
	 // Detener el Timer cuando se pausa el juego
	    if (tiempo != null) {
	        tiempo.cancel();
	    }
	}
	
	public void seguir() {
		btnNewButton_1.setEnabled(true);
		btnNewButton_2.setEnabled(true);
		btnNewButton_4.setEnabled(true);
		btnNewButton_3.setEnabled(true);
	    btnNewButton.setEnabled(true);
	    btnNewButton_6.setEnabled(true);
	    btnNewButton_5.setEnabled(true);
	    btnNewButton_10.setEnabled(true);
	    btnNewButton_9.setEnabled(true);
	    btnNewButton_8.setEnabled(true);
	    btnNewButton_12.setEnabled(true);
	    btnNewButton_7.setEnabled(true);
	    btnNewButton_11.setEnabled(true);
	    btnNewButton_13.setEnabled(true);
	    btnNewButton_14.setEnabled(true);
	    btnNewButton_15.setEnabled(true);
	    
	    // Crear un nuevo Timer
	    tiempo = new Timer();
	    tiempoDeJuego = new TimerTask() {
	        @Override
	        public void run() {
	            seg++;
	            lblNewLabel_1.setText(String.valueOf(seg)+"s");
	        }
	    };

	    tiempo.scheduleAtFixedRate(tiempoDeJuego, 0, 1000);
	}
	
	public void ganar() {
		int aux = 1;
	    int veces = 0;
	    for (int i = 0; i < 4; i++) {
	        for (int j = 0; j < 4; j++) {
	            if (aux < 16) {
	                if (botones[i][j].getText().equals(String.valueOf(aux))) {
	                    aux++;
	                    veces++;
	                } else {
	                    return;
	                }
	            } else {
	                if (botones[i][j].getText().equals("")) {
	                    veces++;
	                }
	            }
	        }
	    }

	    if (veces == 16) {
	        JOptionPane.showMessageDialog(null, "Ganaste", "Usted Gano el Juego",JOptionPane.INFORMATION_MESSAGE);
	        tiempo.cancel();
	    }
	}
}
