/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vut.unit3assignment;

import java.text.NumberFormat;

/**
 * This class helps to store name and sales details of the employee
 *
 * @author BN Moketa (219030294)
 */
public class SalesPerson
{

    private String name;
    private Address address;
    private double week1Sale, week2Sale, week3Sale, week4Sale, purchasePrice,
            discountPercentage;

    public SalesPerson()
    {
        

    }

    public SalesPerson(String name, Address address, double week1Sale,
            double week2Sale, double week3Sale, double week4Sale,
            double purchasePrice, double discountPercentage)
    {
        setName(name);
        this.address = address;
        setWeek1Sale(week1Sale);
        setWeek2Sale(week2Sale);
        setWeek3Sale(week3Sale);
        setWeek4Sale(week4Sale);
        setPurchasePrice(purchasePrice);
        setDiscountPercentage(discountPercentage);

    }

    public String getName()
    {
        return name;
    }

    public double getWeek1Sale()
    {
        return week1Sale;
    }

    public double getWeek2Sale()
    {
        return week2Sale;
    }

    public double getWeek3Sale()
    {
        return week3Sale;
    }

    public double getWeek4Sale()
    {
        return week4Sale;
    }

    public double getPurchasePrice()
    {
        return purchasePrice;
    }

    public double getDiscountPercentage()
    {
        return discountPercentage;
    }

    public final void setName(String name)
    {
        if (name.length() < 5)
        {
            throw new IllegalArgumentException("Name must be more "
                    + "than 2 characters long");
        }
        this.name = name;
    }

    public final void setWeek1Sale(double week1Sale)
    {
        if (week1Sale < 0)
        {
            throw new IllegalArgumentException("Week 1 sale cannot be less than 0");
        }
        this.week1Sale = week1Sale;
    }

    public final void setWeek2Sale(double week2Sale)
    {
        if (week2Sale < 0)
        {
            throw new IllegalArgumentException("Week 2 sale cannot be less than 0");
        }
        this.week2Sale = week2Sale;
    }

    public final void setWeek3Sale(double week3Sale)
    {
        if (week3Sale < 0)
        {
            throw new IllegalArgumentException("Week 3 sale cannot be less than 0");
        }
        this.week3Sale = week3Sale;
    }

    public final void setWeek4Sale(double week4Sale)
    {
        if (week4Sale < 0)
        {
            throw new IllegalArgumentException("Week 4 sale cannot be less than 0");
        }
        this.week4Sale = week4Sale;
    }

    public final void setPurchasePrice(double purchasePrice)
    {
        if (purchasePrice < 0)
        {
            throw new IllegalArgumentException("Purchase price cannot be less "
                    + "than 0");
        }
        this.purchasePrice = purchasePrice;
    }

    public final void setDiscountPercentage(double discountPercentage)
    {
        if (discountPercentage < 0)
        {
            throw new IllegalArgumentException("Discount percentage cannot be"
                    + " less than 0");
        }
        this.discountPercentage = discountPercentage;
    }

    public double calcTotalMonthSales()
    {
        return week1Sale + week2Sale + week3Sale + week4Sale;
    }

    public double calcMonthlySalary()
    {
        return 750 + (0.1 * calcTotalMonthSales());
    }

    public double calcDiscPrice()
    {
        if (calcTotalMonthSales() >= 300000)
        {
            return purchasePrice - (purchasePrice * 0.5);
        }
        else if (calcTotalMonthSales() < 300000 && calcTotalMonthSales() >= 150000)
        {
            return purchasePrice - (purchasePrice * 0.3);
        }
        else if (calcTotalMonthSales() < 150000 && calcTotalMonthSales() >= 70000)
        {
            return purchasePrice - (purchasePrice * 0.2);
        }
        else
        {
            return purchasePrice;
        }
    }

    public double calcMonthlyInstalment()
    {
        return (calcDiscPrice()*(0.07/12))/(1-Math.pow(1+(0.07/12), -26));
    }

    @Override
    public String toString()
    {
        NumberFormat currency = NumberFormat.getCurrencyInstance();
        NumberFormat percentage = NumberFormat.getPercentInstance();

        return name+","+ address.toString()+"\t"+currency.format(calcTotalMonthSales())
                +"\t\t"+currency.format(calcMonthlySalary())+"\t"+percentage.format(discountPercentage)+"\t"+ 
                currency.format(purchasePrice)+"\t"+currency.format(calcDiscPrice())+"\t"+ 
                currency.format(calcMonthlyInstalment());
    }

}
