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
public class main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        // TODO code application logic here
        
        ListClassInterface myList = new ListClass();
        myList.insertFront("Hello");
        myList.insertFront(25);
        myList.insertFront("GIGA");
        myList.display();
        
        System.out.println("==================");
        
        myList.edit(2, "LA");
        myList.display();
        
        System.out.println("==============");
        myList.RemoveFront();
        myList.display();


    }
    
}
