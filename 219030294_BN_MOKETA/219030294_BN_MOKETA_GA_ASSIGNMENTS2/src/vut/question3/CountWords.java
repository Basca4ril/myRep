/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vut.question3;

/**
 * This program counts words and characters of a string
 *
 * @author BN Moketa(219030294)
 */
public class CountWords
{
    private String word;
    
    public CountWords(String word)
    {
        setWord(word);
    }
    public String getWord()
    {
        return word;
    }
    public final void setWord(String word)
    {
        this.word = word;
    }
    public int countString_Words(String var)
    {
        int count = 0;
        for(int i=0;i<var.length();i++)
        {
            if(var.charAt(i)==' ')
            {
                count++;
            }
        }
        return count+1;
    }
    public int countAllChars(String var)
    {
        return var.length();
        
    }
}
