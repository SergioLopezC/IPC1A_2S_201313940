import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JEditorPane;


public class Reservacion extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;

	
	public Reservacion() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 596, 399);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblCodigoReservacion = new JLabel("CODIGO RESERVACION");
		lblCodigoReservacion.setBounds(26, 22, 124, 14);
		contentPane.add(lblCodigoReservacion);
		
		textField = new JTextField();
		textField.setBounds(149, 19, 200, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JButton btnReservar = new JButton("RESERVAR");
		btnReservar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				textField.setText("ADIOS MUNDO");
			}
		});
		btnReservar.setIcon(new ImageIcon("C:\\Users\\Sergio Lopez\\Documents\\EclipseLuna\\SEGUNDA FASE\\_font_b_Modern_b_font_Electronic.summ.jpg"));
		btnReservar.setBounds(26, 213, 231, 63);
		contentPane.add(btnReservar);
		
		JButton btnCancelarReservacion = new JButton("CANCELAR RESERVACION");
		btnCancelarReservacion.setIcon(new ImageIcon("C:\\Users\\Sergio Lopez\\Documents\\EclipseLuna\\SEGUNDA FASE\\onebit_33.png"));
		btnCancelarReservacion.setBounds(26, 158, 231, 63);
		contentPane.add(btnCancelarReservacion);
		
		JButton btnAgregarALista = new JButton("AGREGAR A LISTA DE ESPERA");
		btnAgregarALista.setIcon(new ImageIcon("C:\\Users\\Sergio Lopez\\Documents\\EclipseLuna\\SEGUNDA FASE\\Documents.png"));
		btnAgregarALista.setBounds(26, 107, 231, 52);
		contentPane.add(btnAgregarALista);
		
		JLabel lblCodigoCliente = new JLabel("CODIGO CLIENTE");
		lblCodigoCliente.setBounds(26, 47, 112, 14);
		contentPane.add(lblCodigoCliente);
		
		textField_1 = new JTextField();
		textField_1.setBounds(149, 42, 200, 19);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"LISTA DE HOTELES", "DECAMERON", "SALINITAS", "SUNITITAT", "WORD", "CENTRO AMERICA", "PARAISO", "MANANTIAL"}));
		comboBox.setBounds(374, 19, 170, 20);
		contentPane.add(comboBox);
		
		JEditorPane editorPane = new JEditorPane();
		editorPane.setBounds(287, 107, 257, 168);
		contentPane.add(editorPane);
		
		
	}
}
