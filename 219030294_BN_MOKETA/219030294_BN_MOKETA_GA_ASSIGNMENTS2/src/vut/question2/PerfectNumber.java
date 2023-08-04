/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vut.question2;

/**
 * Program determines whether a number is a perfect number or not
 *
 * @author BN Moketa(219030294)
 */
public class PerfectNumber
{

    private int num;

    public PerfectNumber(int num)
    {
        setNum(num);
    }

    public int getNum()
    {
        return num;
    }

    public final void setNum(int num)
    {
        this.num = num;
    }

    public void perfect_number(int num)
    {
        int count = 0;
        for (int i = 1; i <= num; i++)
        {

            if (num % i == 0)
            {
                count = count + i;
                if (count == num)
                {
                    System.out.println(num + " is perfect number");
                    break;
                }
            }
            
        }
        if(count!=num)
        {
            System.out.println(num+" is not perfect number");
        }
    }

    @Override
    public String toString()
    {
        return getClass().getName() + "[Number=" + num + "]";
    }
}
