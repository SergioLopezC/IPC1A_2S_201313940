import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import javax.swing.ImageIcon;

import java.awt.Color;
import java.awt.Label;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;


public class Hotel extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	JButton btnRegistrarElNuevo;
	public Hospedaje hospedaje;
	ListaHotel listaHotel;
	public Hotel() {
		
		hospedaje=new Hospedaje();
		listaHotel=new ListaHotel();
		//setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
		setBounds(100, 100, 1035, 418);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(176, 224, 230));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		
		JLabel lblCodigocliente = new JLabel("CODIGO HOTEL");
		lblCodigocliente.setBounds(97, 65, 101, 14);
		contentPane.add(lblCodigocliente);
		
		textField = new JTextField();
		textField.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent evt) {
				 char car=evt.getKeyChar();
		           if(  textField.getText().length()>=8)evt.consume();
		       if((car<'0' || car>'9') ) evt.consume();
			}
		});
		textField.setBounds(225, 62, 168, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel lblNombre = new JLabel("NOMBRE");
		lblNombre.setBounds(97, 90, 46, 14);
		contentPane.add(lblNombre);
		
		textField_1 = new JTextField();
		textField_1.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent evt) {
				char car=evt.getKeyChar();
			       if((car<'a' || car>'z') && (car<'A' || car>'Z')&&(car<' '||car>' ')) evt.consume();
			}
		});
		textField_1.setBounds(225, 87, 168, 20);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblNombreDelPais = new JLabel("NOMBRE DEL PAIS DONDE DESEA ESTABLECER EL HOTEL");
		lblNombreDelPais.setBounds(97, 150, 389, 20);
		contentPane.add(lblNombreDelPais);
		
		textField_2 = new JTextField();
		textField_2.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent evt) {
				char car=evt.getKeyChar();
			       if((car<'a' || car>'z') && (car<'A' || car>'Z')&&(car<' '||car>' ')) evt.consume();
			}
		});
		textField_2.setBounds(97, 169, 281, 20);
		contentPane.add(textField_2);
		textField_2.setColumns(10);
		
		JLabel lblNoHabitaciones = new JLabel("No. HABITACIONES");
		lblNoHabitaciones.setBounds(97, 213, 121, 14);
		contentPane.add(lblNoHabitaciones);
		
		textField_3 = new JTextField();
		textField_3.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent evt) {
				 char car=evt.getKeyChar();
		           if(  textField.getText().length()>=8)evt.consume();
		       if((car<'0' || car>'9') ) evt.consume();
			}
		});
		textField_3.setBounds(225, 210, 86, 20);
		contentPane.add(textField_3);
		textField_3.setColumns(10);
		
		JButton btnCrearUnNuevo = new JButton("CREAR UN NUEVO HOTEL");
		btnCrearUnNuevo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
					limpiar();
					btnCrearUnNuevo.setEnabled(false);
					btnRegistrarElNuevo.setEnabled(true);
			}
		});
		btnCrearUnNuevo.setIcon(new ImageIcon("C:\\Users\\Sergio Lopez\\Documents\\EclipseLuna\\SEGUNDA FASE\\onebit_20.png"));
		btnCrearUnNuevo.setToolTipText("");
		btnCrearUnNuevo.setBounds(643, 21, 318, 49);
		contentPane.add(btnCrearUnNuevo);
		
		 btnRegistrarElNuevo = new JButton("REGISTRAR EL NUEVO HOTEL");
		btnRegistrarElNuevo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(textField.getText().equals("") || textField_1.getText().equals("") || textField_2.getText().equals("") || textField_3.getText().equals("")){
					JOptionPane.showMessageDialog(null, "Necesita llenar todos los campos para crear un nuevo hotel");
				}else{
					listaHotel.agregar(textField.getText(), textField_1.getText(),textField_2.getText()	,textField_3.getText());
					JOptionPane.showMessageDialog(null, "proceso finalizado con exito");
					btnRegistrarElNuevo.setEnabled(false);
				}
			}
		});
		btnRegistrarElNuevo.setIcon(new ImageIcon("C:\\Users\\Sergio Lopez\\Documents\\EclipseLuna\\SEGUNDA FASE\\_font_b_Modern_b_font_Electronic.summ.jpg"));
		btnRegistrarElNuevo.setBounds(643, 81, 318, 49);
		contentPane.add(btnRegistrarElNuevo);
		
		JButton btnDeshabilitarHotel = new JButton("DESHABILITAR HOTEL");
		btnDeshabilitarHotel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String dato=JOptionPane.showInputDialog(null,"ingrese el codigo del hotel que desea eliminar");
				listaHotel.remover(dato);
				
			}
		});
		btnDeshabilitarHotel.setIcon(new ImageIcon("C:\\Users\\Sergio Lopez\\Documents\\EclipseLuna\\SEGUNDA FASE\\onebit_33.png"));
		btnDeshabilitarHotel.setBounds(643, 140, 318, 49);
		contentPane.add(btnDeshabilitarHotel);
		
		JButton btnSalir = new JButton("SALIR");
		btnSalir.setIcon(new ImageIcon("C:\\Users\\Sergio Lopez\\Documents\\EclipseLuna\\SEGUNDA FASE\\salir_cac5.gif"));
		btnSalir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				setVisible(false);
			}
		});
		btnSalir.setBounds(643, 200, 318, 49);
		contentPane.add(btnSalir);
		
		JButton btnMostrar = new JButton("LISTA DE HOTEL DE LA CADENA DECAMERON");
		btnMostrar.setIcon(new ImageIcon("C:\\Users\\Sergio Lopez\\Documents\\EclipseLuna\\SEGUNDA FASE\\documents_48x48.png"));
		btnMostrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				listaHotel.mostrar();
			}
		});
		btnMostrar.setBounds(643, 312, 318, 41);
		contentPane.add(btnMostrar);
		
		JButton btnMostrarInformacionDetallada = new JButton(" INFORMACION  \r\nDETALLADA DE LOS HOTELES");
		btnMostrarInformacionDetallada.setEnabled(false);
		btnMostrarInformacionDetallada.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				String dato=JOptionPane.showInputDialog(null,"ingrese el codigo del hotel");	
			if(listaHotel.buscar(dato)==true){
					listaHotel.mostrar();
				}else{
					JOptionPane.showMessageDialog(null, "el hotel NO EXISTE, verifique primero la lista de hoteles existentes");
				}
				
				
			}
		});
		btnMostrarInformacionDetallada.setIcon(new ImageIcon("C:\\Users\\Sergio Lopez\\Documents\\EclipseLuna\\SEGUNDA FASE\\Search.png"));
		btnMostrarInformacionDetallada.setBounds(643, 260, 318, 41);
		contentPane.add(btnMostrarInformacionDetallada);
		
		JLabel label = new JLabel("");
		label.setIcon(new ImageIcon("C:\\Users\\Sergio Lopez\\Documents\\EclipseLuna\\SEGUNDA FASE\\DECAMERON-14.jpg"));
		label.setBounds(0, 11, 87, 250);
		contentPane.add(label);
		
		JLabel label_1 = new JLabel("");
		label_1.setIcon(new ImageIcon("C:\\Users\\Sergio Lopez\\Documents\\EclipseLuna\\SEGUNDA FASE\\fondo.jpg"));
		label_1.setBounds(83, 11, 519, 250);
		contentPane.add(label_1);
		
		JLabel label_2 = new JLabel("");
		label_2.setIcon(new ImageIcon("C:\\Users\\Sergio Lopez\\Documents\\EclipseLuna\\SEGUNDA FASE\\fondo.jpg"));
		label_2.setBounds(622, 11, 361, 357);
		contentPane.add(label_2);
	}
	 public void limpiar(){
         this.textField.setText("");
       this.textField_1.setText("");
        this.textField_2.setText(""); 
        this.textField_3.setText("");
     
}
	 public void BOTONES(){
		   /* this.jButton1.setEnabled(false);
		           this.jButton2.setEnabled(true);
		           this.jButton3.setEnabled(true);
		           this.jButton4.setEnabled(false);
		           this.jButton5.setEnabled(false);*/
		}
}
