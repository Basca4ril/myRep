/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practrice.serialization;
import java.io.*;

/**
 *
 * @author Accounts
 */
public class StudentApp
{
    public static void main(String[] args)
    {
        Student student =  new Student("John",25,"23 East, Califonia");
        
        //Serialization
        String filename = "C:\\Users\\Accounts\\Documents\\school\\Engineering programming 4\\AdvancedJava\\src\\practrice\\serialization\\Test.txt";
        FileOutputStream fileOut = null;
        ObjectOutputStream objOut = null;
        try{
            fileOut =  new FileOutputStream(filename);
            objOut = new ObjectOutputStream(fileOut);
            objOut.writeObject(student);
            
            objOut.close();
            fileOut.close();
            
            System.out.println("Object has been serialized: \n" + student);
                    
            
        }catch(IOException ex)
        {
            System.out.println("IOException has been caught "+ex);
        }
        
        //Deserialization
        FileInputStream fileIn = null;
        ObjectInputStream objIn = null;
        try
        {
            fileIn = new FileInputStream(filename);
            objIn = new ObjectInputStream(fileIn);
            
            Student object = (Student) objIn.readObject();
            System.out.println("Object has been deserialized \n"+object );
            
            
        }catch(IOException ex)
        {
            System.out.println("IOException has been caught");
        }
        catch(ClassNotFoundException ex)
        {
            System.out.println("ClassNotFoundException is caught");
        }
                
    }
}
