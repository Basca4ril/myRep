/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vut.question2;

import java.util.Scanner;

/**
 *This program checks whether a number is perfect or not
 * 
 * @author BN Moketa(219030294)
 */
public class PerfectNumberApplication
{
    public static void main(String[] args)
    {
        PerfectNumber obj;
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter number");
        int num;
        num = input.nextInt();
        obj = new PerfectNumber(num);
        obj.perfect_number(num);
    }
}
