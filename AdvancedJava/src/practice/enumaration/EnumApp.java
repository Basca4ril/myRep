/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practice.enumaration;

/**
 *
 * @author Accounts
 */
public class EnumApp
{
    public static void main(String[] args)
    {
        Enumaration obj = Enumaration.RED;
        
        System.out.println("Enum name:"+obj.name());
        System.out.println("Enum name:"+obj.getValue());
        
        for(Enumaration obj1: Enumaration.values())
        {
            System.out.println("Enum values:"+obj1.name());
        }
    }
    
}
