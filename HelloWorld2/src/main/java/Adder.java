/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author tombarton
 */
public class Adder {
    public static void main(String[] arg) {
        
        // define variables and assign value
        int sum = 0; 
        int operand1 = 0;
        int operand2 = 0;
        
        // variable data type scanner, name my scanner, used to collect input. Scanner not recognised.
        Scanner myScanner = newScanner(System.in);
        
        // data collected as strings, Java naming convention lowercase first word uppercase second
        String stringOperand1 = "";
        String stringOperand2 = "";
        
        // readout prompts user for input
        System.out.println("Enter first number:");
        
        // string value inputed placed in stringOperand1
        stringOperand1 = myScanner.nextline();
        
        System.out.println("Enter second number:");

        stringOperand2 = myScanner.nextline();
        
        // parse string values into integer in order to be able to perform operations
        operand1 = Integer.parseInt(stringOperand1);
        operand2 = Integer.parseInt(stringOperand2);
        
        // add the operands together and print out result
        sum = operand1 + operand2;
        System.out.println("Sum is: " + sum);       
                
    }
    
}
