/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package hoteles_de_centro_america;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 *
 * @author Bravo
 */
public class Menu_Reservar {

    public Menu_Reservar() {
    }
    JFrame ventanaReservar = new JFrame();
    JTextField nombretxt = new JTextField();
    JTextField apellidotxt = new JTextField();
    JTextField pasaportetxt = new JTextField();
    JTextField numeroteltxt = new JTextField();
    JTextField edadtxt = new JTextField();
    JTextField fechaintxt = new JTextField();
    JTextField fechaouttxt = new JTextField();
    JTextField ntarjetatxt = new JTextField();
    JLabel lnombre = new JLabel("NOMBRE");
    JLabel lapellido = new JLabel("APELLIDO");
    JLabel lpasaporte = new JLabel("PASAPORTE");
    JLabel lnumerotel = new JLabel("TELEFONO");
    JLabel ledad = new JLabel("EDAD");
    JLabel lfechain = new JLabel("FECHA INGRESO");
    JLabel lfechaout = new JLabel("FECHA SALIDA");
    JLabel lntarjeta = new JLabel("NO. TARJETA");
    JButton aceptarbutton = new JButton("ACEPTAR");
    
    String nombre;
    String apellido;
    int pasaporte=0;
    int numerotel=0;
    int edad=0;
    String fechain;
    String fechaout;
    int ntarjeta=0;
            

    public void menuReservar() {
        ventanaReservar.setVisible(true);
        ventanaReservar.setBounds(50, 50, 400, 400);
        ventanaReservar.setLayout(null);

        ventanaReservar.add(lnombre);
        ventanaReservar.add(lapellido);
        ventanaReservar.add(lpasaporte);
        ventanaReservar.add(lnumerotel);
        ventanaReservar.add(ledad);
        ventanaReservar.add(lfechain);
        ventanaReservar.add(lfechaout);
        ventanaReservar.add(lntarjeta);
        ventanaReservar.add(nombretxt);
        ventanaReservar.add(apellidotxt);
        ventanaReservar.add(pasaportetxt);
        ventanaReservar.add(numeroteltxt);
        ventanaReservar.add(edadtxt);
        ventanaReservar.add(fechaintxt);
        ventanaReservar.add(fechaouttxt);
        ventanaReservar.add(ntarjetatxt);
        ventanaReservar.add(aceptarbutton);

        lnombre.setVisible(true);
        lnombre.setBounds(25, 25, 100, 30);

        lapellido.setVisible(true);
        lapellido.setBounds(25, 60, 100, 30);

        lpasaporte.setVisible(true);
        lpasaporte.setBounds(25, 95, 100, 30);

        lnumerotel.setVisible(true);
        lnumerotel.setBounds(25, 130, 100, 30);

        ledad.setVisible(true);
        ledad.setBounds(25, 165, 100, 30);

        lfechain.setVisible(true);
        lfechain.setBounds(25, 200, 100, 30);

        lfechaout.setVisible(true);
        lfechaout.setBounds(25, 235, 100, 30);

        lntarjeta.setVisible(true);
        lntarjeta.setBounds(25, 270, 100, 30);

        nombretxt.setVisible(true);
        nombretxt.setBounds(130, 25, 100, 30);

        apellidotxt.setVisible(true);
        apellidotxt.setBounds(130, 60, 100, 30);

        pasaportetxt.setVisible(true);
        pasaportetxt.setBounds(130, 95, 100, 30);

        numeroteltxt.setVisible(true);
        numeroteltxt.setBounds(130, 130, 100, 30);

        edadtxt.setVisible(true);
        edadtxt.setBounds(130, 165, 100, 30);

        fechaintxt.setVisible(true);
        fechaintxt.setBounds(130, 200, 100, 30);

        fechaouttxt.setVisible(true);
        fechaouttxt.setBounds(130, 235, 100, 30);

        ntarjetatxt.setVisible(true);
        ntarjetatxt.setBounds(130, 270, 100, 30);
        
        aceptarbutton.setVisible(true);
        aceptarbutton.setBounds(250, 250, 100, 30);
        Aceptar aceptar=new Aceptar();
        aceptarbutton.addActionListener(aceptar);

    }

    private class Aceptar implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            Lista_Clientes listaClientes=new Lista_Clientes();
            nombre=nombretxt.getText();
            apellido=apellidotxt.getText();
            pasaporte= Integer.parseInt(pasaportetxt.getText());
            numerotel=Integer.parseInt(numeroteltxt.getText());
            edad= Integer.parseInt(edadtxt.getText());
            fechain= fechaintxt.getText();
            fechaout= fechaouttxt.getText();
            ntarjeta= Integer.parseInt(ntarjetatxt.getText());
            
           // Nodo_Clientes nuevo=new Nodo_Clientes(nombre, apellido, numerotel, pasaporte, edad, fechain, fechaout, ntarjeta );
         //   listaClientes.agregar(nuevo);
           // listaClientes.imprimir(nuevo);
            
            ventanaReservar.dispose();
           
                    
            
        }
    }
    
    
        
  
        
     

   }
   
    
    

