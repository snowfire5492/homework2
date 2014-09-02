
package homework2;

/* 
 * Chapter No. 2    Excercise No. 1
 * File Name: HomeWork2.java
 * @author: Eric Schenck
 * Date: September 2, 2012
 * 
 * 
 * Problem Statement: Write a program that reads in three whole numbers and 
 * prints out the average of those three numbers.
 *
 * Overall plan:
 * 1.) Ask user to input three whole numbers
 * 2.) Add those three numbers together
 * 3.) Divide the sum of those numbers by three 
 * 4.) Print out the resulting average of those three numbers
 *
 * 
 */

// importing the scanner
import java.util.Scanner;


public class HomeWork2 {

    
    public static void main(String[] args) {
        
    
        // Ask the user to input three whole numbers
        System.out.println("Hello there!");
        System.out.println("Please enter three whole numbers,");
        System.out.println("So that I may calculate the average for you.");
        
        
        
        
        // The user inputs the three whole numbers
        Scanner keyboard = new Scanner(System.in);
        
        
        
        // declare variables
        int n1, n2, n3, sum, fnl;
        
       
        
        // set the user input equal to declared variables
        n1 = keyboard.nextInt();
        n2 = keyboard.nextInt();
        n3 = keyboard.nextInt();
        
        
        
        //calculate the sum of those three whole numbers
        sum = n1 + n2 + n3;
        
        
        
        // Divide the sum of those numbers by three
        // in order to output the average of those numbers
        fnl = sum / 3;
        
        
        // Print out a message along with the average of the three numbers
        System.out.println("The average of your numbers is... " + fnl);
        
        
    }
}
