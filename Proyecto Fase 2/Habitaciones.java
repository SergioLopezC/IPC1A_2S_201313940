import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.plaf.basic.BasicComboBoxUI.ItemHandler;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.ImageIcon;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.ItemEvent;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.Color;

import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JRadioButton;
import javax.swing.JSeparator;
import javax.swing.JToggleButton;
import javax.swing.JList;
import javax.swing.JTextPane;
import java.awt.Font;


public class Habitaciones extends JFrame{

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	JRadioButton rdbtnSimple; 
	JRadioButton rdbtnDoble;
	JRadioButton rdbtnExclusiva;
	
	ListaHabitaciones listaHab;
	
	public Habitaciones() {
		
		listaHab=new ListaHabitaciones();
		//setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 663, 385);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(135, 206, 250));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNoHabitacion = new JLabel("No. HABITACION");
		lblNoHabitacion.setBounds(31, 34, 102, 14);
		contentPane.add(lblNoHabitacion);
		
		textField = new JTextField();
		textField.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent evt) {
				char car=evt.getKeyChar();
		           if(  textField.getText().length()>=8)evt.consume();
		       if((car<'0' || car>'9') ) evt.consume();
			}
		});
		textField.setBounds(134, 31, 86, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel lblTipo = new JLabel("TIPO");
		lblTipo.setBounds(258, 34, 65, 14);
		contentPane.add(lblTipo);
		
		textField_1 = new JTextField();
		textField_1.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent evt) {
				char car=evt.getKeyChar();
			       if((car<'a' || car>'z') && (car<'A' || car>'Z')&&(car<' '||car>' ')) evt.consume();
			}
		});
		textField_1.setBounds(604, 257, 3, 20);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblDescripcion = new JLabel("DESCRIPCION");
		lblDescripcion.setBounds(31, 89, 86, 14);
		contentPane.add(lblDescripcion);
		
		textField_2 = new JTextField();
		textField_2.setFont(new Font("Tahoma", Font.PLAIN, 9));
		textField_2.setBounds(134, 81, 461, 23);
		contentPane.add(textField_2);
		textField_2.setColumns(10);
		
		JLabel lblPrecio = new JLabel("PRECIO ");
		lblPrecio.setBounds(31, 135, 56, 14);
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
		textField_3.setBounds(134, 132, 86, 20);
		contentPane.add(textField_3);
		textField_3.setColumns(10);
		
		JLabel lblEstado = new JLabel("ESTADO");
		lblEstado.setBounds(258, 135, 65, 14);
		contentPane.add(lblEstado);
		
		setTextField_4(new JTextField());
		getTextField_4().addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent evt) {
				char car=evt.getKeyChar();
			       if((car<'a' || car>'z') && (car<'A' || car>'Z')&&(car<' '||car>' ')) evt.consume();
			}
		});
		getTextField_4().setBounds(319, 132, 86, 20);
		contentPane.add(getTextField_4());
		getTextField_4().setColumns(10);
		
		JButton btnNuevo = new JButton("NUEVO");
		btnNuevo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				limpiar();
			}
		});
		btnNuevo.setIcon(new ImageIcon("C:\\Users\\Sergio Lopez\\Documents\\EclipseLuna\\SEGUNDA FASE\\onebit_20.png"));
		btnNuevo.setBounds(22, 201, 140, 98);
		contentPane.add(btnNuevo);
		
		JButton btnAgregar = new JButton("AGREGAR");
		btnAgregar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			listaHab.agregar(textField.getText(), textField_1.getText(), textField_2.getText(), textField_3.getText(), getTextField_4().getText());
		
			}
		});
		btnAgregar.setIcon(new ImageIcon("C:\\Users\\Sergio Lopez\\Documents\\EclipseLuna\\SEGUNDA FASE\\onebit_12.png"));
		btnAgregar.setBounds(157, 201, 159, 98);
		contentPane.add(btnAgregar);
		
		JButton btnEliminar = new JButton("ELIMINAR");
		btnEliminar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String dato=JOptionPane.showInputDialog(null, "ingrese el numero de habitacion que desea deshabilitar");
				listaHab.remover(dato);
			}
		});
		btnEliminar.setIcon(new ImageIcon("C:\\Users\\Sergio Lopez\\Documents\\EclipseLuna\\SEGUNDA FASE\\onebit_33.png"));
		btnEliminar.setBounds(356, 201, 133, 98);
		contentPane.add(btnEliminar);
		
		JButton btnSalir = new JButton("SALIR");
		btnSalir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				setVisible(false);
			}
		});
		rdbtnDoble = new JRadioButton("REGULAR");
		rdbtnDoble.setBackground(new Color(135, 206, 250));
		rdbtnDoble.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				textField_2.setText("2 CAMAS KING-SIZE Y UNA SENCILLA, TV SATELITAL, TELEFONO, AIRE ACONDICIONADO");
				textField_3.setText("300");
				textField_1.setText("REGULAR");
				rdbtnSimple.setSelected(false);
				rdbtnDoble.setSelected(true);
				rdbtnExclusiva.setSelected(false);
			}
		});
		
		//JRadioButton rdbtnDoble = new JRadioButton("DOBLE");
		rdbtnDoble.setBounds(393, 30, 86, 23);
		contentPane.add(rdbtnDoble);
		btnSalir.setIcon(new ImageIcon("C:\\Users\\Sergio Lopez\\Documents\\EclipseLuna\\SEGUNDA FASE\\salir_cac5.gif"));
		btnSalir.setBounds(484, 201, 123, 98);
		contentPane.add(btnSalir);
		rdbtnSimple = new JRadioButton("SIMPLE");
		rdbtnSimple.setBackground(new Color(135, 206, 250));
		
	//	JRadioButton rdbtnSimple = new JRadioButton("SIMPLE");
		
		rdbtnSimple.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				textField_2.setText("2 CAMAS SENCILLAS, TV SATELITAL , TELEFONO, BAÑO");
				textField_3.setText("200");
				textField_1.setText("SIMPLE");
				rdbtnSimple.setSelected(true);
				rdbtnDoble.setSelected(false);
				rdbtnExclusiva.setSelected(false);
				
			}
		});
		
		JButton btnMostrar = new JButton("MOSTRAR");
		btnMostrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				listaHab.mostrar();
			}
		});
		btnMostrar.setBounds(280, 323, 89, 23);
		contentPane.add(btnMostrar);
		rdbtnSimple.setBounds(303, 30, 78, 23);
		contentPane.add(rdbtnSimple);
		
		rdbtnExclusiva = new JRadioButton("EXCLUSIVA");
		rdbtnExclusiva.setBackground(new Color(135, 206, 250));
		rdbtnExclusiva.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				textField_2.setText("2 CAMAS KING-SIZE, TV SATELITAL, TELEFONO, INTERNET, BAÑO, CAJA FUERTE, AIRE ACONDICIONADO");
				textField_3.setText("500");
				textField_1.setText("EXCLUSIVA");
				rdbtnExclusiva.setSelected(true);
				rdbtnSimple.setSelected(false);
				rdbtnDoble.setSelected(false);
				
			}
		});
		rdbtnExclusiva.setBounds(485, 30, 86, 23);
		contentPane.add(rdbtnExclusiva);
		
		JLabel label_1 = new JLabel("");
		label_1.setIcon(new ImageIcon("C:\\Users\\Sergio Lopez\\Documents\\EclipseLuna\\SEGUNDA FASE\\fondo.jpg"));
		label_1.setBounds(10, 11, 604, 161);
		contentPane.add(label_1);
		
		JLabel lblQ = new JLabel("Q.");
		lblQ.setBounds(107, 117, 26, 14);
		contentPane.add(lblQ);
		
		JLabel label = new JLabel("");
		label.setIcon(new ImageIcon("C:\\Users\\Sergio Lopez\\Documents\\EclipseLuna\\SEGUNDA FASE\\hotel decameron salinitas habitacion.jpg"));
		label.setBounds(0, 0, 647, 346);
		contentPane.add(label);
		
		JLabel label_2 = new JLabel("");
		label_2.setBackground(new Color(135, 206, 250));
		label_2.setBounds(481, 105, 46, 14);
		contentPane.add(label_2);
	}
	 public void limpiar(){
         this.textField.setText("");
       this.textField_1.setText("");
        this.textField_2.setText(""); 
        this.textField_3.setText("");
        this.getTextField_4().setText("");
        
}
	public JTextField getTextField_4() {
		return textField_4;
	}
	public void setTextField_4(JTextField textField_4) {
		this.textField_4 = textField_4;
	}
}
