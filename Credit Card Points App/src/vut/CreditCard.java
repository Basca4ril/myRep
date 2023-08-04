package vut;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *Class calculates and accumulates the points acquired based on credit card
 * purchases
 *
 * @author BN Moketa
 */
public class CreditCard
{

    String fullName, gender, idNum, cellNum;
    int numPurchase, numPoints;

    public CreditCard(String fName, String lName, String idNum, String cellNum, String gender)
    {
        numPurchase = 0;
        numPoints = 0;
        setFullName(fName, lName);
        setIdNum(idNum);
        setCellNum(cellNum);
        setGender(gender);
    }

    public final void setFullName(String fName, String lName)
    {
        if (fName.length() > 0 && lName.length()>0)
        {
            if (fName.length() < 3)
            {
                throw new IllegalArgumentException("First name must be greater than "
                        + "3\nInvalid Input: " + fName);
            }
            else if (lName.length() < 3)
            {
                throw new IllegalArgumentException("Surname length must be greater "
                        + "than 3\nInvalid Input: " + lName);
            }
            this.fullName = fName + " " + lName;
        }
        else if(fName.length()==0 || lName.length()==0)
            throw new IllegalArgumentException("Full name must have name and "
                    + "surname seperated by a space");
    }

    public final void setIdNum(String idNum)
    {
        
        if(idNum.length()!=13)
            throw new IllegalArgumentException("The Id number must have 13 digits");
        this.idNum = idNum;
    }

    public final void setCellNum(String cellNum)
    {
        if(cellNum.length()==10)
        {
            
            if(cellNum.charAt(0)==('0')&&cellNum.charAt(1)==('0'))
                throw new IllegalArgumentException("Cell number cannot have 2 0s in "
                        + "the beginning");
            if(!(cellNum.charAt(0)==('0')))
                throw new IllegalArgumentException("Cell number must begin with "
                        + "a zero");
            this.cellNum = cellNum;
        }
        else
        {
            throw new IllegalArgumentException("Cell number must have 10 digits");
        }
    }

    public final void setGender(String gender)
    {
        if(!(gender.equalsIgnoreCase("male")||gender.equalsIgnoreCase("female")))
            throw new IllegalArgumentException("Gender must be either male or female");
        this.gender = gender;
    }
    
    public String getFullName()
    {
        return fullName;
    }
    public String getIdNum()
    {
        return idNum;
    }
    public String getCellNum()
    {
        return cellNum;
    }
    public String getGender()
    {
        return gender;
    }
    public void cardPurchase(float spent)
    {
        if(spent>0)
        {
            if(spent<=100)
            {
                numPoints=numPoints+5;
                numPurchase++;
            }
            else if(spent>100 && spent<=500)
            {
                numPoints=numPoints+10;
                numPurchase++;
            }
            else if(spent>500 && spent<=1800)
            {
                numPoints=numPoints+18;
                numPurchase++;
            }
            else if(spent>1800)
            {
                numPoints=numPoints+125;
                numPurchase++;
            }
        }
    }
    
    @Override
    public String toString()
    {
        return getClass().getName() + "\nFullName: "+ fullName+"\nId Number: "
                +idNum+"\nCell number: "+cellNum+"\nGender:"+gender+"\nNumber "
                + "of Purchases: "+numPurchase+"\nNumber of points: "+numPoints;
    }
}
