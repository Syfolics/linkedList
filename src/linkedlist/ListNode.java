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
public class ListNode <T>
{
    T item;
    ListNode<T> next;
    
    ListNode(T item, ListNode next )
    {
        this.item = item;
        this.next = next;
    }
    ListNode(T item)
    {
        this(item, null);
    }
    
    
}
