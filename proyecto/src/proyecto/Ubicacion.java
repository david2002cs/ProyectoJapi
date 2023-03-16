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

public class Ubicacion extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ubicacion frame = new Ubicacion();
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
	public Ubicacion() {
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
				MenuItem_Scooter.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						Scooter scooter = new Scooter();
						scooter.setVisible(true);
						dispose();
					}
				});
				Menu_Motos.add(MenuItem_Scooter);
				
				JMenuItem mntmNewMenuItem_1 = new JMenuItem("Ubicacion de Nuestras tienda");
					
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
		
		
		JLabel lblNewLabel = new JLabel("Ubicaciones");
		lblNewLabel.setFont(new Font("Verdana", Font.PLAIN, 25));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(0, 0, 802, 38);
		contentPane.add(lblNewLabel);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(-15, 49, 817, 2);
		contentPane.add(separator);
		
		JLabel lblNewLabel_1 = new JLabel("Telefonos de nuestros concecionarios");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 15));
		lblNewLabel_1.setBounds(0, 62, 802, 38);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Centro comercial saladillo  Estepona\r\n");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel_2.setBounds(5, 111, 407, 14);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_2_1 = new JLabel("Calle Tacidides Málaga");
		lblNewLabel_2_1.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel_2_1.setBounds(5, 258, 176, 18);
		contentPane.add(lblNewLabel_2_1);
		
		JLabel lblNewLabel_3 = new JLabel("");
		lblNewLabel_3.setIcon(new ImageIcon("C:\\Users\\VSPC-LIGTPOLELITEV3\\OneDrive\\Escritorio\\Interfaz\\proyecto\\consecionario1.jpg"));
		lblNewLabel_3.setBounds(10, 130, 209, 117);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("Numero de telefono: 609 93 03 94");
		lblNewLabel_4.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_4.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_4.setBounds(229, 130, 209, 21);
		contentPane.add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("New label");
		lblNewLabel_5.setIcon(new ImageIcon("C:\\Users\\VSPC-LIGTPOLELITEV3\\OneDrive\\Escritorio\\Interfaz\\proyecto\\concesionario2.jpg"));
		lblNewLabel_5.setBounds(10, 280, 209, 117);
		contentPane.add(lblNewLabel_5);
		
		JLabel lblNewLabel_4_1 = new JLabel("Numero de telefono: 645 35 64 54");
		lblNewLabel_4_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_4_1.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_4_1.setBounds(229, 280, 209, 21);
		contentPane.add(lblNewLabel_4_1);
	}
}
