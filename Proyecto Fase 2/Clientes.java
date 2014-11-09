import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;

import java.awt.GridLayout;

import javax.swing.JLabel;
import javax.swing.BoxLayout;

import java.awt.FlowLayout;

import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JTable;
import javax.swing.JButton;
import javax.swing.ListSelectionModel;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import javax.swing.DropMode;
import javax.swing.ImageIcon;
import java.awt.Color;
import java.awt.Font;
import java.awt.Toolkit;


public class Clientes extends JFrame  {
	 
	 JPanel contentPane;
	 JTextField textField;
	 JTextField textField_1;
	 JTextField textField_2;
	 JTextField textField_3;
	 JTextField textField_4;
	 Object jTable1;
	 JTable table;
	 JTable table_1;
	 ListaClientes listaClientes;
	 
	public Clientes() {
		listaClientes=new ListaClientes();
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\Sergio Lopez\\Documents\\EclipseLuna\\SEGUNDA FASE\\clientes.png"));
	
		setBounds(100, 100, 601, 468);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(175, 238, 238));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNombre = new JLabel("DPI");
		lblNombre.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNombre.setBounds(277, 36, 114, 14);
		contentPane.add(lblNombre);
		
		textField = new JTextField();
		textField.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent evt) {
				  char car=evt.getKeyChar();
		           if(  textField.getText().length()>=8)evt.consume();
		       if((car<'0' || car>'9') ) evt.consume();
		 
			}
		});
		
		textField.setBounds(424, 33, 86, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel lblNombre_1 = new JLabel("NOMBRE");
		lblNombre_1.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNombre_1.setBounds(277, 67, 114, 14);
		contentPane.add(lblNombre_1);
		
		textField_1 = new JTextField();
		textField_1.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent evt) {
				char car=evt.getKeyChar();
			       if((car<'a' || car>'z') && (car<'A' || car>'Z')&&(car<' '||car>' ')) evt.consume();
			}
		});
		textField_1.setBounds(424, 64, 86, 20);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblSexo = new JLabel("SEXO");
		lblSexo.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblSexo.setBounds(277, 105, 114, 14);
		contentPane.add(lblSexo);
		
		textField_2 = new JTextField();
		textField_2.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent evt) {
				char car=evt.getKeyChar();
			       if((car<'a' || car>'z') && (car<'A' || car>'Z')&&(car<' '||car>' ')) evt.consume();
			}
		});
		textField_2.setBounds(424, 102, 86, 20);
		contentPane.add(textField_2);
		textField_2.setColumns(10);
		
		JLabel lblTelefono = new JLabel("TELEFONO");
		lblTelefono.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblTelefono.setBounds(277, 136, 114, 14);
		contentPane.add(lblTelefono);
		
		textField_3 = new JTextField();
		textField_3.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent evt) {
				 char car=evt.getKeyChar();
		         if(  textField_3.getText().length()>=9)evt.consume();
		        if ((car<'0'||car>'9'))evt.consume();
			}
		});
		textField_3.setBounds(424, 133, 86, 20);
		contentPane.add(textField_3);
		textField_3.setColumns(10);
		
		JLabel lblNacionalidad = new JLabel("NACIONALIDAD");
		lblNacionalidad.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNacionalidad.setBounds(277, 173, 114, 14);
		contentPane.add(lblNacionalidad);
		
		textField_4 = new JTextField();
		textField_4.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent evt) {
				char car=evt.getKeyChar();
			       if((car<'a' || car>'z') && (car<'A' || car>'Z')&&(car<' '||car>' ')) evt.consume();
			}
		});
		textField_4.setBounds(424, 170, 86, 20);
		contentPane.add(textField_4);
		textField_4.setColumns(10);
		
		JButton btnNewButton = new JButton("NUEVO");
		btnNewButton.setIcon(new ImageIcon("C:\\Users\\Sergio Lopez\\Documents\\EclipseLuna\\SEGUNDA FASE\\onebit_20.png"));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				limpiar();
				
			}
		});
		btnNewButton.setBounds(44, 228, 139, 79);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("AGREGAR");
		btnNewButton_1.setIcon(new ImageIcon("C:\\Users\\Sergio Lopez\\Documents\\EclipseLuna\\SEGUNDA FASE\\onebit_12.png"));
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(textField.getText().equals("") || textField_1.getText().equals("") || textField_2.getText().equals("") || textField_3.getText().equals("") || textField_4.getText().equals("")){
					JOptionPane.showMessageDialog(null, "Necesita llenar todos los campos para crear un nuevo registro");
				}else{
					JOptionPane.showMessageDialog(null, "proceso realizado  con exito");
			listaClientes.agregar( textField.getText(), textField_1.getText(), textField_2.getText(),textField_3.getText(),textField_4.getText());
			//textField_5.setText(textField.getText()+" "+ textField_1.getText()+" "+ textField_2.getText()+" "+textField_3.getText()+" "+textField_4.getText());
				}
				}
		});
		btnNewButton_1.setBounds(183, 228, 139, 79);
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("BUSCAR");
		btnNewButton_2.setIcon(new ImageIcon("C:\\Users\\Sergio Lopez\\Documents\\EclipseLuna\\SEGUNDA FASE\\onebit_21.png"));
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String dato=JOptionPane.showInputDialog(null,"ingrese el numero de DPI del cliente");
				listaClientes.buscar(dato);
				
			}
		});
		btnNewButton_2.setBounds(183, 303, 139, 79);
		contentPane.add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("MOSTRAR");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				listaClientes.mostrar();
				//textField_5.setText(listaClientes.actual_dpi+" "+listaClientes.actual_nombre);
			}
		});
		btnNewButton_3.setBounds(115, 406, 112, 23);
		contentPane.add(btnNewButton_3);
		
		JButton btnNewButton_4 = new JButton("ELIMINAR");
		btnNewButton_4.setIcon(new ImageIcon("C:\\Users\\Sergio Lopez\\Documents\\EclipseLuna\\SEGUNDA FASE\\onebit_33.png"));
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String dato=JOptionPane.showInputDialog(null,"ingrese el numero de DPI del cliente a eliminar");
				listaClientes.remover(dato);
			}
		});
		btnNewButton_4.setBounds(44, 303, 139, 79);
		contentPane.add(btnNewButton_4);
		
		JButton btnNewButton_6 = new JButton("SALIR");
		btnNewButton_6.setIcon(new ImageIcon("C:\\Users\\Sergio Lopez\\Documents\\EclipseLuna\\SEGUNDA FASE\\salir_cac5.gif"));
		btnNewButton_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				setVisible(false);
			}
		});
		btnNewButton_6.setBounds(463, 339, 112, 79);
		contentPane.add(btnNewButton_6);
		
		JLabel label = new JLabel("");
		label.setIcon(new ImageIcon("C:\\Users\\Sergio Lopez\\Documents\\EclipseLuna\\SEGUNDA FASE\\clientes.png"));
		label.setBounds(85, 36, 177, 154);
		contentPane.add(label);
		
		JLabel label_1 = new JLabel("");
		label_1.setIcon(new ImageIcon("C:\\Users\\Sergio Lopez\\Documents\\EclipseLuna\\SEGUNDA FASE\\fondo.jpg"));
		label_1.setBounds(72, 11, 469, 195);
		contentPane.add(label_1);
		
		JLabel label_2 = new JLabel("");
		label_2.setIcon(new ImageIcon("C:\\Users\\Sergio Lopez\\Documents\\EclipseLuna\\SEGUNDA FASE\\DECAMERON-14.jpg"));
		label_2.setBounds(10, 11, 65, 195);
		contentPane.add(label_2);
		
		JLabel label_3 = new JLabel("");
		label_3.setIcon(new ImageIcon("C:\\Users\\Sergio Lopez\\Documents\\EclipseLuna\\SEGUNDA FASE\\fondoMenu.png"));
		label_3.setBounds(0, 0, 585, 429);
		contentPane.add(label_3);
		
		
	}
	 public void limpiar(){
         this.textField.setText("");
       this.textField_1.setText("");
        this.textField_2.setText(""); 
        this.textField_3.setText("");
        this.textField_4.setText("");
        
}
}
