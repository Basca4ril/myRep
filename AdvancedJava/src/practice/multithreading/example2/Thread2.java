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
public class Thread2 implements Runnable
{
    Multiples mul;
    
    public Thread2(Multiples mul)
    {
        this.mul = mul;
    }
    
    @Override
    public void run()
    {
        try
        {
            mul.getMultiples(3);
            
        }catch(Exception e)
        {
            System.out.println(e);
        }
    }
}
