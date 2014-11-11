/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package hoteles_de_centro_america;


import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;

/**
 *
 * @author Bravo
 */
public class Menu_Principal {
    JFrame menuPrincipal= new JFrame();
    JButton Guatemala=new JButton("Guatemala");
    JButton Salvador= new JButton("El Salvador");
    JButton Nicaragua= new JButton("Nicaragua");
    JButton Honduras=new JButton("Honduras");
    JButton Panama=new JButton("Panama");
    JButton Belice=new JButton("Belice");
    public Menu_Principal()
    {
        
    }
    
    public void ventanaMenuPrincipal()
    {
        menuPrincipal.setLayout(null);
        menuPrincipal.setVisible(true);
        menuPrincipal.setBounds(25, 25, 400, 400);
        menuPrincipal.setTitle("Hoteles de Centro America");
        
        menuPrincipal.add(Guatemala);
        Guatemala.setVisible(true);
        Guatemala.setBounds(25, 25, 100, 30);
        
        menuPrincipal.add(Salvador);
        Salvador.setVisible(true);
        Salvador.setBounds(25, 60, 100, 30);
        
        menuPrincipal.add(Nicaragua);
        Nicaragua.setVisible(true);
        Nicaragua.setBounds(25, 95, 100, 30);
        
        menuPrincipal.add(Honduras);
        Honduras.setVisible(true);
        Honduras.setBounds(25, 130, 100, 30);
        
        menuPrincipal.add(Panama);
        Panama.setVisible(true);
        Panama.setBounds(25, 165, 100, 30);
        
        menuPrincipal.add(Belice);
        Belice.setVisible(true);
        Belice.setBounds(25, 200, 100, 30);
        
        BotonGuatemala botonguate=new BotonGuatemala();
        Guatemala.addActionListener(botonguate);
        
        BotonSalvador botonsalvador=new BotonSalvador();
        Salvador.addActionListener(botonsalvador);
        
        BotonHonduras botonhondu=new BotonHonduras();
        Honduras.addActionListener(botonhondu);
        
        BotonNicaragua botonN=new BotonNicaragua();
        Nicaragua.addActionListener(botonN);
        
        BotonBelice botonbelice=new BotonBelice();
        Belice.addActionListener(botonbelice);
        
        BotonPanama botonpanama= new BotonPanama();
        Panama.addActionListener(botonpanama);
     
     
    }
    
    private class BotonGuatemala implements ActionListener
    {

        @Override
        public void actionPerformed(ActionEvent e) {
            Menu_Guatemala menuguate=new Menu_Guatemala();
            menuguate.ventanaPais();
            menuPrincipal.dispose();
            
            
             }
    }
    private class BotonSalvador implements ActionListener
    {

        @Override
        public void actionPerformed(ActionEvent e) {
            Menu_Salvador menusalvador=new Menu_Salvador();
            menusalvador.ventanaPais();
            menuPrincipal.dispose();
             }
}
    
    private class BotonHonduras implements ActionListener
    {

        @Override
        public void actionPerformed(ActionEvent e) {
            Menu_Honduras menuHonduras=new Menu_Honduras();
            menuHonduras.ventanaPais();
            menuPrincipal.dispose();
             }   
}
    
    private class BotonNicaragua implements ActionListener
    {

        @Override
        public void actionPerformed(ActionEvent e) {
            Menu_Nicaragua menuN=new Menu_Nicaragua();
            menuN.ventanaPais();
            menuPrincipal.dispose();
             }
}
    
    private class BotonPanama implements ActionListener
    {

        @Override
        public void actionPerformed(ActionEvent e) {
            Menu_Panama menuN=new Menu_Panama();
            menuN.ventanaPais();
            menuPrincipal.dispose();
             }
}
    
    
    private class BotonBelice implements ActionListener
    {

        @Override
        public void actionPerformed(ActionEvent e) {
            Menu_Belice menuN=new Menu_Belice();
            menuN.ventanaPais();
            menuPrincipal.dispose();
             }
}
    
    
}
