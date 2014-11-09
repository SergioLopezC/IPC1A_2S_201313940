import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Frame;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.SwingConstants;
import javax.swing.JMenuItem;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import java.awt.Color;
import java.util.Calendar;
import java.awt.Toolkit;


public class MenuPrincipal extends JFrame  {

	private JPanel contentPane;
	Hotel hotel=new Hotel();
	
	
	public MenuPrincipal() {
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\Sergio Lopez\\Documents\\EclipseLuna\\SEGUNDA FASE\\whosamungus-usuario-icono-6392-96.png"));
		 Calendar cal=Calendar.getInstance();
		 String fecha=cal.get(Calendar.DATE)+"/"+cal.get(Calendar.MONTH)+"/"+cal.get(cal.YEAR);
		String hora=cal.get(cal.HOUR_OF_DAY)+":"+cal.get(Calendar.MINUTE)+":"+cal.get(cal.SECOND); 
		
	
	
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 719, 534);
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu mnNewMenu = new JMenu("HOTEL");
		menuBar.add(mnNewMenu);
		
		JMenuItem mntmCrearHotel = new JMenuItem("CREAR HOTEL");
		mntmCrearHotel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				hotel.setVisible(true);
				
			}
		});
		mnNewMenu.add(mntmCrearHotel);
		
		JMenu mnReservacion = new JMenu("HOSPEDAJE");
		menuBar.add(mnReservacion);
		
		JMenuItem mntmRegistrarHospedaje = new JMenuItem("REGISTRAR HOSPEDAJE");
		mntmRegistrarHospedaje.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
					hotel.hospedaje.setVisible(true);
			}
		});
		mnReservacion.add(mntmRegistrarHospedaje);
		
		JMenu mnClientes = new JMenu("CLIENTE");
		menuBar.add(mnClientes);
		
		JMenuItem mntmRegistrarCliente = new JMenuItem("REGISTRAR CLIENTE");
		mntmRegistrarCliente.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
		hotel.hospedaje.clientes.setVisible(true);	
		//	ListaHotel.this.inicio.hos.setVisible(true);
			}
		});
		mnClientes.add(mntmRegistrarCliente);
		
		JMenu mnNewMenu_1 = new JMenu("HABITACION");
		menuBar.add(mnNewMenu_1);
		
		JMenuItem mntmRegistrarHabitacion = new JMenuItem("REGISTRAR HABITACION");
		mntmRegistrarHabitacion.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				hotel.hospedaje.habitaciones.setVisible(true);
			
			}
		});
		mnNewMenu_1.add(mntmRegistrarHabitacion);
		
		JMenu mnNewMenu_2 = new JMenu("RESTAURANTES");
		menuBar.add(mnNewMenu_2);
		
		JMenuItem mntmRegistrarRestaurante = new JMenuItem("REGISTRAR RESTAURANTE");
		mntmRegistrarRestaurante.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
	hotel.hospedaje.res.setVisible(true);	
			}
		});
		mnNewMenu_2.add(mntmRegistrarRestaurante);
		
		JMenu mnNewMenu_3 = new JMenu("SERVICIOS");
		menuBar.add(mnNewMenu_3);
		
		JMenuItem mntmCrearNuevoServicio = new JMenuItem("CREAR NUEVO SERVICIO");
		mntmCrearNuevoServicio.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
	hotel.hospedaje.servicios.setVisible(true);
			}
		});
		mnNewMenu_3.add(mntmCrearNuevoServicio);
		
		JMenu mnReportes = new JMenu("PROMOCIONES Y PAQUETES");
		menuBar.add(mnReportes);
		
		JMenuItem mntmCrearPromocion = new JMenuItem("CREAR PROMOCION");
		mntmCrearPromocion.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			hotel.hospedaje.promos.setVisible(true);
			}
		});
		mnReportes.add(mntmCrearPromocion);
		
		JMenu mnSalir = new JMenu("SALIR");
		mnSalir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				setDefaultCloseOperation(EXIT_ON_CLOSE);
			}
		});
		
		JMenu mnReservaciones = new JMenu("RESERVACIONES");
		menuBar.add(mnReservaciones);
		
		JMenuItem mntmHacerReservacion = new JMenuItem("HACER RESERVACION");
		mntmHacerReservacion.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				hotel.hospedaje.reservar.setVisible(true);
			}
		});
		mnReservaciones.add(mntmHacerReservacion);
		menuBar.add(mnSalir);
		contentPane = new JPanel();
		contentPane.setBackground(Color.BLACK);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setBounds(85, 56, 540, 368);
		lblNewLabel.setVerticalAlignment(SwingConstants.TOP);
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\Sergio Lopez\\Documents\\EclipseLuna\\SEGUNDA FASE\\royal-decameron-salinitas.jpg"));
		contentPane.add(lblNewLabel);
		
		JLabel label1 = new JLabel("");
		label1.setFont(new Font("Tahoma", Font.BOLD, 13));
		label1.setForeground(Color.WHITE);
		label1.setBounds(250, 435, 98, 29);
		label1.setText(fecha);
		contentPane.add(label1);
		
		JLabel lblHotelesRoyalDecameron = new JLabel("Hoteles Royal Decameron");
		lblHotelesRoyalDecameron.setForeground(Color.WHITE);
		lblHotelesRoyalDecameron.setFont(new Font("Traditional Arabic", Font.BOLD, 21));
		lblHotelesRoyalDecameron.setBounds(234, 11, 308, 50);
		contentPane.add(lblHotelesRoyalDecameron);
		
		JLabel label2 = new JLabel("");
		label2.setFont(new Font("Tahoma", Font.BOLD, 13));
		label2.setForeground(Color.WHITE);
		label2.setBounds(424, 435, 98, 29);
		contentPane.add(label2);
		label2.setText(hora);
		
		JLabel lblFecha = new JLabel("Fecha:");
		lblFecha.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblFecha.setForeground(Color.WHITE);
		lblFecha.setBounds(177, 439, 63, 21);
		contentPane.add(lblFecha);
		
		JLabel lblHora = new JLabel("Hora:");
		lblHora.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblHora.setForeground(Color.WHITE);
		lblHora.setBounds(358, 441, 46, 14);
		contentPane.add(lblHora);
		setVisible(true);
	}
}
