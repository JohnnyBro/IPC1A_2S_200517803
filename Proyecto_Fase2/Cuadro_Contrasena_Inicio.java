/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package hoteles_de_centro_america;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 *
 * @author Bravo
 */
public class Cuadro_Contrasena_Inicio extends javax.swing.JFrame {
    //Creacion de la ventana tipo JFrame y todos sus componentes

    JFrame cuadroInicio = new JFrame();
    JTextField nombretext = new JTextField();
    JTextField passwordtext = new JTextField();
    JLabel nombre = new JLabel("Nombre");
    JLabel password = new JLabel("Password");
    JButton aceptar = new JButton("ACEPTAR");
    int intentos = 0;

    //Constructor
    public Cuadro_Contrasena_Inicio() {
    }

    //Metodo para crear la ventana de inicio
    public void ventanaInicio() {
        cuadroInicio.setVisible(true);
        cuadroInicio.setLayout(null);
        cuadroInicio.setTitle("Hoteles de Centro America");
        cuadroInicio.setBounds(100, 100, 400, 150);
        cuadroInicio.setDefaultCloseOperation(EXIT_ON_CLOSE);
        cuadroInicio.setResizable(false);

        cuadroInicio.add(nombretext);
        nombretext.setBounds(130, 20, 100, 20);
        nombretext.setVisible(true);

        cuadroInicio.add(passwordtext);
        passwordtext.setBounds(130, 50, 100, 20);
        passwordtext.setVisible(true);

        cuadroInicio.add(nombre);
        nombre.setBounds(20, 20, 75, 20);
        nombre.setVisible(true);

        cuadroInicio.add(password);
        password.setBounds(20, 50, 75, 20);
        password.setVisible(true);

        cuadroInicio.add(aceptar);
        aceptar.setVisible(true);
        aceptar.setBounds(270, 80, 100, 30);

        Acceso acceso = new Acceso();
        aceptar.addActionListener(acceso);
    }

    private class Acceso implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {



            if (nombretext.getText().equals("1") && passwordtext.getText().equals("1")) {
                Menu_Principal menuPrincipal = new Menu_Principal();
                menuPrincipal.ventanaMenuPrincipal();
                cuadroInicio.dispose();
                nombretext.setText(" ");
                passwordtext.setText(" ");

            } else {
                //String mensaje="La contraseÃ±a es incorrecta";
                nombretext.setText(" ");
                passwordtext.setText(" ");

                JOptionPane.showMessageDialog(cuadroInicio, "La contraseña es incorrecta");
                intentos++;
                cuadroInicio.show();

            }

            if (intentos == 3) {
                JOptionPane.showMessageDialog(cuadroInicio, "Comuniquese con Generencia");
                System.exit(0);
            }
        }
    }
}