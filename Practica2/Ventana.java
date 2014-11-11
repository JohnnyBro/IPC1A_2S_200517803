

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Enumeration;
import java.util.StringTokenizer;







import javax.swing.Box;
import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;




public class Ventana {
	JFrame frame= new JFrame();

	JMenuBar menubar= new JMenuBar();
	JMenu menu= new JMenu("Menu");
	JMenuItem abrir= new JMenuItem("Abrir");
	JMenuItem guardar= new JMenuItem("Guardar");
	JMenuItem salir= new JMenuItem("Salir");
	JTextArea texto= new JTextArea("");
	Box cuadro = Box.createHorizontalBox();
	JButton boton1= new JButton("Avanzar");
	JButton boton2= new JButton("Retroceder");
	Pintar p = new Pintar();

	JTextArea textarea= new JTextArea();
	JLabel nombretext= new JLabel();
	int[] pasajerosPrimeraClase;
	int[] pasajerosTerceraClase;
	int[] km;
	Locomotora l = new Locomotora();
	
	public  Ventana()
	{
		
		JPanel contenedor = new JPanel();
		contenedor.setLayout(new GridLayout());
		contenedor.add(p);
	
	
		frame.setTitle("Train Simulator 1885");   
		frame.setSize(1000, 600);
		frame.setLayout(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.add(textarea);
		frame.add(nombretext);
		frame.add(menubar);
		frame.add(cuadro);
		frame.add(new Pintar());
		textarea.setVisible(false);
		textarea.setBounds(50, 50, 890, 250);
		nombretext.setVisible(true);
		nombretext.setBounds(25, 30, 950, 10);
		cuadro.setBounds(50, 50, 890, 250);
		cuadro.setVisible(false);
		cuadro.add(new JScrollPane(textarea));
		frame.add(boton1);
		frame.add(boton2);
		boton1.setBounds(30, 520, 100, 30);
		boton2.setBounds(140, 520, 100, 30);
		frame.add(contenedor);
		


		menubar.add(menu);
		menubar.setBounds(0, 0, 1000, 20);
		menu.add(abrir=new JMenuItem("Abrir"));
		menu.add(guardar=new JMenuItem("Guardar"));
		menu.add(salir= new JMenuItem("Salir"));


		Abrir open=new Abrir();
		abrir.addActionListener(open);
		Guardar save= new Guardar();
		guardar.addActionListener(save);
		Salir exit=new Salir();
		salir.addActionListener(exit);

	}
	
	

	private class Abrir implements ActionListener
	{

		@SuppressWarnings("deprecation")
		@Override
		public void actionPerformed(ActionEvent arg0) {
			// TODO Auto-generated method stub

			JFileChooser seleccionar = new JFileChooser();
			seleccionar.setCurrentDirectory(new java.io.File("."));
			seleccionar.setDialogTitle("Directorio");
			seleccionar.setFileSelectionMode(JFileChooser.FILES_AND_DIRECTORIES);
			seleccionar.setAcceptAllFileFilterUsed(false);

			if (seleccionar.showOpenDialog(null) == JFileChooser.APPROVE_OPTION) {
				//System.out.println("Directorio: " + seleccionar.getCurrentDirectory());
				nombretext.setText(seleccionar.getSelectedFile()+"");
				cuadro.setVisible(true);
				textarea.setVisible(true);		
				String ruta1="";
				ruta1=nombretext.getText();

				String infor="";
				try{
					String line;
					FileInputStream is = new FileInputStream(ruta1);
					DataInputStream ds =new DataInputStream(is);
					while((line=ds.readLine())!=null){
						infor=infor+line+"\n";

					}
					String[] a=infor.split(" ");
					for(int i=0 ; i< a.length; i++){
						System.out.println(a[i]);
					}
					
					int aux1=0;
					int aux2=1;
					int aux3=2;
					
					pasajerosPrimeraClase=new int[a.length];
					 for(int i=0; i < a.length; i++){
						
						 
						 pasajerosPrimeraClase[i]= Integer.parseInt(a[aux1]);
						 System.out.println(pasajerosPrimeraClase[i]);
						 aux1=aux1+3;
					 }
					 
					 pasajerosTerceraClase= new int[a.length];
					 for(int i=0; i < a.length; i++){
						 pasajerosTerceraClase[i]= Integer.parseInt(a[aux2]);
						 System.out.println(pasajerosTerceraClase[i]);
						 aux2=aux2+3;
					 }
						 
					 km =new int[a.length];
					 for(int i=0; i < a.length; i++){
						 km[i]= Integer.parseInt(a[aux3]);
						 System.out.println(km[i]);
						 aux3=aux3+3;
					 }
					 
					/*String[] a1 = infor.split(" ");
					for(int i=0; i<a1.length; i++){
						if(i%1 ==0)
							pasajerosPrimeraClase[i] = Integer.parseInt(a1[i]);
						if(i%2 == 0)
							pasajerosTerceraClase[i] = Integer.parseInt(a1[i]);
						else{
							km[i] = Integer.parseInt(a1[i]);}
						
						creaVagon();
					}*/
					
					
					
					ds.close();
					is.close();
				}
				catch(IOException evr){
					System.out.println("Error de archivo "+evr);
				}
				textarea.setText(infor);
			} else {
				textarea.setVisible(false);
			}
			
			
			/*String datos="";
			datos=textarea.getSelectedText();
			StringTokenizer token=new StringTokenizer(datos);
			System.out.println(token.countTokens());
	
			
			//while ( token.hasMoreTokens() )
		   // System.out.println( token.nextToken() );
			
*/
		}

	}
	//Metodo Guardar
	private class Guardar implements ActionListener
	{

		@Override
		public void actionPerformed(ActionEvent arg0) {

			String ruta2;
			String agregar;
			agregar=textarea.getText();
			ruta2=nombretext.getText();
			try{
				FileOutputStream os= new FileOutputStream(ruta2);
				os.write(agregar.getBytes());
				os.close();
			}catch(IOException ev){
				System.out.println("Error de Archivo "+ ev);

			}

		}

	}


	//Metodo Salir
	private class Salir implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent arg0) {
			// TODO Auto-generated method stub
			System.exit(0);
		}

	}


	public void creaVagon() {
			
	for(int i =0; i<pasajerosPrimeraClase.length; i++){
		System.out.println("pasajerosPrimeraClase[i]");
		System.out.println("pasajerosTerceraClase[i]");
		System.out.println("km[i]");

		
		
	}
		
	}
	
	

		

		
		
	}




