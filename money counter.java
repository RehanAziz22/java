package com.mycompany.oop_se;

import java.util.Scanner;

/**
 *
 * @author Muhammad Rehan
 */
public class MuhammadRehanBSE20F074 {

    
// Java Program to Determine amount entered by the user is available or not

    public static void main(String[] args) { 
        //taking input from the user 
        Scanner reader = new Scanner(System.in);
        System.out.println("Please enter amount to widraw: ");
        int useramount = reader.nextInt();
        int remaining;
        int amount=150;
 /*  */
 if (useramount <= amount)
 {
 /* if amount is avaliable than print the following */
 System.out.println("Amount is available.\nYou have succesfully withdrawal the amount");
 //subtracting the amount insert by the user
 remaining = amount - useramount;
 System.out.println("Total Amount left in your account is: " +remaining );
 }
 else
 {
 /* if amount is greater than print the following */
 System.out.println("The Amount you entered is not available.");
 System.out.println("current ammount avaliable in your Account is ." + amount );
 
 }        
    } 
}
