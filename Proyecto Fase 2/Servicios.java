import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.ImageIcon;

import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;


public class Servicios extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	ListaServicios listaServicios;
	
	public Servicios() {
		
		listaServicios=new ListaServicios();
		setBounds(100, 100, 530, 516);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(135, 206, 250));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblCodigo = new JLabel("CODIGO");
		lblCodigo.setBounds(22, 181, 77, 14);
		contentPane.add(lblCodigo);
		
		textField = new JTextField();
		textField.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent evt) {
				char car=evt.getKeyChar();
		           if(  textField.getText().length()>=8)evt.consume();
		       if((car<'0' || car>'9') ) evt.consume();
			}
		});
		textField.setBounds(97, 178, 86, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel lblNombre = new JLabel("NOMBRE");
		lblNombre.setBounds(22, 217, 77, 14);
		contentPane.add(lblNombre);
		
		textField_1 = new JTextField();
		textField_1.setBounds(97, 214, 86, 20);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblCapacidad = new JLabel("CAPACIDAD");
		lblCapacidad.setBounds(22, 256, 77, 14);
		contentPane.add(lblCapacidad);
		
		textField_2 = new JTextField();
		textField_2.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent evt) {
				char car=evt.getKeyChar();
		           if(  textField_2.getText().length()>=8)evt.consume();
		       if((car<'0' || car>'9') ) evt.consume();
			}
		});
		textField_2.setBounds(97, 253, 86, 20);
		contentPane.add(textField_2);
		textField_2.setColumns(10);
		
		JLabel lblPrecio = new JLabel("PRECIO");
		lblPrecio.setBounds(22, 291, 46, 14);
		contentPane.add(lblPrecio);
		
		textField_3 = new JTextField();
		textField_3.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent evt) {
				char car=evt.getKeyChar();
		           if(  textField_3.getText().length()>=8)evt.consume();
		       if((car<'0' || car>'9') ) evt.consume();
			}
		});
		textField_3.setBounds(97, 284, 86, 20);
		contentPane.add(textField_3);
		textField_3.setColumns(10);
		
		JLabel lblHoraInic = new JLabel("INICIO");
		lblHoraInic.setBounds(22, 348, 46, 14);
		contentPane.add(lblHoraInic);
		
		textField_4 = new JTextField();
		textField_4.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent evt) {
				char car=evt.getKeyChar();
		           if(  textField_4.getText().length()>=8)evt.consume();
		       if((car<'0' || car>'9') ) evt.consume();
			}
		});
		textField_4.setBounds(97, 345, 86, 20);
		contentPane.add(textField_4);
		textField_4.setColumns(10);
		
		JLabel lblFin = new JLabel("FIN");
		lblFin.setBounds(22, 383, 46, 14);
		contentPane.add(lblFin);
		
		textField_5 = new JTextField();
		textField_5.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent evt) {
				char car=evt.getKeyChar();
		           if(  textField_5.getText().length()>=8)evt.consume();
		       if((car<'0' || car>'9') ) evt.consume();
			}
		});
		textField_5.setBounds(97, 380, 86, 20);
		contentPane.add(textField_5);
		textField_5.setColumns(10);
		
		JLabel lblHorarioDeAtencion = new JLabel("HORARIO DE ATENCION");
		lblHorarioDeAtencion.setBounds(21, 323, 146, 14);
		contentPane.add(lblHorarioDeAtencion);
		
		JButton btnNuevo = new JButton("NUEVO");
		btnNuevo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				limpiar();
			}
		});
		btnNuevo.setIcon(new ImageIcon("C:\\Users\\Sergio Lopez\\Documents\\EclipseLuna\\SEGUNDA FASE\\onebit_20.png"));
		btnNuevo.setBounds(324, 166, 137, 75);
		contentPane.add(btnNuevo);
		
		JButton btnAgregar = new JButton("AGREGAR");
		btnAgregar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				listaServicios.agregar(textField.getText(), textField_1.getText(), textField_2.getText(), textField_3.getText(), textField_4.getText(), textField_5.getText());
			}
		});
		btnAgregar.setIcon(new ImageIcon("C:\\Users\\Sergio Lopez\\Documents\\EclipseLuna\\SEGUNDA FASE\\onebit_12.png"));
		btnAgregar.setBounds(324, 235, 137, 75);
		contentPane.add(btnAgregar);
		
		JButton btnEliminar = new JButton("ELIMINAR");
		btnEliminar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String dato=JOptionPane.showInputDialog(null,"ingrese el codigo del servicio que desea eliminar");
				listaServicios.remover(dato);
			}
		});
		btnEliminar.setIcon(new ImageIcon("C:\\Users\\Sergio Lopez\\Documents\\EclipseLuna\\SEGUNDA FASE\\onebit_33.png"));
		btnEliminar.setBounds(324, 303, 137, 63);
		contentPane.add(btnEliminar);
		
		JButton btnSalir = new JButton("SALIR");
		btnSalir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				setVisible(false);
			}
		});
		btnSalir.setIcon(new ImageIcon("C:\\Users\\Sergio Lopez\\Documents\\EclipseLuna\\SEGUNDA FASE\\salir_cac5.gif"));
		btnSalir.setBounds(324, 359, 137, 63);
		contentPane.add(btnSalir);
		
		JButton btnMostrar = new JButton("MOSTRAR");
		btnMostrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				listaServicios.mostrar();
			}
		});
		btnMostrar.setBounds(353, 454, 89, 23);
		contentPane.add(btnMostrar);
		
		JLabel label = new JLabel("");
		label.setIcon(new ImageIcon("C:\\Users\\Sergio Lopez\\Documents\\EclipseLuna\\SEGUNDA FASE\\loving-the-new-pool.jpg"));
		label.setBounds(0, 0, 217, 133);
		contentPane.add(label);
		
		JLabel label_1 = new JLabel("");
		label_1.setIcon(new ImageIcon("C:\\Users\\Sergio Lopez\\Documents\\EclipseLuna\\SEGUNDA FASE\\2.jpg"));
		label_1.setBounds(214, 0, 283, 133);
		contentPane.add(label_1);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\Sergio Lopez\\Documents\\EclipseLuna\\SEGUNDA FASE\\fondo.jpg"));
		lblNewLabel.setBackground(new Color(128, 0, 0));
		lblNewLabel.setBounds(10, 166, 207, 256);
		contentPane.add(lblNewLabel);
		
		JLabel label_2 = new JLabel("");
		label_2.setIcon(new ImageIcon("C:\\Users\\Sergio Lopez\\Documents\\EclipseLuna\\SEGUNDA FASE\\fondo.jpg"));
		label_2.setBounds(263, 144, 234, 299);
		contentPane.add(label_2);
	}
	 public void limpiar(){
         this.textField.setText("");
       this.textField_1.setText("");
        this.textField_2.setText(""); 
        this.textField_3.setText("");
        this.textField_4.setText("");
        this.textField_5.setText("");
        
}
}
