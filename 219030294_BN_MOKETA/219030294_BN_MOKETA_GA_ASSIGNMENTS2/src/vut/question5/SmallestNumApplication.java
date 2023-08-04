/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vut.question5;

import java.util.Scanner;

/**
 *This program finds the smallest number in a sequence of inputted numbers until
 * -1 is entered
 * 
 * @author Accounts
 */
public class SmallestNumApplication
{

    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        int num, smallest = 0;
        System.out.println("Enter number or type -1 to stop: ");
        num = in.nextInt();

        while (num != -1)
        {
            if(num<smallest)
            {
                smallest=num;
            }
            
            System.out.println("Enter number or type -1 to stop: ");
            num = in.nextInt();

        }
        System.out.println("The smallest num is: "+smallest);

    }
}
