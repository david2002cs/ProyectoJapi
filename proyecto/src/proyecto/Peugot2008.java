package proyecto;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextPane;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Peugot2008 extends JFrame {

	private JPanel contentPane;
	private JPanel contentPane_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Peugot2008 frame = new Peugot2008();
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
	public Peugot2008() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 817, 575);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
				
				
				
				
				contentPane_1 = new JPanel();
				contentPane_1.setBackground(new Color(0, 255, 255));
				contentPane_1.setForeground(new Color(255, 255, 255));
				contentPane_1.setBorder(new EmptyBorder(5, 5, 5, 5));

		
		setContentPane(contentPane_1);
		contentPane_1.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon("Peugeot2008(5).jpg"));
		lblNewLabel_1.setBounds(10, 11, 356, 200);
		contentPane_1.add(lblNewLabel_1);
		
		JLabel coche_puegot = new JLabel("Peugot 2008");
		coche_puegot.setFont(new Font("Tahoma", Font.BOLD, 20));
		coche_puegot.setBounds(376, 11, 335, 23);
		contentPane_1.add(coche_puegot);
		
		JTextPane txtpnFechaKilimetros = new JTextPane();
		txtpnFechaKilimetros.setEditable(false);
		txtpnFechaKilimetros.setText("Fecha: 01/2018\r\nKilimetros: 18.237\r\nGasolina\r\nManual");
		txtpnFechaKilimetros.setFont(new Font("Tahoma", Font.PLAIN, 12));
		txtpnFechaKilimetros.setBackground(Color.CYAN);
		txtpnFechaKilimetros.setBounds(376, 65, 335, 75);
		contentPane_1.add(txtpnFechaKilimetros);
		
		JLabel NewLabel_Precio = new JLabel("18.990 €");
		NewLabel_Precio.setFont(new Font("Times New Roman", Font.BOLD, 16));
		NewLabel_Precio.setBounds(643, 188, 68, 23);
		contentPane_1.add(NewLabel_Precio);
		
		JLabel lblNewLabel = new JLabel("Extras");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel.setBounds(20, 222, 346, 23);
		contentPane_1.add(lblNewLabel);
		
		JTextPane txtpnReconocimientoSealesDe = new JTextPane();
		txtpnReconocimientoSealesDe.setEditable(false);
		txtpnReconocimientoSealesDe.setText("Reconocimiento señales de tráfico\r\n\r\nTecho panorámico\r\n\r\nSensor de parking\r\n\r\nEncendido automático de faros\r\n\r\nSensor de lluvia\r\n");
		txtpnReconocimientoSealesDe.setBackground(Color.CYAN);
		txtpnReconocimientoSealesDe.setBounds(10, 251, 209, 160);
		contentPane_1.add(txtpnReconocimientoSealesDe);
		
		JTextPane txtpnControlDeVelocidad = new JTextPane();
		txtpnControlDeVelocidad.setEditable(false);
		txtpnControlDeVelocidad.setBackground(Color.CYAN);
		txtpnControlDeVelocidad.setText("Control de velocidad\r\n\r\nArranque por botón\r\n\r\nNavegador\r\n\r\nCámara de marcha atrás\r\n\r\nBluetooth");
		txtpnControlDeVelocidad.setBounds(255, 251, 195, 160);
		contentPane_1.add(txtpnControlDeVelocidad);
		
		JTextPane txtpnClimatizadorFrenoDe = new JTextPane();
		txtpnClimatizadorFrenoDe.setEditable(false);
		txtpnClimatizadorFrenoDe.setBackground(Color.CYAN);
		txtpnClimatizadorFrenoDe.setText("Climatizador\r\n\r\nFreno de estacionamiento eléctrico\r\n\r\nVolante multifunción");
		txtpnClimatizadorFrenoDe.setBounds(475, 251, 195, 160);
		contentPane_1.add(txtpnClimatizadorFrenoDe);
		
		JButton btn_reservar = new JButton("Reservar");
		btn_reservar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ConfirmarReserva reserva = new ConfirmarReserva();
				reserva.setVisible(true);
			}
		});
		btn_reservar.setBounds(702, 474, 89, 23);
		contentPane_1.add(btn_reservar);
		
		JButton btn_Atras = new JButton("Atras");
		btn_Atras.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				inicio atras = new inicio();
				atras.setVisible(true);
				dispose();
			}
		});
		btn_Atras.setBounds(10, 474, 89, 23);
		contentPane_1.add(btn_Atras);
	}
}
