/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vut.question1;

import java.util.Scanner;

/**
 * This program takes a sequence of inputted numbers and counts how many are odd
 * and how many are even, then terminates when 0 is entered
 *
 * @author BN MOketa(219030294)
 */
public class EvenOddApplication
{
    public static void main(String[] args)
    {
        int countOdd=0,countEven=0;
        Scanner in = new Scanner(System.in);
        int num;
        System.out.println("Enter number: ");
        num = in.nextInt();
        while(num!=0)
        {
            
            if(num%2==0)
            {
                countEven++;
            }
            else
            {
                countOdd++;
            }
            System.out.println("Enter number: ");
            num = in.nextInt();
        }
        System.out.println("Even:"+countEven+", Odd:"+countOdd);
        
    }
    
}
