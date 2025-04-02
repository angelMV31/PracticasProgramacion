package aplication;

import java.awt.EventQueue;
import java.awt.Graphics;
import java.awt.Graphics2D;

import javax.swing.JFrame;

import java.awt.BasicStroke;
import java.awt.BorderLayout;
import javax.swing.JPanel;
import javax.swing.border.LineBorder;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

import java.awt.Color;
import java.awt.GridLayout;
import java.awt.Point;

import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JSlider;
import javax.swing.SwingConstants;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.awt.event.ActionEvent;

public class Paint implements MouseListener, MouseMotionListener {

	private JFrame frame;
	
	private PaintPanel panel;
	
	int tool = 1;
	
	Color color = Color.black;
	
	private ArrayList<Point> puntos = new ArrayList<Point>();
	
	int grosorSlider;
 	
 	List<List<Point>> listaDePuntos = new ArrayList<>(); 
 	
 	ArrayList<pointCuztom> puntos2 = new ArrayList<pointCuztom>();
	List<List<pointCuztom>> listaDePuntos2 = new ArrayList<>();
 	int puntoX, puntoY;
 	
 	ArrayList<figura> figuras = new ArrayList<figura>();
	
 	int tipoFig;
 	Graphics2D g2;
 	Point puntoInicio;
 	Point puntoFinal;
 	boolean segundoClick = false;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Paint window = new Paint();
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
	public Paint() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(0, 0, 255));
		frame.setBackground(new Color(0, 0, 255));
		frame.setBounds(100, 100, 1005, 750);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		panel = new PaintPanel();
		panel.setBorder(new LineBorder(new Color(0, 0, 0), 10));
		panel.setBounds(30, 199, 934, 504);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new LineBorder(new Color(0, 0, 0), 10));
		panel_1.setBounds(30, 10, 934, 179);
		frame.getContentPane().add(panel_1);
		panel_1.setLayout(new GridLayout(0, 3, 0, 0));
		
		JPanel panel_2 = new JPanel();
		panel_1.add(panel_2);
		panel_2.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Tools");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(131, 10, 45, 13);
		panel_2.add(lblNewLabel);
		
		JButton Pincel = new JButton();
		Pincel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tool = 1;
			}
		});
		Pincel.setBackground(new Color(255, 255, 255));
		Pincel.setIcon(new ImageIcon(Paint.class.getResource("/aplication/pincel.jpg")));
		Pincel.setBounds(28, 37, 50, 50);
		panel_2.add(Pincel);
		
		JButton Borrador = new JButton();
		Borrador.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				color = Color.white;
			}
		});
		Borrador.setBackground(new Color(255, 255, 255));
		Borrador.setIcon(new ImageIcon(Paint.class.getResource("/aplication/borra.png")));
		Borrador.setBounds(88, 37, 50, 50);
		panel_2.add(Borrador);
		
		JButton Regresar = new JButton();
		Regresar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		Regresar.setBackground(new Color(255, 255, 255));
		Regresar.setIcon(new ImageIcon(Paint.class.getResource("/aplication/reg.jpg")));
		Regresar.setBounds(165, 37, 50, 50);
		panel_2.add(Regresar);
		
		JButton LimpiaPantalla = new JButton();
		LimpiaPantalla.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				listaDePuntos.clear();
				//figuras.clear();
		        puntos.clear();
		        panel.repaint();
			}
		});
		LimpiaPantalla.setBackground(new Color(255, 255, 255));
		LimpiaPantalla.setIcon(new ImageIcon(Paint.class.getResource("/aplication/limpia.jpg")));
		LimpiaPantalla.setBounds(225, 37, 50, 50);
		panel_2.add(LimpiaPantalla);
		
		JSlider Grosor = new JSlider();
		Grosor.setValue(1);
		Grosor.setMaximum(20);
		Grosor.setBounds(52, 107, 200, 26);
		// ChangeListener sirve para actualizar el valor del grosor
		Grosor.addChangeListener(new ChangeListener() {
            @Override
            public void stateChanged(ChangeEvent e) {
                grosorSlider = Grosor.getValue();
                
            }
        });
		panel_2.add(Grosor);
		
		JPanel panel_3 = new JPanel();
		panel_1.add(panel_3);
		panel_3.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel();
		lblNewLabel_1.setText("Figures");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setBounds(134, 10, 45, 13);
		panel_3.add(lblNewLabel_1);
		
		JButton Rectangulo = new JButton();
		Rectangulo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		Rectangulo.setBackground(new Color(255, 255, 255));
		Rectangulo.setIcon(new ImageIcon(Paint.class.getResource("/aplication/rect.png")));
		Rectangulo.setBounds(58, 40, 50, 50);
		panel_3.add(Rectangulo);
		
		JButton Cuadrado = new JButton();
		Cuadrado.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tool = 2;
			}
		});
		Cuadrado.setBackground(new Color(255, 255, 255));
		Cuadrado.setIcon(new ImageIcon(Paint.class.getResource("/aplication/cuadrado.jpg")));
		Cuadrado.setBounds(209, 40, 50, 50);
		panel_3.add(Cuadrado);
		
		JButton Circulo = new JButton();
		Circulo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tool = 3;
			}
		});
		Circulo.setBackground(new Color(255, 255, 255));
		Circulo.setIcon(new ImageIcon(Paint.class.getResource("/aplication/circulo.png")));
		Circulo.setBounds(58, 100, 50, 50);
		panel_3.add(Circulo);
		
		JButton Linea = new JButton();
		Linea.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tool = 4;
			}
		});
		Linea.setBackground(new Color(255, 255, 255));
		Linea.setIcon(new ImageIcon(Paint.class.getResource("/aplication/linea.png")));
		Linea.setBounds(209, 100, 50, 50);
		panel_3.add(Linea);
		
		JButton Flecha = new JButton();
		Flecha.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		Flecha.setBackground(new Color(255, 255, 255));
		Flecha.setIcon(new ImageIcon(Paint.class.getResource("/aplication/flecha.png")));
		Flecha.setBounds(134, 100, 50, 50);
		panel_3.add(Flecha);
		
		JButton Triangulo = new JButton();
		Triangulo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		Triangulo.setBackground(new Color(255, 255, 255));
		Triangulo.setIcon(new ImageIcon(Paint.class.getResource("/aplication/triangulo.png")));
		Triangulo.setBounds(134, 40, 50, 50);
		panel_3.add(Triangulo);
		
		JPanel panel_4 = new JPanel();
		panel_1.add(panel_4);
		panel_4.setLayout(null);
		
		JLabel lblNewLabel_2 = new JLabel("Colors");
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2.setBounds(140, 10, 45, 13);
		panel_4.add(lblNewLabel_2);
		
		JButton ColorNegro = new JButton();
		ColorNegro.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				color = new Color(0, 0, 0);
			}
		});
		ColorNegro.setBackground(new Color(0, 0, 0));
		ColorNegro.setBounds(42, 42, 50, 50);
		panel_4.add(ColorNegro);
		
		JButton ColorRojo = new JButton();
		ColorRojo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				color = new Color(255, 0, 0);
			}
		});
		ColorRojo.setBackground(new Color(255, 0, 0));
		ColorRojo.setBounds(102, 42, 50, 50);
		panel_4.add(ColorRojo);
		
		JButton ColorAzul = new JButton();
		ColorAzul.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				color = new Color(0, 0, 255);
			}
		});
		ColorAzul.setBackground(new Color(0, 0, 255));
		ColorAzul.setBounds(164, 42, 50, 50);
		panel_4.add(ColorAzul);
		
		JButton ColorRosa = new JButton();
		ColorRosa.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				color = new Color(255, 128, 255);
			}
		});
		ColorRosa.setBackground(new Color(255, 128, 255));
		ColorRosa.setBounds(224, 42, 50, 50);
		panel_4.add(ColorRosa);
		
		JButton ColorAmarillo = new JButton();
		ColorAmarillo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				color = new Color(255, 255, 0);
			}
		});
		ColorAmarillo.setBackground(new Color(255, 255, 0));
		ColorAmarillo.setBounds(102, 99, 50, 50);
		panel_4.add(ColorAmarillo);
		
		JButton ColorVerde = new JButton();
		ColorVerde.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				color = new Color(0, 255, 0);
			}
		});
		ColorVerde.setBackground(new Color(0, 255, 0));
		ColorVerde.setBounds(42, 99, 50, 50);
		panel_4.add(ColorVerde);
		
		JButton ColorNaranja = new JButton();
		ColorNaranja.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				color = new Color(255, 128, 0);
			}
		});
		ColorNaranja.setBackground(new Color(255, 128, 0));
		ColorNaranja.setBounds(164, 99, 50, 50);
		panel_4.add(ColorNaranja);
		
		JButton ColorBlanco = new JButton();
		ColorBlanco.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				color = new Color(255, 255, 255);
			}
		});
		ColorBlanco.setBackground(new Color(255, 255, 255));
		ColorBlanco.setBounds(224, 99, 50, 50);
		panel_4.add(ColorBlanco);
		
		panel.addMouseListener(this);
 		panel.addMouseMotionListener(this);
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
			if(tool == 2) {
				tipoFig=2;
				figuras.add(new figura(e.getX(), e.getY(), 50, 50, color, tipoFig, grosorSlider));
				panel.repaint();
			}
			else if(tool == 3) {
				tipoFig=3;
				figuras.add(new figura(e.getX(), e.getY(), 50, 50, color, tipoFig, grosorSlider));
				panel.repaint();
			}
			else if(tool == 4) {
				
				tipoFig=4;
				
				if (!segundoClick) {
		            puntoInicio = e.getPoint();
		            segundoClick = true;
		        }
				else {
					
		            puntoFinal = e.getPoint();
		            
		            figuras.add(new figura(puntoInicio.x, puntoInicio.y, puntoFinal.x, puntoFinal.y, color, tipoFig, grosorSlider));
		            panel.repaint();
		            
		            segundoClick = false;
		        }
				/*
				figuras.add(new figura(e.getX(), e.getY(), e2.getX(), e2.getY(), color, tipoFig, grosorSlider));
				panel.repaint();*/
			}
	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		//crear una copia de los puntos
		//ArrayList<pointCuztom> ArrList2  = (ArrayList<pointCuztom>)listaDePuntos2.clone();
		ArrayList<pointCuztom> ArrList2 = new ArrayList<>(puntos2);
		listaDePuntos2.add(ArrList2);
		
 		//se guarda en el historial de dibujos
 		listaDePuntos2.add(ArrList2);
 		
 		//limpiamos el trazo actual
 		puntos2.clear();
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		System.out.println("Hola");
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		System.out.println("Adios");
	}

	@Override
	public void mouseDragged(MouseEvent e) {
		// TODO Auto-generated method stub
		/*panel.repaint();
 		
 		puntos.add(e.getPoint());
 		*/
		if(tool == 1) {
			puntoX = e.getX();
			puntoY = e.getY();
			puntos2.add(new pointCuztom(puntoX, puntoY, color, grosorSlider));
			panel.repaint(); 
		}
		
	}

	@Override
	public void mouseMoved(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	
	@SuppressWarnings("serial")
	class PaintPanel extends JPanel{
		
 		public PaintPanel()
 		{
 			this.setBackground(Color.white);
 		}
 		
 		@Override
 	   public void paintComponent(Graphics g) {
 	       super.paintComponent(g);
 	      
 	       g2 = (Graphics2D) g; 
 	       
 	       //cambiar el color depende el color que se selecciona
 	       //g2.setColor(color);
 	       
 	       //cambia el grosor segun se seleccione en el slider
 	      // g2.setStroke(new BasicStroke(grosorSlider)); 
 		   
 	       //dibujar la trayectoria de puntos 
 	       //solo cuando tengo más de 2 puntos
 	       if(puntos2.size()>1) {
 	    	   
 	    	   for (int i = 1; i < puntos2.size(); i++) {
 	    		   
 	    		   /*Point p1 = puntos.get(i-1);
 	    		   Point p2 = puntos.get(i);
 	    		   
 	    		   g2.drawLine(p1.x,p1.y,p2.x,p2.y);*/
 	    		   pointCuztom p1 = puntos2.get(i-1);
 	    		   pointCuztom p2 = puntos2.get(i);
 	    		   
 	    		   p1.nuevoTrazo(p1.getX(), p1.getY(), p2.getX(), p2.getY(), g2);
 	    	   }
 	    	   
 	       }
 	       
 	       for (@SuppressWarnings("rawtypes")
 	       	Iterator iterator = listaDePuntos2.iterator(); iterator.hasNext();) {
 			@SuppressWarnings("unchecked")
			List<pointCuztom> trazo = (List<pointCuztom>) iterator.next();
 			
 			
 				if(trazo.size()>1) {
 		    	   
 		    	   for (int i = 1; i < trazo.size(); i++) {
 		    		   
 		    		   /*Point p1 = trazo.get(i-1);
 		    		   Point p2 = trazo.get(i);
 		    		   
 		    		   g2.drawLine(p1.x,p1.y,p2.x,p2.y);*/
 		    		   pointCuztom p1 = trazo.get(i-1);
 	 	    		   pointCuztom p2 = trazo.get(i);
 	 	    		   
 	 	    		   p1.nuevoTrazo(p1.getX(), p1.getY(), p2.getX(), p2.getY(), g2);
 		    	   }
 		    	   
 		       }
 			
 	       }
 	       
 	      for (figura f : figuras) {
 	    	 
 	    	  g.setColor(f.color);
 	    	  ((Graphics2D) g).setStroke(new BasicStroke(f.grosor));
 	    	  
 	    	  switch(f.tipo) {
 	    	  
 	    	  case 2:
 	    		 g.drawRect(f.x, f.y, f.ancho, f.alto);
 	    		 break;
 	    		 
 	    	  case 3:
 	    		 g.drawOval(f.x, f.y, f.ancho, f.alto);
 	    		 break;
 	    		 
 	    	  case 4:
 	    		  g.drawLine(f.x, f.y, f.ancho, f.alto);
 	    	  }
 	      }
 	       
 	   }
 				
 	}
	
	class pointCuztom{
		
		public int y;
		public int x;
		private Color color;
		private int grosor;
		
		public pointCuztom(int x, int y, Color color, int grosor) {
			this.x = x;
			this.y = y;
			this.color = color;
			this.grosor = grosor;
		}

		public int getY() {
			return y;
		}
		
		public void setY(int y) {
			this.y = y;
		}

		public int getX() {
			return x;
		}

		public void setX(int x) {
			this.x = x;
		}

		public Color getColor() {
			return this.color;
		}

		public void setColor(Color color) {
			this.color = color;
		}

		public int getGrosor() {
			return grosor;
		}

		public void setGrosor(int grosor) {
			this.grosor = grosor;
		}

		public void nuevoTrazo(int p1X, int p1Y, int p2X, int p2Y, Graphics2D g2) {
			g2.setColor(color);
			g2.setStroke(new BasicStroke(grosor));
			g2.drawLine(p1X, p1Y, p2X,p2Y);
		}
		
	}
	
	class figura{
		
		public int x, y, ancho, alto, tipo,grosor;
		Color color;
		
		public figura(int x, int y, int ancho, int alto, Color color, int tipo, int grosor) {
		
			this.x=x;
			this.y=y;
			this.ancho=ancho;
			this.alto=alto;
			this.color=color;
			this.tipo=tipo;
			this.grosor = grosor;
			 	   
    	   for (int i = 1; i < figuras.size(); i++) {
    		   
    		   figura p1 = figuras.get(i-1);
    		   
    		   g2.setColor(color);
    		   g2.setStroke(new BasicStroke(grosor));
    		  /* g2.drawRect(p1.x, p1.y, 50, 50);
    		   g2.drawOval(p1.x, p1.y, 50, 50);
    		   g2.drawLine(p1.x, p1.y, 50, 50);*/
    		  switch(tipo) {
 	    	  case 2:
 	    		 g2.drawRect(p1.x, p1.y, 50, 50);
 	    		 break;
 	    		 
 	    	  case 3:
 	    		 g2.drawOval(p1.x, p1.y, 50, 50);
 	    		 break;
 	    		 
 	    	  case 4:
 	    		  g2.drawLine(p1.x, p1.y, ancho, alto);
 	    		 break;
    	      }
    		  
    	  }	 	       
	 	       
		}	
		
	}
	
}
