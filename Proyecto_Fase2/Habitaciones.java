package hoteles_de_centro_america;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JList;
import javax.swing.JButton;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JInternalFrame;

public class Habitaciones extends JFrame {

	private JPanel contentPane;
	private JTable table_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Habitaciones frame = new Habitaciones();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Habitaciones() {
		setTitle("HABITACIONES");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 433, 480);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JPanel panel = new JPanel();
		contentPane.add(panel, BorderLayout.CENTER);
		panel.setLayout(null);
		
		JButton btnNewButton = new JButton("PRIMERA CLASE");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				Creacion_Habitaciones crear= new Creacion_Habitaciones();
		    	Lista_habitaciones primera= new Lista_habitaciones();
		    	Lista_habitaciones segunda= new Lista_habitaciones();
		    	Lista_habitaciones tercera= new Lista_habitaciones();
		    	
		    	crear.CrearListaHabitaciones(150,1, primera);
		    	crear.CrearListaHabitaciones(350,151, segunda);
		    	crear.CrearListaHabitaciones(552,351, tercera);
		    	
		    	crear.imprimir(primera);
		    	crear.imprimir(segunda);
		    	crear.imprimir(tercera);
			
		    
				
				
				
			}
		});
		btnNewButton.setBounds(10, 26, 125, 23);
		panel.add(btnNewButton);
		
		JButton btnSegundaClase = new JButton("SEGUNDA CLASE");
		btnSegundaClase.setBounds(10, 60, 125, 23);
		panel.add(btnSegundaClase);
		
		JButton btnTerceraClase = new JButton("TERCERA CLASE");
		btnTerceraClase.setBounds(10, 94, 125, 23);
		panel.add(btnTerceraClase);
		
		JButton btnAceptar = new JButton("ACEPTAR");
		btnAceptar.setBounds(30, 128, 91, 23);
		panel.add(btnAceptar);
		
		table_1 = new JTable();
		table_1.setBounds(388, 285, -225, -258);
		panel.add(table_1);
	}
}
