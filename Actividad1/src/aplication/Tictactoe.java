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

import javax.swing.JButton;
import javax.swing.border.LineBorder;
import java.awt.Font;

public class Tictactoe {

	private JFrame frame;

	public boolean turno;
	String jugador;
	JButton boton1,boton2,boton3,boton4,boton5,boton6,boton7,boton8,boton9;
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
		frame.setBounds(100, 100, 545, 460);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel panel = new JPanel();
		panel.setBorder(new LineBorder(new Color(0, 0, 255), 10, true));
		frame.getContentPane().add(panel, BorderLayout.CENTER);
		panel.setBackground(Color.blue);
		panel.setLayout(new GridLayout(3, 3, 10, 10));
		
		boton1 = new JButton("");
		boton1.setFont(new Font("Times New Roman", Font.BOLD, 60));
		boton1.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				
				String jugador = "O";
				if(turno) {
					turno = false;
					jugador = "X";
				}
				else {
					turno = true;
					jugador = "O";
				}
				boton1.setText(jugador);
				boton1.setEnabled(false);
				validarGanador();
			}
			
		});
		panel.add(boton1);
		
		boton2 = new JButton("");
		boton2.setFont(new Font("Times New Roman", Font.BOLD, 60));
		boton2.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				
				String jugador = "O";
				if(turno) {
					turno = false;
					jugador = "X";
				}
				else {
					turno = true;
					jugador = "O";
				}
				boton2.setText(jugador);
				boton2.setEnabled(false);
				validarGanador();
			}
			
		});
		panel.add(boton2);
		
		boton3 = new JButton("");
		boton3.setFont(new Font("Times New Roman", Font.BOLD, 60));
		boton3.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				
				String jugador = "O";
				if(turno) {
					turno = false;
					jugador = "X";
				}
				else {
					turno = true;
					jugador = "O";
				}
				boton3.setText(jugador);
				boton3.setEnabled(false);
				validarGanador();
			}
			
		});
		panel.add(boton3);
		
		boton4 = new JButton("");
		boton4.setFont(new Font("Times New Roman", Font.BOLD, 60));
		boton4.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				
				String jugador = "O";
				if(turno) {
					turno = false;
					jugador = "X";
				}
				else {
					turno = true;
					jugador = "O";
				}
				boton4.setText(jugador);
				boton4.setEnabled(false);
				validarGanador();
			}
			
		});
		panel.add(boton4);
		
		boton5 = new JButton("");
		boton5.setFont(new Font("Times New Roman", Font.BOLD, 60));
		boton5.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				
				String jugador = "O";
				if(turno) {
					turno = false;
					jugador = "X";
				}
				else {
					turno = true;
					jugador = "O";
				}
				boton5.setText(jugador);
				boton5.setEnabled(false);
				validarGanador();
			}
			
		});
		panel.add(boton5);
		
		boton6 = new JButton("");
		boton6.setFont(new Font("Times New Roman", Font.BOLD, 60));
		boton6.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				
				String jugador = "O";
				if(turno) {
					turno = false;
					jugador = "X";
				}
				else {
					turno = true;
					jugador = "O";
				}
				boton6.setText(jugador);
				boton6.setEnabled(false);
				validarGanador();
			}
			
		});
		panel.add(boton6);
		
		boton7 = new JButton("");
		boton7.setFont(new Font("Times New Roman", Font.BOLD, 60));
		boton7.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				
				String jugador = "O";
				if(turno) {
					turno = false;
					jugador = "X";
				}
				else {
					turno = true;
					jugador = "O";
				}
				boton7.setText(jugador);
				boton7.setEnabled(false);
				validarGanador();
			}
			
		});
		panel.add(boton7);
		
		boton8 = new JButton("");
		boton8.setFont(new Font("Times New Roman", Font.BOLD, 60));
		boton8.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				
				String jugador = "O";
				if(turno) {
					turno = false;
					jugador = "X";
				}
				else {
					turno = true;
					jugador = "O";
				}
				boton8.setText(jugador);
				boton8.setEnabled(false);
				validarGanador();
			}
			
		});
		panel.add(boton8);
		
		boton9 = new JButton("");
		boton9.setFont(new Font("Times New Roman", Font.BOLD, 60));
		boton9.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				
				jugador = "O";
				if(turno) {
					turno = false;
					jugador = "X";
				}
				else {
					turno = true;
					jugador = "O";
				}
				boton9.setText(jugador);
				boton9.setEnabled(false);
				validarGanador();
			}
			
		});
		panel.add(boton9);
	}
	
	public void validarGanador() {
	if(!boton1.getText().equals("") && boton1.getText().equals(boton2.getText()) &
			   !boton2.getText().equals("") && boton2.getText().equals(boton3.getText())){
				if(jugador.equals("X")) {
					String message = "El Jugador X ganó. :D"; 
					JOptionPane.showMessageDialog(null, message, "Ganador", JOptionPane.INFORMATION_MESSAGE); //ventana emergente
				}else{
					String message = "El Jugador O ganó. :D"; 
					JOptionPane.showMessageDialog(null, message, "Ganador", JOptionPane.INFORMATION_MESSAGE); //ventana emergente
				}
				boton1.setEnabled(false);boton2.setEnabled(false);boton3.setEnabled(false);
				boton4.setEnabled(false);boton5.setEnabled(false);boton6.setEnabled(false);
				boton7.setEnabled(false);boton8.setEnabled(false);boton9.setEnabled(false);
			}

	}
}
