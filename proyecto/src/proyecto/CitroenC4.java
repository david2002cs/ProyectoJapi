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

public class CitroenC4 extends JFrame {

	private JPanel contentPane;
	private JPanel contentPane_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CitroenC4 frame = new CitroenC4();
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
	public CitroenC4() {
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
		lblNewLabel_1.setBackground(Color.LIGHT_GRAY);
		lblNewLabel_1.setIcon(new ImageIcon("CitroenC4(1).jpg"));
		lblNewLabel_1.setBounds(10, 11, 356, 200);
		contentPane_1.add(lblNewLabel_1);
		
		JLabel lblNewLabel = new JLabel("Extras");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel.setBounds(20, 222, 346, 23);
		contentPane_1.add(lblNewLabel);
		
		JTextPane txtpnReconocimientoSealesDe = new JTextPane();
		txtpnReconocimientoSealesDe.setEditable(false);
		txtpnReconocimientoSealesDe.setText("Reconocimiento señales de tráfico\r\n\r\nClimatizador\r\n\r\nNavegador\r\n\r\nBluetooth\r\n\r\nSistema Car Play");
		txtpnReconocimientoSealesDe.setBackground(Color.CYAN);
		txtpnReconocimientoSealesDe.setBounds(10, 251, 209, 160);
		contentPane_1.add(txtpnReconocimientoSealesDe);
		
		JTextPane txtpnControlDeVelocidad = new JTextPane();
		txtpnControlDeVelocidad.setEditable(false);
		txtpnControlDeVelocidad.setBackground(Color.CYAN);
		txtpnControlDeVelocidad.setText("Sensor de parking\r\n\r\nArranque por botón\r\n\r\nFreno de estacionamiento eléctrico\r\n\r\nCámara de marcha atrás\r\n\r\nEncendido automático de faros\r\n\r\n");
		txtpnControlDeVelocidad.setBounds(255, 251, 195, 160);
		contentPane_1.add(txtpnControlDeVelocidad);
		
		JTextPane txtpnClimatizadorFrenoDe = new JTextPane();
		txtpnClimatizadorFrenoDe.setEditable(false);
		txtpnClimatizadorFrenoDe.setBackground(Color.CYAN);
		txtpnClimatizadorFrenoDe.setText("Volante multifunción\r\n\r\nControl de velocidad\r\n\r\nSensor de lluvia");
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
		
		JLabel coche_C4 = new JLabel("Citroen C4 Cactus");
		coche_C4.setFont(new Font("Tahoma", Font.BOLD, 20));
		coche_C4.setBounds(376, 11, 335, 23);
		contentPane_1.add(coche_C4);
		
		JTextPane txtpnFechaKilimetros_2 = new JTextPane();
		txtpnFechaKilimetros_2.setEditable(false);
		txtpnFechaKilimetros_2.setText("Fecha: 05/2019\r\nKilimetros: 56.136\r\nGasolina\r\nManual\r\nLibre Mantenimiento\r\nÚnico propietario");
		txtpnFechaKilimetros_2.setFont(new Font("Tahoma", Font.PLAIN, 12));
		txtpnFechaKilimetros_2.setBackground(Color.CYAN);
		txtpnFechaKilimetros_2.setBounds(376, 65, 335, 96);
		contentPane_1.add(txtpnFechaKilimetros_2);
		
		JLabel NewLabel_Precio_1 = new JLabel("16.636 €");
		NewLabel_Precio_1.setFont(new Font("Times New Roman", Font.BOLD, 16));
		NewLabel_Precio_1.setBounds(643, 188, 68, 23);
		contentPane_1.add(NewLabel_Precio_1);
	}
}
