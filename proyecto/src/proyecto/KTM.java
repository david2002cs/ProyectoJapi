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

public class KTM extends JFrame {

	private JPanel contentPane;
	private JPanel contentPane_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					KTM frame = new KTM();
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
	public KTM() {
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
		
		JLabel lblNewLabel = new JLabel("Extras");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel.setBounds(20, 222, 346, 23);
		contentPane_1.add(lblNewLabel);
		
		JTextPane txtpnReconocimientoSealesDe = new JTextPane();
		txtpnReconocimientoSealesDe.setEditable(false);
		txtpnReconocimientoSealesDe.setText("\r\nPuños calefactable\r\n\r\nFaros LED");
		txtpnReconocimientoSealesDe.setBackground(Color.CYAN);
		txtpnReconocimientoSealesDe.setBounds(10, 251, 209, 160);
		contentPane_1.add(txtpnReconocimientoSealesDe);
		
		JButton btn_reservar = new JButton("Reservar");
		btn_reservar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ConfirmarReserva_Deportivas reserva = new ConfirmarReserva_Deportivas();
				reserva.setVisible(true);
			}
		});
		btn_reservar.setBounds(702, 474, 89, 23);
		contentPane_1.add(btn_reservar);
		
		JButton btn_Atras = new JButton("Atras");
		btn_Atras.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Deportivas atras = new Deportivas();
				atras.setVisible(true);
				dispose();
			}
		});
		btn_Atras.setBounds(10, 474, 89, 23);
		contentPane_1.add(btn_Atras);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon("duke.jpg"));
		lblNewLabel_1.setBounds(10, 19, 356, 200);
		contentPane_1.add(lblNewLabel_1);
		
		JLabel coche_C4 = new JLabel("KTM 790 Duke");
		coche_C4.setFont(new Font("Tahoma", Font.BOLD, 20));
		coche_C4.setBounds(376, 19, 335, 23);
		contentPane_1.add(coche_C4);
		
		JTextPane txtpnFechaKilimetros_2 = new JTextPane();
		txtpnFechaKilimetros_2.setText("Fecha: 06/2019\r\nKilimetros: 15.585\r\nGasolina\r\nmanual\r\nProcedencia particular");
		txtpnFechaKilimetros_2.setFont(new Font("Tahoma", Font.PLAIN, 12));
		txtpnFechaKilimetros_2.setEditable(false);
		txtpnFechaKilimetros_2.setBackground(Color.CYAN);
		txtpnFechaKilimetros_2.setBounds(376, 73, 335, 96);
		contentPane_1.add(txtpnFechaKilimetros_2);
		
		JLabel NewLabel_Precio_1 = new JLabel("5.750 €");
		NewLabel_Precio_1.setFont(new Font("Times New Roman", Font.BOLD, 16));
		NewLabel_Precio_1.setBounds(643, 196, 68, 23);
		contentPane_1.add(NewLabel_Precio_1);
	}
}
