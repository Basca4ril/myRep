/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practrice.inputOutput;

import java.io.FileInputStream;
import java.io.FileOutputStream;

/**
 *
 * @author Accounts
 */
public class textfCopy
{
    public static void main(String[] args)
    {
        FileInputStream inStream = null;
        FileOutputStream outStream = null;
        
        try{
            inStream = new FileInputStream("C:\\Users\\Accounts\\Documents\\school\\Engineering programming 4\\AdvancedJava\\src\\practrice\\inputOutput\\test.txt");
            outStream = new FileOutputStream("C:\\Users\\Accounts\\Documents\\school\\Engineering programming 4\\AdvancedJava\\src\\practrice\\inputOutput\\tesst.txt");
            
            int content;
           
        }
    }
    
}
