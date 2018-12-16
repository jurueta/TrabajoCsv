/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

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
    }
  
}
