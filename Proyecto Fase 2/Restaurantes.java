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

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;


public class Restaurantes extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	ListaRestaurantes listaRestaurantes;
	
	public static void main(String[] args){
		
	}
	
	public Restaurantes() {
		listaRestaurantes=new ListaRestaurantes();
		setBounds(100, 100, 697, 432);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(176, 224, 230));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblCodigo = new JLabel("CODIGO");
		lblCodigo.setBounds(203, 271, 46, 14);
		contentPane.add(lblCodigo);
		
		textField = new JTextField();
		textField.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent evt) {
				 char car=evt.getKeyChar();
		           if(  textField_4.getText().length()>=8)evt.consume();
		       if((car<'0' || car>'9') ) evt.consume();
			}
		});
		textField.setBounds(290, 268, 86, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel lblNombre = new JLabel("NOMBRE");
		lblNombre.setBounds(203, 305, 77, 14);
		contentPane.add(lblNombre);
		
		textField_1 = new JTextField();
		textField_1.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent evt) {
				char car=evt.getKeyChar();
			       if((car<'a' || car>'z') && (car<'A' || car>'Z')&&(car<' '||car>' ')) evt.consume();
			}
		});
		textField_1.setBounds(290, 299, 86, 20);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblEspecialidad = new JLabel("ESPECIALIDAD");
		lblEspecialidad.setBounds(433, 268, 86, 14);
		contentPane.add(lblEspecialidad);
		
		textField_2 = new JTextField();
		textField_2.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent evt) {
				char car=evt.getKeyChar();
			       if((car<'a' || car>'z') && (car<'A' || car>'Z')&&(car<' '||car>' ')) evt.consume();
			}
		});
		textField_2.setBounds(529, 268, 86, 20);
		contentPane.add(textField_2);
		textField_2.setColumns(10);
		
		JLabel lblCapacidad = new JLabel("CAPACIDAD");
		lblCapacidad.setBounds(433, 302, 86, 14);
		contentPane.add(lblCapacidad);
		
		textField_3 = new JTextField();
		textField_3.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent evt) {
				 char car=evt.getKeyChar();
		           if(  textField_4.getText().length()>=8)evt.consume();
		       if((car<'0' || car>'9') ) evt.consume();
			}
		});
		textField_3.setBounds(529, 299, 86, 20);
		contentPane.add(textField_3);
		textField_3.setColumns(10);
		
		JLabel lblUbicacion = new JLabel("UBICACION");
		lblUbicacion.setBounds(433, 330, 73, 14);
		contentPane.add(lblUbicacion);
		
		textField_4 = new JTextField();
		textField_4.setBounds(529, 327, 86, 20);
		contentPane.add(textField_4);
		textField_4.setColumns(10);
		
		JLabel label = new JLabel("");
		label.setIcon(new ImageIcon("C:\\Users\\Sergio Lopez\\Documents\\EclipseLuna\\SEGUNDA FASE\\Royal_Decameron_Tafoukt_Beach_5.jpg"));
		label.setBounds(181, 11, 246, 206);
		contentPane.add(label);
		
		JButton btnNuevo = new JButton("NUEVO");
		btnNuevo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				limpiar();
				
			}
		});
		btnNuevo.setIcon(new ImageIcon("C:\\Users\\Sergio Lopez\\Documents\\EclipseLuna\\SEGUNDA FASE\\onebit_20.png"));
		btnNuevo.setBounds(10, 25, 137, 79);
		contentPane.add(btnNuevo);
		
		JButton btnAgregar = new JButton("AGREGAR");
		btnAgregar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			if(textField.getText().equals("") || textField_1.getText().equals("") || textField_2.getText().equals("") || textField_3.getText().equals("") || textField_4.getText().equals("")){
				JOptionPane.showMessageDialog(null, "necesita llenar todos los campos para crear un nuevo registro");
			}else{
				JOptionPane.showMessageDialog(null, "proceso realizado con exito");
				listaRestaurantes.agregar(textField.getText(), textField_1.getText(), textField_2.getText(), textField_3.getText(), textField_4.getText());
		}
			}
		});
		btnAgregar.setIcon(new ImageIcon("C:\\Users\\Sergio Lopez\\Documents\\EclipseLuna\\SEGUNDA FASE\\onebit_12.png"));
		btnAgregar.setBounds(10, 102, 137, 73);
		contentPane.add(btnAgregar);
		
		JButton btnEliminar = new JButton("ELIMINAR");
		btnEliminar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String dato=JOptionPane.showInputDialog(null,"ingrese el codigo del restaurante a eliminar");
				listaRestaurantes.remover(dato);
			}
		});
		btnEliminar.setIcon(new ImageIcon("C:\\Users\\Sergio Lopez\\Documents\\EclipseLuna\\SEGUNDA FASE\\onebit_33.png"));
		btnEliminar.setBounds(10, 173, 137, 74);
		contentPane.add(btnEliminar);
		
		JButton btnSalir = new JButton("SALIR");
		btnSalir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				setVisible(false);
			}
		});
		btnSalir.setIcon(new ImageIcon("C:\\Users\\Sergio Lopez\\Documents\\EclipseLuna\\SEGUNDA FASE\\salir_cac5.gif"));
		btnSalir.setBounds(10, 246, 137, 74);
		contentPane.add(btnSalir);
		
		JButton btnMostrar = new JButton("MOSTRAR");
		btnMostrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				listaRestaurantes.mostrar();
			}
		});
		btnMostrar.setBounds(28, 344, 89, 23);
		contentPane.add(btnMostrar);
		
		JLabel label_1 = new JLabel("");
		label_1.setIcon(new ImageIcon("C:\\Users\\Sergio Lopez\\Documents\\EclipseLuna\\SEGUNDA FASE\\fondo.jpg"));
		label_1.setBounds(181, 255, 458, 112);
		contentPane.add(label_1);
		
		JLabel label_2 = new JLabel("");
		label_2.setIcon(new ImageIcon("C:\\Users\\Sergio Lopez\\Documents\\EclipseLuna\\SEGUNDA FASE\\fondoazulceleste.jpg"));
		label_2.setBounds(0, 11, 163, 371);
		contentPane.add(label_2);
		
		JLabel label_3 = new JLabel("");
		label_3.setIcon(new ImageIcon("C:\\Users\\Sergio Lopez\\Documents\\EclipseLuna\\SEGUNDA FASE\\fondoazulceleste.jpg"));
		label_3.setBounds(173, 239, 475, 143);
		contentPane.add(label_3);
		
		JLabel label_4 = new JLabel("");
		label_4.setIcon(new ImageIcon("C:\\Users\\Sergio Lopez\\Documents\\EclipseLuna\\SEGUNDA FASE\\34195_407315868365_21129518365_4543493_4218284_n.jpg"));
		label_4.setBounds(429, 11, 210, 206);
		contentPane.add(label_4);
		
		JLabel label_5 = new JLabel("");
		label_5.setIcon(new ImageIcon("C:\\Users\\Sergio Lopez\\Documents\\EclipseLuna\\SEGUNDA FASE\\fondoMenu.png"));
		label_5.setBounds(0, 0, 681, 393);
		contentPane.add(label_5);
	}
	 public void limpiar(){
         this.textField.setText("");
       this.textField_1.setText("");
        this.textField_2.setText(""); 
        this.textField_3.setText("");
        this.textField_4.setText("");
        
}
}
