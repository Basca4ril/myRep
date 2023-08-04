/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practice.multithreading;

/**
 *
 * @author Accounts
 */
public class MultiThreadApp
{
    public static void main(String[] args)
    {
        for(int x=0;x<6;x++)
        {
            Thread1 objThread1 =  new Thread1();
            objThread1.start();

            Thread objThread2 = new Thread(new Thread2());
            objThread2.start();
            
            Thread3 objThread3 = new Thread3();
            objThread3.start();
        }
    }
    
}
