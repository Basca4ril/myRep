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
public enum Enumaration
{
    RED("red"),GREEN("green"),YELLOW("yellow");
    
    private String value;
    
    Enumaration(String value)
    {
        this.value = value;
    }
    public String getValue()
    {
        return value;
    }
}
