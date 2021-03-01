package com.mycompany.oop_se;

import java.util.Scanner;
public class MuhammadRehanBSE20F074 {
// Java Program to Determine the number entered by the user is either Even or Odd

    public static void main(String[] args) { 
        //taking input from the user 
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter a number: ");
        int i = sc.nextInt();
        
        //condition for Even or Odd 
        if(i % 2 == 0)
            System.out.println(i + " is even");
        else
            System.out.println(i + " is odd");        
    } 
}
