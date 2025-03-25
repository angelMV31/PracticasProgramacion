package aplication;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.border.LineBorder;
import java.awt.Font;
import javax.swing.JLabel;

public class Tictactoe {

	private JFrame frame;

	public boolean turno;
	String jugador;
	JButton boton1,boton2,boton3,boton4,boton5,boton6,boton7,boton8,boton9;
	int contadorX = 0;
	int contadorO = 0;
	private JButton btnNewButton;
	private JPanel panel_1;
	private JLabel lblNewLabel_2;
	private JLabel lblNewLabel_3;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Tictactoe window = new Tictactoe();
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
	public Tictactoe() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 546, 582);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		btnNewButton = new JButton("Jugar de Nuevo");
		btnNewButton.setBounds(0, 512, 532, 33);
		btnNewButton.setBackground(new Color(0, 255, 64));
		btnNewButton.setFont(new Font("Times New Roman", Font.BOLD, 20));
		btnNewButton.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				boton1.setEnabled(true);
				boton2.setEnabled(true);
				boton3.setEnabled(true);
				boton4.setEnabled(true);
				boton5.setEnabled(true);
				boton6.setEnabled(true);
				boton7.setEnabled(true);
				boton8.setEnabled(true);
				boton9.setEnabled(true);
				
				boton1.setText("");
				boton2.setText("");
				boton3.setText("");
				boton4.setText("");
				boton5.setText("");
				boton6.setText("");
				boton7.setText("");
				boton8.setText("");
				boton9.setText("");
				
				boton1.setIcon(null);
				boton2.setIcon(null);
				boton3.setIcon(null);
				boton4.setIcon(null);
				boton5.setIcon(null);
				boton6.setIcon(null);
				boton7.setIcon(null);
				boton8.setIcon(null);
				boton9.setIcon(null);
				
				boton1.setBackground(Color.white);
				boton2.setBackground(Color.white);
				boton3.setBackground(Color.white);
				boton4.setBackground(Color.white);
				boton5.setBackground(Color.white);
				boton6.setBackground(Color.white);
				boton7.setBackground(Color.white);
				boton8.setBackground(Color.white);
				boton9.setBackground(Color.white);
			}
			
		});
		frame.getContentPane().setLayout(null);
		frame.getContentPane().add(btnNewButton);
		
		panel_1 = new JPanel();
		panel_1.setBounds(0, 0, 532, 25);
		frame.getContentPane().add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Ganadas del jugador X: ");
		lblNewLabel.setBounds(0, 0, 140, 30);
		panel_1.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Ganadas del jugador 0: ");
		lblNewLabel_1.setBounds(291, 0, 140, 30);
		panel_1.add(lblNewLabel_1);
		
		lblNewLabel_2 = new JLabel(""+contadorO);
		lblNewLabel_2.setBounds(441, 0, 45, 30);
		panel_1.add(lblNewLabel_2);
		
		lblNewLabel_3 = new JLabel(""+contadorX);
		lblNewLabel_3.setBounds(150, 0, 45, 30);
		panel_1.add(lblNewLabel_3);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 24, 532, 488);
		panel.setBorder(new LineBorder(new Color(0, 0, 255), 10, true));
		frame.getContentPane().add(panel);
		panel.setBackground(Color.blue);
		
		boton1 = new JButton("");
		boton1.setFont(new Font("Times New Roman", Font.BOLD, 40));
		boton1.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				
				String jugador = "O";
				if(turno) {
					turno = false;
					jugador = "X";
					ImageIcon variableImg= new ImageIcon(getClass().getResource("X.jpg"));
					boton1.setIcon(variableImg);
					boton1.setDisabledIcon(new ImageIcon(Tictactoe.class.getResource("/aplication/X.jpg")));
					boton1.setBackground(Color.red);
					
				}
				else {
					turno = true;
					jugador = "O";
					ImageIcon variableImg= new ImageIcon(getClass().getResource("0.png"));
					boton1.setIcon(variableImg);
					boton1.setDisabledIcon(new ImageIcon(Tictactoe.class.getResource("/aplication/0.png")));
					boton1.setBackground(Color.cyan);
				}
				boton1.setText(jugador);
				boton1.setEnabled(false);
				
				
				validarGanador();
			}
			
		});
		panel.setLayout(new GridLayout(3, 3, 10, 10));
		panel.add(boton1);
		
		boton2 = new JButton("");
		boton2.setFont(new Font("Times New Roman", Font.BOLD, 40));
		boton2.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				
				String jugador = "O";
				if(turno) {
					turno = false;
					jugador = "X";
					ImageIcon variableImg= new ImageIcon(getClass().getResource("X.jpg"));
					boton2.setIcon(variableImg);
					boton2.setDisabledIcon(new ImageIcon(Tictactoe.class.getResource("/aplication/X.jpg")));
					boton2.setBackground(Color.red);
					
				}
				else {
					turno = true;
					jugador = "O";
					ImageIcon variableImg= new ImageIcon(getClass().getResource("0.png"));
					boton2.setIcon(variableImg);
					boton2.setDisabledIcon(new ImageIcon(Tictactoe.class.getResource("/aplication/0.png")));
					boton2.setBackground(Color.cyan);
				}
				boton2.setText(jugador);
				boton2.setEnabled(false);
				validarGanador();
			}
			
		});
		panel.add(boton2);
		
		boton3 = new JButton("");
		boton3.setFont(new Font("Times New Roman", Font.BOLD, 40));
		boton3.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				
				String jugador = "O";
				if(turno) {
					turno = false;
					jugador = "X";
					ImageIcon variableImg= new ImageIcon(getClass().getResource("X.jpg"));
					boton3.setIcon(variableImg);
					boton3.setDisabledIcon(new ImageIcon(Tictactoe.class.getResource("/aplication/X.jpg")));
					boton3.setBackground(Color.red);
					
				}
				else {
					turno = true;
					jugador = "O";
					ImageIcon variableImg= new ImageIcon(getClass().getResource("0.png"));
					boton3.setIcon(variableImg);
					boton3.setDisabledIcon(new ImageIcon(Tictactoe.class.getResource("/aplication/0.png")));
					boton3.setBackground(Color.cyan);
				}
				boton3.setText(jugador);
				boton3.setEnabled(false);
				validarGanador();
			}
			
		});
		panel.add(boton3);
		
		boton4 = new JButton("");
		boton4.setFont(new Font("Times New Roman", Font.BOLD, 40));
		boton4.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				
				String jugador = "O";
				if(turno) {
					turno = false;
					jugador = "X";
					ImageIcon variableImg= new ImageIcon(getClass().getResource("X.jpg"));
					boton4.setIcon(variableImg);
					boton4.setDisabledIcon(new ImageIcon(Tictactoe.class.getResource("/aplication/X.jpg")));
					boton4.setBackground(Color.red);
					
				}
				else {
					turno = true;
					jugador = "O";
					ImageIcon variableImg= new ImageIcon(getClass().getResource("0.png"));
					boton4.setIcon(variableImg);
					boton4.setDisabledIcon(new ImageIcon(Tictactoe.class.getResource("/aplication/0.png")));
					boton4.setBackground(Color.cyan);
				}
				boton4.setText(jugador);
				boton4.setEnabled(false);
				validarGanador();
			}
			
		});
		panel.add(boton4);
		
		boton5 = new JButton("");
		boton5.setFont(new Font("Times New Roman", Font.BOLD, 40));
		boton5.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				
				String jugador = "O";
				if(turno) {
					turno = false;
					jugador = "X";
					ImageIcon variableImg= new ImageIcon(getClass().getResource("X.jpg"));
					boton5.setIcon(variableImg);
					boton5.setDisabledIcon(new ImageIcon(Tictactoe.class.getResource("/aplication/X.jpg")));
					boton5.setBackground(Color.red);
					
				}
				else {
					turno = true;
					jugador = "O";
					ImageIcon variableImg= new ImageIcon(getClass().getResource("0.png"));
					boton5.setIcon(variableImg);
					boton5.setDisabledIcon(new ImageIcon(Tictactoe.class.getResource("/aplication/0.png")));
					boton5.setBackground(Color.cyan);
				}
				boton5.setText(jugador);
				boton5.setEnabled(false);
				validarGanador();
			}
			
		});
		panel.add(boton5);
		
		boton6 = new JButton("");
		boton6.setFont(new Font("Times New Roman", Font.BOLD, 40));
		boton6.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				
				String jugador = "O";
				if(turno) {
					turno = false;
					jugador = "X";
					ImageIcon variableImg= new ImageIcon(getClass().getResource("X.jpg"));
					boton6.setIcon(variableImg);
					boton6.setDisabledIcon(new ImageIcon(Tictactoe.class.getResource("/aplication/X.jpg")));
					boton6.setBackground(Color.red);
					
				}
				else {
					turno = true;
					jugador = "O";
					ImageIcon variableImg= new ImageIcon(getClass().getResource("0.png"));
					boton6.setIcon(variableImg);
					boton6.setDisabledIcon(new ImageIcon(Tictactoe.class.getResource("/aplication/0.png")));
					boton6.setBackground(Color.cyan);
				}
				boton6.setText(jugador);
				boton6.setEnabled(false);
				validarGanador();
			}
			
		});
		panel.add(boton6);
		
		boton7 = new JButton("");
		boton7.setFont(new Font("Times New Roman", Font.BOLD, 40));
		boton7.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				
				String jugador = "O";
				if(turno) {
					turno = false;
					jugador = "X";
					ImageIcon variableImg= new ImageIcon(getClass().getResource("X.jpg"));
					boton7.setIcon(variableImg);
					boton7.setDisabledIcon(new ImageIcon(Tictactoe.class.getResource("/aplication/X.jpg")));
					boton7.setBackground(Color.red);
					
				}
				else {
					turno = true;
					jugador = "O";
					ImageIcon variableImg= new ImageIcon(getClass().getResource("0.png"));
					boton7.setIcon(variableImg);
					boton7.setDisabledIcon(new ImageIcon(Tictactoe.class.getResource("/aplication/0.png")));
					boton7.setBackground(Color.cyan);
				}
				boton7.setText(jugador);
				boton7.setEnabled(false);
				validarGanador();
			}
			
		});
		panel.add(boton7);
		
		boton8 = new JButton("");
		boton8.setFont(new Font("Times New Roman", Font.BOLD, 40));
		boton8.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				
				String jugador = "O";
				if(turno) {
					turno = false;
					jugador = "X";
					ImageIcon variableImg= new ImageIcon(getClass().getResource("X.jpg"));
					boton8.setIcon(variableImg);
					boton8.setDisabledIcon(new ImageIcon(Tictactoe.class.getResource("/aplication/X.jpg")));
					boton8.setBackground(Color.red);
				
				}
				else {
					turno = true;
					jugador = "O";
					ImageIcon variableImg= new ImageIcon(getClass().getResource("0.png"));
					boton8.setIcon(variableImg);
					boton8.setDisabledIcon(new ImageIcon(Tictactoe.class.getResource("/aplication/0.png")));
					boton8.setBackground(Color.cyan);
				}
				boton8.setText(jugador);
				boton8.setEnabled(false);
				validarGanador();
			}
			
		});
		panel.add(boton8);
		
		boton9 = new JButton("");
		boton9.setFont(new Font("Times New Roman", Font.BOLD, 40));
		boton9.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				
				jugador = "O";
				if(turno) {
					turno = false;
					jugador = "X";
					ImageIcon variableImg= new ImageIcon(getClass().getResource("X.jpg"));
					boton9.setIcon(variableImg);
					boton9.setDisabledIcon(new ImageIcon(Tictactoe.class.getResource("/aplication/X.jpg")));
					boton9.setBackground(Color.red);
					
				}
				else {
					turno = true;
					jugador = "O";
					ImageIcon variableImg= new ImageIcon(getClass().getResource("0.png"));
					boton9.setIcon(variableImg);
					boton9.setDisabledIcon(new ImageIcon(Tictactoe.class.getResource("/aplication/0.png")));
					boton9.setBackground(Color.cyan);
				}
				boton9.setText(jugador);
				boton9.setEnabled(false);
				validarGanador();
			}
			
		});
		panel.add(boton9);
	}
	
	public void validarGanador() {
	    if(!boton1.getText().equals("") && 
	       boton1.getText().equals(boton2.getText()) && 
	       boton2.getText().equals(boton3.getText())) {
	        
	        String message = "El Jugador " + boton1.getText() + " ganó";
	        JOptionPane.showMessageDialog(null, message, "Ganador", JOptionPane.INFORMATION_MESSAGE);
	        if(boton1.getText().equals("X")) {
	        	contadorX++;
	        	lblNewLabel_3.setText(""+contadorX);
	        	System.out.print(contadorX);
	        }
        else {
        	contadorO++;
        	lblNewLabel_2.setText(""+contadorO);
        	System.out.print(contadorO);
        }
	        desabilitaBotones();
	    }
	    else if(!boton4.getText().equals("") && 
 	       boton4.getText().equals(boton5.getText()) && 
	       boton5.getText().equals(boton6.getText())) {
	    	
	    	String message = "El Jugador " + boton4.getText() + " ganó";
	        JOptionPane.showMessageDialog(null, message, "Ganador", JOptionPane.INFORMATION_MESSAGE);
	        if(boton4.getText().equals("X")) {
	        	contadorX++;
	        	lblNewLabel_3.setText(""+contadorX);
	        	System.out.print(contadorX);
	        }
        else {
        	contadorO++;
        	lblNewLabel_2.setText(""+contadorO);
        	System.out.print(contadorO);
        }
	        desabilitaBotones();
	    }
	    else if(!boton7.getText().equals("") && 
	  	       boton7.getText().equals(boton8.getText()) && 
	 	       boton8.getText().equals(boton9.getText())) {
	 	    	
	 	    	String message = "El Jugador " + boton7.getText() + " ganó";
	 	        JOptionPane.showMessageDialog(null, message, "Ganador", JOptionPane.INFORMATION_MESSAGE);
	 	       if(boton7.getText().equals("X")) {
		        	contadorX++;
		        	lblNewLabel_3.setText(""+contadorX);
		        	System.out.print(contadorX);
		        }
	        else {
	        	contadorO++;
	        	lblNewLabel_2.setText(""+contadorO);
	        	System.out.print(contadorO);
	        }
	 	        desabilitaBotones();
	 	 }
	    else if(!boton1.getText().equals("") && 
		  	       boton1.getText().equals(boton4.getText()) && 
		 	       boton4.getText().equals(boton7.getText())) {
		 	    	
		 	    	String message = "El Jugador " + boton1.getText() + " ganó";
		 	        JOptionPane.showMessageDialog(null, message, "Ganador", JOptionPane.INFORMATION_MESSAGE);
		 	       if(boton1.getText().equals("X")) {
			        	contadorX++;
			        	lblNewLabel_3.setText(""+contadorX);
			        	System.out.print(contadorX);
			        }
		        else {
		        	contadorO++;
		        	lblNewLabel_2.setText(""+contadorO);
		        	System.out.print(contadorO);
		        }
		 	        desabilitaBotones();
		 }
	    else if(!boton2.getText().equals("") && 
		  	       boton2.getText().equals(boton5.getText()) && 
		 	       boton5.getText().equals(boton8.getText())) {
		 	    	
		 	    	String message = "El Jugador " + boton2.getText() + " ganó";
		 	        JOptionPane.showMessageDialog(null, message, "Ganador", JOptionPane.INFORMATION_MESSAGE);
		 	       if(boton2.getText().equals("X")) {
			        	contadorX++;
			        	lblNewLabel_3.setText(""+contadorX);
			        	System.out.print(contadorX);
			        }
		 	       else {
		        	contadorO++;
		        	lblNewLabel_2.setText(""+contadorO);
		        	System.out.print(contadorO);
		        }
		 	        desabilitaBotones();
		 }
	    else if(!boton3.getText().equals("") && 
		  	       boton3.getText().equals(boton6.getText()) && 
		 	       boton6.getText().equals(boton9.getText())) {
		 	    	
		 	    	String message = "El Jugador " + boton3.getText() + " ganó";
		 	        JOptionPane.showMessageDialog(null, message, "Ganador", JOptionPane.INFORMATION_MESSAGE);
		 	       if(boton3.getText().equals("X")) {
			        	contadorX++;
			        	lblNewLabel_3.setText(""+contadorX);
			        	System.out.print(contadorX);
			        }
		 	       else {
		        	contadorO++;
		        	lblNewLabel_2.setText(""+contadorO);
		        	System.out.print(contadorO);
		        }
		 	        desabilitaBotones();
		 }
	    else if(!boton1.getText().equals("") && 
		  	       boton1.getText().equals(boton5.getText()) && 
		 	       boton5.getText().equals(boton9.getText())) {
		 	    	
		 	    	String message = "El Jugador " + boton1.getText() + " ganó";
		 	        JOptionPane.showMessageDialog(null, message, "Ganador", JOptionPane.INFORMATION_MESSAGE);
		 	       if(boton1.getText().equals("X")) {
			        	contadorX++;
			        	lblNewLabel_3.setText(""+contadorX);
			        	System.out.print(contadorX);
			        }
		 	       else {
		        	contadorO++;
		        	lblNewLabel_2.setText(""+contadorO);
		        	System.out.print(contadorO);
		        }
		 	        desabilitaBotones();
		 }
	    else if(!boton3.getText().equals("") && 
		  	       boton3.getText().equals(boton5.getText()) && 
		 	       boton5.getText().equals(boton7.getText())) {
		 	    	
		 	    	String message = "El Jugador " + boton3.getText() + " ganó";
		 	        JOptionPane.showMessageDialog(null, message, "Ganador", JOptionPane.INFORMATION_MESSAGE);
		 	       if(boton3.getText().equals("X")) {
			        	contadorX++;
			        	lblNewLabel_3.setText(""+contadorX);
			        	System.out.print(contadorX);
			        }
		        else {
		        	contadorO++;
		        	lblNewLabel_2.setText(""+contadorO);
		        	System.out.print(contadorO);
		        }
		 	        desabilitaBotones();
		 }
	    else if(!boton1.getText().equals("") && 
		  	       !boton2.getText().equals("") && 
		 	       !boton3.getText().equals("") &&
		 	       !boton4.getText().equals("") && 
		 	       !boton5.getText().equals("") && 
		  	       !boton6.getText().equals("") && 
		 	       !boton7.getText().equals("") &&
		 	       !boton8.getText().equals("") && 
		 	       !boton9.getText().equals("")) {
	    	JOptionPane.showMessageDialog(null, "Hubo empate", "Ganador", JOptionPane.INFORMATION_MESSAGE);
	    	
	    }
	}
	
	public void desabilitaBotones() {
		boton1.setEnabled(false);
		boton2.setEnabled(false);
		boton3.setEnabled(false);
		boton4.setEnabled(false);
		boton5.setEnabled(false);
		boton6.setEnabled(false);
		boton7.setEnabled(false);
		boton8.setEnabled(false);
		boton9.setEnabled(false);
	}
	
}
