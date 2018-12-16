/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

/**
 *
 * @author Urueta
 * @param <U>
 */

public class DoublyNode<U> {
    
 private DoublyNode<U> next;
 private DoublyNode<U> Previous;
 private U info;

    public DoublyNode() {
    }

    public DoublyNode(U info) {
        this.info = info;
    }

    public DoublyNode<U> getNext() {
        return next;
    }

    public void setNext(DoublyNode<U> next) {
        this.next = next;
    }

    public DoublyNode<U> getPrevious() {
        return Previous;
    }

    public void setPrevious(DoublyNode<U> Previous) {
        this.Previous = Previous;
    }

    public U getInfo() {
        return info;
    }

    public void setInfo(U info) {
        this.info = info;
    }



    @Override
    public String toString() {
        return " "+info;
    }
 
     

}
