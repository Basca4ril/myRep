  /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vut.question3;

import java.util.Scanner;

/**
 *This program counts words and characters of a string
 * 
 * @author BN Moketa(219030294)
 */
public class CountWordsApplication
{
    public static void main(String[] args)
    {
        CountWords obj;
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter word:");
        String var = input.nextLine();
        
        obj = new CountWords(var);
        int wordCount = obj.countString_Words(var);
        int charCount = obj.countAllChars(var);
        
        System.out.println("Words:"+wordCount+"\nCharacters:"+charCount);
    }
}
