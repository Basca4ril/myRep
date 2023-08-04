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
public class Thread3 extends Thread
{
    @Override
    public void run()
    {
        try
        {
            System.out.println("Thread 3 is running");
        }catch(Exception e)
        {
            System.out.println("Exception raised "+ e);
        }
    }
}
