import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.ImageIcon;

import java.awt.Color;

import javax.swing.JButton;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;


public class Promociones extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;
	private JTextField textField_8;
	private JTextField textField_9;
	private JTextField textField_10;
	ListaPromos listaPromos;

	public Promociones() {
		listaPromos=new ListaPromos();
		setBounds(100, 100, 619, 601);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(176, 224, 230));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblCodigo = new JLabel("CODIGO");
		lblCodigo.setBounds(24, 21, 46, 14);
		contentPane.add(lblCodigo);
		
		textField = new JTextField();
		textField.setBounds(100, 18, 86, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("PAIS");
		lblNewLabel.setBounds(24, 105, 46, 14);
		contentPane.add(lblNewLabel);
		
		textField_1 = new JTextField();
		textField_1.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent evt) {
				char car=evt.getKeyChar();
			       if((car<'a' || car>'z') && (car<'A' || car>'Z')&&(car<' '||car>' ')) evt.consume();
			}
		});
		textField_1.setBounds(100, 102, 86, 20);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblPaisParaEl = new JLabel("PAIS PARA EL QUE ES VALIDA LA PROMOCION");
		lblPaisParaEl.setBounds(24, 80, 226, 14);
		contentPane.add(lblPaisParaEl);
		
		JLabel lblFechaDeValides = new JLabel("FECHA DE VALIDES DE LA PROMOCION");
		lblFechaDeValides.setBounds(24, 163, 226, 14);
		contentPane.add(lblFechaDeValides);
		
		JLabel lblInicio = new JLabel("INICIO");
		lblInicio.setBounds(24, 188, 46, 14);
		contentPane.add(lblInicio);
		
		textField_2 = new JTextField();
		textField_2.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent evt) {
				char car=evt.getKeyChar();
		           if(  textField_2.getText().length()>=8)evt.consume();
		       if((car<'0' || car>'9') ) evt.consume();
		 
			}
		});
		textField_2.setBounds(80, 185, 27, 20);
		contentPane.add(textField_2);
		textField_2.setColumns(10);
		
		textField_3 = new JTextField();
		textField_3.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent evt) {
				char car=evt.getKeyChar();
		           if(  textField_3.getText().length()>=8)evt.consume();
		       if((car<'0' || car>'9') ) evt.consume();
		 
			}
		});
		textField_3.setBounds(108, 185, 27, 20);
		contentPane.add(textField_3);
		textField_3.setColumns(10);
		
		textField_4 = new JTextField();
		textField_4.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent evt) {
				char car=evt.getKeyChar();
		           if(  textField_4.getText().length()>=8)evt.consume();
		       if((car<'0' || car>'9') ) evt.consume();
		 
			}
		});
		textField_4.setBounds(135, 185, 46, 20);
		contentPane.add(textField_4);
		textField_4.setColumns(10);
		
		JLabel lblFin = new JLabel("FIN");
		lblFin.setBounds(24, 231, 37, 14);
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
		textField_5.setBounds(80, 228, 27, 20);
		contentPane.add(textField_5);
		textField_5.setColumns(10);
		
		textField_6 = new JTextField();
		textField_6.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent evt) {
				char car=evt.getKeyChar();
		           if(  textField_6.getText().length()>=8)evt.consume();
		       if((car<'0' || car>'9') ) evt.consume();
		 
			}
		});
		textField_6.setBounds(109, 228, 26, 20);
		contentPane.add(textField_6);
		textField_6.setColumns(10);
		
		textField_7 = new JTextField();
		textField_7.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent evt) {
				char car=evt.getKeyChar();
		           if(  textField_7.getText().length()>=8)evt.consume();
		       if((car<'0' || car>'9') ) evt.consume();
		 
			}
		});
		textField_7.setBounds(135, 228, 46, 20);
		contentPane.add(textField_7);
		textField_7.setColumns(10);
		
		JLabel lblDiaMes = new JLabel("  dia  /  mes /  a\u00F1o");
		lblDiaMes.setBounds(80, 204, 101, 14);
		contentPane.add(lblDiaMes);
		
		JLabel lblDiaMes_1 = new JLabel("  dia  /  mes  /  a\u00F1o");
		lblDiaMes_1.setBounds(80, 251, 101, 14);
		contentPane.add(lblDiaMes_1);
		
		JLabel lblNumeroDeDias = new JLabel("NUMERO DE DIAS QUE SE PROMOCIONARA EL PAQUETE");
		lblNumeroDeDias.setBounds(24, 414, 316, 14);
		contentPane.add(lblNumeroDeDias);
		
		JLabel lblDescripcionDeLo = new JLabel("DESCRIPCION DE LO QUE INCLUYE EL PAQUETE");
		lblDescripcionDeLo.setBounds(24, 288, 258, 14);
		contentPane.add(lblDescripcionDeLo);
		
		JLabel lblServicios = new JLabel("SERVICIOS");
		lblServicios.setBounds(24, 313, 63, 14);
		contentPane.add(lblServicios);
		
		textField_8 = new JTextField();
		textField_8.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent evt) {
				char car=evt.getKeyChar();
			       if((car<'a' || car>'z') && (car<'A' || car>'Z')&&(car<' '||car>' ')) evt.consume();
			}
		});
		textField_8.setBounds(106, 313, 170, 42);
		contentPane.add(textField_8);
		textField_8.setColumns(10);
		
		JLabel lblPrecio = new JLabel("PRECIO");
		lblPrecio.setBounds(24, 366, 46, 14);
		contentPane.add(lblPrecio);
		
		textField_9 = new JTextField();
		textField_9.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent evt) {
				char car=evt.getKeyChar();
		           if(  textField_9.getText().length()>=8)evt.consume();
		       if((car<'0' || car>'9') ) evt.consume();
		 
			}
		});
		textField_9.setBounds(80, 366, 86, 20);
		contentPane.add(textField_9);
		textField_9.setColumns(10);
		
		textField_10 = new JTextField();
		textField_10.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent evt) {
				char car=evt.getKeyChar();
		           if(  textField_10.getText().length()>=8)evt.consume();
		       if((car<'0' || car>'9') ) evt.consume();
		 
			}
		});
		textField_10.setBounds(348, 411, 86, 20);
		contentPane.add(textField_10);
		textField_10.setColumns(10);
		
		JLabel label = new JLabel("");
		label.setIcon(new ImageIcon("C:\\Users\\Sergio Lopez\\Documents\\EclipseLuna\\SEGUNDA FASE\\fondo.jpg"));
		label.setBounds(6, 11, 244, 42);
		contentPane.add(label);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon("C:\\Users\\Sergio Lopez\\Documents\\EclipseLuna\\SEGUNDA FASE\\fondo.jpg"));
		lblNewLabel_1.setBounds(6, 67, 244, 65);
		contentPane.add(lblNewLabel_1);
		
		JLabel label_1 = new JLabel("");
		label_1.setIcon(new ImageIcon("C:\\Users\\Sergio Lopez\\Documents\\EclipseLuna\\SEGUNDA FASE\\fondo.jpg"));
		label_1.setBounds(6, 163, 244, 102);
		contentPane.add(label_1);
		
		JLabel label_2 = new JLabel("");
		label_2.setIcon(new ImageIcon("C:\\Users\\Sergio Lopez\\Documents\\EclipseLuna\\SEGUNDA FASE\\fondo.jpg"));
		label_2.setBounds(6, 288, 270, 108);
		contentPane.add(label_2);
		
		JButton btnNuevo = new JButton("NUEVO");
		btnNuevo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				limpiar();
			}
		});
		btnNuevo.setIcon(new ImageIcon("C:\\Users\\Sergio Lopez\\Documents\\EclipseLuna\\SEGUNDA FASE\\onebit_20.png"));
		btnNuevo.setBounds(43, 458, 125, 74);
		contentPane.add(btnNuevo);
		
		JButton btnAgregar = new JButton("AGREGAR");
		btnAgregar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				listaPromos.agregar(textField.getText(), textField_1.getText(), textField_2.getText(), textField_3.getText(), textField_4.getText(), textField_5.getText(), textField_6.getText(), textField_7.getText(), textField_8.getText(), textField_9.getText(), textField_10.getText());
			}
		});
		btnAgregar.setIcon(new ImageIcon("C:\\Users\\Sergio Lopez\\Documents\\EclipseLuna\\SEGUNDA FASE\\onebit_12.png"));
		btnAgregar.setBounds(167, 458, 140, 74);
		contentPane.add(btnAgregar);
		
		JButton btnEliminar = new JButton("ELIMINAR");
		btnEliminar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String dato=JOptionPane.showInputDialog(null,"ingrese el codigo de la promocion que desea remover");
				listaPromos.remover(dato);
			}
		});
		btnEliminar.setIcon(new ImageIcon("C:\\Users\\Sergio Lopez\\Documents\\EclipseLuna\\SEGUNDA FASE\\onebit_33.png"));
		btnEliminar.setBounds(306, 458, 140, 74);
		contentPane.add(btnEliminar);
		
		JButton btnSalir = new JButton("SALIR");
		btnSalir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				setVisible(false);
			}
		});
		btnSalir.setIcon(new ImageIcon("C:\\Users\\Sergio Lopez\\Documents\\EclipseLuna\\SEGUNDA FASE\\salir_cac5.gif"));
		btnSalir.setBounds(445, 458, 119, 74);
		contentPane.add(btnSalir);
		
		JButton btnMostrar = new JButton("MOSTRAR");
		btnMostrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				listaPromos.mostrar();
			}
		});
		btnMostrar.setBounds(265, 543, 89, 23);
		contentPane.add(btnMostrar);
		
		JLabel label_3 = new JLabel("");
		label_3.setIcon(new ImageIcon("C:\\Users\\Sergio Lopez\\Documents\\EclipseLuna\\SEGUNDA FASE\\34195_407315868365_21129518365_4543493_4218284_n.jpg"));
		label_3.setBounds(286, 11, 307, 392);
		contentPane.add(label_3);
		
		JLabel label_4 = new JLabel("");
		label_4.setIcon(new ImageIcon("C:\\Users\\Sergio Lopez\\Documents\\EclipseLuna\\SEGUNDA FASE\\fondoMenu.png"));
		label_4.setBounds(0, 0, 603, 566);
		contentPane.add(label_4);
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
}
}
