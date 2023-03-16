package proyecto;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JSeparator;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class ConfirmarReserva_Deportivas extends JDialog {

	private final JPanel contentPanel = new JPanel();
	private JTextField textField_tlf;
	private JTextField textField_Apellidos;
	private JTextField textField_Nombre;
	private JTextField textField_DNI;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			ConfirmarReserva_Deportivas dialog = new ConfirmarReserva_Deportivas();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public ConfirmarReserva_Deportivas() {
		setBounds(100, 100, 450, 300);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		{
			JLabel lblNewLabel = new JLabel("Rellene el siguiente formulario con sus datos");
			lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 13));
			lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
			lblNewLabel.setBounds(10, 0, 414, 36);
			contentPanel.add(lblNewLabel);
		}
		{
			JSeparator separator = new JSeparator();
			separator.setBounds(-12, 34, 446, 2);
			contentPanel.add(separator);
		}
		{
			JLabel lblNewLabel_1 = new JLabel("Nombre");
			lblNewLabel_1.setBounds(10, 77, 116, 20);
			contentPanel.add(lblNewLabel_1);
		}
		{
			JLabel lblNewLabel_2 = new JLabel("Apellidos");
			lblNewLabel_2.setBounds(10, 117, 116, 20);
			contentPanel.add(lblNewLabel_2);
		}
		{
			JLabel lblNewLabel_3 = new JLabel("DNI");
			lblNewLabel_3.setBounds(10, 47, 116, 20);
			contentPanel.add(lblNewLabel_3);
		}
		{
			JLabel lblNewLabel_4 = new JLabel("Numero de telefono");
			lblNewLabel_4.setBounds(10, 148, 116, 20);
			contentPanel.add(lblNewLabel_4);
		}
		
		textField_tlf = new JTextField();
		textField_tlf.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				int key = e.getKeyChar();

			    boolean numeros = key >= 48 && key <= 57;
			        
			    if (!numeros)
			    {
			        e.consume();
			    }

			    if (textField_tlf.getText().trim().length() == 10) {
			        e.consume();
			    }
			}
		});
		textField_tlf.setBounds(136, 148, 116, 20);
		contentPanel.add(textField_tlf);
		textField_tlf.setColumns(10);
		
		textField_Apellidos = new JTextField();
		textField_Apellidos.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				 int key = e.getKeyChar();

				    boolean mayusculas = key >= 65 && key <= 90;
				    boolean minusculas = key >= 97 && key <= 122;
				    boolean espacio = key == 32;
				            
				     if (!(minusculas || mayusculas || espacio))
				    {
				        e.consume();
				    }
			}
		});
		textField_Apellidos.setColumns(10);
		textField_Apellidos.setBounds(136, 117, 116, 20);
		contentPanel.add(textField_Apellidos);
		
		textField_Nombre = new JTextField();
		textField_Nombre.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				 int key = e.getKeyChar();

				    boolean mayusculas = key >= 65 && key <= 90;
				    boolean minusculas = key >= 97 && key <= 122;
				    boolean espacio = key == 32;
				            
				     if (!(minusculas || mayusculas || espacio))
				    {
				        e.consume();
				    }
			}
		});
		textField_Nombre.setColumns(10);
		textField_Nombre.setBounds(136, 77, 116, 20);
		contentPanel.add(textField_Nombre);
		
		textField_DNI = new JTextField();
		textField_DNI.setColumns(10);
		textField_DNI.setBounds(136, 47, 116, 20);
		contentPanel.add(textField_DNI);
		{
			JPanel buttonPane = new JPanel();
			buttonPane.setLayout(new FlowLayout(FlowLayout.RIGHT));
			getContentPane().add(buttonPane, BorderLayout.SOUTH);
			{
				JButton okButton = new JButton("OK");
				okButton.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						if (!textField_Apellidos.getText().equals("")&&!textField_DNI.getText().equals("")&&!textField_Nombre.getText().equals("")&&!textField_tlf.getText().equals("")) {
						
						JOptionPane.showMessageDialog(null, "Datos correctos");
						
						dispose();
						}
					}
				});
				okButton.setActionCommand("OK");
				buttonPane.add(okButton);
				getRootPane().setDefaultButton(okButton);
			}
			{
				JButton cancelButton = new JButton("Cancel");
				cancelButton.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						Deportivas cancelar = new Deportivas();
						cancelar.setVisible(true);
						dispose();
					}
				});
				cancelButton.setActionCommand("Cancel");
				buttonPane.add(cancelButton);
			}
		}
	}
}
