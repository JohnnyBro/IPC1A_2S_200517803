package hoteles_de_centro_america;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JFormattedTextField;
import javax.swing.LookAndFeel;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

import com.toedter.calendar.JCalendar;
import com.toedter.calendar.JDateChooser;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.text.DateFormat;
import java.util.Calendar;

import javax.swing.JTable;
import javax.swing.JScrollPane;

public class Menu_Reservacion extends JFrame {

	private JPanel contentPane;
	private JTextField nombretxt;
	private JTextField apellidotxt;
	private JTextField edadtxt;
	private JTextField pasaportetxt;
	private JTextField numeroteltxt;
	private JTextField tarjetatxt;
	
	final JDateChooser calendario1=new JDateChooser();
	final JDateChooser calendario2=new JDateChooser();
	
	String[][] datos= {};
	String[] titulos = {"Nombre","Apellido","Edad","Pasaporte","Tarjeta"};
	private DefaultTableModel modelo= new DefaultTableModel(datos,titulos);
	int cont=0;
	
	String[][] datos1= {};
	String[] titulos1 = {"Nombre","Apellido","Edad","Pasaporte","Tarjeta"};
	private DefaultTableModel modelo1= new DefaultTableModel(datos1,titulos1);
	int aux=0;
	
	Lista_Clientes listaClientes=new Lista_Clientes();
	
	
	
	    String nombre;
	    String apellido; 
	    int pasaporte=0;
	    int numerotel=0;
	    int edad=0;
	    int fechain;
	    int fechaout;
	    int ntarjeta=0;
	    private JTable table;
	    private JTable table_1;
	    private JTable table_2;
	    private JTable table_3;

	/**
	 * Launch the application.
	 */
	/*public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				
				
				try {
					Menu_Reservacion frame = new Menu_Reservacion();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}*/

	/**
	 * Create the frame.
	 */
	public Menu_Reservacion() {
		setTitle("RESERVACIONES");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 769, 586);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JPanel panel = new JPanel();
		contentPane.add(panel, BorderLayout.CENTER);
		panel.setLayout(null);
		
		JLabel lblnombre = new JLabel("NOMBRE");
		lblnombre.setBounds(29, 11, 59, 24);
		panel.add(lblnombre);
		
		JLabel lblapellido = new JLabel("APELLIDO");
		lblapellido.setBounds(29, 46, 59, 24);
		panel.add(lblapellido);
		
		JLabel lblpasaporte = new JLabel("# PASAPORTE");
		lblpasaporte.setBounds(29, 116, 75, 24);
		panel.add(lblpasaporte);
		
		JLabel lbltelefono = new JLabel("# TELEFONO");
		lbltelefono.setBounds(29, 151, 75, 24);
		panel.add(lbltelefono);
		
		JLabel lbledad = new JLabel("EDAD");
		lbledad.setBounds(29, 81, 59, 24);
		panel.add(lbledad);
		
		JLabel lblfechain = new JLabel("FECHA IN");
		lblfechain.setBounds(29, 221, 75, 24);
		panel.add(lblfechain);
		
		JLabel lblfechaout = new JLabel("FECHA OUT");
		lblfechaout.setBounds(29, 256, 75, 24);
		panel.add(lblfechaout);
		
		JLabel lbltarjeta = new JLabel("# TARJETA");
		lbltarjeta.setBounds(29, 186, 75, 24);
		panel.add(lbltarjeta);
		
		JButton btnNewButton = new JButton("ACEPTAR");
		
		//accion del boton aceptar
		
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				
		          if(nombretxt.getText().equals("") || apellidotxt.getText().equals("") || pasaportetxt.getText().equals("") || numeroteltxt.getText().equals("") || edadtxt.getText().equals("") || tarjetatxt.getText().equals("")){ 
		          JOptionPane.showMessageDialog(rootPane, "LLene los espacios en blanco");
		          setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		   
		          }else{
		    
	            nombre=nombretxt.getText();
	            apellido=apellidotxt.getText();
	            String passport= pasaportetxt.getText().toString();
	            System.out.println(passport);
	            pasaporte= Integer.parseInt(passport);
	            
	            numerotel= Integer.parseInt(numeroteltxt.getText());
	            edad= Integer.parseInt(edadtxt.getText());
	            ntarjeta = Integer.parseInt(tarjetatxt.getText());
	           // fechain=calendario1.getCalendar().get(Calendar.DAY_OF_MONTH);
	            //fechaout=calendario2.getCalendar().get(Calendar.DAY_OF_MONTH);
	            //System.out.println(fechain);
	            //System.out.println(fechaout);
	          
	            Nodo_Clientes nuevo=new Nodo_Clientes(nombre, apellido, numerotel, pasaporte, edad, ntarjeta );
	            listaClientes.agregar(nuevo);
	            listaClientes.imprimir(nuevo);

		        
	           
	            nombretxt.setText("");
	            apellidotxt.setText("");
	            pasaportetxt.setText("");
	            numeroteltxt.setText("");
	            edadtxt.setText("");
	            tarjetatxt.setText("");
	            setDefaultCloseOperation(DISPOSE_ON_CLOSE);
	            cargarClientes(nuevo);
	            
		          }
				
			}
		});
		

		
		
		btnNewButton.setBounds(246, 222, 117, 28);
		panel.add(btnNewButton);
		
		nombretxt = new JTextField();
		nombretxt.setBounds(119, 13, 191, 20);
		panel.add(nombretxt);
		nombretxt.setColumns(10);
		
		apellidotxt = new JTextField();
		apellidotxt.setColumns(10);
		apellidotxt.setBounds(119, 48, 191, 20);
		panel.add(apellidotxt);
		
		edadtxt = new JTextField();
		edadtxt.addKeyListener(new KeyAdapter() {
			//validando el JTextField
			@Override
			public void keyTyped(KeyEvent arg0) {
				
				char c= arg0.getKeyChar();
				if(c<'0'||c>'9')arg0.consume();
			}
		});
		edadtxt.setColumns(10);
		edadtxt.setBounds(119, 83, 86, 20);
		panel.add(edadtxt);
		
		pasaportetxt = new JTextField();
		pasaportetxt.addKeyListener(new KeyAdapter() {
			//validando el JTextField
			@Override
			public void keyTyped(KeyEvent arg0) {
				char c= arg0.getKeyChar();
				if(c<'0'||c>'9')arg0.consume();
				
			}
		});
		pasaportetxt.setColumns(10);
		pasaportetxt.setBounds(119, 118, 191, 20);
		panel.add(pasaportetxt);
		
		numeroteltxt = new JTextField();
		numeroteltxt.addKeyListener(new KeyAdapter() {
			//validando el JTextField
			@Override
			public void keyTyped(KeyEvent e) {
				char c= e.getKeyChar();
				if(c<'0'||c>'9')e.consume();
			}
		});
		numeroteltxt.setColumns(10);
		numeroteltxt.setBounds(119, 153, 191, 20);
		panel.add(numeroteltxt);
		
		tarjetatxt = new JTextField();
		tarjetatxt.addKeyListener(new KeyAdapter() {
			//validando el JTextField
			@Override
			public void keyTyped(KeyEvent e) {
				char c= e.getKeyChar();
				if(c<'0'||c>'9')e.consume();
			}
		});
		tarjetatxt.setColumns(10);
		tarjetatxt.setBounds(119, 188, 191, 20);
		panel.add(tarjetatxt);
		
		final JDateChooser calendario1 = new JDateChooser();
		calendario1.getCalendarButton().addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			System.out.println(calendario1.getDate());	
			}
		});
		calendario1.setBounds(124, 225, 81, 20);
		panel.add(calendario1);
		
		JDateChooser calendario2 = new JDateChooser();
		calendario2.setBounds(124, 260, 81, 20);
		panel.add(calendario2);
		
		JButton btnH = new JButton("MENU ANTERIOR");
		btnH.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent arg0) {
				
				Menu_Pais menuPais=new Menu_Pais();
				menuPais.ventanaPais();
				setDefaultCloseOperation(DISPOSE_ON_CLOSE);
			}
		});
		btnH.setBounds(246, 256, 117, 29);
		panel.add(btnH);
		
		JButton btnNewButton_1 = new JButton("BUSCAR HABITACION");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnNewButton_1.setBounds(144, 291, 158, 33);
		panel.add(btnNewButton_1);
		
		table = new JTable();
		table.setBounds(419, 26, 191, 279);
		table.setModel(modelo);
		
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(375, 11, 362, 286);
		scrollPane.setViewportView(table);
		panel.add(scrollPane);
		
		
		
		table_3 = new JTable();
		table_3.setBounds(368, 505, -248, -89);
		table_3.setModel(modelo1);
		
		JScrollPane scrollPane_1 = new JScrollPane();
		scrollPane_1.setBounds(29, 370, 531, 133);
		scrollPane_1.setViewportView(table_3);
		panel.add(scrollPane_1);
		
	
		
	
	
		
		
		
		
		
		
	
	}

	private void cargarClientes(Nodo_Clientes auxiliar) {
		// TODO Auto-generated method stub
			modelo.insertRow(cont, new Object[]{});
			modelo.setValueAt(auxiliar.getNombre(), cont, 0);
			modelo.setValueAt(auxiliar.getApellido(), cont, 1);
			modelo.setValueAt(auxiliar.getEdad(), cont, 2);
			modelo.setValueAt(auxiliar.getPasaporte(), cont, 3);
			modelo.setValueAt(auxiliar.getNtarjeta(), cont, 4);
			cont++;
		
	}
}
