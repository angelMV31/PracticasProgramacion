package aplication;

import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import java.awt.Color;
import javax.swing.border.LineBorder;
import javax.swing.border.MatteBorder;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Rompecabezas {

	Font etiq = new Font("Time new Roman", Font.BOLD, 30);
	
	private JFrame frame;
	
    JButton btnNewButton_1,btnNewButton_2,btnNewButton_4,btnNewButton_3,
    btnNewButton,btnNewButton_6,btnNewButton_5,btnNewButton_10,
    btnNewButton_9,btnNewButton_8,btnNewButton_12,btnNewButton_7,
    btnNewButton_11,btnNewButton_13,btnNewButton_14,btnNewButton_15;

	JButton botones[][] = {{btnNewButton_1,btnNewButton_2,btnNewButton_4,btnNewButton_3},
							{btnNewButton,btnNewButton_6,btnNewButton_5,btnNewButton_10},
							{btnNewButton_9,btnNewButton_8,btnNewButton_12,btnNewButton_7},
							{btnNewButton_11,btnNewButton_13,btnNewButton_14,btnNewButton_15}};
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
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(214,178,126));
		frame.setBounds(100, 100, 697, 688);
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
		btnNewButton_1.setBackground(new Color(214,178,126));
		btnNewButton_1.setForeground(Color.white);
		btnNewButton_1.setFont(etiq);
		panel.add(btnNewButton_1);
		
		btnNewButton_2 = new JButton("2");
		btnNewButton_2.setBackground(new Color(214,178,126));
		btnNewButton_2.setForeground(Color.white);
		btnNewButton_2.setFont(etiq);
		panel.add(btnNewButton_2);
		
		btnNewButton_4 = new JButton("3");
		btnNewButton_4.setBackground(new Color(214,178,126));
		btnNewButton_4.setForeground(Color.white);
		btnNewButton_4.setFont(etiq);
		panel.add(btnNewButton_4);
		
		btnNewButton_3 = new JButton("4");
		btnNewButton_3.setBackground(new Color(214,178,126));
		btnNewButton_3.setForeground(Color.white);
		btnNewButton_3.setFont(etiq);
		panel.add(btnNewButton_3);
		
		btnNewButton = new JButton("5");
		btnNewButton.setBackground(new Color(214,178,126));
		btnNewButton.setForeground(Color.white);
		btnNewButton.setFont(etiq);
		panel.add(btnNewButton);
		
		btnNewButton_6 = new JButton("6");
		btnNewButton_6.setBackground(new Color(214,178,126));
		btnNewButton_6.setForeground(Color.white);
		btnNewButton_6.setFont(etiq);
		panel.add(btnNewButton_6);
		
		btnNewButton_5 = new JButton("7");
		btnNewButton_5.setBackground(new Color(214,178,126));
		btnNewButton_5.setForeground(Color.white);
		btnNewButton_5.setFont(etiq);
		panel.add(btnNewButton_5);
		
		btnNewButton_10 = new JButton("8");
		btnNewButton_10.setBackground(new Color(214,178,126));
		btnNewButton_10.setForeground(Color.white);
		btnNewButton_10.setFont(etiq);
		panel.add(btnNewButton_10);
		
		btnNewButton_9 = new JButton("9");
		btnNewButton_9.setBackground(new Color(214,178,126));
		btnNewButton_9.setForeground(Color.white);
		btnNewButton_9.setFont(etiq);
		panel.add(btnNewButton_9);
		
		btnNewButton_8 = new JButton("10");
		btnNewButton_8.setBackground(new Color(214,178,126));
		btnNewButton_8.setForeground(Color.white);
		btnNewButton_8.setFont(etiq);
		panel.add(btnNewButton_8);
		
		btnNewButton_12 = new JButton("11");
		btnNewButton_12.setBackground(new Color(214,178,126));
		btnNewButton_12.setForeground(Color.white);
		btnNewButton_12.setFont(etiq);
		panel.add(btnNewButton_12);
		
		btnNewButton_7 = new JButton("12");
		btnNewButton_7.setBackground(new Color(214,178,126));
		btnNewButton_7.setForeground(Color.white);
		btnNewButton_7.setFont(etiq);
		panel.add(btnNewButton_7);
		
		btnNewButton_11 = new JButton("13");
		btnNewButton_11.setBackground(new Color(214,178,126));
		btnNewButton_11.setForeground(Color.white);
		btnNewButton_11.setFont(etiq);
		panel.add(btnNewButton_11);
		
		btnNewButton_13 = new JButton("14");
		btnNewButton_13.setBackground(new Color(214,178,126));
		btnNewButton_13.setForeground(Color.white);
		btnNewButton_13.setFont(etiq);
		panel.add(btnNewButton_13);
		
		btnNewButton_14 = new JButton("15");
		btnNewButton_14.setBackground(new Color(214,178,126));
		btnNewButton_14.setForeground(Color.white);
		btnNewButton_14.setFont(etiq);
		panel.add(btnNewButton_14);
		
		btnNewButton_15 = new JButton("");
		btnNewButton_15.setBackground(new Color(214,178,126));
		btnNewButton_15.setForeground(Color.white);
		panel.add(btnNewButton_15);
		
		JLabel lblNewLabel = new JLabel("Juego de Rompecabezas");
		lblNewLabel.setBounds(38, 0, 635, 58);
		lblNewLabel.setBackground(new Color(214,178,126));
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 30));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		frame.getContentPane().add(lblNewLabel);
		
		JButton btnNewButton_16 = new JButton("Jugar nuevamente");
		btnNewButton_16.setBounds(188, 583, 317, 47);
		btnNewButton_16.setBackground(new Color(164, 90, 53));
		btnNewButton_16.setFont(new Font("Times New Roman", Font.BOLD, 25));
		btnNewButton_16.setForeground(Color.white);
		frame.getContentPane().add(btnNewButton_16);
	}
}
