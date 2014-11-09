import java.awt.BorderLayout;
import java.awt.Component;
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

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import com.jgoodies.forms.factories.DefaultComponentFactory;

import javax.swing.JSplitPane;
import javax.swing.JInternalFrame;

import java.awt.Color;

import javax.swing.border.TitledBorder;
import javax.swing.text.BadLocationException;
import javax.swing.UIManager;

import java.awt.Toolkit;
import java.util.Calendar;


public class Hospedaje extends JFrame {

	private static final Component Calendar = null;
	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	Clientes clientes;
	Habitaciones habitaciones;
	Restaurantes res;
	Servicios servicios;
	Promociones promos;
	ListaHospedaje listaHospedaje;
	Reservacion reservar;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;
	private JTextField textField_8;
	private JTextField textField_9;
	private JTextField textField_10;
	private JTextField textField_11;
	private JTextField textField_12;
	private JTextField textField_13;
	private JTextField textField_14;
	private JTextField textField_15;
	private JTextField textField_16;
	private JTextField textField_17;
	private JTextField textField_18;
	private JTextField textField_19;

	public Hospedaje() {
		setBackground(new Color(0, 255, 0));
		setTitle("HOSPEDAJE");
		setForeground(new Color(248, 248, 255));
		reservar=new Reservacion();
		clientes=new Clientes();
		habitaciones=new Habitaciones();
		res=new Restaurantes();
		servicios=new Servicios();
		promos=new Promociones();
		listaHospedaje=new ListaHospedaje();
		
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\Sergio Lopez\\Documents\\EclipseLuna\\SEGUNDA FASE\\clientes.png"));
		
		setBounds(100, 100, 686, 519);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(0, 153, 204));
		contentPane.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "HOSPEDAJE", TitledBorder.CENTER, TitledBorder.TOP, null, new Color(0, 0, 0)));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblDpi = new JLabel("DPI");
		lblDpi.setBounds(78, 84, 46, 14);
		contentPane.add(lblDpi);
		
		textField = new JTextField();
		textField.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent arg0) {
				
			}
		});
		textField.setBounds(207, 80, 112, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel lblNombre = new JLabel("NOMBRE");
		lblNombre.setBounds(78, 109, 77, 14);
		contentPane.add(lblNombre);
		
		textField_1 = new JTextField();
		textField_1.setBounds(207, 105, 112, 20);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblTelefono = new JLabel("SEXO");
		lblTelefono.setBounds(78, 143, 58, 14);
		contentPane.add(lblTelefono);
		
		textField_2 = new JTextField();
		textField_2.setBounds(207, 136, 112, 20);
		contentPane.add(textField_2);
		textField_2.setColumns(10);
		
		JLabel lblNacionalidad = new JLabel("TELEFONO");
		lblNacionalidad.setBounds(78, 178, 86, 14);
		contentPane.add(lblNacionalidad);
		
		textField_3 = new JTextField();
		textField_3.setBounds(207, 174, 112, 20);
		contentPane.add(textField_3);
		textField_3.setColumns(10);
		
		JLabel lblCliente = new JLabel("NACIONALIDAD");
		lblCliente.setBounds(78, 208, 93, 14);
		contentPane.add(lblCliente);
		
		textField_4 = new JTextField();
		textField_4.setBounds(207, 205, 112, 20);
		contentPane.add(textField_4);
		textField_4.setColumns(10);
		
		JButton btnBuscar = new JButton("");
		btnBuscar.setIcon(new ImageIcon("C:\\Users\\Sergio Lopez\\Documents\\EclipseLuna\\SEGUNDA FASE\\search32.png"));
		btnBuscar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				clientes.listaClientes.buscar(textField_5.getText());
				textField.setText(clientes.listaClientes.actual_dpi);
				textField_1.setText(clientes.listaClientes.actual_nombre);
				textField_2.setText(clientes.listaClientes.actual_sexo);
				textField_3.setText(clientes.listaClientes.actual_telefono);
				textField_4.setText(clientes.listaClientes.actual_nacionalidad);
			}
		});
		btnBuscar.setBounds(307, 326, 32, 30);
		contentPane.add(btnBuscar);
		
		textField_5 = new JTextField();
		textField_5.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent evt) {
				char car=evt.getKeyChar();
		           if(  textField_5.getText().length()>=8)evt.consume();
		       if((car<'0' || car>'9') ) evt.consume();
			}
		});
		textField_5.setBounds(130, 336, 174, 20);
		contentPane.add(textField_5);
		textField_5.setColumns(10);
		
		JLabel lblCliente_1 = new JLabel("DPI CLIENTE");
		lblCliente_1.setBounds(43, 342, 77, 14);
		contentPane.add(lblCliente_1);
		
		JLabel lblNoHabitacion = new JLabel("No. HABITACION");
		lblNoHabitacion.setBounds(389, 59, 101, 14);
		contentPane.add(lblNoHabitacion);
		
		textField_6 = new JTextField();
		textField_6.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent evt) {
				char car=evt.getKeyChar();
		           if(  textField_6.getText().length()>=8)evt.consume();
		       if((car<'0' || car>'9') ) evt.consume();
			}
		});
		textField_6.setBounds(492, 56, 86, 20);
		contentPane.add(textField_6);
		textField_6.setColumns(10);
		
		JLabel lblTipo = new JLabel("TIPO");
		lblTipo.setBounds(389, 84, 46, 14);
		contentPane.add(lblTipo);
		
		textField_7 = new JTextField();
		textField_7.setBounds(492, 81, 125, 20);
		contentPane.add(textField_7);
		textField_7.setColumns(10);
		
		JLabel lblDescripcion = new JLabel("DESCRIPCION");
		lblDescripcion.setBounds(389, 118, 93, 14);
		contentPane.add(lblDescripcion);
		
		textField_8 = new JTextField();
		textField_8.setBounds(492, 112, 125, 20);
		contentPane.add(textField_8);
		textField_8.setColumns(10);
		
		JLabel lblPrecio = new JLabel("PRECIO");
		lblPrecio.setBounds(389, 153, 46, 14);
		contentPane.add(lblPrecio);
		
		textField_9 = new JTextField();
		textField_9.setBounds(492, 150, 125, 20);
		contentPane.add(textField_9);
		textField_9.setColumns(10);
		
		JLabel lblEstado = new JLabel("ESTADO");
		lblEstado.setBounds(389, 183, 93, 14);
		contentPane.add(lblEstado);
		
		textField_10 = new JTextField();
		textField_10.setBounds(492, 180, 125, 20);
		contentPane.add(textField_10);
		textField_10.setColumns(10);
		
		JButton button = new JButton("");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				habitaciones.listaHab.buscar(textField_6.getText());
				textField_7.setText(habitaciones.listaHab.actual_tipo);
				textField_8.setText(habitaciones.listaHab.actual_descripcion);
				textField_9.setText(habitaciones.listaHab.actual_precio);
				textField_10.setText(habitaciones.listaHab.actual_estado);
			}
		});
		button.setIcon(new ImageIcon("C:\\Users\\Sergio Lopez\\Documents\\EclipseLuna\\SEGUNDA FASE\\search32over.png"));
		button.setBounds(581, 48, 32, 30);
		contentPane.add(button);
		
		JLabel lblQ = new JLabel("Q.");
		lblQ.setBounds(462, 153, 17, 14);
		contentPane.add(lblQ);
		
		JLabel lblNo = new JLabel("No. HOSPEDAJE");
		lblNo.setBounds(78, 56, 93, 14);
		contentPane.add(lblNo);
		
		textField_11 = new JTextField();
		textField_11.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent evt) {
				char car=evt.getKeyChar();
		           if(  textField_11.getText().length()>=8)evt.consume();
		       if((car<'0' || car>'9') ) evt.consume();
		 
			}
		});
		textField_11.setBounds(207, 52, 112, 20);
		contentPane.add(textField_11);
		textField_11.setColumns(10);
		
		JButton btnNuevo = new JButton("NUEVO");
		btnNuevo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				limpiar();
			}
		});
		btnNuevo.setIcon(new ImageIcon("C:\\Users\\Sergio Lopez\\Documents\\EclipseLuna\\SEGUNDA FASE\\onebit_20.png"));
		btnNuevo.setBounds(30, 395, 145, 57);
		contentPane.add(btnNuevo);
		
		JButton btnAgregar = new JButton("AGREGAR");
		btnAgregar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(textField.getText().equals("") || textField_11.getText().equals("") || textField_14.getText().equals("") || textField_16.getText().equals("") || textField_18.getText().equals("") 	|| textField_3.getText().equals("") || textField_7.getText().equals("") || textField_12.getText().equals("") || textField_13.getText().equals("")){
				JOptionPane.showMessageDialog(null, "necesita llenar todos los campos para crear un nuevo registro");
				}else{
				if(textField_10.getText().equals("OCUPADO")){
					JOptionPane.showMessageDialog(null, "Esta habitacion YA ESTA OCUPADA, asigne al cliente a otra habitacion");
					
				}else{
				textField_10.setText("OCUPADO");
				JOptionPane.showMessageDialog(null, "proceso realizado con exito");
				listaHospedaje.agregar(textField_11.getText(), textField.getText(), textField_1.getText(), textField_2.getText(), textField_3.getText(), textField_4.getText(), textField_14.getText(), textField_15.getText(), textField_16.getText(), textField_17.getText(), textField_18.getText(), textField_19.getText(), textField_6.getText(), textField_7.getText(), textField_8.getText(), textField_9.getText(), textField_10.getText(), textField_12.getText(), textField_13.getText());
				habitaciones.getTextField_4().setText(textField_10.getText());
				}
			}}
		});
		btnAgregar.setIcon(new ImageIcon("C:\\Users\\Sergio Lopez\\Documents\\EclipseLuna\\SEGUNDA FASE\\onebit_12.png"));
		btnAgregar.setBounds(185, 395, 154, 57);
		contentPane.add(btnAgregar);
		
		JButton btnEliminar = new JButton("ELIMINAR");
		btnEliminar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String dato=JOptionPane.showInputDialog(null,"ingrese el codigo de registro hospedaje a eliminar");
				listaHospedaje.remover(dato);
			}
		});
		btnEliminar.setIcon(new ImageIcon("C:\\Users\\Sergio Lopez\\Documents\\EclipseLuna\\SEGUNDA FASE\\onebit_33.png"));
		btnEliminar.setBounds(349, 395, 153, 57);
		contentPane.add(btnEliminar);
		
		JButton btnSalir = new JButton("SALIR");
		btnSalir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			setVisible(false);	
			}
		});
		btnSalir.setIcon(new ImageIcon("C:\\Users\\Sergio Lopez\\Documents\\EclipseLuna\\SEGUNDA FASE\\salir_cac5.gif"));
		btnSalir.setBounds(512, 395, 125, 57);
		contentPane.add(btnSalir);
		
		JLabel lblNumero = new JLabel("No. DIAS");
		lblNumero.setBounds(389, 216, 86, 20);
		contentPane.add(lblNumero);
		
		textField_12 = new JTextField();
		textField_12.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent evt) {
				 char car=evt.getKeyChar();
		           if(  textField_12.getText().length()>=8)evt.consume();
		       if((car<'0' || car>'9') ) evt.consume();
			}
		});
		textField_12.setBounds(492, 208, 125, 20);
		contentPane.add(textField_12);
		textField_12.setColumns(10);
		
		JLabel lblMonto = new JLabel("MONTO");
		lblMonto.setBounds(389, 241, 69, 30);
		contentPane.add(lblMonto);
		
		textField_13 = new JTextField();
		textField_13.setBounds(492, 246, 93, 20);
		contentPane.add(textField_13);
		textField_13.setColumns(10);
		
		JButton btnNewButton = new JButton("");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				int a=Integer.parseInt(textField_9.getText());
				int b=Integer.parseInt(textField_12.getText());
				int c= a*b;
				String valueOf=String.valueOf(c);
				textField_13.setText(valueOf);
				
				
			}

			private String toString(int c) {
				// TODO Auto-generated method stub
				return null;
			}
		});
		btnNewButton.setIcon(new ImageIcon("C:\\Users\\Sergio Lopez\\Documents\\EclipseLuna\\SEGUNDA FASE\\boton-aceptar.jpg"));
		btnNewButton.setBounds(585, 236, 32, 30);
		contentPane.add(btnNewButton);
		
		textField_14 = new JTextField();
		textField_14.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent evt) {
				char car=evt.getKeyChar();
		           if(  textField_14.getText().length()>=8)evt.consume();
		       if((car<'0' || car>'9') ) evt.consume();
		 
			}
		});
		textField_14.setToolTipText(" dia /mes/a\u00F1o  ");
		textField_14.setBounds(207, 236, 32, 20);
		
		contentPane.add(textField_14);
		textField_14.setColumns(10);
		
		textField_15 = new JTextField();
		textField_15.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent evt) {
				char car=evt.getKeyChar();
		           if(  textField_15.getText().length()>=8)evt.consume();
		       if((car<'0' || car>'9') ) evt.consume();
		 
			}
		});
		textField_15.setToolTipText("dia/mes/a\u00F1o");
		textField_15.setBounds(238, 236, 32, 20);
		contentPane.add(textField_15);
		textField_15.setColumns(10);
		
		JLabel lblFechaFin = new JLabel("FECHA FIN");
		lblFechaFin.setBounds(78, 282, 86, 14);
		contentPane.add(lblFechaFin);
		
		JLabel lblFechaInicio = new JLabel("FECHA INICIO");
		lblFechaInicio.setBounds(78, 239, 77, 14);
		contentPane.add(lblFechaInicio);
		
		textField_16 = new JTextField();
		textField_16.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent evt) {
				char car=evt.getKeyChar();
		           if(  textField_16.getText().length()>=8)evt.consume();
		       if((car<'0' || car>'9') ) evt.consume();
		 
			}
		});
		textField_16.setBounds(268, 236, 51, 20);
		contentPane.add(textField_16);
		textField_16.setColumns(10);
		
		textField_17 = new JTextField();
		textField_17.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent evt) {
				char car=evt.getKeyChar();
		           if(  textField_17.getText().length()>=8)evt.consume();
		       if((car<'0' || car>'9') ) evt.consume();
		 
			}
		});
		textField_17.setBounds(207, 283, 32, 20);
		contentPane.add(textField_17);
		textField_17.setColumns(10);
		
		textField_18 = new JTextField();
		textField_18.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent evt) {
				char car=evt.getKeyChar();
		           if(  textField_18.getText().length()>=8)evt.consume();
		       if((car<'0' || car>'9') ) evt.consume();
		 
			}
		});
		textField_18.setBounds(238, 283, 32, 20);
		contentPane.add(textField_18);
		textField_18.setColumns(10);
		
		textField_19 = new JTextField();
		textField_19.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent evt) {
				char car=evt.getKeyChar();
		           if(  textField_19.getText().length()>=8)evt.consume();
		       if((car<'0' || car>'9') ) evt.consume();
		 
			}
		});
		textField_19.setBounds(268, 283, 51, 20);
		contentPane.add(textField_19);
		textField_19.setColumns(10);
		
		JLabel lblDiamesao = new JLabel("  dia  /  mes  /  a\u00F1o");
		lblDiamesao.setBounds(207, 257, 112, 14);
		contentPane.add(lblDiamesao);
		
		JLabel lblDiaMes = new JLabel("  dia  /  mes  /  a\u00F1o");
		lblDiaMes.setBounds(207, 302, 112, 14);
		contentPane.add(lblDiaMes);
		
		JButton btnMostrar = new JButton("MOSTRAR");
		btnMostrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				listaHospedaje.mostrar();
			}
		});
		btnMostrar.setBounds(305, 463, 101, 23);
		contentPane.add(btnMostrar);
		
		JLabel label = new JLabel("");
		label.setIcon(new ImageIcon("C:\\Users\\Sergio Lopez\\Documents\\EclipseLuna\\SEGUNDA FASE\\fondo.jpg"));
		label.setBounds(35, 34, 304, 336);
		contentPane.add(label);
		
		JLabel label_1 = new JLabel("");
		label_1.setIcon(new ImageIcon("C:\\Users\\Sergio Lopez\\Documents\\EclipseLuna\\SEGUNDA FASE\\fondo.jpg"));
		label_1.setBounds(363, 34, 274, 336);
		contentPane.add(label_1);
		
		JLabel label_2 = new JLabel("");
		label_2.setIcon(new ImageIcon("C:\\Users\\Sergio Lopez\\Documents\\EclipseLuna\\SEGUNDA FASE\\fondoMenu.png"));
		label_2.setBounds(0, 0, 670, 486);
		contentPane.add(label_2);
		
	}
	public void limpiar(){
		this.textField.setText("");
		this.textField_1.setText("");
		this.textField_2.setText("");
		this.textField_3.setText("");
		this.textField_4.setText("");
		this.textField_5.setText("");
		this.textField_6.setText("");
		this.textField_7.setText("");
		this.textField_8.setText("");
		this.textField_9.setText("");
		this.textField_10.setText("");
		this.textField_11.setText("");
		this.textField_12.setText("");
		this.textField_13.setText("");
		this.textField_14.setText("");
		this.textField_15.setText("");
		this.textField_16.setText("");
		this.textField_17.setText("");
		this.textField_18.setText("");
		this.textField_19.setText("");
       
}
}
