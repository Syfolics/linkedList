/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package linkedlist;

/**
 *
 * 
 */
public interface ListClassInterface<T> {
    public void insertFront (T item);
    public void RemoveFront ();
    public void edit(int position, T value);
    public void display();
    
}
