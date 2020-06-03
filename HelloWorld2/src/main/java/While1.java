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
        
            // keep looping so long as the conditions are met of input != null and !input.isEmpty()
            if(input != null && !input.isEmpty()) {
            
                System.out.println("Nothing entered!");
            
            // If conditions of non valid data is not met, break out of loop. 
            } else {
                break;
            }      
        }
    
}
