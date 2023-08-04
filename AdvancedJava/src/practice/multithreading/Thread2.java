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
public class Thread2 implements Runnable
{
    @Override
    public void run()
    {
        try
        {
            System.out.println("Thread 2 is running ");
        }catch(Exception e)
        {
            System.out.println("Exception raised "+e);
        }
    }
    
}
