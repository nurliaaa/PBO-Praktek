/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author LIA
 */
public class Screen {
    public void displayMessage(String message) {
      System.out.print(message); 
   } 

   // display a message with a carriage return
   public void displayMessageLine(String message) {
      System.out.println(message);   
   } 

   // displays a dollar amount
   public void displayDollarAmount(double amount) {
      System.out.printf("$%,.2f", amount);   
   }
}
