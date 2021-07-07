/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author tombarton
 */

import java.util.Scanner;

public class While1 {
    public static void main(String[] args) {
        
        // Run so long as the condition holds that no valid data is entered.
        while(true) {
        
            // Variable data type of scanner, named my scanner, collecting input
            Scanner myScanner = newScanner(System.in);
        
            // Prompts user for input
            System.out.println("Enter data:");
        
            // Reads and stores the string input in the input variable
            String input = myScanner.readLine();
        
            // keep looping so long as the conditions are met of data being null or empty.
            if(input != null && !input.isEmpty()) {
            
                System.out.println("Nothing entered!");
            
            // If conditions of non valid data is not met, break out of loop. 
            } else {
                break;
            }      
        }
    }
    
}
    
/* Other method using Boolean
    

boolean isValid = false;

do {

    System.out.println("Enter some data: ");
    String input = myScanner.readLine();

    if(input == null || input.isEmpty()) {
        System.out.println("You did not enter anything!")
    } else {
        isValid = true
    }

} while(!isValid)
    
isValid is set to false, and the program is set to run so long as it is false? 
Becomes true when data is entered, terminating the loop?
Again unsure exactly on the while and do while loops: 
https://docs.oracle.com/javase/tutorial/java/nutsandbolts/while.html

*/