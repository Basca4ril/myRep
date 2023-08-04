/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vut.question4;

/**
 *This program prints even numbers between 1 and 10
 * 
 * @author BN Moketa
 */
public class EvenNumApplication
{
    public static void main(String[] args)
    {
        for(int i=1;i<10;i++)
        {
            if(i%2==0)
                System.out.println(i);
        }
    }
}
