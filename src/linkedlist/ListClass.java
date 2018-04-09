/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package linkedlist;

/**
 *
 */
public class ListClass <T> implements ListClassInterface<T>
{
    private ListNode head;
    private int size;
    
    ListClass(){
        head = null;
        size = 0;
    }
    
    public void insertFront (T item)
    {
         head = new ListNode (item, head);
         size++;
    }
    
    public void RemoveFront ()
    {
         head = head.next;
         size--;
    }
    
    public void edit(int position, T value)
    {
        ListNode current = head; 
        int cnt = 0; 
        while (cnt < position-1 && current != null) 
        { 
            current = current.next; 
            cnt++;
        } 
        if (current != null) 
        { 
            current.item = value; 
        }
    }
    
    public void display()
    {
        ListNode current = head;
        while (current!=null)
        {
            System.out.println(current.item);
            current = current.next;

        }
        
    }


    
}
