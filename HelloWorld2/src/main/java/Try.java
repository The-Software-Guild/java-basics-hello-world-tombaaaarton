
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author tombarton
 */



public class Try {
    public static void main(String[] args) {
        
             Scanner myScanner = newScanner(System.in);    
        
        // Setting Boolean to false to run? 
        Boolean isValid = false;
        
        // Block is run until, with the condition evaluated at the bottom rather than the top
        do {
            
            // Similar to try except in python, first tries to execute this block
            try{
                System.out.println("Enter whole number");
                
                String input = myScanner.readLine();
                int number = Integer.parseInt(input);
                
            // If the above block encounters an error, breaks and starts on this block.
            } catch(NumberFormatException ex) {
                System.out.println("Invalid input");
         
            }
        // unsure how while and do whiles seems to work in java, no stattement in block that changes boolean to true
        } while(!isValid)
                
                
    }
    
}

// https://docs.oracle.com/javase/tutorial/java/nutsandbolts/while.html