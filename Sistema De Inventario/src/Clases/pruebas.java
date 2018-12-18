/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

import java.util.Calendar;
import java.util.Iterator;
import javax.swing.JOptionPane;

/**
 *
 * @author Urueta
 */
public class pruebas {
    public static void main(String[] args) {
        DoublyLinkedList<Integer> lista = new DoublyLinkedList<>();
        
        
        lista.addLast(123);
        lista.addLast(456);
        lista.addLast(789);
        lista.addLast(258);
        System.out.println(lista);
        lista.removeByPos(2);
        System.out.println(lista);
        Iterator<Integer> ite = lista.list();
        while (ite.hasNext()) {
            Integer next = ite.next();
            System.out.println(next);
            return;
        }   
        prueba();
        
        System.out.println(Calendar.getInstance().getWeekYear());
        System.out.println("jasdb");
        System.out.println(JOptionPane.showConfirmDialog(null, "kskñ"));
    }
   public static void prueba(){
       System.out.println("vamo a juga");
       if (1 == 1) {
           return;
       }
       System.out.println("mira");
   }
}
