/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practrice.serialization;

import java.io.Serializable;


/**
 *
 * @author Accounts
 */
public class Student implements Serializable
{
    private static final long serialVersionUID = 1L;
    
    transient private String name;
    transient private int age;
    transient private String address;
    
    public Student(String name,int age,String address)
    {
        setName(name);
        setAge(age);
        setAddress(address);
    }
    
    public void setName(String name)
    {
        this.name = name;
    }
    public void setAge(int age)
    {
        this.age = age;
    }
    public void setAddress(String address)
    {
        this.address = address;
    }
    
    public String getName()
    {
        return name;
    }
    public int getAge()
    {
        return age;
    }
    public String getAddress()
    {
        return address;
    }
    
    @Override
    public String toString()
    {
        return  "Name is: "+name+",Age is: "+age
                +",Address is: "+address;
    }
}
