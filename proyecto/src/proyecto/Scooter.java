package proyecto;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JMenu;
import javax.swing.JScrollBar;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JSeparator;
import javax.swing.JTextPane;

public class Scooter extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Scooter frame = new Scooter();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Scooter() {
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 817, 575);
		
		
		//menu para ir a las diferentes zonas de la aplicacion
				JMenuBar menuBar = new JMenuBar();
				menuBar.setBackground(new Color(224, 255, 255));
				setJMenuBar(menuBar);
				
				
				
				//zona de coches con diferentes opciones
				JMenu Menu_Coches = new JMenu("Coches");
				Menu_Coches.setForeground(Color.GRAY);
				Menu_Coches.setFont(new Font("Segoe UI", Font.PLAIN, 15));
				menuBar.add(Menu_Coches);
				
				JMenuItem MenuItem_Berlina = new JMenuItem("Berlina");
				MenuItem_Berlina.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						Berlina berlina = new Berlina();
						berlina.setVisible(true);
						dispose();
					}
				});
				Menu_Coches.add(MenuItem_Berlina);
				
				JMenuItem MenuItem_Familiar = new JMenuItem("Familiar");
				MenuItem_Familiar.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						Familiar familiar = new Familiar();
						familiar.setVisible(true);
						dispose();
					}
				});
				Menu_Coches.add(MenuItem_Familiar);
				
				JMenuItem MenuItem_Camper = new JMenuItem("Camper");
				MenuItem_Camper.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						Camper camper = new Camper();
						camper.setVisible(true);
						dispose();
					}
				});
				Menu_Coches.add(MenuItem_Camper);
				
				//zona de motos con diferentes opciones
				JMenu Menu_Motos = new JMenu("Motos");
				Menu_Motos.setForeground(Color.GRAY);
				Menu_Motos.setFont(new Font("Segoe UI", Font.PLAIN, 15));
				menuBar.add(Menu_Motos);
				
				JMenuItem mntmDeportivas = new JMenuItem("Deportivas");
				mntmDeportivas.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						Deportivas deportivas = new Deportivas();
						deportivas.setVisible(true);
						dispose();
					}
				});
				Menu_Motos.add(mntmDeportivas);
				
				JMenuItem MenuItem_Scooter = new JMenuItem("Scooter");
				Menu_Motos.add(MenuItem_Scooter);
				
				JMenuItem mntmNewMenuItem_1 = new JMenuItem("Ubicacion de Nuestras tienda");
				mntmNewMenuItem_1.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						Ubicacion ubicacion = new Ubicacion();
						ubicacion.setVisible(true);
						dispose();
					}
				});
				mntmNewMenuItem_1.setHorizontalAlignment(SwingConstants.LEFT);
				mntmNewMenuItem_1.setForeground(Color.GRAY);
				mntmNewMenuItem_1.setFont(new Font("Segoe UI", Font.PLAIN, 15));
				mntmNewMenuItem_1.setBackground(Color.WHITE);
				menuBar.add(mntmNewMenuItem_1);
				
				JMenuItem mntmNewMenuItem = new JMenuItem("Inicio");
				mntmNewMenuItem.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						inicio inicio = new inicio();
						inicio.setVisible(true);
						dispose();
					}
				});
				mntmNewMenuItem.setFont(new Font("Segoe UI", Font.PLAIN, 15));
				mntmNewMenuItem.setBackground(Color.WHITE);
				mntmNewMenuItem.setForeground(Color.GRAY);
				mntmNewMenuItem.setHorizontalAlignment(SwingConstants.LEFT);
				menuBar.add(mntmNewMenuItem);
				
						
		
		contentPane = new JPanel();
		contentPane.setBackground(new Color(0, 255, 255));
		contentPane.setForeground(new Color(255, 255, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		
		JLabel lblNewLabel = new JLabel("Scooters");
		lblNewLabel.setFont(new Font("Verdana", Font.PLAIN, 25));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(0, 0, 802, 38);
		contentPane.add(lblNewLabel);
		
		
		//primer coche con foto en un boton para ir a la pagina de comprar
		
		JButton btn_Peugot = new JButton("");
		btn_Peugot.setBackground(Color.WHITE);
		btn_Peugot.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				HondaNC750 hondaNC750 = new HondaNC750();
				hondaNC750.setVisible(true);
				dispose();
			}
		});
		btn_Peugot.setIcon(new ImageIcon("HondaNC.jpg"));
		btn_Peugot.setBounds(10, 62, 356, 200);
		contentPane.add(btn_Peugot);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(-15, 49, 817, 2);
		contentPane.add(separator);

		JLabel coche_puegot = new JLabel("Honda NC 750");
		coche_puegot.setFont(new Font("Tahoma", Font.BOLD, 20));
		coche_puegot.setBounds(376, 62, 335, 23);
		contentPane.add(coche_puegot);
		
		JTextPane txtpnFechaKilimetros = new JTextPane();
		txtpnFechaKilimetros.setEditable(false);
		txtpnFechaKilimetros.setBackground(Color.CYAN);
		txtpnFechaKilimetros.setFont(new Font("Tahoma", Font.PLAIN, 12));
		txtpnFechaKilimetros.setText("Fecha: 06/2019\r\nKilimetros: 6.316\r\nGasolina\r\nAuto\r\nProcedencia particualar");
		txtpnFechaKilimetros.setBounds(376, 116, 335, 81);
		contentPane.add(txtpnFechaKilimetros);
		
		JLabel NewLabel_Precio = new JLabel("7.400 €");
		NewLabel_Precio.setFont(new Font("Times New Roman", Font.BOLD, 16));
		NewLabel_Precio.setBounds(643, 239, 68, 23);
		contentPane.add(NewLabel_Precio);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setBounds(0, 273, 802, 5);
		contentPane.add(separator_1);
		
		
	
		
		//Segundo coche con foto en un boton para ir a la pagina de comprar
		
		JButton btn_C4 = new JButton("");
		btn_C4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Kymco kymco = new Kymco();
				kymco.setVisible(true);
				dispose();
			}
		});
		btn_C4.setIcon(new ImageIcon("kymco.jpg"));
		btn_C4.setBackground(Color.WHITE);
		btn_C4.setBounds(10, 289, 356, 200);
		contentPane.add(btn_C4);
		
		JLabel coche_C4 = new JLabel("KYMCO Super Dink 125");
		coche_C4.setFont(new Font("Tahoma", Font.BOLD, 20));
		coche_C4.setBounds(376, 289, 335, 23);
		contentPane.add(coche_C4);
		
		JTextPane txtpnFechaKilimetros_2 = new JTextPane();
		txtpnFechaKilimetros_2.setEditable(false);
		txtpnFechaKilimetros_2.setText("Fecha: 10/2020\r\nKilimetros: 20.888\r\nGasolina\r\nAuto\r\nProcedencia particular");
		txtpnFechaKilimetros_2.setFont(new Font("Tahoma", Font.PLAIN, 12));
		txtpnFechaKilimetros_2.setBackground(Color.CYAN);
		txtpnFechaKilimetros_2.setBounds(376, 343, 335, 96);
		contentPane.add(txtpnFechaKilimetros_2);
		
		JLabel NewLabel_Precio_1 = new JLabel("3.350 €");
		NewLabel_Precio_1.setFont(new Font("Times New Roman", Font.BOLD, 16));
		NewLabel_Precio_1.setBounds(643, 466, 68, 23);
		contentPane.add(NewLabel_Precio_1);
	}
}
