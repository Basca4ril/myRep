/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practice.annotation;

/**
 *
 * @author Accounts
 */
public class Animal
{
    private String name, teethType;
    private int legNum;
    Animal(String name, String teethType,int legNum)
    {
        this.name = name;
        this.teethType = teethType;
        this.legNum = legNum;
    }
    public String getName()
    {
        return name;
    }
    public String getTeethType()
    {
        return teethType;
    }
    public int getLegNum()
    {
        return legNum;
    }
    public void display()
    {
        System.out.println(name);
        System.out.println(teethType);
        System.out.println(legNum);
    }
}
