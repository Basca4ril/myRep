/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vut.unit3assignment;

/**
 * This program generates full address for employees
 *
 * @author BN Moketa (219030294)
 */
public class Address
{

    private int houseNum, postalCode;
    private String street, city;

    public Address()
    {
        this(0, "none", "none", 0);
    }

    public Address(int houseNum, String street, String city, int postalCode)
    {
        this.houseNum = houseNum;
        setStreet(street);
        setCity(city);
        this.postalCode = postalCode;

    }

    public final void setStreet(String street)
    {
        if (street.length() < 5)
        {
            throw new IllegalArgumentException("Name of street must be more "
                    + "than 5 characters long");
        }
        this.street = street;

    }

    public final void setCity(String city)
    {
        if (city.length() < 5)
        {
            throw new IllegalArgumentException("Name of city must be more "
                    + "than 5 characters long");
        }
        this.city = city;

    }

    @Override
    public String toString()
    {
        return  "[" + houseNum + ","+ street + "," + city + "," + postalCode + "]";
    }

}
