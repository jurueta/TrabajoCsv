/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

import java.io.Serializable;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.NoSuchElementException;

/**
 *
 * @author Urueta
 * @param <U>
 */
public class DoublyLinkedList<U> implements Serializable {
   private DoublyNode<U> headNode;
   private DoublyNode<U> endNode;
   
    public DoublyLinkedList() {
    }
    
    public boolean isEmpty(){
        return headNode == null;
    }
    
    public int size(){
       int tam = 0;
        if (isEmpty()) {
        return tam;     
        } else {
            DoublyNode<U> currentNode = headNode;
            while (currentNode != null) {
                tam++;
                currentNode = currentNode.getNext();
            }
         return tam;
        }
    }
    
    public void addFirst(U newInfo){
        DoublyNode<U> newNode = new DoublyNode<>(newInfo);
        if (isEmpty()) {
            headNode = newNode;
            endNode = newNode;
        }else{
          newNode.setNext(headNode);
          headNode.setPrevious(newNode);
          headNode = newNode;
        }
    }
    
    public void addLast(U newInfo){
         DoublyNode<U> newNode = new DoublyNode<>(newInfo);
        if (isEmpty()) {
            headNode = newNode;
            endNode = newNode;
        }else{
          newNode.setNext(null);
          newNode.setPrevious(endNode);
          endNode.setNext(newNode);
          endNode = newNode;
        }
    }
    
    public void removeFirst(){
        if (isEmpty()) {
            
        } else {
            
            headNode = headNode.getNext();
        }
    }
    
    public void removeLast(){
        if (isEmpty()) {
            
        } else {
            if (size() == 1) {
                removeFirst();
            } else {
                endNode = endNode.getPrevious();
                endNode.setNext(null);
            }
            
        }
    } 
    
    public void removeByPos(int pos){
        if (isEmpty()) {
            
        } else {
            if (pos == 1) {
                removeFirst();
            } else {
                if (pos == size()) {
                    removeLast();
                } else {
                    int cont = 1;
                    DoublyNode<U> currentNode = headNode;
                    while (currentNode.getNext() != null && cont != pos) {
                        cont++;
                        currentNode = currentNode.getNext();
                    }
                    currentNode.getPrevious().setNext(currentNode.getNext());
                    currentNode.getNext().setPrevious(currentNode.getPrevious());
                }
            }
        }
    }
    
      @Override
    public String toString() {
        DoublyNode<U> currentNode = headNode;
        String string = "";
        while (currentNode != null) {
            string += currentNode.toString() + " ";
            currentNode = currentNode.getNext();
        }
        return string;
    }

    public ListIterator<U> list(){
      return new ListIterator<U>() {
          private DoublyNode<U> currentNode = headNode;
          private int index = 0;
          @Override
          public boolean hasNext() {
              return currentNode != null;
          }

          @Override
          public U next() {
              if (hasNext()) {
                  U dato = currentNode.getInfo();
                  index++;
                  currentNode = currentNode.getNext();
                  return dato;
              } else {
                  throw new NoSuchElementException();
              }
          }

          @Override
          public boolean hasPrevious() {
            return currentNode != null;
          }

          @Override
          public U previous() {
              if (hasPrevious()) {
                  U dato = currentNode.getInfo();
                  index--;
                  currentNode = currentNode.getPrevious();
                  return dato;
              } else {
                  throw new NoSuchElementException();
              }
          }

          @Override
          public int nextIndex() {
              throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
          }

          @Override
          public int previousIndex() {
              throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
          }

          @Override
          public void remove() {
              throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
          }

          @Override
          public void set(U e) {
              throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
          }

          @Override
          public void add(U e) {
              throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
          }
      };
    }    
    
}
