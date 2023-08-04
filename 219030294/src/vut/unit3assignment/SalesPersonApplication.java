/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vut.unit3assignment;

import java.util.ArrayList;
import java.util.Scanner;
import java.text.NumberFormat;

/**
 * This SalesPersonApplication class stores and retrieves sales people information
 *
 * @author BN Moketa (219030294)
 */
public class SalesPersonApplication
{

    public static ArrayList<SalesPerson> arSales = new ArrayList<>();

    public static void main(String[] args)
    {
        
        Scanner in = new Scanner(System.in);
        while (true)
        {
            try
            {
                int option;
                menuOptions();
                System.out.print("Enter your option: ");
                option = in.nextInt();
                if(option == 1)
                {
                    arSales.add(getSalesPerson(new Scanner(System.in)));
                }
                else if(option == 2)
                {
                    System.out.println("-----------------------------SEARCH RESULTS"
                            + "-----------------------------------");
                    System.out.print("Enter name to search: ");
                    String name = in.next();
                    searchSalesPerson(name);
                }
                else if(option == 3)
                {
                    System.out.println("--------------------------DISPLAYS ALL "
                            + "SALESPERSON RECORDS-------------------------------");
                    headings();
                    displayAllRecord();
                    System.out.println("-----------------------------------------"
                            + "--------------------------------------------------");
                }
                
                else if(option == 4)
                {
                    monthlyStatisticsReport();
                }
                else if(option == -1)
                {
                    break;
                }

            }
            catch(IllegalArgumentException ex)
            {
                System.out.println("Exception encountered:" + ex.getMessage());
            }

        }

    }

    Scanner in = new Scanner(System.in);

    public static Address getAddress(Scanner in)
    {
        int houseNum, postalCode;
        String street, city;
        System.out.print("Enter house number: ");
        houseNum = in.nextInt();
        System.out.print("Enter Street Name:");
        street = in.next();
        System.out.print("Enter City:");
        city = in.next();
        System.out.print("Enter Postal Code:");
        postalCode = in.nextInt();

        Address objAd = new Address(houseNum, street, city, postalCode);
        return objAd;

    }

    public static void menuOptions()
    {
        System.out.println("Enter any of the Listed numbers as your option");
        System.out.println("1 - Add new SalesPerson Record");
        System.out.println("2 - Search SalesPerson Record by name");
        System.out.println("3 - Display All SalesPersons Records");
        System.out.println("4 - Company Monthly Staticstics Report");
        System.out.println("-1 - Exit Program");
        System.out.println("************************************************");
    }

    public static SalesPerson getSalesPerson(Scanner in)
    {
        String name;
        double week1Sale, week2Sale, week3Sale, week4Sale, purchasePrice,
                discountPercentage;
        SalesPerson sperson = new SalesPerson();

        System.out.print("Enter SalesPerson Name:");
        name = in.next();
        System.out.println("************ADDRESS DETAILS**********");
        Address address = getAddress(new Scanner(System.in));
        //sperson.setAddress(address);
        System.out.print("Enter week1 sale:");
        week1Sale = in.nextDouble();
        System.out.print("Enter week2 sale:");
        week2Sale = in.nextDouble();
        System.out.print("Enter week3 sale:");
        week3Sale = in.nextDouble();
        System.out.print("Enter week4 sale:");
        week4Sale = in.nextDouble();

        sperson.setWeek1Sale(week1Sale);
        sperson.setWeek2Sale(week2Sale);
        sperson.setWeek3Sale(week3Sale);
        sperson.setWeek4Sale(week4Sale);
        System.out.println("---SALES PERSONS STORE PRODUCT PURCHASE BENEFIT---");

        double salesTotal = sperson.calcTotalMonthSales();
        if (salesTotal >= 300000)
        {
            System.out.println("You qualify for a discount of: 50%");
            discountPercentage = 0.5;
        }
        else if (salesTotal < 300000 && salesTotal >= 150000)
        {
            System.out.println("You qualify for a discount of: 30%");
            discountPercentage = 0.3;
        }
        else if (salesTotal < 150000 && salesTotal >= 70000)
        {
            System.out.println("You qualify for a discount of: 20%");
            discountPercentage = 0.2;
        }
        else
        {
            System.out.println("You qualify for a discount of: 0%");
            discountPercentage = 0;
        }
        sperson.setDiscountPercentage(discountPercentage);

        System.out.print("Enter Product Purchase Price: ");
        purchasePrice = in.nextDouble();

        sperson.setPurchasePrice(purchasePrice);
        sperson.setName(name);

        SalesPerson sPerson = new SalesPerson(name, address, week1Sale, week2Sale, week3Sale, week4Sale, purchasePrice, discountPercentage);

        return sPerson;
    }

    public static void headings()
    {
        System.out.println("SalesPerson Name and Address:\tTotal Monthly Sale:"
                + "\tMonthly Salary:\tDisc %:"
                + "\tPurchase Price:\tDisc Price:"
                + "\tMonthly Instalments");
    }

    public static void displayAllRecord()
    {
        for (int i = 0; i < arSales.size(); i++)
        {
            System.out.println(arSales.get(i));
        }

    }

    public static void searchSalesPerson(String name)
    {
        int position;
        for (int i = 0; i < arSales.size(); i++)
        {
            if (arSales.get(i).getName().equals(name))
            {
                position = i;
                if (position >= 0)
                {
                    headings();
                    System.out.println(arSales.get(i));
                }
            }
        }

    }

    public static int getBestSalesPerson()
    {
        double tempNum = 0;
        int position = 0;
        for (int i = 0; i < arSales.size(); i++)
        {
            if (arSales.get(i).calcTotalMonthSales() > tempNum)
            {
                tempNum = arSales.get(i).calcTotalMonthSales();
                position = i;
            }
        }
        return position;
    }

    public static double calcMonthlyTurnOver()
    {
        double turnOver = 0;
        for (int i = 0; i < arSales.size(); i++)
        {
            turnOver +=arSales.get(i).calcTotalMonthSales();
        }
        return turnOver;
    }

    public static double calcSalaryExpenditure()
    {
        double totalPay = 0;
        for (int i = 0; i < arSales.size(); i++)
        {
            totalPay += arSales.get(i).calcMonthlySalary();
        }

        return totalPay;
    }

    public static void monthlyStatisticsReport()
    {
        NumberFormat currency = NumberFormat.getCurrencyInstance();
        System.out.println("-----------------------------COMPANY MONTHLY "
                + "STATTISTICS REPORT---------------------------");
        System.out.println("Company Monthly Turn Over : "
                + currency.format(calcMonthlyTurnOver()));
        System.out.println("Company Monthly Expenditure on Salary only : "
                + currency.format(calcSalaryExpenditure()));
        String name = arSales.get(getBestSalesPerson()).getName();
        System.out.println("Best SalesPerson of the month: " + name + " with Monthly"
                + "Sale of: " + currency.format(arSales.get(getBestSalesPerson()).calcTotalMonthSales()));
        System.out.println("-----------------------------------------------------------"
                + "------------------------------");
    }
}
