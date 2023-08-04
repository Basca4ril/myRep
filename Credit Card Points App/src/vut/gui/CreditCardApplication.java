package vut.gui;

import java.util.Scanner;
import vut.CreditCard;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Accounts
 */
public class CreditCardApplication
{

    public static void main(String[] args)
    {
        String cellNum, idNum, gender;
        CreditCard obj;
        Scanner in = new Scanner(System.in);

        /*System.out.println("Please enter name and surname: ");
        String fName = in.nextLine();
        System.out.println("Enter last:");
        String lName = in.nextLine();
        System.out.println("Please enter cellphone number:");
        cellNum = in.nextLine();
        System.out.println("Please enter Id Number:");
        idNum = in.nextLine();
        System.out.println("Please enter gender:");
        gender = in.nextLine();*/

        obj = new CreditCard("Basia", "Moketa", "0012345678000", "0012345678", "male");

        System.out.println(obj);

    }

}
