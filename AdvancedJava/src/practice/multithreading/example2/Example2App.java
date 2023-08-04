/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practice.multithreading.example2;

/**
 * Synchronised multiThreading
 *
 * @author
 */
public class Example2App
{

    public static void main(String[] args)
    {
        Multiples objMul = new Multiples();

        Thead1 objThead1 = new Thead1(objMul);
        objThead1.start();

        Thread objThread2 = new Thread(new Thread2(objMul));
        objThread2.start();
    }

}
