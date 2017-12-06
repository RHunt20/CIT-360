/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg360.practice;

/**
 *
 * @author Ryan
 */
public class BookView implements View{
    
    @Override
    public void display(){
        
    System.out.println("********************************\n" +
                         "Booklist\n" +
                         "********************************");
    
      System.out.println("A Farewell to Arms, Ernest Hemingway");
      System.out.println("As I Lay Dying, William Faulkner");
      System.out.println("Ulysses, James Joyce");
      System.out.println("The Hobbit, J R R Tolkien");
      System.out.println("Dune, Frank Herbert");
   }
}
