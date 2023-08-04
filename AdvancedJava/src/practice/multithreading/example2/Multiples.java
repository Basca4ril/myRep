/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practice.multithreading.example2;

/**
 *
 * @author Accounts
 */
public class Multiples
{
    synchronized void getMultiples(int num)
    {
        //synchronized (this)
        {
            for(int x=1;x<=5;x++)
            {
                System.out.println(num*x);
                try
                {
                    Thread.sleep(1000);
                }catch(Exception e)
                {
                    System.out.println(e);
                }
            }
        }
    }
    
}
