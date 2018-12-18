/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

import Interfaz.Inventario;
import com.toedter.calendar.JCalendar;
import java.util.Calendar;
import java.util.HashMap;
import java.util.Iterator;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

/**
 *
 * @author Urueta
 */
public class MetodosLogin {
    private static  DoublyLinkedList<Empleado> listaIngreso = new DoublyLinkedList<Empleado>();
    
    public static void crearEmpleado(JTextField nombre, JTextField apellido, JTextField cedula,
                                     JCalendar fechaNac, JTextField celular, JTextField correo, 
                                     JTextField usuario, JTextField contra){
        
        String nom, ape, ced, cel, corr, contraseña, usua;
        int com = 0;
        nom = nombre.getText();
        ape = apellido.getText();
        ced = cedula.getText();
        cel = celular.getText();
        corr = correo.getText();
        usua = usuario.getText();
        contraseña = contra.getText();
        Iterator<Empleado> ite = listaIngreso.list();
        
        int fec = fechaNac.getYearChooser().getYear();
        
        if ( fec > (Calendar.getInstance().getWeekYear()-18)) {
            JOptionPane.showMessageDialog(null, "Fecha incorrecta Tiene que ser mayor de edad ", "Error", JOptionPane.ERROR_MESSAGE);
         int op = JOptionPane.showConfirmDialog(null, "Desea realizar excepcion ?", "Excepcion", JOptionPane.QUESTION_MESSAGE, JOptionPane.YES_NO_OPTION);
            if (op == 1) {
              return;  
            }
        }
        while (ite.hasNext()) {
            Empleado next = ite.next();
            if (usua.equals(next.getUsuario())) {
                JOptionPane.showMessageDialog(null, "Ese usuario ya existe Ingrese otro ", "Error", JOptionPane.ERROR_MESSAGE);
                return;
            }
        }
        
        
        Empleado nuevoEmpleado = new Empleado(nom, ape, ced, fechaNac.getCalendar(), cel, corr, usua, contraseña);
        listaIngreso.addLast(nuevoEmpleado); 
    }
    
    public static boolean accesoUsuario(JTextField usuario, JPasswordField contrasena){
       String Dato, Dato_2 = "";
        Dato = usuario.getText();
        Iterator<Empleado> ite = listaIngreso.list();
        for (char i : contrasena.getPassword()) {
           Dato_2 += i; 
        }
        while (ite.hasNext()) {
            Empleado next = ite.next();
            if (next.getUsuario().equals(Dato) && next.getContrasena().equals(Dato_2)) {
                return true;
            }
        } 
       return false;      
    }
    
}
